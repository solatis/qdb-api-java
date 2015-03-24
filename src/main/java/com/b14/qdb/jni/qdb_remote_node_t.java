/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.b14.qdb.jni;

public class qdb_remote_node_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected qdb_remote_node_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(qdb_remote_node_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        qdbJNI.delete_qdb_remote_node_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAddress(String value) {
    qdbJNI.qdb_remote_node_t_address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return qdbJNI.qdb_remote_node_t_address_get(swigCPtr, this);
  }

  public void setPort(int value) {
    qdbJNI.qdb_remote_node_t_port_set(swigCPtr, this, value);
  }

  public int getPort() {
    return qdbJNI.qdb_remote_node_t_port_get(swigCPtr, this);
  }

  public void setError(qdb_error_t value) {
    qdbJNI.qdb_remote_node_t_error_set(swigCPtr, this, value.swigValue());
  }

  public qdb_error_t getError() {
    return qdb_error_t.swigToEnum(qdbJNI.qdb_remote_node_t_error_get(swigCPtr, this));
  }

  public qdb_remote_node_t() {
    this(qdbJNI.new_qdb_remote_node_t(), true);
  }

}