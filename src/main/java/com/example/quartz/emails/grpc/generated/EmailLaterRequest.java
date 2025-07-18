// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: email_service.proto

package com.example.quartz.emails.grpc.generated;

/**
 * Protobuf type {@code com.example.quartz.emails.grpc.generated.EmailLaterRequest}
 */
public final class EmailLaterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.quartz.emails.grpc.generated.EmailLaterRequest)
    EmailLaterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmailLaterRequest.newBuilder() to construct.
  private EmailLaterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmailLaterRequest() {
    emailAddress_ = "";
    sub_ = "";
    body_ = "";
    cronExpression_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmailLaterRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.quartz.emails.grpc.generated.EmailServiceOuterClass.internal_static_com_example_quartz_emails_grpc_generated_EmailLaterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.quartz.emails.grpc.generated.EmailServiceOuterClass.internal_static_com_example_quartz_emails_grpc_generated_EmailLaterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.quartz.emails.grpc.generated.EmailLaterRequest.class, com.example.quartz.emails.grpc.generated.EmailLaterRequest.Builder.class);
  }

  public static final int EMAIL_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object emailAddress_ = "";
  /**
   * <code>string email_address = 1;</code>
   * @return The emailAddress.
   */
  @java.lang.Override
  public java.lang.String getEmailAddress() {
    java.lang.Object ref = emailAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string email_address = 1;</code>
   * @return The bytes for emailAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailAddressBytes() {
    java.lang.Object ref = emailAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emailAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUB_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sub_ = "";
  /**
   * <code>string sub = 2;</code>
   * @return The sub.
   */
  @java.lang.Override
  public java.lang.String getSub() {
    java.lang.Object ref = sub_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sub_ = s;
      return s;
    }
  }
  /**
   * <code>string sub = 2;</code>
   * @return The bytes for sub.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubBytes() {
    java.lang.Object ref = sub_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sub_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BODY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object body_ = "";
  /**
   * <code>string body = 3;</code>
   * @return The body.
   */
  @java.lang.Override
  public java.lang.String getBody() {
    java.lang.Object ref = body_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      body_ = s;
      return s;
    }
  }
  /**
   * <code>string body = 3;</code>
   * @return The bytes for body.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBodyBytes() {
    java.lang.Object ref = body_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      body_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CRON_EXPRESSION_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cronExpression_ = "";
  /**
   * <code>string cron_expression = 4;</code>
   * @return The cronExpression.
   */
  @java.lang.Override
  public java.lang.String getCronExpression() {
    java.lang.Object ref = cronExpression_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cronExpression_ = s;
      return s;
    }
  }
  /**
   * <code>string cron_expression = 4;</code>
   * @return The bytes for cronExpression.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCronExpressionBytes() {
    java.lang.Object ref = cronExpression_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cronExpression_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, emailAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sub_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sub_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(body_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, body_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cronExpression_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, cronExpression_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, emailAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sub_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sub_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(body_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, body_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cronExpression_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, cronExpression_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.quartz.emails.grpc.generated.EmailLaterRequest)) {
      return super.equals(obj);
    }
    com.example.quartz.emails.grpc.generated.EmailLaterRequest other = (com.example.quartz.emails.grpc.generated.EmailLaterRequest) obj;

    if (!getEmailAddress()
        .equals(other.getEmailAddress())) return false;
    if (!getSub()
        .equals(other.getSub())) return false;
    if (!getBody()
        .equals(other.getBody())) return false;
    if (!getCronExpression()
        .equals(other.getCronExpression())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EMAIL_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getEmailAddress().hashCode();
    hash = (37 * hash) + SUB_FIELD_NUMBER;
    hash = (53 * hash) + getSub().hashCode();
    hash = (37 * hash) + BODY_FIELD_NUMBER;
    hash = (53 * hash) + getBody().hashCode();
    hash = (37 * hash) + CRON_EXPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + getCronExpression().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest parseFrom(
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
  public static Builder newBuilder(com.example.quartz.emails.grpc.generated.EmailLaterRequest prototype) {
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
   * Protobuf type {@code com.example.quartz.emails.grpc.generated.EmailLaterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.quartz.emails.grpc.generated.EmailLaterRequest)
      com.example.quartz.emails.grpc.generated.EmailLaterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.quartz.emails.grpc.generated.EmailServiceOuterClass.internal_static_com_example_quartz_emails_grpc_generated_EmailLaterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.quartz.emails.grpc.generated.EmailServiceOuterClass.internal_static_com_example_quartz_emails_grpc_generated_EmailLaterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.quartz.emails.grpc.generated.EmailLaterRequest.class, com.example.quartz.emails.grpc.generated.EmailLaterRequest.Builder.class);
    }

    // Construct using com.example.quartz.emails.grpc.generated.EmailLaterRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      emailAddress_ = "";
      sub_ = "";
      body_ = "";
      cronExpression_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.quartz.emails.grpc.generated.EmailServiceOuterClass.internal_static_com_example_quartz_emails_grpc_generated_EmailLaterRequest_descriptor;
    }

    @java.lang.Override
    public com.example.quartz.emails.grpc.generated.EmailLaterRequest getDefaultInstanceForType() {
      return com.example.quartz.emails.grpc.generated.EmailLaterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.quartz.emails.grpc.generated.EmailLaterRequest build() {
      com.example.quartz.emails.grpc.generated.EmailLaterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.quartz.emails.grpc.generated.EmailLaterRequest buildPartial() {
      com.example.quartz.emails.grpc.generated.EmailLaterRequest result = new com.example.quartz.emails.grpc.generated.EmailLaterRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.quartz.emails.grpc.generated.EmailLaterRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emailAddress_ = emailAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sub_ = sub_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.body_ = body_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.cronExpression_ = cronExpression_;
      }
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
      if (other instanceof com.example.quartz.emails.grpc.generated.EmailLaterRequest) {
        return mergeFrom((com.example.quartz.emails.grpc.generated.EmailLaterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.quartz.emails.grpc.generated.EmailLaterRequest other) {
      if (other == com.example.quartz.emails.grpc.generated.EmailLaterRequest.getDefaultInstance()) return this;
      if (!other.getEmailAddress().isEmpty()) {
        emailAddress_ = other.emailAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSub().isEmpty()) {
        sub_ = other.sub_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getBody().isEmpty()) {
        body_ = other.body_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getCronExpression().isEmpty()) {
        cronExpression_ = other.cronExpression_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              emailAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              sub_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              body_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              cronExpression_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object emailAddress_ = "";
    /**
     * <code>string email_address = 1;</code>
     * @return The emailAddress.
     */
    public java.lang.String getEmailAddress() {
      java.lang.Object ref = emailAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email_address = 1;</code>
     * @return The bytes for emailAddress.
     */
    public com.google.protobuf.ByteString
        getEmailAddressBytes() {
      java.lang.Object ref = emailAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email_address = 1;</code>
     * @param value The emailAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEmailAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      emailAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string email_address = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailAddress() {
      emailAddress_ = getDefaultInstance().getEmailAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string email_address = 1;</code>
     * @param value The bytes for emailAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEmailAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      emailAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object sub_ = "";
    /**
     * <code>string sub = 2;</code>
     * @return The sub.
     */
    public java.lang.String getSub() {
      java.lang.Object ref = sub_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sub_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sub = 2;</code>
     * @return The bytes for sub.
     */
    public com.google.protobuf.ByteString
        getSubBytes() {
      java.lang.Object ref = sub_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sub_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sub = 2;</code>
     * @param value The sub to set.
     * @return This builder for chaining.
     */
    public Builder setSub(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sub_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string sub = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSub() {
      sub_ = getDefaultInstance().getSub();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string sub = 2;</code>
     * @param value The bytes for sub to set.
     * @return This builder for chaining.
     */
    public Builder setSubBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sub_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object body_ = "";
    /**
     * <code>string body = 3;</code>
     * @return The body.
     */
    public java.lang.String getBody() {
      java.lang.Object ref = body_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        body_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string body = 3;</code>
     * @return The bytes for body.
     */
    public com.google.protobuf.ByteString
        getBodyBytes() {
      java.lang.Object ref = body_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        body_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string body = 3;</code>
     * @param value The body to set.
     * @return This builder for chaining.
     */
    public Builder setBody(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      body_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string body = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBody() {
      body_ = getDefaultInstance().getBody();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string body = 3;</code>
     * @param value The bytes for body to set.
     * @return This builder for chaining.
     */
    public Builder setBodyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      body_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object cronExpression_ = "";
    /**
     * <code>string cron_expression = 4;</code>
     * @return The cronExpression.
     */
    public java.lang.String getCronExpression() {
      java.lang.Object ref = cronExpression_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cronExpression_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cron_expression = 4;</code>
     * @return The bytes for cronExpression.
     */
    public com.google.protobuf.ByteString
        getCronExpressionBytes() {
      java.lang.Object ref = cronExpression_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cronExpression_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cron_expression = 4;</code>
     * @param value The cronExpression to set.
     * @return This builder for chaining.
     */
    public Builder setCronExpression(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cronExpression_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string cron_expression = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCronExpression() {
      cronExpression_ = getDefaultInstance().getCronExpression();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string cron_expression = 4;</code>
     * @param value The bytes for cronExpression to set.
     * @return This builder for chaining.
     */
    public Builder setCronExpressionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cronExpression_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:com.example.quartz.emails.grpc.generated.EmailLaterRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.quartz.emails.grpc.generated.EmailLaterRequest)
  private static final com.example.quartz.emails.grpc.generated.EmailLaterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.quartz.emails.grpc.generated.EmailLaterRequest();
  }

  public static com.example.quartz.emails.grpc.generated.EmailLaterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmailLaterRequest>
      PARSER = new com.google.protobuf.AbstractParser<EmailLaterRequest>() {
    @java.lang.Override
    public EmailLaterRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EmailLaterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmailLaterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.quartz.emails.grpc.generated.EmailLaterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

