// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: realtimedata.proto

package com.grpc.proto.smartproto;

public final class SmartProtoImpl {
  private SmartProtoImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartproto_PMRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartproto_PMRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartproto_PMResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartproto_PMResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartproto_OzoneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartproto_OzoneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartproto_OzoneResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartproto_OzoneResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartproto_SummaryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartproto_SummaryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartproto_SummaryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartproto_SummaryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartproto_AirQualitySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartproto_AirQualitySummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartproto_LocationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartproto_LocationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartproto_LocationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartproto_LocationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartproto_AirQualityByLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartproto_AirQualityByLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022realtimedata.proto\022\nsmartproto\"\'\n\tPMRe" +
      "quest\022\014\n\004city\030\001 \001(\t\022\014\n\004area\030\002 \001(\t\"\033\n\nPMR" +
      "esponse\022\r\n\005value\030\001 \001(\002\"*\n\014OzoneRequest\022\014" +
      "\n\004city\030\001 \001(\t\022\014\n\004area\030\002 \001(\t\"\036\n\rOzoneRespo" +
      "nse\022\r\n\005value\030\001 \001(\002\"\036\n\016SummaryRequest\022\014\n\004" +
      "city\030\001 \001(\t\"A\n\017SummaryResponse\022.\n\007summary" +
      "\030\001 \003(\0132\035.smartproto.AirQualitySummary\"t\n" +
      "\021AirQualitySummary\022\014\n\004area\030\001 \001(\t\022\021\n\tpm25" +
      "Value\030\002 \001(\002\022\021\n\tpm10Value\030\003 \001(\002\022\022\n\nozoneV" +
      "alue\030\004 \001(\002\022\027\n\017airQualityIndex\030\005 \001(\002\"6\n\017L" +
      "ocationRequest\022\020\n\010latitude\030\001 \001(\002\022\021\n\tlong" +
      "itude\030\002 \001(\002\"L\n\020LocationResponse\0228\n\016airQu" +
      "alityList\030\001 \003(\0132 .smartproto.AirQualityB" +
      "yLocation\"^\n\024AirQualityByLocation\022\014\n\004are" +
      "a\030\001 \001(\t\022\021\n\tpm25Value\030\002 \001(\002\022\021\n\tpm10Value\030" +
      "\003 \001(\002\022\022\n\nozoneValue\030\004 \001(\0022\371\002\n\021AirQuality" +
      "Service\022:\n\007getPM25\022\025.smartproto.PMReques" +
      "t\032\026.smartproto.PMResponse\"\000\022:\n\007getPM10\022\025" +
      ".smartproto.PMRequest\032\026.smartproto.PMRes" +
      "ponse\"\000\022A\n\010getOzone\022\030.smartproto.OzoneRe" +
      "quest\032\031.smartproto.OzoneResponse\"\000\022Q\n\024ge" +
      "tAirQualitySummary\022\032.smartproto.SummaryR" +
      "equest\032\033.smartproto.SummaryResponse\"\000\022V\n" +
      "\027getAirQualityByLocation\022\033.smartproto.Lo" +
      "cationRequest\032\034.smartproto.LocationRespo" +
      "nse\"\000B-\n\031com.grpc.proto.smartprotoB\016Smar" +
      "tProtoImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_smartproto_PMRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartproto_PMRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartproto_PMRequest_descriptor,
        new java.lang.String[] { "City", "Area", });
    internal_static_smartproto_PMResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartproto_PMResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartproto_PMResponse_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_smartproto_OzoneRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartproto_OzoneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartproto_OzoneRequest_descriptor,
        new java.lang.String[] { "City", "Area", });
    internal_static_smartproto_OzoneResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smartproto_OzoneResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartproto_OzoneResponse_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_smartproto_SummaryRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smartproto_SummaryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartproto_SummaryRequest_descriptor,
        new java.lang.String[] { "City", });
    internal_static_smartproto_SummaryResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_smartproto_SummaryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartproto_SummaryResponse_descriptor,
        new java.lang.String[] { "Summary", });
    internal_static_smartproto_AirQualitySummary_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_smartproto_AirQualitySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartproto_AirQualitySummary_descriptor,
        new java.lang.String[] { "Area", "Pm25Value", "Pm10Value", "OzoneValue", "AirQualityIndex", });
    internal_static_smartproto_LocationRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_smartproto_LocationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartproto_LocationRequest_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", });
    internal_static_smartproto_LocationResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_smartproto_LocationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartproto_LocationResponse_descriptor,
        new java.lang.String[] { "AirQualityList", });
    internal_static_smartproto_AirQualityByLocation_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_smartproto_AirQualityByLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartproto_AirQualityByLocation_descriptor,
        new java.lang.String[] { "Area", "Pm25Value", "Pm10Value", "OzoneValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
