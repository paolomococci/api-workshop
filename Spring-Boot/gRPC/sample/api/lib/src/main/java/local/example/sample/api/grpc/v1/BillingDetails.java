// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package local.example.sample.api.grpc.v1;

/**
 * Protobuf type {@code local.example.sample.api.grpc.v1.BillingDetails}
 */
public final class BillingDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:local.example.sample.api.grpc.v1.BillingDetails)
    BillingDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BillingDetails.newBuilder() to construct.
  private BillingDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BillingDetails() {
    email_ = "";
    name_ = "";
    phone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BillingDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BillingDetails(
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
            local.example.sample.api.grpc.v1.Address.Builder subBuilder = null;
            if (address_ != null) {
              subBuilder = address_.toBuilder();
            }
            address_ = input.readMessage(local.example.sample.api.grpc.v1.Address.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(address_);
              address_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            phone_ = s;
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
    return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_BillingDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_BillingDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            local.example.sample.api.grpc.v1.BillingDetails.class, local.example.sample.api.grpc.v1.BillingDetails.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private local.example.sample.api.grpc.v1.Address address_;
  /**
   * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
   * @return Whether the address field is set.
   */
  @java.lang.Override
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
   * @return The address.
   */
  @java.lang.Override
  public local.example.sample.api.grpc.v1.Address getAddress() {
    return address_ == null ? local.example.sample.api.grpc.v1.Address.getDefaultInstance() : address_;
  }
  /**
   * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
   */
  @java.lang.Override
  public local.example.sample.api.grpc.v1.AddressOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int EMAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 2;</code>
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 2;</code>
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONE_FIELD_NUMBER = 4;
  private volatile java.lang.Object phone_;
  /**
   * <code>string phone = 4;</code>
   * @return The phone.
   */
  @java.lang.Override
  public java.lang.String getPhone() {
    java.lang.Object ref = phone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phone_ = s;
      return s;
    }
  }
  /**
   * <code>string phone = 4;</code>
   * @return The bytes for phone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhoneBytes() {
    java.lang.Object ref = phone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phone_ = b;
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
    if (address_ != null) {
      output.writeMessage(1, getAddress());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, email_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, phone_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAddress());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, email_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, phone_);
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
    if (!(obj instanceof local.example.sample.api.grpc.v1.BillingDetails)) {
      return super.equals(obj);
    }
    local.example.sample.api.grpc.v1.BillingDetails other = (local.example.sample.api.grpc.v1.BillingDetails) obj;

    if (hasAddress() != other.hasAddress()) return false;
    if (hasAddress()) {
      if (!getAddress()
          .equals(other.getAddress())) return false;
    }
    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getPhone()
        .equals(other.getPhone())) return false;
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
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PHONE_FIELD_NUMBER;
    hash = (53 * hash) + getPhone().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static local.example.sample.api.grpc.v1.BillingDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.BillingDetails parseFrom(
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
  public static Builder newBuilder(local.example.sample.api.grpc.v1.BillingDetails prototype) {
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
   * Protobuf type {@code local.example.sample.api.grpc.v1.BillingDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:local.example.sample.api.grpc.v1.BillingDetails)
      local.example.sample.api.grpc.v1.BillingDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_BillingDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_BillingDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              local.example.sample.api.grpc.v1.BillingDetails.class, local.example.sample.api.grpc.v1.BillingDetails.Builder.class);
    }

    // Construct using local.example.sample.api.grpc.v1.BillingDetails.newBuilder()
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
      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      email_ = "";

      name_ = "";

      phone_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_BillingDetails_descriptor;
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.BillingDetails getDefaultInstanceForType() {
      return local.example.sample.api.grpc.v1.BillingDetails.getDefaultInstance();
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.BillingDetails build() {
      local.example.sample.api.grpc.v1.BillingDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.BillingDetails buildPartial() {
      local.example.sample.api.grpc.v1.BillingDetails result = new local.example.sample.api.grpc.v1.BillingDetails(this);
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      result.email_ = email_;
      result.name_ = name_;
      result.phone_ = phone_;
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
      if (other instanceof local.example.sample.api.grpc.v1.BillingDetails) {
        return mergeFrom((local.example.sample.api.grpc.v1.BillingDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(local.example.sample.api.grpc.v1.BillingDetails other) {
      if (other == local.example.sample.api.grpc.v1.BillingDetails.getDefaultInstance()) return this;
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getPhone().isEmpty()) {
        phone_ = other.phone_;
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
      local.example.sample.api.grpc.v1.BillingDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (local.example.sample.api.grpc.v1.BillingDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private local.example.sample.api.grpc.v1.Address address_;
    private com.google.protobuf.SingleFieldBuilderV3<
        local.example.sample.api.grpc.v1.Address, local.example.sample.api.grpc.v1.Address.Builder, local.example.sample.api.grpc.v1.AddressOrBuilder> addressBuilder_;
    /**
     * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
     * @return Whether the address field is set.
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
     * @return The address.
     */
    public local.example.sample.api.grpc.v1.Address getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? local.example.sample.api.grpc.v1.Address.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
     */
    public Builder setAddress(local.example.sample.api.grpc.v1.Address value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
     */
    public Builder setAddress(
        local.example.sample.api.grpc.v1.Address.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
     */
    public Builder mergeAddress(local.example.sample.api.grpc.v1.Address value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            local.example.sample.api.grpc.v1.Address.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
     */
    public local.example.sample.api.grpc.v1.Address.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
     */
    public local.example.sample.api.grpc.v1.AddressOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            local.example.sample.api.grpc.v1.Address.getDefaultInstance() : address_;
      }
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Address address = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        local.example.sample.api.grpc.v1.Address, local.example.sample.api.grpc.v1.Address.Builder, local.example.sample.api.grpc.v1.AddressOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            local.example.sample.api.grpc.v1.Address, local.example.sample.api.grpc.v1.Address.Builder, local.example.sample.api.grpc.v1.AddressOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 2;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 2;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 2;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 2;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object phone_ = "";
    /**
     * <code>string phone = 4;</code>
     * @return The phone.
     */
    public java.lang.String getPhone() {
      java.lang.Object ref = phone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string phone = 4;</code>
     * @return The bytes for phone.
     */
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      java.lang.Object ref = phone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string phone = 4;</code>
     * @param value The phone to set.
     * @return This builder for chaining.
     */
    public Builder setPhone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string phone = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhone() {
      
      phone_ = getDefaultInstance().getPhone();
      onChanged();
      return this;
    }
    /**
     * <code>string phone = 4;</code>
     * @param value The bytes for phone to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phone_ = value;
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


    // @@protoc_insertion_point(builder_scope:local.example.sample.api.grpc.v1.BillingDetails)
  }

  // @@protoc_insertion_point(class_scope:local.example.sample.api.grpc.v1.BillingDetails)
  private static final local.example.sample.api.grpc.v1.BillingDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new local.example.sample.api.grpc.v1.BillingDetails();
  }

  public static local.example.sample.api.grpc.v1.BillingDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BillingDetails>
      PARSER = new com.google.protobuf.AbstractParser<BillingDetails>() {
    @java.lang.Override
    public BillingDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BillingDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BillingDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BillingDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public local.example.sample.api.grpc.v1.BillingDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

