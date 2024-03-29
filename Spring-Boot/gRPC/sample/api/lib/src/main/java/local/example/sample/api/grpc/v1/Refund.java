// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package local.example.sample.api.grpc.v1;

/**
 * Protobuf type {@code local.example.sample.api.grpc.v1.Refund}
 */
public final class Refund extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:local.example.sample.api.grpc.v1.Refund)
    RefundOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Refund.newBuilder() to construct.
  private Refund(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Refund() {
    id_ = "";
    fee_ = "";
    currency_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Refund();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Refund(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            id_ = s;
            break;
          }
          case 16: {

            amount_ = input.readUInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fee_ = s;
            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (created_ != null) {
              subBuilder = created_.toBuilder();
            }
            created_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(created_);
              created_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            currency_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_Refund_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_Refund_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            local.example.sample.api.grpc.v1.Refund.class, local.example.sample.api.grpc.v1.Refund.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private int amount_;
  /**
   * <code>uint32 amount = 2;</code>
   * @return The amount.
   */
  @java.lang.Override
  public int getAmount() {
    return amount_;
  }

  public static final int FEE_FIELD_NUMBER = 3;
  private volatile java.lang.Object fee_;
  /**
   * <code>string fee = 3;</code>
   * @return The fee.
   */
  @java.lang.Override
  public java.lang.String getFee() {
    java.lang.Object ref = fee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fee_ = s;
      return s;
    }
  }
  /**
   * <code>string fee = 3;</code>
   * @return The bytes for fee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeeBytes() {
    java.lang.Object ref = fee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fee_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATED_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp created_;
  /**
   * <code>.google.protobuf.Timestamp created = 4;</code>
   * @return Whether the created field is set.
   */
  @java.lang.Override
  public boolean hasCreated() {
    return created_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp created = 4;</code>
   * @return The created.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreated() {
    return created_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : created_;
  }
  /**
   * <code>.google.protobuf.Timestamp created = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder() {
    return getCreated();
  }

  public static final int CURRENCY_FIELD_NUMBER = 5;
  private volatile java.lang.Object currency_;
  /**
   * <code>string currency = 5;</code>
   * @return The currency.
   */
  @java.lang.Override
  public java.lang.String getCurrency() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currency_ = s;
      return s;
    }
  }
  /**
   * <code>string currency = 5;</code>
   * @return The bytes for currency.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCurrencyBytes() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (amount_ != 0) {
      output.writeUInt32(2, amount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fee_);
    }
    if (created_ != null) {
      output.writeMessage(4, getCreated());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(currency_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, currency_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (amount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, amount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fee_);
    }
    if (created_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCreated());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(currency_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, currency_);
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
    if (!(obj instanceof local.example.sample.api.grpc.v1.Refund)) {
      return super.equals(obj);
    }
    local.example.sample.api.grpc.v1.Refund other = (local.example.sample.api.grpc.v1.Refund) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (getAmount()
        != other.getAmount()) return false;
    if (!getFee()
        .equals(other.getFee())) return false;
    if (hasCreated() != other.hasCreated()) return false;
    if (hasCreated()) {
      if (!getCreated()
          .equals(other.getCreated())) return false;
    }
    if (!getCurrency()
        .equals(other.getCurrency())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount();
    hash = (37 * hash) + FEE_FIELD_NUMBER;
    hash = (53 * hash) + getFee().hashCode();
    if (hasCreated()) {
      hash = (37 * hash) + CREATED_FIELD_NUMBER;
      hash = (53 * hash) + getCreated().hashCode();
    }
    hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrency().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static local.example.sample.api.grpc.v1.Refund parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.Refund parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.Refund parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.Refund parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.Refund parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.Refund parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.Refund parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.Refund parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.Refund parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.Refund parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.Refund parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.Refund parseFrom(
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
  public static Builder newBuilder(local.example.sample.api.grpc.v1.Refund prototype) {
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
   * Protobuf type {@code local.example.sample.api.grpc.v1.Refund}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:local.example.sample.api.grpc.v1.Refund)
      local.example.sample.api.grpc.v1.RefundOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_Refund_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_Refund_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              local.example.sample.api.grpc.v1.Refund.class, local.example.sample.api.grpc.v1.Refund.Builder.class);
    }

    // Construct using local.example.sample.api.grpc.v1.Refund.newBuilder()
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
      id_ = "";

      amount_ = 0;

      fee_ = "";

      if (createdBuilder_ == null) {
        created_ = null;
      } else {
        created_ = null;
        createdBuilder_ = null;
      }
      currency_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_Refund_descriptor;
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.Refund getDefaultInstanceForType() {
      return local.example.sample.api.grpc.v1.Refund.getDefaultInstance();
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.Refund build() {
      local.example.sample.api.grpc.v1.Refund result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.Refund buildPartial() {
      local.example.sample.api.grpc.v1.Refund result = new local.example.sample.api.grpc.v1.Refund(this);
      result.id_ = id_;
      result.amount_ = amount_;
      result.fee_ = fee_;
      if (createdBuilder_ == null) {
        result.created_ = created_;
      } else {
        result.created_ = createdBuilder_.build();
      }
      result.currency_ = currency_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof local.example.sample.api.grpc.v1.Refund) {
        return mergeFrom((local.example.sample.api.grpc.v1.Refund)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(local.example.sample.api.grpc.v1.Refund other) {
      if (other == local.example.sample.api.grpc.v1.Refund.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getAmount() != 0) {
        setAmount(other.getAmount());
      }
      if (!other.getFee().isEmpty()) {
        fee_ = other.fee_;
        onChanged();
      }
      if (other.hasCreated()) {
        mergeCreated(other.getCreated());
      }
      if (!other.getCurrency().isEmpty()) {
        currency_ = other.currency_;
        onChanged();
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
      local.example.sample.api.grpc.v1.Refund parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (local.example.sample.api.grpc.v1.Refund) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private int amount_ ;
    /**
     * <code>uint32 amount = 2;</code>
     * @return The amount.
     */
    @java.lang.Override
    public int getAmount() {
      return amount_;
    }
    /**
     * <code>uint32 amount = 2;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(int value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 amount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fee_ = "";
    /**
     * <code>string fee = 3;</code>
     * @return The fee.
     */
    public java.lang.String getFee() {
      java.lang.Object ref = fee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fee = 3;</code>
     * @return The bytes for fee.
     */
    public com.google.protobuf.ByteString
        getFeeBytes() {
      java.lang.Object ref = fee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fee = 3;</code>
     * @param value The fee to set.
     * @return This builder for chaining.
     */
    public Builder setFee(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fee_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fee = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFee() {
      
      fee_ = getDefaultInstance().getFee();
      onChanged();
      return this;
    }
    /**
     * <code>string fee = 3;</code>
     * @param value The bytes for fee to set.
     * @return This builder for chaining.
     */
    public Builder setFeeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fee_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp created_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdBuilder_;
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     * @return Whether the created field is set.
     */
    public boolean hasCreated() {
      return createdBuilder_ != null || created_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     * @return The created.
     */
    public com.google.protobuf.Timestamp getCreated() {
      if (createdBuilder_ == null) {
        return created_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : created_;
      } else {
        return createdBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public Builder setCreated(com.google.protobuf.Timestamp value) {
      if (createdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        created_ = value;
        onChanged();
      } else {
        createdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public Builder setCreated(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createdBuilder_ == null) {
        created_ = builderForValue.build();
        onChanged();
      } else {
        createdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public Builder mergeCreated(com.google.protobuf.Timestamp value) {
      if (createdBuilder_ == null) {
        if (created_ != null) {
          created_ =
            com.google.protobuf.Timestamp.newBuilder(created_).mergeFrom(value).buildPartial();
        } else {
          created_ = value;
        }
        onChanged();
      } else {
        createdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public Builder clearCreated() {
      if (createdBuilder_ == null) {
        created_ = null;
        onChanged();
      } else {
        created_ = null;
        createdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreatedBuilder() {
      
      onChanged();
      return getCreatedFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder() {
      if (createdBuilder_ != null) {
        return createdBuilder_.getMessageOrBuilder();
      } else {
        return created_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : created_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreatedFieldBuilder() {
      if (createdBuilder_ == null) {
        createdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreated(),
                getParentForChildren(),
                isClean());
        created_ = null;
      }
      return createdBuilder_;
    }

    private java.lang.Object currency_ = "";
    /**
     * <code>string currency = 5;</code>
     * @return The currency.
     */
    public java.lang.String getCurrency() {
      java.lang.Object ref = currency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currency = 5;</code>
     * @return The bytes for currency.
     */
    public com.google.protobuf.ByteString
        getCurrencyBytes() {
      java.lang.Object ref = currency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currency = 5;</code>
     * @param value The currency to set.
     * @return This builder for chaining.
     */
    public Builder setCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currency = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrency() {
      
      currency_ = getDefaultInstance().getCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>string currency = 5;</code>
     * @param value The bytes for currency to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currency_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:local.example.sample.api.grpc.v1.Refund)
  }

  // @@protoc_insertion_point(class_scope:local.example.sample.api.grpc.v1.Refund)
  private static final local.example.sample.api.grpc.v1.Refund DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new local.example.sample.api.grpc.v1.Refund();
  }

  public static local.example.sample.api.grpc.v1.Refund getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Refund>
      PARSER = new com.google.protobuf.AbstractParser<Refund>() {
    @java.lang.Override
    public Refund parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Refund(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Refund> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Refund> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public local.example.sample.api.grpc.v1.Refund getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

