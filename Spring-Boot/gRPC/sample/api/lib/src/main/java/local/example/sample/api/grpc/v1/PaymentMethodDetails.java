// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package local.example.sample.api.grpc.v1;

/**
 * Protobuf type {@code local.example.sample.api.grpc.v1.PaymentMethodDetails}
 */
public final class PaymentMethodDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:local.example.sample.api.grpc.v1.PaymentMethodDetails)
    PaymentMethodDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaymentMethodDetails.newBuilder() to construct.
  private PaymentMethodDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaymentMethodDetails() {
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PaymentMethodDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaymentMethodDetails(
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
            local.example.sample.api.grpc.v1.Card.Builder subBuilder = null;
            if (card_ != null) {
              subBuilder = card_.toBuilder();
            }
            card_ = input.readMessage(local.example.sample.api.grpc.v1.Card.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(card_);
              card_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 26: {
            local.example.sample.api.grpc.v1.SampleBrandAccount.Builder subBuilder = null;
            if (sampleBrandAccount_ != null) {
              subBuilder = sampleBrandAccount_.toBuilder();
            }
            sampleBrandAccount_ = input.readMessage(local.example.sample.api.grpc.v1.SampleBrandAccount.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sampleBrandAccount_);
              sampleBrandAccount_ = subBuilder.buildPartial();
            }

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
    return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_PaymentMethodDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_PaymentMethodDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            local.example.sample.api.grpc.v1.PaymentMethodDetails.class, local.example.sample.api.grpc.v1.PaymentMethodDetails.Builder.class);
  }

  public static final int CARD_FIELD_NUMBER = 1;
  private local.example.sample.api.grpc.v1.Card card_;
  /**
   * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
   * @return Whether the card field is set.
   */
  @java.lang.Override
  public boolean hasCard() {
    return card_ != null;
  }
  /**
   * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
   * @return The card.
   */
  @java.lang.Override
  public local.example.sample.api.grpc.v1.Card getCard() {
    return card_ == null ? local.example.sample.api.grpc.v1.Card.getDefaultInstance() : card_;
  }
  /**
   * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
   */
  @java.lang.Override
  public local.example.sample.api.grpc.v1.CardOrBuilder getCardOrBuilder() {
    return getCard();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 2;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAMPLEBRANDACCOUNT_FIELD_NUMBER = 3;
  private local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount_;
  /**
   * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
   * @return Whether the sampleBrandAccount field is set.
   */
  @java.lang.Override
  public boolean hasSampleBrandAccount() {
    return sampleBrandAccount_ != null;
  }
  /**
   * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
   * @return The sampleBrandAccount.
   */
  @java.lang.Override
  public local.example.sample.api.grpc.v1.SampleBrandAccount getSampleBrandAccount() {
    return sampleBrandAccount_ == null ? local.example.sample.api.grpc.v1.SampleBrandAccount.getDefaultInstance() : sampleBrandAccount_;
  }
  /**
   * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
   */
  @java.lang.Override
  public local.example.sample.api.grpc.v1.SampleBrandAccountOrBuilder getSampleBrandAccountOrBuilder() {
    return getSampleBrandAccount();
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
    if (card_ != null) {
      output.writeMessage(1, getCard());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (sampleBrandAccount_ != null) {
      output.writeMessage(3, getSampleBrandAccount());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (card_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCard());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (sampleBrandAccount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSampleBrandAccount());
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
    if (!(obj instanceof local.example.sample.api.grpc.v1.PaymentMethodDetails)) {
      return super.equals(obj);
    }
    local.example.sample.api.grpc.v1.PaymentMethodDetails other = (local.example.sample.api.grpc.v1.PaymentMethodDetails) obj;

    if (hasCard() != other.hasCard()) return false;
    if (hasCard()) {
      if (!getCard()
          .equals(other.getCard())) return false;
    }
    if (!getType()
        .equals(other.getType())) return false;
    if (hasSampleBrandAccount() != other.hasSampleBrandAccount()) return false;
    if (hasSampleBrandAccount()) {
      if (!getSampleBrandAccount()
          .equals(other.getSampleBrandAccount())) return false;
    }
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
    if (hasCard()) {
      hash = (37 * hash) + CARD_FIELD_NUMBER;
      hash = (53 * hash) + getCard().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (hasSampleBrandAccount()) {
      hash = (37 * hash) + SAMPLEBRANDACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getSampleBrandAccount().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static local.example.sample.api.grpc.v1.PaymentMethodDetails parseFrom(
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
  public static Builder newBuilder(local.example.sample.api.grpc.v1.PaymentMethodDetails prototype) {
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
   * Protobuf type {@code local.example.sample.api.grpc.v1.PaymentMethodDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:local.example.sample.api.grpc.v1.PaymentMethodDetails)
      local.example.sample.api.grpc.v1.PaymentMethodDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_PaymentMethodDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_PaymentMethodDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              local.example.sample.api.grpc.v1.PaymentMethodDetails.class, local.example.sample.api.grpc.v1.PaymentMethodDetails.Builder.class);
    }

    // Construct using local.example.sample.api.grpc.v1.PaymentMethodDetails.newBuilder()
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
      if (cardBuilder_ == null) {
        card_ = null;
      } else {
        card_ = null;
        cardBuilder_ = null;
      }
      type_ = "";

      if (sampleBrandAccountBuilder_ == null) {
        sampleBrandAccount_ = null;
      } else {
        sampleBrandAccount_ = null;
        sampleBrandAccountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.internal_static_local_example_sample_api_grpc_v1_PaymentMethodDetails_descriptor;
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.PaymentMethodDetails getDefaultInstanceForType() {
      return local.example.sample.api.grpc.v1.PaymentMethodDetails.getDefaultInstance();
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.PaymentMethodDetails build() {
      local.example.sample.api.grpc.v1.PaymentMethodDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public local.example.sample.api.grpc.v1.PaymentMethodDetails buildPartial() {
      local.example.sample.api.grpc.v1.PaymentMethodDetails result = new local.example.sample.api.grpc.v1.PaymentMethodDetails(this);
      if (cardBuilder_ == null) {
        result.card_ = card_;
      } else {
        result.card_ = cardBuilder_.build();
      }
      result.type_ = type_;
      if (sampleBrandAccountBuilder_ == null) {
        result.sampleBrandAccount_ = sampleBrandAccount_;
      } else {
        result.sampleBrandAccount_ = sampleBrandAccountBuilder_.build();
      }
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
      if (other instanceof local.example.sample.api.grpc.v1.PaymentMethodDetails) {
        return mergeFrom((local.example.sample.api.grpc.v1.PaymentMethodDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(local.example.sample.api.grpc.v1.PaymentMethodDetails other) {
      if (other == local.example.sample.api.grpc.v1.PaymentMethodDetails.getDefaultInstance()) return this;
      if (other.hasCard()) {
        mergeCard(other.getCard());
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.hasSampleBrandAccount()) {
        mergeSampleBrandAccount(other.getSampleBrandAccount());
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
      local.example.sample.api.grpc.v1.PaymentMethodDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (local.example.sample.api.grpc.v1.PaymentMethodDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private local.example.sample.api.grpc.v1.Card card_;
    private com.google.protobuf.SingleFieldBuilderV3<
        local.example.sample.api.grpc.v1.Card, local.example.sample.api.grpc.v1.Card.Builder, local.example.sample.api.grpc.v1.CardOrBuilder> cardBuilder_;
    /**
     * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
     * @return Whether the card field is set.
     */
    public boolean hasCard() {
      return cardBuilder_ != null || card_ != null;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
     * @return The card.
     */
    public local.example.sample.api.grpc.v1.Card getCard() {
      if (cardBuilder_ == null) {
        return card_ == null ? local.example.sample.api.grpc.v1.Card.getDefaultInstance() : card_;
      } else {
        return cardBuilder_.getMessage();
      }
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
     */
    public Builder setCard(local.example.sample.api.grpc.v1.Card value) {
      if (cardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        card_ = value;
        onChanged();
      } else {
        cardBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
     */
    public Builder setCard(
        local.example.sample.api.grpc.v1.Card.Builder builderForValue) {
      if (cardBuilder_ == null) {
        card_ = builderForValue.build();
        onChanged();
      } else {
        cardBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
     */
    public Builder mergeCard(local.example.sample.api.grpc.v1.Card value) {
      if (cardBuilder_ == null) {
        if (card_ != null) {
          card_ =
            local.example.sample.api.grpc.v1.Card.newBuilder(card_).mergeFrom(value).buildPartial();
        } else {
          card_ = value;
        }
        onChanged();
      } else {
        cardBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
     */
    public Builder clearCard() {
      if (cardBuilder_ == null) {
        card_ = null;
        onChanged();
      } else {
        card_ = null;
        cardBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
     */
    public local.example.sample.api.grpc.v1.Card.Builder getCardBuilder() {
      
      onChanged();
      return getCardFieldBuilder().getBuilder();
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
     */
    public local.example.sample.api.grpc.v1.CardOrBuilder getCardOrBuilder() {
      if (cardBuilder_ != null) {
        return cardBuilder_.getMessageOrBuilder();
      } else {
        return card_ == null ?
            local.example.sample.api.grpc.v1.Card.getDefaultInstance() : card_;
      }
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.Card card = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        local.example.sample.api.grpc.v1.Card, local.example.sample.api.grpc.v1.Card.Builder, local.example.sample.api.grpc.v1.CardOrBuilder> 
        getCardFieldBuilder() {
      if (cardBuilder_ == null) {
        cardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            local.example.sample.api.grpc.v1.Card, local.example.sample.api.grpc.v1.Card.Builder, local.example.sample.api.grpc.v1.CardOrBuilder>(
                getCard(),
                getParentForChildren(),
                isClean());
        card_ = null;
      }
      return cardBuilder_;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 2;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        local.example.sample.api.grpc.v1.SampleBrandAccount, local.example.sample.api.grpc.v1.SampleBrandAccount.Builder, local.example.sample.api.grpc.v1.SampleBrandAccountOrBuilder> sampleBrandAccountBuilder_;
    /**
     * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
     * @return Whether the sampleBrandAccount field is set.
     */
    public boolean hasSampleBrandAccount() {
      return sampleBrandAccountBuilder_ != null || sampleBrandAccount_ != null;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
     * @return The sampleBrandAccount.
     */
    public local.example.sample.api.grpc.v1.SampleBrandAccount getSampleBrandAccount() {
      if (sampleBrandAccountBuilder_ == null) {
        return sampleBrandAccount_ == null ? local.example.sample.api.grpc.v1.SampleBrandAccount.getDefaultInstance() : sampleBrandAccount_;
      } else {
        return sampleBrandAccountBuilder_.getMessage();
      }
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
     */
    public Builder setSampleBrandAccount(local.example.sample.api.grpc.v1.SampleBrandAccount value) {
      if (sampleBrandAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sampleBrandAccount_ = value;
        onChanged();
      } else {
        sampleBrandAccountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
     */
    public Builder setSampleBrandAccount(
        local.example.sample.api.grpc.v1.SampleBrandAccount.Builder builderForValue) {
      if (sampleBrandAccountBuilder_ == null) {
        sampleBrandAccount_ = builderForValue.build();
        onChanged();
      } else {
        sampleBrandAccountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
     */
    public Builder mergeSampleBrandAccount(local.example.sample.api.grpc.v1.SampleBrandAccount value) {
      if (sampleBrandAccountBuilder_ == null) {
        if (sampleBrandAccount_ != null) {
          sampleBrandAccount_ =
            local.example.sample.api.grpc.v1.SampleBrandAccount.newBuilder(sampleBrandAccount_).mergeFrom(value).buildPartial();
        } else {
          sampleBrandAccount_ = value;
        }
        onChanged();
      } else {
        sampleBrandAccountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
     */
    public Builder clearSampleBrandAccount() {
      if (sampleBrandAccountBuilder_ == null) {
        sampleBrandAccount_ = null;
        onChanged();
      } else {
        sampleBrandAccount_ = null;
        sampleBrandAccountBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
     */
    public local.example.sample.api.grpc.v1.SampleBrandAccount.Builder getSampleBrandAccountBuilder() {
      
      onChanged();
      return getSampleBrandAccountFieldBuilder().getBuilder();
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
     */
    public local.example.sample.api.grpc.v1.SampleBrandAccountOrBuilder getSampleBrandAccountOrBuilder() {
      if (sampleBrandAccountBuilder_ != null) {
        return sampleBrandAccountBuilder_.getMessageOrBuilder();
      } else {
        return sampleBrandAccount_ == null ?
            local.example.sample.api.grpc.v1.SampleBrandAccount.getDefaultInstance() : sampleBrandAccount_;
      }
    }
    /**
     * <code>.local.example.sample.api.grpc.v1.SampleBrandAccount sampleBrandAccount = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        local.example.sample.api.grpc.v1.SampleBrandAccount, local.example.sample.api.grpc.v1.SampleBrandAccount.Builder, local.example.sample.api.grpc.v1.SampleBrandAccountOrBuilder> 
        getSampleBrandAccountFieldBuilder() {
      if (sampleBrandAccountBuilder_ == null) {
        sampleBrandAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            local.example.sample.api.grpc.v1.SampleBrandAccount, local.example.sample.api.grpc.v1.SampleBrandAccount.Builder, local.example.sample.api.grpc.v1.SampleBrandAccountOrBuilder>(
                getSampleBrandAccount(),
                getParentForChildren(),
                isClean());
        sampleBrandAccount_ = null;
      }
      return sampleBrandAccountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:local.example.sample.api.grpc.v1.PaymentMethodDetails)
  }

  // @@protoc_insertion_point(class_scope:local.example.sample.api.grpc.v1.PaymentMethodDetails)
  private static final local.example.sample.api.grpc.v1.PaymentMethodDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new local.example.sample.api.grpc.v1.PaymentMethodDetails();
  }

  public static local.example.sample.api.grpc.v1.PaymentMethodDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaymentMethodDetails>
      PARSER = new com.google.protobuf.AbstractParser<PaymentMethodDetails>() {
    @java.lang.Override
    public PaymentMethodDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaymentMethodDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaymentMethodDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaymentMethodDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public local.example.sample.api.grpc.v1.PaymentMethodDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

