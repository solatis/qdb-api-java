package com.b14.qdb.hadoop.mapreduce.examples.temperature;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.b14.qdb.Quasardb;
import com.b14.qdb.QuasardbConfig;
import com.b14.qdb.QuasardbException;
import com.b14.qdb.QuasardbNode;
import com.b14.qdb.hadoop.mapreduce.QuasardbInputFormat;
import com.b14.qdb.hadoop.mapreduce.QuasardbJobConf;
import com.b14.qdb.hadoop.mapreduce.QuasardbOutputFormat;
import com.b14.qdb.hadoop.mapreduce.keysgenerators.ProvidedKeysGenerator;
import com.b14.qdb.hadoop.mapreduce.tools.FixHadoopOnWindows;

public class MaxTemperatureIT extends Configured implements Tool {
    public static final String HOST = "127.0.0.1";
    public static final int PORT = 2836;
    private static final QuasardbConfig config = new QuasardbConfig();
    private Quasardb qdbInstance = null;
    private String keys = new String();
    
    public int run(String[] args) throws Exception {
        if (args.length != 2) {
            System.err.printf("Usage: %s [generic options] <input> <output>\n", getClass().getSimpleName());
            ToolRunner.printGenericCommandUsage(System.err);
            return -1;
        }

        Job job = new Job(getConf(), "Max temperature");
        job.setJarByClass(getClass());

        job.setInputFormatClass(QuasardbInputFormat.class);
        job.setOutputFormatClass(QuasardbOutputFormat.class);
        
        job.setMapperClass(MaxTemperatureMapper.class);
        job.setCombinerClass(MaxTemperatureReducer.class);
        job.setReducerClass(MaxTemperatureReducer.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        return job.waitForCompletion(true) ? 0 : 1;
    }

    public static void main(String[] args) throws Exception {
        int exitCode = ToolRunner.run(new MaxTemperatureIT(), args);
        System.exit(exitCode);
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        QuasardbNode quasardbNode = new QuasardbNode(HOST, PORT);
        config.addNode(quasardbNode);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        //  => Connect to given qdbinstance
        qdbInstance = new Quasardb(config);
        try {
            qdbInstance.connect();
        } catch (QuasardbException e) {
            e.printStackTrace();
        }
        
        //  => Populate quasardb instance with data
        try {
            String line = "";
            InputStream is = getClass().getClassLoader().getResourceAsStream("temperatures.txt");
            InputStreamReader fis = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(fis);
            long i = 0;
            while ((line = reader.readLine()) != null) {
                i++;
                qdbInstance.update("key_" + i, new Text(line));
                if (!keys.isEmpty()) {
                    keys += ",";
                }
                keys += "key_" + i;
            }
        } catch (Exception e) {}
        
        // => Fix Hadoop on Windows
        try {
            FixHadoopOnWindows.runFix();
        } catch (Exception e) {
        }
    }
    
    @After
    public void tearDown() {
        try {
            if (qdbInstance != null) {
                // Check results
                IntWritable result = qdbInstance.get("1949");
                assertTrue(result.get() == 111);
                result = qdbInstance.get("1950");
                assertTrue(result.get() == 22);
                
                // Clean
                qdbInstance.purgeAll();
                qdbInstance.close();
            }
        } catch (QuasardbException e) {
            fail("Shouldn't have an Exception => " + e.getMessage());
        }
    }
    
    @Test
    public void testMaxTemperatureDriver() throws Throwable {
        Configuration conf = new Configuration();
        conf.set("fs.default.name", "file:///");
        conf.setInt("dfs.replication", 1);
        conf.set("mapreduce.jobtracker.address", "local");
        conf.set("hadoop.tmp.dir", FixHadoopOnWindows.isWindows() ? "D:/tmp" : "/tmp");
        conf = QuasardbJobConf.addLocation(conf, new QuasardbNode(HOST, PORT));
        ProvidedKeysGenerator providedKeysGenerator = new ProvidedKeysGenerator();
        providedKeysGenerator.init(keys);
        conf = QuasardbJobConf.setKeysGenerator(conf, providedKeysGenerator);
        conf = QuasardbJobConf.setHadoopClusterSize(conf, 4);
        
        Job job = new Job(conf, "Max temperature");
        job.setJarByClass(MaxTemperatureIT.class);
        job.setJobName("Max temperature");
        
        job.setInputFormatClass(QuasardbInputFormat.class);
        job.setOutputFormatClass(QuasardbOutputFormat.class);
        
        job.setMapperClass(MaxTemperatureMapper.class);
        job.setCombinerClass(MaxTemperatureReducer.class);
        job.setReducerClass(MaxTemperatureReducer.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        job.waitForCompletion(true);
    }
}