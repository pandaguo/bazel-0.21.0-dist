// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/protobuf/extra_actions_base.proto

package com.google.devtools.build.lib.actions.extra;

/**
 * <pre>
 * An individual action printed by the print_action command.
 * </pre>
 *
 * Protobuf type {@code blaze.DetailedExtraActionInfo}
 */
public  final class DetailedExtraActionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:blaze.DetailedExtraActionInfo)
    DetailedExtraActionInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DetailedExtraActionInfo.newBuilder() to construct.
  private DetailedExtraActionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DetailedExtraActionInfo() {
    triggeringFile_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DetailedExtraActionInfo(
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
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            triggeringFile_ = bs;
            break;
          }
          case 18: {
            com.google.devtools.build.lib.actions.extra.ExtraActionInfo.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = action_.toBuilder();
            }
            action_ = input.readMessage(com.google.devtools.build.lib.actions.extra.ExtraActionInfo.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(action_);
              action_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
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
    return com.google.devtools.build.lib.actions.extra.ExtraActionsBase.internal_static_blaze_DetailedExtraActionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.build.lib.actions.extra.ExtraActionsBase.internal_static_blaze_DetailedExtraActionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo.class, com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo.Builder.class);
  }

  private int bitField0_;
  public static final int TRIGGERING_FILE_FIELD_NUMBER = 1;
  private volatile java.lang.Object triggeringFile_;
  /**
   * <pre>
   * If the given action was included in the output due to a request for a
   * specific file, then this field contains the name of that file so that the
   * caller can correctly associate the extra action with that file.
   * The data in this message is currently not sufficient to run the action on a
   * production machine, because not all necessary input files are identified,
   * especially for C++.
   * There is no easy way to fix this; we could require that all header files
   * are declared and then add all of them here (which would be a huge superset
   * of the files that are actually required), or we could run the include
   * scanner and add those files here.
   * </pre>
   *
   * <code>optional string triggering_file = 1;</code>
   */
  public boolean hasTriggeringFile() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * If the given action was included in the output due to a request for a
   * specific file, then this field contains the name of that file so that the
   * caller can correctly associate the extra action with that file.
   * The data in this message is currently not sufficient to run the action on a
   * production machine, because not all necessary input files are identified,
   * especially for C++.
   * There is no easy way to fix this; we could require that all header files
   * are declared and then add all of them here (which would be a huge superset
   * of the files that are actually required), or we could run the include
   * scanner and add those files here.
   * </pre>
   *
   * <code>optional string triggering_file = 1;</code>
   */
  public java.lang.String getTriggeringFile() {
    java.lang.Object ref = triggeringFile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        triggeringFile_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * If the given action was included in the output due to a request for a
   * specific file, then this field contains the name of that file so that the
   * caller can correctly associate the extra action with that file.
   * The data in this message is currently not sufficient to run the action on a
   * production machine, because not all necessary input files are identified,
   * especially for C++.
   * There is no easy way to fix this; we could require that all header files
   * are declared and then add all of them here (which would be a huge superset
   * of the files that are actually required), or we could run the include
   * scanner and add those files here.
   * </pre>
   *
   * <code>optional string triggering_file = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTriggeringFileBytes() {
    java.lang.Object ref = triggeringFile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      triggeringFile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private com.google.devtools.build.lib.actions.extra.ExtraActionInfo action_;
  /**
   * <pre>
   * The actual action.
   * </pre>
   *
   * <code>required .blaze.ExtraActionInfo action = 2;</code>
   */
  public boolean hasAction() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * The actual action.
   * </pre>
   *
   * <code>required .blaze.ExtraActionInfo action = 2;</code>
   */
  public com.google.devtools.build.lib.actions.extra.ExtraActionInfo getAction() {
    return action_ == null ? com.google.devtools.build.lib.actions.extra.ExtraActionInfo.getDefaultInstance() : action_;
  }
  /**
   * <pre>
   * The actual action.
   * </pre>
   *
   * <code>required .blaze.ExtraActionInfo action = 2;</code>
   */
  public com.google.devtools.build.lib.actions.extra.ExtraActionInfoOrBuilder getActionOrBuilder() {
    return action_ == null ? com.google.devtools.build.lib.actions.extra.ExtraActionInfo.getDefaultInstance() : action_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasAction()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getAction().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, triggeringFile_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getAction());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, triggeringFile_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAction());
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
    if (!(obj instanceof com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo)) {
      return super.equals(obj);
    }
    com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo other = (com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo) obj;

    boolean result = true;
    result = result && (hasTriggeringFile() == other.hasTriggeringFile());
    if (hasTriggeringFile()) {
      result = result && getTriggeringFile()
          .equals(other.getTriggeringFile());
    }
    result = result && (hasAction() == other.hasAction());
    if (hasAction()) {
      result = result && getAction()
          .equals(other.getAction());
    }
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
    if (hasTriggeringFile()) {
      hash = (37 * hash) + TRIGGERING_FILE_FIELD_NUMBER;
      hash = (53 * hash) + getTriggeringFile().hashCode();
    }
    if (hasAction()) {
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parseFrom(
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
  public static Builder newBuilder(com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo prototype) {
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
   * <pre>
   * An individual action printed by the print_action command.
   * </pre>
   *
   * Protobuf type {@code blaze.DetailedExtraActionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:blaze.DetailedExtraActionInfo)
      com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.build.lib.actions.extra.ExtraActionsBase.internal_static_blaze_DetailedExtraActionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.build.lib.actions.extra.ExtraActionsBase.internal_static_blaze_DetailedExtraActionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo.class, com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo.Builder.class);
    }

    // Construct using com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo.newBuilder()
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
        getActionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      triggeringFile_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (actionBuilder_ == null) {
        action_ = null;
      } else {
        actionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.build.lib.actions.extra.ExtraActionsBase.internal_static_blaze_DetailedExtraActionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo getDefaultInstanceForType() {
      return com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo build() {
      com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo buildPartial() {
      com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo result = new com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.triggeringFile_ = triggeringFile_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (actionBuilder_ == null) {
        result.action_ = action_;
      } else {
        result.action_ = actionBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo) {
        return mergeFrom((com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo other) {
      if (other == com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo.getDefaultInstance()) return this;
      if (other.hasTriggeringFile()) {
        bitField0_ |= 0x00000001;
        triggeringFile_ = other.triggeringFile_;
        onChanged();
      }
      if (other.hasAction()) {
        mergeAction(other.getAction());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasAction()) {
        return false;
      }
      if (!getAction().isInitialized()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object triggeringFile_ = "";
    /**
     * <pre>
     * If the given action was included in the output due to a request for a
     * specific file, then this field contains the name of that file so that the
     * caller can correctly associate the extra action with that file.
     * The data in this message is currently not sufficient to run the action on a
     * production machine, because not all necessary input files are identified,
     * especially for C++.
     * There is no easy way to fix this; we could require that all header files
     * are declared and then add all of them here (which would be a huge superset
     * of the files that are actually required), or we could run the include
     * scanner and add those files here.
     * </pre>
     *
     * <code>optional string triggering_file = 1;</code>
     */
    public boolean hasTriggeringFile() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * If the given action was included in the output due to a request for a
     * specific file, then this field contains the name of that file so that the
     * caller can correctly associate the extra action with that file.
     * The data in this message is currently not sufficient to run the action on a
     * production machine, because not all necessary input files are identified,
     * especially for C++.
     * There is no easy way to fix this; we could require that all header files
     * are declared and then add all of them here (which would be a huge superset
     * of the files that are actually required), or we could run the include
     * scanner and add those files here.
     * </pre>
     *
     * <code>optional string triggering_file = 1;</code>
     */
    public java.lang.String getTriggeringFile() {
      java.lang.Object ref = triggeringFile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          triggeringFile_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If the given action was included in the output due to a request for a
     * specific file, then this field contains the name of that file so that the
     * caller can correctly associate the extra action with that file.
     * The data in this message is currently not sufficient to run the action on a
     * production machine, because not all necessary input files are identified,
     * especially for C++.
     * There is no easy way to fix this; we could require that all header files
     * are declared and then add all of them here (which would be a huge superset
     * of the files that are actually required), or we could run the include
     * scanner and add those files here.
     * </pre>
     *
     * <code>optional string triggering_file = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTriggeringFileBytes() {
      java.lang.Object ref = triggeringFile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        triggeringFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If the given action was included in the output due to a request for a
     * specific file, then this field contains the name of that file so that the
     * caller can correctly associate the extra action with that file.
     * The data in this message is currently not sufficient to run the action on a
     * production machine, because not all necessary input files are identified,
     * especially for C++.
     * There is no easy way to fix this; we could require that all header files
     * are declared and then add all of them here (which would be a huge superset
     * of the files that are actually required), or we could run the include
     * scanner and add those files here.
     * </pre>
     *
     * <code>optional string triggering_file = 1;</code>
     */
    public Builder setTriggeringFile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      triggeringFile_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the given action was included in the output due to a request for a
     * specific file, then this field contains the name of that file so that the
     * caller can correctly associate the extra action with that file.
     * The data in this message is currently not sufficient to run the action on a
     * production machine, because not all necessary input files are identified,
     * especially for C++.
     * There is no easy way to fix this; we could require that all header files
     * are declared and then add all of them here (which would be a huge superset
     * of the files that are actually required), or we could run the include
     * scanner and add those files here.
     * </pre>
     *
     * <code>optional string triggering_file = 1;</code>
     */
    public Builder clearTriggeringFile() {
      bitField0_ = (bitField0_ & ~0x00000001);
      triggeringFile_ = getDefaultInstance().getTriggeringFile();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the given action was included in the output due to a request for a
     * specific file, then this field contains the name of that file so that the
     * caller can correctly associate the extra action with that file.
     * The data in this message is currently not sufficient to run the action on a
     * production machine, because not all necessary input files are identified,
     * especially for C++.
     * There is no easy way to fix this; we could require that all header files
     * are declared and then add all of them here (which would be a huge superset
     * of the files that are actually required), or we could run the include
     * scanner and add those files here.
     * </pre>
     *
     * <code>optional string triggering_file = 1;</code>
     */
    public Builder setTriggeringFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      triggeringFile_ = value;
      onChanged();
      return this;
    }

    private com.google.devtools.build.lib.actions.extra.ExtraActionInfo action_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.build.lib.actions.extra.ExtraActionInfo, com.google.devtools.build.lib.actions.extra.ExtraActionInfo.Builder, com.google.devtools.build.lib.actions.extra.ExtraActionInfoOrBuilder> actionBuilder_;
    /**
     * <pre>
     * The actual action.
     * </pre>
     *
     * <code>required .blaze.ExtraActionInfo action = 2;</code>
     */
    public boolean hasAction() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * The actual action.
     * </pre>
     *
     * <code>required .blaze.ExtraActionInfo action = 2;</code>
     */
    public com.google.devtools.build.lib.actions.extra.ExtraActionInfo getAction() {
      if (actionBuilder_ == null) {
        return action_ == null ? com.google.devtools.build.lib.actions.extra.ExtraActionInfo.getDefaultInstance() : action_;
      } else {
        return actionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The actual action.
     * </pre>
     *
     * <code>required .blaze.ExtraActionInfo action = 2;</code>
     */
    public Builder setAction(com.google.devtools.build.lib.actions.extra.ExtraActionInfo value) {
      if (actionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        actionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * The actual action.
     * </pre>
     *
     * <code>required .blaze.ExtraActionInfo action = 2;</code>
     */
    public Builder setAction(
        com.google.devtools.build.lib.actions.extra.ExtraActionInfo.Builder builderForValue) {
      if (actionBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        actionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * The actual action.
     * </pre>
     *
     * <code>required .blaze.ExtraActionInfo action = 2;</code>
     */
    public Builder mergeAction(com.google.devtools.build.lib.actions.extra.ExtraActionInfo value) {
      if (actionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            action_ != null &&
            action_ != com.google.devtools.build.lib.actions.extra.ExtraActionInfo.getDefaultInstance()) {
          action_ =
            com.google.devtools.build.lib.actions.extra.ExtraActionInfo.newBuilder(action_).mergeFrom(value).buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        actionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * The actual action.
     * </pre>
     *
     * <code>required .blaze.ExtraActionInfo action = 2;</code>
     */
    public Builder clearAction() {
      if (actionBuilder_ == null) {
        action_ = null;
        onChanged();
      } else {
        actionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <pre>
     * The actual action.
     * </pre>
     *
     * <code>required .blaze.ExtraActionInfo action = 2;</code>
     */
    public com.google.devtools.build.lib.actions.extra.ExtraActionInfo.Builder getActionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getActionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The actual action.
     * </pre>
     *
     * <code>required .blaze.ExtraActionInfo action = 2;</code>
     */
    public com.google.devtools.build.lib.actions.extra.ExtraActionInfoOrBuilder getActionOrBuilder() {
      if (actionBuilder_ != null) {
        return actionBuilder_.getMessageOrBuilder();
      } else {
        return action_ == null ?
            com.google.devtools.build.lib.actions.extra.ExtraActionInfo.getDefaultInstance() : action_;
      }
    }
    /**
     * <pre>
     * The actual action.
     * </pre>
     *
     * <code>required .blaze.ExtraActionInfo action = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.build.lib.actions.extra.ExtraActionInfo, com.google.devtools.build.lib.actions.extra.ExtraActionInfo.Builder, com.google.devtools.build.lib.actions.extra.ExtraActionInfoOrBuilder> 
        getActionFieldBuilder() {
      if (actionBuilder_ == null) {
        actionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.build.lib.actions.extra.ExtraActionInfo, com.google.devtools.build.lib.actions.extra.ExtraActionInfo.Builder, com.google.devtools.build.lib.actions.extra.ExtraActionInfoOrBuilder>(
                getAction(),
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      return actionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:blaze.DetailedExtraActionInfo)
  }

  // @@protoc_insertion_point(class_scope:blaze.DetailedExtraActionInfo)
  private static final com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo();
  }

  public static com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DetailedExtraActionInfo>
      PARSER = new com.google.protobuf.AbstractParser<DetailedExtraActionInfo>() {
    @java.lang.Override
    public DetailedExtraActionInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DetailedExtraActionInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DetailedExtraActionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DetailedExtraActionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.build.lib.actions.extra.DetailedExtraActionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

