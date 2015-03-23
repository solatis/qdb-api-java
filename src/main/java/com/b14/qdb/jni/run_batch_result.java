/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.b14.qdb.jni;

public class run_batch_result {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected run_batch_result(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(run_batch_result obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        qdbJNI.delete_run_batch_result(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public run_batch_result() {
    this(qdbJNI.new_run_batch_result(), true);
  }

  public void setSuccesses(long value) {
    qdbJNI.run_batch_result_successes_set(swigCPtr, this, value);
  }

  public long getSuccesses() {
    return qdbJNI.run_batch_result_successes_get(swigCPtr, this);
  }

  public void setResults(BatchOpsVec value) {
    qdbJNI.run_batch_result_results_set(swigCPtr, this, BatchOpsVec.getCPtr(value), value);
  }

  public BatchOpsVec getResults() {
    long cPtr = qdbJNI.run_batch_result_results_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BatchOpsVec(cPtr, false);
  }

}
