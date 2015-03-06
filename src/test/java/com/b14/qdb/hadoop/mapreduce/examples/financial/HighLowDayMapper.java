package com.b14.qdb.hadoop.mapreduce.examples.financial;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * Hadoop MapReduce example showing high and low for a day across all stock symbols
 * 
 */
public class HighLowDayMapper extends Mapper<Text, Text, Text, DoubleWritable> {
    /**
     * Expected input:<br>
     * 
     * <pre>
     * exchange,stock_symbol,date,stock_price_open,stock_price_high,stock_price_low,stock_price_close,stock_volume,stock_price_adj_close
     * NASDAQ,XING,2010-02-08,1.73,1.76,1.71,1.73,147400,1.73
     * </pre>
     */
    @Override
    public void map(Text key, Text value, Context context) throws IOException, InterruptedException {
        String inputLine = value.toString();
        
        if (inputLine.startsWith("exchange,")) {
            // Line is the header, ignore it
            return;
        }
        
        String[] columns = inputLine.split(",");
        
        if (columns.length != 9) {
            // Line isn't the correct number of columns or formatted properly
            return;
        }

        // You'd normally represent money as a BigDecimal, but we're using doubles
        // to make things easier to understand
        double close = Double.parseDouble(columns[6]);
        context.write(new Text(columns[2]), new DoubleWritable(close));
    }
}