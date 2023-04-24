// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: history.proto

package com.grpc.proto.smartproto;

/**
 * Protobuf type {@code smartproto.HistoryRequest}
 */
public  final class HistoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartproto.HistoryRequest)
    HistoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistoryRequest.newBuilder() to construct.
  private HistoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistoryRequest() {
    city_ = "";
    area_ = "";
    days_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HistoryRequest(
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

            city_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            area_ = s;
            break;
          }
          case 24: {

            days_ = input.readInt32();
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
    return com.grpc.proto.smartproto.HistoryDataProtoImpl.internal_static_smartproto_HistoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.proto.smartproto.HistoryDataProtoImpl.internal_static_smartproto_HistoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.proto.smartproto.HistoryRequest.class, com.grpc.proto.smartproto.HistoryRequest.Builder.class);
  }

  public static final int CITY_FIELD_NUMBER = 1;
  private volatile java.lang.Object city_;
  /**
   * <code>string city = 1;</code>
   */
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AREA_FIELD_NUMBER = 2;
  private volatile java.lang.Object area_;
  /**
   * <code>string area = 2;</code>
   */
  public java.lang.String getArea() {
    java.lang.Object ref = area_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      area_ = s;
      return s;
    }
  }
  /**
   * <code>string area = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAreaBytes() {
    java.lang.Object ref = area_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      area_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DAYS_FIELD_NUMBER = 3;
  private int days_;
  /**
   * <pre>
   * Number of days to retrieve historical data for
   * </pre>
   *
   * <code>int32 days = 3;</code>
   */
  public int getDays() {
    return days_;
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
    if (!getCityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, city_);
    }
    if (!getAreaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, area_);
    }
    if (days_ != 0) {
      output.writeInt32(3, days_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, city_);
    }
    if (!getAreaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, area_);
    }
    if (days_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, days_);
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
    if (!(obj instanceof com.grpc.proto.smartproto.HistoryRequest)) {
      return super.equals(obj);
    }
    com.grpc.proto.smartproto.HistoryRequest other = (com.grpc.proto.smartproto.HistoryRequest) obj;

    boolean result = true;
    result = result && getCity()
        .equals(other.getCity());
    result = result && getArea()
        .equals(other.getArea());
    result = result && (getDays()
        == other.getDays());
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
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    hash = (37 * hash) + AREA_FIELD_NUMBER;
    hash = (53 * hash) + getArea().hashCode();
    hash = (37 * hash) + DAYS_FIELD_NUMBER;
    hash = (53 * hash) + getDays();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.proto.smartproto.HistoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.smartproto.HistoryRequest parseFrom(
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
  public static Builder newBuilder(com.grpc.proto.smartproto.HistoryRequest prototype) {
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
   * Protobuf type {@code smartproto.HistoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartproto.HistoryRequest)
      com.grpc.proto.smartproto.HistoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.proto.smartproto.HistoryDataProtoImpl.internal_static_smartproto_HistoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.proto.smartproto.HistoryDataProtoImpl.internal_static_smartproto_HistoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.proto.smartproto.HistoryRequest.class, com.grpc.proto.smartproto.HistoryRequest.Builder.class);
    }

    // Construct using com.grpc.proto.smartproto.HistoryRequest.newBuilder()
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
      city_ = "";

      area_ = "";

      days_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.proto.smartproto.HistoryDataProtoImpl.internal_static_smartproto_HistoryRequest_descriptor;
    }

    @java.lang.Override
    public com.grpc.proto.smartproto.HistoryRequest getDefaultInstanceForType() {
      return com.grpc.proto.smartproto.HistoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.proto.smartproto.HistoryRequest build() {
      com.grpc.proto.smartproto.HistoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.proto.smartproto.HistoryRequest buildPartial() {
      com.grpc.proto.smartproto.HistoryRequest result = new com.grpc.proto.smartproto.HistoryRequest(this);
      result.city_ = city_;
      result.area_ = area_;
      result.days_ = days_;
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
      if (other instanceof com.grpc.proto.smartproto.HistoryRequest) {
        return mergeFrom((com.grpc.proto.smartproto.HistoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.proto.smartproto.HistoryRequest other) {
      if (other == com.grpc.proto.smartproto.HistoryRequest.getDefaultInstance()) return this;
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        onChanged();
      }
      if (!other.getArea().isEmpty()) {
        area_ = other.area_;
        onChanged();
      }
      if (other.getDays() != 0) {
        setDays(other.getDays());
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
      com.grpc.proto.smartproto.HistoryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.proto.smartproto.HistoryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 1;</code>
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 1;</code>
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      city_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 1;</code>
     */
    public Builder clearCity() {
      
      city_ = getDefaultInstance().getCity();
      onChanged();
      return this;
    }
    /**
     * <code>string city = 1;</code>
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      city_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object area_ = "";
    /**
     * <code>string area = 2;</code>
     */
    public java.lang.String getArea() {
      java.lang.Object ref = area_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        area_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string area = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAreaBytes() {
      java.lang.Object ref = area_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        area_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string area = 2;</code>
     */
    public Builder setArea(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      area_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string area = 2;</code>
     */
    public Builder clearArea() {
      
      area_ = getDefaultInstance().getArea();
      onChanged();
      return this;
    }
    /**
     * <code>string area = 2;</code>
     */
    public Builder setAreaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      area_ = value;
      onChanged();
      return this;
    }

    private int days_ ;
    /**
     * <pre>
     * Number of days to retrieve historical data for
     * </pre>
     *
     * <code>int32 days = 3;</code>
     */
    public int getDays() {
      return days_;
    }
    /**
     * <pre>
     * Number of days to retrieve historical data for
     * </pre>
     *
     * <code>int32 days = 3;</code>
     */
    public Builder setDays(int value) {
      
      days_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of days to retrieve historical data for
     * </pre>
     *
     * <code>int32 days = 3;</code>
     */
    public Builder clearDays() {
      
      days_ = 0;
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


    // @@protoc_insertion_point(builder_scope:smartproto.HistoryRequest)
  }

  // @@protoc_insertion_point(class_scope:smartproto.HistoryRequest)
  private static final com.grpc.proto.smartproto.HistoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.proto.smartproto.HistoryRequest();
  }

  public static com.grpc.proto.smartproto.HistoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<HistoryRequest>() {
    @java.lang.Override
    public HistoryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HistoryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HistoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.proto.smartproto.HistoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
