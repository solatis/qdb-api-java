package net.quasardb.qdb;

import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import net.quasardb.qdb.jni.*;
import java.util.*;
import java.util.stream.Collectors;

public class QdbBlobAggregation extends QdbAggregation<QdbBlobColumnValue> {

    public QdbBlobAggregation (Type type, QdbTimeRange range) {
        super(type, range, 0, new QdbBlobColumnValue());
    }


    public QdbBlobAggregation (Type type, QdbTimeRange range, long count, QdbBlobColumnValue value) {
        super(type, range, count, value);
    }

    /**
     * Converts this object to JNI-compatible representation.
     */
    protected static qdb_ts_blob_aggregation toNative(QdbBlobAggregation input) {
        return new qdb_ts_blob_aggregation (QdbTimeRange.toNative(input.range),
                                            input.type.value,
                                            input.count,
                                            QdbBlobColumnValue.toNative(input.result));
    }

    /**
     * Creates this object from JNI-compatible representation.
     */
    protected static QdbBlobAggregation fromNative(qdb_ts_blob_aggregation input) {
        return new QdbBlobAggregation(Type.values()[(int)input.getAggregationType()],
                                      QdbTimeRange.fromNative(input.getRange()),
                                      input.getCount(),
                                      QdbBlobColumnValue.fromNative(input.getResult()));
    }
}
