// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: realtimedata.proto

package com.grpc.proto.smartproto;

public interface SummaryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:smartproto.SummaryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .smartproto.AirQualitySummary summary = 1;</code>
   */
  java.util.List<com.grpc.proto.smartproto.AirQualitySummary> 
      getSummaryList();
  /**
   * <code>repeated .smartproto.AirQualitySummary summary = 1;</code>
   */
  com.grpc.proto.smartproto.AirQualitySummary getSummary(int index);
  /**
   * <code>repeated .smartproto.AirQualitySummary summary = 1;</code>
   */
  int getSummaryCount();
  /**
   * <code>repeated .smartproto.AirQualitySummary summary = 1;</code>
   */
  java.util.List<? extends com.grpc.proto.smartproto.AirQualitySummaryOrBuilder> 
      getSummaryOrBuilderList();
  /**
   * <code>repeated .smartproto.AirQualitySummary summary = 1;</code>
   */
  com.grpc.proto.smartproto.AirQualitySummaryOrBuilder getSummaryOrBuilder(
      int index);
}