// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: allerts.proto

package com.grpc.proto.smartproto;

/**
 * Protobuf enum {@code smartproto.AlertType}
 */
public enum AlertType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PM25 = 0;</code>
   */
  PM25(0),
  /**
   * <code>PM10 = 1;</code>
   */
  PM10(1),
  /**
   * <code>OZONE = 2;</code>
   */
  OZONE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PM25 = 0;</code>
   */
  public static final int PM25_VALUE = 0;
  /**
   * <code>PM10 = 1;</code>
   */
  public static final int PM10_VALUE = 1;
  /**
   * <code>OZONE = 2;</code>
   */
  public static final int OZONE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AlertType valueOf(int value) {
    return forNumber(value);
  }

  public static AlertType forNumber(int value) {
    switch (value) {
      case 0: return PM25;
      case 1: return PM10;
      case 2: return OZONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AlertType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AlertType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AlertType>() {
          public AlertType findValueByNumber(int number) {
            return AlertType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.grpc.proto.smartproto.SmartAlertsProtoImpl.getDescriptor().getEnumTypes().get(0);
  }

  private static final AlertType[] VALUES = values();

  public static AlertType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AlertType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:smartproto.AlertType)
}

