package net.quasardb.qdb;

import java.io.Serializable;
import net.quasardb.qdb.jni.*;

public class QdbTimeRange implements Serializable {

    protected QdbTimespec begin;
    protected QdbTimespec end;

    public QdbTimeRange (QdbTimespec begin, QdbTimespec end) {
        this.begin = begin;
        this.end = end;
    }

    public QdbTimespec getBegin() {
        return this.begin;
    }

    public QdbTimespec getEnd() {
        return this.end;
    }
    public static qdb_ts_range toNative(QdbTimeRange input) {
        return new qdb_ts_range(input.begin.toNative(), input.end.toNative());
    }

    public static QdbTimeRange fromNative(qdb_ts_range input) {
        return new QdbTimeRange(QdbTimespec.fromNative(input.getBegin()),
                                QdbTimespec.fromNative(input.getEnd()));
    }

    public String toString() {
        return "QdbTimeRange (begin: " + this.begin.toString() + ", end: " + this.end.toString() + ")";
    }
}
