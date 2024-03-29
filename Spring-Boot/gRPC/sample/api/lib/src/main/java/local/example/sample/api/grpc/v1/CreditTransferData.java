// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package local.example.sample.api.grpc.v1;

/**
 * Protobuf type {@code local.example.sample.api.grpc.v1.CreditTransferData}
 */
public final class CreditTransferData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:local.example.sample.api.grpc.v1.CreditTransferData)
    CreditTransferDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreditTransferData.newBuilder() to construct.
  private CreditTransferData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreditTransferData() {
    accountNumber_ = "";
    routingNumber_ = "";
    fingerprint_ = "";
    bankName_ = "";
    swiftCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreditTransferData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreditTransferData(
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

            accountNumber_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            routingNumber_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fingerprint_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            bankName_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            swiftCode_ = s;
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
    return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_CreditTransferData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_CreditTransferData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            local.example.sample.api.grpc.v1.CreditTransferData.class, local.example.sample.api.grpc.v1.CreditTransferData.Builder.class);
  }

  public static final int ACCOUNTNUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object accountNumber_;
  /**
   * <code>string accountNumber = 1;</code>
   * @return The accountNumber.
   */
  @java.lang.Override
  public java.lang.String getAccountNumber() {
    java.lang.Object ref = accountNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string accountNumber = 1;</code>
   * @return The bytes for accountNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountNumberBytes() {
    java.lang.Object ref = accountNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accountNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROUTINGNUMBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object routingNumber_;
  /**
   * <code>string routingNumber = 2;</code>
   * @return The routingNumber.
   */
  @java.lang.Override
  public java.lang.String getRoutingNumber() {
    java.lang.Object ref = routingNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      routingNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string routingNumber = 2;</code>
   * @return The bytes for routingNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRoutingNumberBytes() {
    java.lang.Object ref = routingNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      routingNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FINGERPRINT_FIELD_NUMBER = 3;
  private volatile java.lang.Object fingerprint_;
  /**
   * <code>string fingerprint = 3;</code>
   * @return The fingerprint.
   */
  @java.lang.Override
  public java.lang.String getFingerprint() {
    java.lang.Object ref = fingerprint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fingerprint_ = s;
      return s;
    }
  }
  /**
   * <code>string fingerprint = 3;</code>
   * @return The bytes for fingerprint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFingerprintBytes() {
    java.lang.Object ref = fingerprint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fingerprint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BANKNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object bankName_;
  /**
   * <code>string bankName = 4;</code>
   * @return The bankName.
   */
  @java.lang.Override
  public java.lang.String getBankName() {
    java.lang.Object ref = bankName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bankName_ = s;
      return s;
    }
  }
  /**
   * <code>string bankName = 4;</code>
   * @return The bytes for bankName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBankNameBytes() {
    java.lang.Object ref = bankName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bankName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SWIFTCODE_FIELD_NUMBER = 5;
  private volatile java.lang.Object swiftCode_;
  /**
   * <code>string swiftCode = 5;</code>
   * @return The swiftCode.
   */
  @java.lang.Override
  public java.lang.String getSwiftCode() {
    java.lang.Object ref = swiftCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      swiftCode_ = s;
      return s;
    }
  }
  /**
   * <code>string swiftCode = 5;</code>
   * @return The bytes for swiftCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSwiftCodeBytes() {
    java.lang.Object ref = swiftCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      swiftCode_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accountNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(routingNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, routingNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fingerprint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fingerprint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bankName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, bankName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(swiftCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, swiftCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accountNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(routingNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, routingNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fingerprint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fingerprint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bankName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, bankName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(swiftCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, swiftCode_);
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
    if (!(obj instanceof local.example.sample.api.grpc.v1.CreditTransferData)) {
      return super.equals(obj);
    }
    local.example.sample.api.grpc.v1.CreditTransferData other = (local.example.sample.api.grpc.v1.CreditTransferData) obj;

    if (!getAccountNumber()
        .equals(other.getAccountNumber())) return false;
    if (!getRoutingNumber()
        .equals(other.getRoutingNumber())) return false;
    if (!getFingerprint()
        .equals(other.getFingerprint())) return false;
    if (!getBankName()
        .equals(other.getBankName())) return false;
    if (!getSwiftCode()
        .equals(other.getSwiftCode())) return false;
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
    hash = (37 * hash) + ACCOUNTNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getAccountNumber().hashCode();
    hash = (37 * hash) + ROUTINGNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getRoutingNumber().hashCode();
    hash = (37 * hash) + FINGERPRINT_FIELD_NUMBER;
    hash = (53 * hash) + getFingerprint().hashCode();
    hash = (37 * hash) + BANKNAME_FIELD_NUMBER;
    hash = (53 * hash) + getBankName().hashCode();
    hash = (37 * hash) + SWIFTCODE_FIELD_NUMBER;
    hash = (53 * hash) + getSwiftCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static local.example.sample.api.grpc.v1.CreditTransferData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.CreditTransferData parseFrom(
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
  public static Builder newBuilder(local.example.sample.api.grpc.v1.CreditTransferData prototype) {
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
   * Protobuf type {@code local.example.sample.api.grpc.v1.CreditTransferData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:local.example.sample.api.grpc.v1.CreditTransferData)
      local.example.sample.api.grpc.v1.CreditTransferDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_CreditTransferData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_CreditTransferData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              local.example.sample.api.grpc.v1.CreditTransferData.class, local.example.sample.api.grpc.v1.CreditTransferData.Builder.class);
    }

    // Construct using local.example.sample.api.grpc.v1.CreditTransferData.newBuilder()
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
      accountNumber_ = "";

      routingNumber_ = "";

      fingerprint_ = "";

      bankName_ = "";

      swiftCode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_CreditTransferData_descriptor;
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.CreditTransferData getDefaultInstanceForType() {
      return local.example.sample.api.grpc.v1.CreditTransferData.getDefaultInstance();
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.CreditTransferData build() {
      local.example.sample.api.grpc.v1.CreditTransferData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.CreditTransferData buildPartial() {
      local.example.sample.api.grpc.v1.CreditTransferData result = new local.example.sample.api.grpc.v1.CreditTransferData(this);
      result.accountNumber_ = accountNumber_;
      result.routingNumber_ = routingNumber_;
      result.fingerprint_ = fingerprint_;
      result.bankName_ = bankName_;
      result.swiftCode_ = swiftCode_;
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
      if (other instanceof local.example.sample.api.grpc.v1.CreditTransferData) {
        return mergeFrom((local.example.sample.api.grpc.v1.CreditTransferData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(local.example.sample.api.grpc.v1.CreditTransferData other) {
      if (other == local.example.sample.api.grpc.v1.CreditTransferData.getDefaultInstance()) return this;
      if (!other.getAccountNumber().isEmpty()) {
        accountNumber_ = other.accountNumber_;
        onChanged();
      }
      if (!other.getRoutingNumber().isEmpty()) {
        routingNumber_ = other.routingNumber_;
        onChanged();
      }
      if (!other.getFingerprint().isEmpty()) {
        fingerprint_ = other.fingerprint_;
        onChanged();
      }
      if (!other.getBankName().isEmpty()) {
        bankName_ = other.bankName_;
        onChanged();
      }
      if (!other.getSwiftCode().isEmpty()) {
        swiftCode_ = other.swiftCode_;
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
      local.example.sample.api.grpc.v1.CreditTransferData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (local.example.sample.api.grpc.v1.CreditTransferData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object accountNumber_ = "";
    /**
     * <code>string accountNumber = 1;</code>
     * @return The accountNumber.
     */
    public java.lang.String getAccountNumber() {
      java.lang.Object ref = accountNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string accountNumber = 1;</code>
     * @return The bytes for accountNumber.
     */
    public com.google.protobuf.ByteString
        getAccountNumberBytes() {
      java.lang.Object ref = accountNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string accountNumber = 1;</code>
     * @param value The accountNumber to set.
     * @return This builder for chaining.
     */
    public Builder setAccountNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accountNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string accountNumber = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountNumber() {
      
      accountNumber_ = getDefaultInstance().getAccountNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string accountNumber = 1;</code>
     * @param value The bytes for accountNumber to set.
     * @return This builder for chaining.
     */
    public Builder setAccountNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accountNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object routingNumber_ = "";
    /**
     * <code>string routingNumber = 2;</code>
     * @return The routingNumber.
     */
    public java.lang.String getRoutingNumber() {
      java.lang.Object ref = routingNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        routingNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string routingNumber = 2;</code>
     * @return The bytes for routingNumber.
     */
    public com.google.protobuf.ByteString
        getRoutingNumberBytes() {
      java.lang.Object ref = routingNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        routingNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string routingNumber = 2;</code>
     * @param value The routingNumber to set.
     * @return This builder for chaining.
     */
    public Builder setRoutingNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      routingNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string routingNumber = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoutingNumber() {
      
      routingNumber_ = getDefaultInstance().getRoutingNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string routingNumber = 2;</code>
     * @param value The bytes for routingNumber to set.
     * @return This builder for chaining.
     */
    public Builder setRoutingNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      routingNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fingerprint_ = "";
    /**
     * <code>string fingerprint = 3;</code>
     * @return The fingerprint.
     */
    public java.lang.String getFingerprint() {
      java.lang.Object ref = fingerprint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fingerprint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fingerprint = 3;</code>
     * @return The bytes for fingerprint.
     */
    public com.google.protobuf.ByteString
        getFingerprintBytes() {
      java.lang.Object ref = fingerprint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fingerprint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fingerprint = 3;</code>
     * @param value The fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setFingerprint(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fingerprint_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fingerprint = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFingerprint() {
      
      fingerprint_ = getDefaultInstance().getFingerprint();
      onChanged();
      return this;
    }
    /**
     * <code>string fingerprint = 3;</code>
     * @param value The bytes for fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setFingerprintBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fingerprint_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object bankName_ = "";
    /**
     * <code>string bankName = 4;</code>
     * @return The bankName.
     */
    public java.lang.String getBankName() {
      java.lang.Object ref = bankName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bankName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bankName = 4;</code>
     * @return The bytes for bankName.
     */
    public com.google.protobuf.ByteString
        getBankNameBytes() {
      java.lang.Object ref = bankName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bankName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bankName = 4;</code>
     * @param value The bankName to set.
     * @return This builder for chaining.
     */
    public Builder setBankName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bankName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bankName = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBankName() {
      
      bankName_ = getDefaultInstance().getBankName();
      onChanged();
      return this;
    }
    /**
     * <code>string bankName = 4;</code>
     * @param value The bytes for bankName to set.
     * @return This builder for chaining.
     */
    public Builder setBankNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bankName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object swiftCode_ = "";
    /**
     * <code>string swiftCode = 5;</code>
     * @return The swiftCode.
     */
    public java.lang.String getSwiftCode() {
      java.lang.Object ref = swiftCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        swiftCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string swiftCode = 5;</code>
     * @return The bytes for swiftCode.
     */
    public com.google.protobuf.ByteString
        getSwiftCodeBytes() {
      java.lang.Object ref = swiftCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        swiftCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string swiftCode = 5;</code>
     * @param value The swiftCode to set.
     * @return This builder for chaining.
     */
    public Builder setSwiftCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      swiftCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string swiftCode = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSwiftCode() {
      
      swiftCode_ = getDefaultInstance().getSwiftCode();
      onChanged();
      return this;
    }
    /**
     * <code>string swiftCode = 5;</code>
     * @param value The bytes for swiftCode to set.
     * @return This builder for chaining.
     */
    public Builder setSwiftCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      swiftCode_ = value;
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


    // @@protoc_insertion_point(builder_scope:local.example.sample.api.grpc.v1.CreditTransferData)
  }

  // @@protoc_insertion_point(class_scope:local.example.sample.api.grpc.v1.CreditTransferData)
  private static final local.example.sample.api.grpc.v1.CreditTransferData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new local.example.sample.api.grpc.v1.CreditTransferData();
  }

  public static local.example.sample.api.grpc.v1.CreditTransferData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreditTransferData>
      PARSER = new com.google.protobuf.AbstractParser<CreditTransferData>() {
    @java.lang.Override
    public CreditTransferData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreditTransferData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreditTransferData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreditTransferData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public local.example.sample.api.grpc.v1.CreditTransferData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

