/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.b14.qdb.jni;

public class BatchOpsVec {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected BatchOpsVec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BatchOpsVec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        qdbJNI.delete_BatchOpsVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BatchOpsVec() {
    this(qdbJNI.new_BatchOpsVec__SWIG_0(), true);
  }

  public BatchOpsVec(long n) {
    this(qdbJNI.new_BatchOpsVec__SWIG_1(n), true);
  }

  public long size() {
    return qdbJNI.BatchOpsVec_size(swigCPtr, this);
  }

  public long capacity() {
    return qdbJNI.BatchOpsVec_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    qdbJNI.BatchOpsVec_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return qdbJNI.BatchOpsVec_empty(swigCPtr, this);
  }

  public void clear() {
    qdbJNI.BatchOpsVec_clear(swigCPtr, this);
  }

  public void push_back(qdb_operation_t x) {
    qdbJNI.BatchOpsVec_push_back(swigCPtr, this, qdb_operation_t.getCPtr(x), x);
  }

  public qdb_operation_t get(int i) {
    return new qdb_operation_t(qdbJNI.BatchOpsVec_get(swigCPtr, this, i), false);
  }

  public void set(int i, qdb_operation_t val) {
    qdbJNI.BatchOpsVec_set(swigCPtr, this, i, qdb_operation_t.getCPtr(val), val);
  }

}
