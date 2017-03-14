// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/step_stats.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.StepStats}
 */
public  final class StepStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.StepStats)
    StepStatsOrBuilder {
  // Use StepStats.newBuilder() to construct.
  private StepStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StepStats() {
    devStats_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StepStats(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              devStats_ = new java.util.ArrayList<org.tensorflow.framework.DeviceStepStats>();
              mutable_bitField0_ |= 0x00000001;
            }
            devStats_.add(
                input.readMessage(org.tensorflow.framework.DeviceStepStats.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        devStats_ = java.util.Collections.unmodifiableList(devStats_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_StepStats_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_StepStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.StepStats.class, org.tensorflow.framework.StepStats.Builder.class);
  }

  public static final int DEV_STATS_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.framework.DeviceStepStats> devStats_;
  /**
   * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
   */
  public java.util.List<org.tensorflow.framework.DeviceStepStats> getDevStatsList() {
    return devStats_;
  }
  /**
   * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.framework.DeviceStepStatsOrBuilder> 
      getDevStatsOrBuilderList() {
    return devStats_;
  }
  /**
   * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
   */
  public int getDevStatsCount() {
    return devStats_.size();
  }
  /**
   * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
   */
  public org.tensorflow.framework.DeviceStepStats getDevStats(int index) {
    return devStats_.get(index);
  }
  /**
   * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
   */
  public org.tensorflow.framework.DeviceStepStatsOrBuilder getDevStatsOrBuilder(
      int index) {
    return devStats_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < devStats_.size(); i++) {
      output.writeMessage(1, devStats_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < devStats_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, devStats_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.framework.StepStats)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.StepStats other = (org.tensorflow.framework.StepStats) obj;

    boolean result = true;
    result = result && getDevStatsList()
        .equals(other.getDevStatsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDevStatsCount() > 0) {
      hash = (37 * hash) + DEV_STATS_FIELD_NUMBER;
      hash = (53 * hash) + getDevStatsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.StepStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.StepStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.StepStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.StepStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.StepStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.StepStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.StepStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.StepStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.StepStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.StepStats parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.StepStats prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code tensorflow.StepStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.StepStats)
      org.tensorflow.framework.StepStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_StepStats_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_StepStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.StepStats.class, org.tensorflow.framework.StepStats.Builder.class);
    }

    // Construct using org.tensorflow.framework.StepStats.newBuilder()
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
        getDevStatsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (devStatsBuilder_ == null) {
        devStats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        devStatsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_StepStats_descriptor;
    }

    public org.tensorflow.framework.StepStats getDefaultInstanceForType() {
      return org.tensorflow.framework.StepStats.getDefaultInstance();
    }

    public org.tensorflow.framework.StepStats build() {
      org.tensorflow.framework.StepStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.framework.StepStats buildPartial() {
      org.tensorflow.framework.StepStats result = new org.tensorflow.framework.StepStats(this);
      int from_bitField0_ = bitField0_;
      if (devStatsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          devStats_ = java.util.Collections.unmodifiableList(devStats_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.devStats_ = devStats_;
      } else {
        result.devStats_ = devStatsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.StepStats) {
        return mergeFrom((org.tensorflow.framework.StepStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.StepStats other) {
      if (other == org.tensorflow.framework.StepStats.getDefaultInstance()) return this;
      if (devStatsBuilder_ == null) {
        if (!other.devStats_.isEmpty()) {
          if (devStats_.isEmpty()) {
            devStats_ = other.devStats_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDevStatsIsMutable();
            devStats_.addAll(other.devStats_);
          }
          onChanged();
        }
      } else {
        if (!other.devStats_.isEmpty()) {
          if (devStatsBuilder_.isEmpty()) {
            devStatsBuilder_.dispose();
            devStatsBuilder_ = null;
            devStats_ = other.devStats_;
            bitField0_ = (bitField0_ & ~0x00000001);
            devStatsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDevStatsFieldBuilder() : null;
          } else {
            devStatsBuilder_.addAllMessages(other.devStats_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.framework.StepStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.StepStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.framework.DeviceStepStats> devStats_ =
      java.util.Collections.emptyList();
    private void ensureDevStatsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        devStats_ = new java.util.ArrayList<org.tensorflow.framework.DeviceStepStats>(devStats_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.DeviceStepStats, org.tensorflow.framework.DeviceStepStats.Builder, org.tensorflow.framework.DeviceStepStatsOrBuilder> devStatsBuilder_;

    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.DeviceStepStats> getDevStatsList() {
      if (devStatsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(devStats_);
      } else {
        return devStatsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public int getDevStatsCount() {
      if (devStatsBuilder_ == null) {
        return devStats_.size();
      } else {
        return devStatsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public org.tensorflow.framework.DeviceStepStats getDevStats(int index) {
      if (devStatsBuilder_ == null) {
        return devStats_.get(index);
      } else {
        return devStatsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public Builder setDevStats(
        int index, org.tensorflow.framework.DeviceStepStats value) {
      if (devStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevStatsIsMutable();
        devStats_.set(index, value);
        onChanged();
      } else {
        devStatsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public Builder setDevStats(
        int index, org.tensorflow.framework.DeviceStepStats.Builder builderForValue) {
      if (devStatsBuilder_ == null) {
        ensureDevStatsIsMutable();
        devStats_.set(index, builderForValue.build());
        onChanged();
      } else {
        devStatsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public Builder addDevStats(org.tensorflow.framework.DeviceStepStats value) {
      if (devStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevStatsIsMutable();
        devStats_.add(value);
        onChanged();
      } else {
        devStatsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public Builder addDevStats(
        int index, org.tensorflow.framework.DeviceStepStats value) {
      if (devStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevStatsIsMutable();
        devStats_.add(index, value);
        onChanged();
      } else {
        devStatsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public Builder addDevStats(
        org.tensorflow.framework.DeviceStepStats.Builder builderForValue) {
      if (devStatsBuilder_ == null) {
        ensureDevStatsIsMutable();
        devStats_.add(builderForValue.build());
        onChanged();
      } else {
        devStatsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public Builder addDevStats(
        int index, org.tensorflow.framework.DeviceStepStats.Builder builderForValue) {
      if (devStatsBuilder_ == null) {
        ensureDevStatsIsMutable();
        devStats_.add(index, builderForValue.build());
        onChanged();
      } else {
        devStatsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public Builder addAllDevStats(
        java.lang.Iterable<? extends org.tensorflow.framework.DeviceStepStats> values) {
      if (devStatsBuilder_ == null) {
        ensureDevStatsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, devStats_);
        onChanged();
      } else {
        devStatsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public Builder clearDevStats() {
      if (devStatsBuilder_ == null) {
        devStats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        devStatsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public Builder removeDevStats(int index) {
      if (devStatsBuilder_ == null) {
        ensureDevStatsIsMutable();
        devStats_.remove(index);
        onChanged();
      } else {
        devStatsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public org.tensorflow.framework.DeviceStepStats.Builder getDevStatsBuilder(
        int index) {
      return getDevStatsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public org.tensorflow.framework.DeviceStepStatsOrBuilder getDevStatsOrBuilder(
        int index) {
      if (devStatsBuilder_ == null) {
        return devStats_.get(index);  } else {
        return devStatsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.framework.DeviceStepStatsOrBuilder> 
         getDevStatsOrBuilderList() {
      if (devStatsBuilder_ != null) {
        return devStatsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(devStats_);
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public org.tensorflow.framework.DeviceStepStats.Builder addDevStatsBuilder() {
      return getDevStatsFieldBuilder().addBuilder(
          org.tensorflow.framework.DeviceStepStats.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public org.tensorflow.framework.DeviceStepStats.Builder addDevStatsBuilder(
        int index) {
      return getDevStatsFieldBuilder().addBuilder(
          index, org.tensorflow.framework.DeviceStepStats.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.DeviceStepStats.Builder> 
         getDevStatsBuilderList() {
      return getDevStatsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.DeviceStepStats, org.tensorflow.framework.DeviceStepStats.Builder, org.tensorflow.framework.DeviceStepStatsOrBuilder> 
        getDevStatsFieldBuilder() {
      if (devStatsBuilder_ == null) {
        devStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.framework.DeviceStepStats, org.tensorflow.framework.DeviceStepStats.Builder, org.tensorflow.framework.DeviceStepStatsOrBuilder>(
                devStats_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        devStats_ = null;
      }
      return devStatsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.StepStats)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.StepStats)
  private static final org.tensorflow.framework.StepStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.StepStats();
  }

  public static org.tensorflow.framework.StepStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StepStats>
      PARSER = new com.google.protobuf.AbstractParser<StepStats>() {
    public StepStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StepStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StepStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StepStats> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.framework.StepStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

