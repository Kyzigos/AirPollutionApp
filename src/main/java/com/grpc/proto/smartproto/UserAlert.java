// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: allerts.proto

package com.grpc.proto.smartproto;

/**
 * Protobuf type {@code smartproto.UserAlert}
 */
public  final class UserAlert extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartproto.UserAlert)
    UserAlertOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserAlert.newBuilder() to construct.
  private UserAlert(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserAlert() {
    alertId_ = "";
    userId_ = "";
    alertType_ = 0;
    threshold_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserAlert(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            alertId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            alertType_ = rawValue;
            break;
          }
          case 34: {
            com.grpc.proto.smartproto.Location.Builder subBuilder = null;
            if (location_ != null) {
              subBuilder = location_.toBuilder();
            }
            location_ = input.readMessage(com.grpc.proto.smartproto.Location.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(location_);
              location_ = subBuilder.buildPartial();
            }

            break;
          }
          case 45: {

            threshold_ = input.readFloat();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.proto.smartproto.SmartAlertsProtoImpl.internal_static_smartproto_UserAlert_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.proto.smartproto.SmartAlertsProtoImpl.internal_static_smartproto_UserAlert_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.proto.smartproto.UserAlert.class, com.grpc.proto.smartproto.UserAlert.Builder.class);
  }

  public static final int ALERT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object alertId_;
  /**
   * <code>string alert_id = 1;</code>
   */
  public java.lang.String getAlertId() {
    java.lang.Object ref = alertId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alertId_ = s;
      return s;
    }
  }
  /**
   * <code>string alert_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAlertIdBytes() {
    java.lang.Object ref = alertId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alertId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object userId_;
  /**
   * <code>string user_id = 2;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALERT_TYPE_FIELD_NUMBER = 3;
  private int alertType_;
  /**
   * <code>.smartproto.AlertType alert_type = 3;</code>
   */
  public int getAlertTypeValue() {
    return alertType_;
  }
  /**
   * <code>.smartproto.AlertType alert_type = 3;</code>
   */
  public com.grpc.proto.smartproto.AlertType getAlertType() {
    @SuppressWarnings("deprecation")
    com.grpc.proto.smartproto.AlertType result = com.grpc.proto.smartproto.AlertType.valueOf(alertType_);
    return result == null ? com.grpc.proto.smartproto.AlertType.UNRECOGNIZED : result;
  }

  public static final int LOCATION_FIELD_NUMBER = 4;
  private com.grpc.proto.smartproto.Location location_;
  /**
   * <code>.smartproto.Location location = 4;</code>
   */
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <code>.smartproto.Location location = 4;</code>
   */
  public com.grpc.proto.smartproto.Location getLocation() {
    return location_ == null ? com.grpc.proto.smartproto.Location.getDefaultInstance() : location_;
  }
  /**
   * <code>.smartproto.Location location = 4;</code>
   */
  public com.grpc.proto.smartproto.LocationOrBuilder getLocationOrBuilder() {
    return getLocation();
  }

  public static final int THRESHOLD_FIELD_NUMBER = 5;
  private float threshold_;
  /**
   * <code>float threshold = 5;</code>
   */
  public float getThreshold() {
    return threshold_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAlertIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, alertId_);
    }
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    if (alertType_ != com.grpc.proto.smartproto.AlertType.PM25.getNumber()) {
      output.writeEnum(3, alertType_);
    }
    if (location_ != null) {
      output.writeMessage(4, getLocation());
    }
    if (threshold_ != 0F) {
      output.writeFloat(5, threshold_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAlertIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, alertId_);
    }
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
    }
    if (alertType_ != com.grpc.proto.smartproto.AlertType.PM25.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, alertType_);
    }
    if (location_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getLocation());
    }
    if (threshold_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, threshold_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.proto.smartproto.UserAlert)) {
      return super.equals(obj);
    }
    com.grpc.proto.smartproto.UserAlert other = (com.grpc.proto.smartproto.UserAlert) obj;

    boolean result = true;
    result = result && getAlertId()
        .equals(other.getAlertId());
    result = result && getUserId()
        .equals(other.getUserId());
    result = result && alertType_ == other.alertType_;
    result = result && (hasLocation() == other.hasLocation());
    if (hasLocation()) {
      result = result && getLocation()
          .equals(other.getLocation());
    }
    result = result && (
        java.lang.Float.floatToIntBits(getThreshold())
        == java.lang.Float.floatToIntBits(
            other.getThreshold()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ALERT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAlertId().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + ALERT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + alertType_;
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    hash = (37 * hash) + THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getThreshold());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.proto.smartproto.UserAlert parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.smartproto.UserAlert parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.smartproto.UserAlert parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.smartproto.UserAlert parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.smartproto.UserAlert parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.smartproto.UserAlert parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.smartproto.UserAlert parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.smartproto.UserAlert parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.smartproto.UserAlert parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.proto.smartproto.UserAlert parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.smartproto.UserAlert parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.smartproto.UserAlert parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.proto.smartproto.UserAlert prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code smartproto.UserAlert}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartproto.UserAlert)
      com.grpc.proto.smartproto.UserAlertOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.proto.smartproto.SmartAlertsProtoImpl.internal_static_smartproto_UserAlert_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.proto.smartproto.SmartAlertsProtoImpl.internal_static_smartproto_UserAlert_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.proto.smartproto.UserAlert.class, com.grpc.proto.smartproto.UserAlert.Builder.class);
    }

    // Construct using com.grpc.proto.smartproto.UserAlert.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      alertId_ = "";

      userId_ = "";

      alertType_ = 0;

      if (locationBuilder_ == null) {
        location_ = null;
      } else {
        location_ = null;
        locationBuilder_ = null;
      }
      threshold_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.proto.smartproto.SmartAlertsProtoImpl.internal_static_smartproto_UserAlert_descriptor;
    }

    @java.lang.Override
    public com.grpc.proto.smartproto.UserAlert getDefaultInstanceForType() {
      return com.grpc.proto.smartproto.UserAlert.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.proto.smartproto.UserAlert build() {
      com.grpc.proto.smartproto.UserAlert result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.proto.smartproto.UserAlert buildPartial() {
      com.grpc.proto.smartproto.UserAlert result = new com.grpc.proto.smartproto.UserAlert(this);
      result.alertId_ = alertId_;
      result.userId_ = userId_;
      result.alertType_ = alertType_;
      if (locationBuilder_ == null) {
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
      }
      result.threshold_ = threshold_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.proto.smartproto.UserAlert) {
        return mergeFrom((com.grpc.proto.smartproto.UserAlert)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.proto.smartproto.UserAlert other) {
      if (other == com.grpc.proto.smartproto.UserAlert.getDefaultInstance()) return this;
      if (!other.getAlertId().isEmpty()) {
        alertId_ = other.alertId_;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (other.alertType_ != 0) {
        setAlertTypeValue(other.getAlertTypeValue());
      }
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      if (other.getThreshold() != 0F) {
        setThreshold(other.getThreshold());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.grpc.proto.smartproto.UserAlert parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.proto.smartproto.UserAlert) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object alertId_ = "";
    /**
     * <code>string alert_id = 1;</code>
     */
    public java.lang.String getAlertId() {
      java.lang.Object ref = alertId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alertId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alert_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAlertIdBytes() {
      java.lang.Object ref = alertId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alertId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alert_id = 1;</code>
     */
    public Builder setAlertId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alertId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string alert_id = 1;</code>
     */
    public Builder clearAlertId() {
      
      alertId_ = getDefaultInstance().getAlertId();
      onChanged();
      return this;
    }
    /**
     * <code>string alert_id = 1;</code>
     */
    public Builder setAlertIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alertId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 2;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 2;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2;</code>
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private int alertType_ = 0;
    /**
     * <code>.smartproto.AlertType alert_type = 3;</code>
     */
    public int getAlertTypeValue() {
      return alertType_;
    }
    /**
     * <code>.smartproto.AlertType alert_type = 3;</code>
     */
    public Builder setAlertTypeValue(int value) {
      alertType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.smartproto.AlertType alert_type = 3;</code>
     */
    public com.grpc.proto.smartproto.AlertType getAlertType() {
      @SuppressWarnings("deprecation")
      com.grpc.proto.smartproto.AlertType result = com.grpc.proto.smartproto.AlertType.valueOf(alertType_);
      return result == null ? com.grpc.proto.smartproto.AlertType.UNRECOGNIZED : result;
    }
    /**
     * <code>.smartproto.AlertType alert_type = 3;</code>
     */
    public Builder setAlertType(com.grpc.proto.smartproto.AlertType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      alertType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.smartproto.AlertType alert_type = 3;</code>
     */
    public Builder clearAlertType() {
      
      alertType_ = 0;
      onChanged();
      return this;
    }

    private com.grpc.proto.smartproto.Location location_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.proto.smartproto.Location, com.grpc.proto.smartproto.Location.Builder, com.grpc.proto.smartproto.LocationOrBuilder> locationBuilder_;
    /**
     * <code>.smartproto.Location location = 4;</code>
     */
    public boolean hasLocation() {
      return locationBuilder_ != null || location_ != null;
    }
    /**
     * <code>.smartproto.Location location = 4;</code>
     */
    public com.grpc.proto.smartproto.Location getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.grpc.proto.smartproto.Location.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <code>.smartproto.Location location = 4;</code>
     */
    public Builder setLocation(com.grpc.proto.smartproto.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.smartproto.Location location = 4;</code>
     */
    public Builder setLocation(
        com.grpc.proto.smartproto.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.smartproto.Location location = 4;</code>
     */
    public Builder mergeLocation(com.grpc.proto.smartproto.Location value) {
      if (locationBuilder_ == null) {
        if (location_ != null) {
          location_ =
            com.grpc.proto.smartproto.Location.newBuilder(location_).mergeFrom(value).buildPartial();
        } else {
          location_ = value;
        }
        onChanged();
      } else {
        locationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.smartproto.Location location = 4;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = null;
        onChanged();
      } else {
        location_ = null;
        locationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.smartproto.Location location = 4;</code>
     */
    public com.grpc.proto.smartproto.Location.Builder getLocationBuilder() {
      
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>.smartproto.Location location = 4;</code>
     */
    public com.grpc.proto.smartproto.LocationOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.grpc.proto.smartproto.Location.getDefaultInstance() : location_;
      }
    }
    /**
     * <code>.smartproto.Location location = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.proto.smartproto.Location, com.grpc.proto.smartproto.Location.Builder, com.grpc.proto.smartproto.LocationOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.proto.smartproto.Location, com.grpc.proto.smartproto.Location.Builder, com.grpc.proto.smartproto.LocationOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }

    private float threshold_ ;
    /**
     * <code>float threshold = 5;</code>
     */
    public float getThreshold() {
      return threshold_;
    }
    /**
     * <code>float threshold = 5;</code>
     */
    public Builder setThreshold(float value) {
      
      threshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float threshold = 5;</code>
     */
    public Builder clearThreshold() {
      
      threshold_ = 0F;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:smartproto.UserAlert)
  }

  // @@protoc_insertion_point(class_scope:smartproto.UserAlert)
  private static final com.grpc.proto.smartproto.UserAlert DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.proto.smartproto.UserAlert();
  }

  public static com.grpc.proto.smartproto.UserAlert getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserAlert>
      PARSER = new com.google.protobuf.AbstractParser<UserAlert>() {
    @java.lang.Override
    public UserAlert parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserAlert(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserAlert> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserAlert> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.proto.smartproto.UserAlert getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

