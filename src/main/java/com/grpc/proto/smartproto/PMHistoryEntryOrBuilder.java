// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: history.proto

package com.grpc.proto.smartproto;

public interface PMHistoryEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:smartproto.PMHistoryEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timestamp (in seconds since the Unix epoch)
   * </pre>
   *
   * <code>int64 timestamp = 1;</code>
   */
  long getTimestamp();

  /**
   * <code>float value = 2;</code>
   */
  float getValue();
}
