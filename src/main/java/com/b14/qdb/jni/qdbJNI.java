/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.b14.qdb.jni;

public class qdbJNI {
  public final static native long new_ApiBufferPtr();
  public final static native void delete_ApiBufferPtr(long jarg1);
  public final static native int qdb_l_alias_max_length_get();
  public final static native int qdb_l_min_prefix_length_get();
  public final static native int error_uninitialized_get();
  public final static native int error_ok_get();
  public final static native int error_system_get();
  public final static native int error_internal_get();
  public final static native int error_no_memory_get();
  public final static native int error_invalid_protocol_get();
  public final static native int error_host_not_found_get();
  public final static native int error_invalid_option_get();
  public final static native int error_alias_too_long_get();
  public final static native int error_alias_not_found_get();
  public final static native int error_alias_already_exists_get();
  public final static native int error_timeout_get();
  public final static native int error_buffer_too_small_get();
  public final static native int error_invalid_command_get();
  public final static native int error_connection_refused_get();
  public final static native int error_connection_reset_get();
  public final static native int error_unexpected_reply_get();
  public final static native int error_not_implemented_get();
  public final static native int error_unstable_hive_get();
  public final static native int error_protocol_error_get();
  public final static native int error_outdated_topology_get();
  public final static native int error_wrong_peer_get();
  public final static native int error_invalid_version_get();
  public final static native int error_try_again_get();
  public final static native int error_invalid_argument_get();
  public final static native int error_out_of_bounds_get();
  public final static native int error_conflict_get();
  public final static native int error_not_connected_get();
  public final static native int error_invalid_handle_get();
  public final static native int error_reserved_alias_get();
  public final static native int error_unmatched_content_get();
  public final static native int error_invalid_iterator_get();
  public final static native int error_prefix_too_short_get();
  public final static native int error_skipped_get();
  public final static native int option_operation_timeout_get();
  public final static native int option_log_callback_get();
  public final static native int qdb_p_tcp_get();
  public final static native int optionp_uninitialized_get();
  public final static native int optionp_get_alloc_get();
  public final static native int optionp_put_get();
  public final static native int optionp_update_get();
  public final static native int optionp_remove_get();
  public final static native int optionp_cas_get();
  public final static native int optionp_get_update_get();
  public final static native int optionp_get_remove_get();
  public final static native int optionp_remove_if_get();
  public final static native long qdb_const_iterator_t_handle_get(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native long qdb_const_iterator_t_token_get(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native long qdb_const_iterator_t_node_get(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native long qdb_const_iterator_t_ref_get(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native String qdb_const_iterator_t_alias_get(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native java.nio.ByteBuffer qdb_const_iterator_t_content_get(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native long qdb_const_iterator_t_content_size_get(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native long new_qdb_const_iterator_t();
  public final static native void delete_qdb_const_iterator_t(long jarg1);
  public final static native void qdb_remote_node_t_address_set(long jarg1, qdb_remote_node_t jarg1_, String jarg2);
  public final static native String qdb_remote_node_t_address_get(long jarg1, qdb_remote_node_t jarg1_);
  public final static native void qdb_remote_node_t_port_set(long jarg1, qdb_remote_node_t jarg1_, int jarg2);
  public final static native int qdb_remote_node_t_port_get(long jarg1, qdb_remote_node_t jarg1_);
  public final static native void qdb_remote_node_t_error_set(long jarg1, qdb_remote_node_t jarg1_, int jarg2);
  public final static native int qdb_remote_node_t_error_get(long jarg1, qdb_remote_node_t jarg1_);
  public final static native long new_qdb_remote_node_t();
  public final static native void delete_qdb_remote_node_t(long jarg1);
  public final static native void qdb_operation_t_type_set(long jarg1, qdb_operation_t jarg1_, int jarg2);
  public final static native int qdb_operation_t_type_get(long jarg1, qdb_operation_t jarg1_);
  public final static native void qdb_operation_t_alias_set(long jarg1, qdb_operation_t jarg1_, String jarg2);
  public final static native String qdb_operation_t_alias_get(long jarg1, qdb_operation_t jarg1_);
  public final static native void qdb_operation_t_content_set(long jarg1, qdb_operation_t jarg1_, java.nio.ByteBuffer jarg2);
  public final static native java.nio.ByteBuffer qdb_operation_t_content_get(long jarg1, qdb_operation_t jarg1_);
  public final static native void qdb_operation_t_content_size_set(long jarg1, qdb_operation_t jarg1_, long jarg2);
  public final static native long qdb_operation_t_content_size_get(long jarg1, qdb_operation_t jarg1_);
  public final static native void qdb_operation_t_comparand_set(long jarg1, qdb_operation_t jarg1_, java.nio.ByteBuffer jarg2);
  public final static native java.nio.ByteBuffer qdb_operation_t_comparand_get(long jarg1, qdb_operation_t jarg1_);
  public final static native void qdb_operation_t_comparand_size_set(long jarg1, qdb_operation_t jarg1_, long jarg2);
  public final static native long qdb_operation_t_comparand_size_get(long jarg1, qdb_operation_t jarg1_);
  public final static native void qdb_operation_t_expiry_time_set(long jarg1, qdb_operation_t jarg1_, long jarg2);
  public final static native long qdb_operation_t_expiry_time_get(long jarg1, qdb_operation_t jarg1_);
  public final static native int qdb_operation_t_error_get(long jarg1, qdb_operation_t jarg1_);
  public final static native java.nio.ByteBuffer qdb_operation_t_result_get(long jarg1, qdb_operation_t jarg1_);
  public final static native long qdb_operation_t_result_size_get(long jarg1, qdb_operation_t jarg1_);
  public final static native long new_qdb_operation_t();
  public final static native void delete_qdb_operation_t(long jarg1);
  public final static native long new_batch_request__SWIG_0();
  public final static native long new_batch_request__SWIG_1(int jarg1, String jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long new_batch_request__SWIG_2(int jarg1, String jarg2, long jarg3, long jarg4);
  public final static native long new_batch_request__SWIG_3(int jarg1, String jarg2, long jarg3);
  public final static native long new_batch_request__SWIG_4(int jarg1, String jarg2);
  public final static native void batch_request_type_set(long jarg1, batch_request jarg1_, int jarg2);
  public final static native int batch_request_type_get(long jarg1, batch_request jarg1_);
  public final static native void batch_request_alias_set(long jarg1, batch_request jarg1_, String jarg2);
  public final static native String batch_request_alias_get(long jarg1, batch_request jarg1_);
  public final static native void batch_request_content_set(long jarg1, batch_request jarg1_, long jarg2);
  public final static native long batch_request_content_get(long jarg1, batch_request jarg1_);
  public final static native void batch_request_comparand_set(long jarg1, batch_request jarg1_, long jarg2);
  public final static native long batch_request_comparand_get(long jarg1, batch_request jarg1_);
  public final static native void batch_request_expiry_time_set(long jarg1, batch_request jarg1_, long jarg2);
  public final static native long batch_request_expiry_time_get(long jarg1, batch_request jarg1_);
  public final static native void delete_batch_request(long jarg1);
  public final static native long new_batch_result__SWIG_0();
  public final static native long new_batch_result__SWIG_1(int jarg1, String jarg2, int jarg3, long jarg4);
  public final static native long new_batch_result__SWIG_2(int jarg1, String jarg2, int jarg3);
  public final static native int batch_result_type_get(long jarg1, batch_result jarg1_);
  public final static native String batch_result_alias_get(long jarg1, batch_result jarg1_);
  public final static native int batch_result_error_get(long jarg1, batch_result jarg1_);
  public final static native long batch_result_result_get(long jarg1, batch_result jarg1_);
  public final static native void delete_batch_result(long jarg1);
  public final static native long new_retval();
  public final static native void retval_buffer_set(long jarg1, retval jarg1_, String jarg2);
  public final static native String retval_buffer_get(long jarg1, retval jarg1_);
  public final static native void retval_buffer_size_set(long jarg1, retval jarg1_, long jarg2);
  public final static native long retval_buffer_size_get(long jarg1, retval jarg1_);
  public final static native void delete_retval(long jarg1);
  public final static native long new_error_carrier();
  public final static native void error_carrier_error_set(long jarg1, error_carrier jarg1_, int jarg2);
  public final static native int error_carrier_error_get(long jarg1, error_carrier jarg1_);
  public final static native void delete_error_carrier(long jarg1);
  public final static native long new_run_batch_result();
  public final static native void run_batch_result_successes_set(long jarg1, run_batch_result jarg1_, long jarg2);
  public final static native long run_batch_result_successes_get(long jarg1, run_batch_result jarg1_);
  public final static native void run_batch_result_results_set(long jarg1, run_batch_result jarg1_, long jarg2, BatchOpsVec jarg2_);
  public final static native long run_batch_result_results_get(long jarg1, run_batch_result jarg1_);
  public final static native void delete_run_batch_result(long jarg1);
  public final static native String version();
  public final static native String build();
  public final static native long open();
  public final static native int close(long jarg1);
  public final static native int connect(long jarg1, String jarg2, int jarg3);
  public final static native long new_remoteNodeArray__SWIG_0();
  public final static native long new_remoteNodeArray__SWIG_1(long jarg1);
  public final static native long remoteNodeArray_size(long jarg1, remoteNodeArray jarg1_);
  public final static native long remoteNodeArray_capacity(long jarg1, remoteNodeArray jarg1_);
  public final static native void remoteNodeArray_reserve(long jarg1, remoteNodeArray jarg1_, long jarg2);
  public final static native boolean remoteNodeArray_empty(long jarg1, remoteNodeArray jarg1_);
  public final static native void remoteNodeArray_clear(long jarg1, remoteNodeArray jarg1_);
  public final static native void remoteNodeArray_push_back(long jarg1, remoteNodeArray jarg1_, long jarg2, qdb_remote_node_t jarg2_);
  public final static native long remoteNodeArray_get(long jarg1, remoteNodeArray jarg1_, int jarg2);
  public final static native void remoteNodeArray_set(long jarg1, remoteNodeArray jarg1_, int jarg2, long jarg3, qdb_remote_node_t jarg3_);
  public final static native void delete_remoteNodeArray(long jarg1);
  public final static native long multi_connect(long jarg1, long jarg2, remoteNodeArray jarg2_);
  public final static native int stop_node(long jarg1, long jarg2, qdb_remote_node_t jarg2_, String jarg3);
  public final static native int put(long jarg1, String jarg2, java.nio.ByteBuffer jarg3, long jarg4, long jarg5);
  public final static native long new_StringVec__SWIG_0();
  public final static native long new_StringVec__SWIG_1(long jarg1);
  public final static native long StringVec_size(long jarg1, StringVec jarg1_);
  public final static native long StringVec_capacity(long jarg1, StringVec jarg1_);
  public final static native void StringVec_reserve(long jarg1, StringVec jarg1_, long jarg2);
  public final static native boolean StringVec_empty(long jarg1, StringVec jarg1_);
  public final static native void StringVec_clear(long jarg1, StringVec jarg1_);
  public final static native void StringVec_push_back(long jarg1, StringVec jarg1_, String jarg2);
  public final static native String StringVec_get(long jarg1, StringVec jarg1_, int jarg2);
  public final static native void StringVec_set(long jarg1, StringVec jarg1_, int jarg2, String jarg3);
  public final static native void delete_StringVec(long jarg1);
  public final static native java.nio.ByteBuffer get_buffer(long jarg1, String jarg2, long jarg3, error_carrier jarg3_);
  public final static native long prefix_get(long jarg1, String jarg2, long jarg3, error_carrier jarg3_);
  public final static native void RemoteNode_address_set(long jarg1, RemoteNode jarg1_, String jarg2);
  public final static native String RemoteNode_address_get(long jarg1, RemoteNode jarg1_);
  public final static native void RemoteNode_port_set(long jarg1, RemoteNode jarg1_, int jarg2);
  public final static native int RemoteNode_port_get(long jarg1, RemoteNode jarg1_);
  public final static native long new_RemoteNode();
  public final static native void delete_RemoteNode(long jarg1);
  public final static native long get_location(long jarg1, String jarg2, long jarg3, error_carrier jarg3_);
  public final static native java.nio.ByteBuffer get_remove(long jarg1, String jarg2, long jarg3, error_carrier jarg3_);
  public final static native java.nio.ByteBuffer get_buffer_update(long jarg1, String jarg2, java.nio.ByteBuffer jarg3, long jarg4, long jarg5, long jarg6, error_carrier jarg6_);
  public final static native java.nio.ByteBuffer node_status(long jarg1, long jarg2, qdb_remote_node_t jarg2_, long jarg3, error_carrier jarg3_);
  public final static native java.nio.ByteBuffer node_config(long jarg1, long jarg2, qdb_remote_node_t jarg2_, long jarg3, error_carrier jarg3_);
  public final static native java.nio.ByteBuffer node_topology(long jarg1, long jarg2, qdb_remote_node_t jarg2_, long jarg3, error_carrier jarg3_);
  public final static native java.nio.ByteBuffer compare_and_swap(long jarg1, String jarg2, java.nio.ByteBuffer jarg3, long jarg4, java.nio.ByteBuffer jarg5, long jarg6, long jarg7, long jarg8, error_carrier jarg8_);
  public final static native void free_buffer(long jarg1, java.nio.ByteBuffer jarg2);
  public final static native String make_error_string(int jarg1);
  public final static native int update(long jarg1, String jarg2, java.nio.ByteBuffer jarg3, long jarg4, long jarg5);
  public final static native int remove(long jarg1, String jarg2);
  public final static native int remove_if(long jarg1, String jarg2, java.nio.ByteBuffer jarg3, long jarg4);
  public final static native int purge_all(long jarg1);
  public final static native int iterator_begin(long jarg1, long jarg2, qdb_const_iterator_t jarg2_);
  public final static native int iterator_rbegin(long jarg1, long jarg2, qdb_const_iterator_t jarg2_);
  public final static native int iterator_next(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native int iterator_previous(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native int iterator_close(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native int iterator_copy(long jarg1, qdb_const_iterator_t jarg1_, long jarg2, qdb_const_iterator_t jarg2_);
  public final static native java.nio.ByteBuffer iterator_content(long jarg1, qdb_const_iterator_t jarg1_);
  public final static native int expires_at(long jarg1, String jarg2, long jarg3);
  public final static native int expires_from_now(long jarg1, String jarg2, long jarg3);
  public final static native long get_expiry(long jarg1, String jarg2, long jarg3, error_carrier jarg3_);
  public final static native long new_BatchOpsVec__SWIG_0();
  public final static native long new_BatchOpsVec__SWIG_1(long jarg1);
  public final static native long BatchOpsVec_size(long jarg1, BatchOpsVec jarg1_);
  public final static native long BatchOpsVec_capacity(long jarg1, BatchOpsVec jarg1_);
  public final static native void BatchOpsVec_reserve(long jarg1, BatchOpsVec jarg1_, long jarg2);
  public final static native boolean BatchOpsVec_empty(long jarg1, BatchOpsVec jarg1_);
  public final static native void BatchOpsVec_clear(long jarg1, BatchOpsVec jarg1_);
  public final static native void BatchOpsVec_push_back(long jarg1, BatchOpsVec jarg1_, long jarg2, qdb_operation_t jarg2_);
  public final static native long BatchOpsVec_get(long jarg1, BatchOpsVec jarg1_, int jarg2);
  public final static native void BatchOpsVec_set(long jarg1, BatchOpsVec jarg1_, int jarg2, long jarg3, qdb_operation_t jarg3_);
  public final static native void delete_BatchOpsVec(long jarg1);
  public final static native long run_batch(long jarg1, long jarg2, BatchOpsVec jarg2_);
  public final static native void release_batch_result(long jarg1, long jarg2, run_batch_result jarg2_);
}