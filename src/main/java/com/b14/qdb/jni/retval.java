/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.b14.qdb.jni;

public class retval {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected retval(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(retval obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        qdbJNI.delete_retval(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public retval() {
    this(qdbJNI.new_retval(), true);
  }

  public void setBuffer(String value) {
    qdbJNI.retval_buffer_set(swigCPtr, this, value);
  }

  public String getBuffer() {
    return qdbJNI.retval_buffer_get(swigCPtr, this);
  }

  public void setBuffer_size(long value) {
    qdbJNI.retval_buffer_size_set(swigCPtr, this, value);
  }

  public long getBuffer_size() {
    return qdbJNI.retval_buffer_size_get(swigCPtr, this);
  }

}
