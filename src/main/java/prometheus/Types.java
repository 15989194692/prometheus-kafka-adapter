package prometheus;

public final class Types {
  private Types() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SampleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:prometheus.Sample)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double value = 1;</code>
     * @return The value.
     */
    double getValue();

    /**
     * <code>int64 timestamp = 2;</code>
     * @return The timestamp.
     */
    long getTimestamp();
  }
  /**
   * Protobuf type {@code prometheus.Sample}
   */
  public static final class Sample extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:prometheus.Sample)
      SampleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Sample.newBuilder() to construct.
    private Sample(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Sample() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Sample();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Sample(
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
            case 9: {

              value_ = input.readDouble();
              break;
            }
            case 16: {

              timestamp_ = input.readInt64();
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
      return prometheus.Types.internal_static_prometheus_Sample_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return prometheus.Types.internal_static_prometheus_Sample_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              prometheus.Types.Sample.class, prometheus.Types.Sample.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;
    /**
     * <code>double value = 1;</code>
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private long timestamp_;
    /**
     * <code>int64 timestamp = 2;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
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
      if (value_ != 0D) {
        output.writeDouble(1, value_);
      }
      if (timestamp_ != 0L) {
        output.writeInt64(2, timestamp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, value_);
      }
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, timestamp_);
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
      if (!(obj instanceof prometheus.Types.Sample)) {
        return super.equals(obj);
      }
      prometheus.Types.Sample other = (prometheus.Types.Sample) obj;

      if (java.lang.Double.doubleToLongBits(getValue())
          != java.lang.Double.doubleToLongBits(
              other.getValue())) return false;
      if (getTimestamp()
          != other.getTimestamp()) return false;
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
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getValue()));
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static prometheus.Types.Sample parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Sample parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Sample parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Sample parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Sample parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Sample parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Sample parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.Sample parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.Sample parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static prometheus.Types.Sample parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.Sample parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.Sample parseFrom(
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
    public static Builder newBuilder(prometheus.Types.Sample prototype) {
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
     * Protobuf type {@code prometheus.Sample}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:prometheus.Sample)
        prometheus.Types.SampleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return prometheus.Types.internal_static_prometheus_Sample_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return prometheus.Types.internal_static_prometheus_Sample_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                prometheus.Types.Sample.class, prometheus.Types.Sample.Builder.class);
      }

      // Construct using prometheus.Types.Sample.newBuilder()
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
        value_ = 0D;

        timestamp_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return prometheus.Types.internal_static_prometheus_Sample_descriptor;
      }

      @java.lang.Override
      public prometheus.Types.Sample getDefaultInstanceForType() {
        return prometheus.Types.Sample.getDefaultInstance();
      }

      @java.lang.Override
      public prometheus.Types.Sample build() {
        prometheus.Types.Sample result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public prometheus.Types.Sample buildPartial() {
        prometheus.Types.Sample result = new prometheus.Types.Sample(this);
        result.value_ = value_;
        result.timestamp_ = timestamp_;
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
        if (other instanceof prometheus.Types.Sample) {
          return mergeFrom((prometheus.Types.Sample)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(prometheus.Types.Sample other) {
        if (other == prometheus.Types.Sample.getDefaultInstance()) return this;
        if (other.getValue() != 0D) {
          setValue(other.getValue());
        }
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
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
        prometheus.Types.Sample parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (prometheus.Types.Sample) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double value_ ;
      /**
       * <code>double value = 1;</code>
       * @return The value.
       */
      @java.lang.Override
      public double getValue() {
        return value_;
      }
      /**
       * <code>double value = 1;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(double value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double value = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0D;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 2;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 2;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(long value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:prometheus.Sample)
    }

    // @@protoc_insertion_point(class_scope:prometheus.Sample)
    private static final prometheus.Types.Sample DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new prometheus.Types.Sample();
    }

    public static prometheus.Types.Sample getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Sample>
        PARSER = new com.google.protobuf.AbstractParser<Sample>() {
      @java.lang.Override
      public Sample parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Sample(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Sample> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Sample> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public prometheus.Types.Sample getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TimeSeriesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:prometheus.TimeSeries)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<prometheus.Types.Label> 
        getLabelsList();
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    prometheus.Types.Label getLabels(int index);
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    int getLabelsCount();
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends prometheus.Types.LabelOrBuilder> 
        getLabelsOrBuilderList();
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    prometheus.Types.LabelOrBuilder getLabelsOrBuilder(
        int index);

    /**
     * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<prometheus.Types.Sample> 
        getSamplesList();
    /**
     * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    prometheus.Types.Sample getSamples(int index);
    /**
     * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    int getSamplesCount();
    /**
     * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends prometheus.Types.SampleOrBuilder> 
        getSamplesOrBuilderList();
    /**
     * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    prometheus.Types.SampleOrBuilder getSamplesOrBuilder(
        int index);
  }
  /**
   * <pre>
   * TimeSeries represents samples and labels for a single time series.
   * </pre>
   *
   * Protobuf type {@code prometheus.TimeSeries}
   */
  public static final class TimeSeries extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:prometheus.TimeSeries)
      TimeSeriesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TimeSeries.newBuilder() to construct.
    private TimeSeries(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TimeSeries() {
      labels_ = java.util.Collections.emptyList();
      samples_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TimeSeries();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TimeSeries(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                labels_ = new java.util.ArrayList<prometheus.Types.Label>();
                mutable_bitField0_ |= 0x00000001;
              }
              labels_.add(
                  input.readMessage(prometheus.Types.Label.parser(), extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                samples_ = new java.util.ArrayList<prometheus.Types.Sample>();
                mutable_bitField0_ |= 0x00000002;
              }
              samples_.add(
                  input.readMessage(prometheus.Types.Sample.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          samples_ = java.util.Collections.unmodifiableList(samples_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return prometheus.Types.internal_static_prometheus_TimeSeries_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return prometheus.Types.internal_static_prometheus_TimeSeries_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              prometheus.Types.TimeSeries.class, prometheus.Types.TimeSeries.Builder.class);
    }

    public static final int LABELS_FIELD_NUMBER = 1;
    private java.util.List<prometheus.Types.Label> labels_;
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<prometheus.Types.Label> getLabelsList() {
      return labels_;
    }
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<? extends prometheus.Types.LabelOrBuilder> 
        getLabelsOrBuilderList() {
      return labels_;
    }
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public prometheus.Types.Label getLabels(int index) {
      return labels_.get(index);
    }
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public prometheus.Types.LabelOrBuilder getLabelsOrBuilder(
        int index) {
      return labels_.get(index);
    }

    public static final int SAMPLES_FIELD_NUMBER = 2;
    private java.util.List<prometheus.Types.Sample> samples_;
    /**
     * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<prometheus.Types.Sample> getSamplesList() {
      return samples_;
    }
    /**
     * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<? extends prometheus.Types.SampleOrBuilder> 
        getSamplesOrBuilderList() {
      return samples_;
    }
    /**
     * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public int getSamplesCount() {
      return samples_.size();
    }
    /**
     * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public prometheus.Types.Sample getSamples(int index) {
      return samples_.get(index);
    }
    /**
     * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public prometheus.Types.SampleOrBuilder getSamplesOrBuilder(
        int index) {
      return samples_.get(index);
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
      for (int i = 0; i < labels_.size(); i++) {
        output.writeMessage(1, labels_.get(i));
      }
      for (int i = 0; i < samples_.size(); i++) {
        output.writeMessage(2, samples_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < labels_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, labels_.get(i));
      }
      for (int i = 0; i < samples_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, samples_.get(i));
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
      if (!(obj instanceof prometheus.Types.TimeSeries)) {
        return super.equals(obj);
      }
      prometheus.Types.TimeSeries other = (prometheus.Types.TimeSeries) obj;

      if (!getLabelsList()
          .equals(other.getLabelsList())) return false;
      if (!getSamplesList()
          .equals(other.getSamplesList())) return false;
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
      if (getLabelsCount() > 0) {
        hash = (37 * hash) + LABELS_FIELD_NUMBER;
        hash = (53 * hash) + getLabelsList().hashCode();
      }
      if (getSamplesCount() > 0) {
        hash = (37 * hash) + SAMPLES_FIELD_NUMBER;
        hash = (53 * hash) + getSamplesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static prometheus.Types.TimeSeries parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.TimeSeries parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.TimeSeries parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.TimeSeries parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.TimeSeries parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.TimeSeries parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.TimeSeries parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.TimeSeries parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.TimeSeries parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static prometheus.Types.TimeSeries parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.TimeSeries parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.TimeSeries parseFrom(
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
    public static Builder newBuilder(prometheus.Types.TimeSeries prototype) {
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
     * TimeSeries represents samples and labels for a single time series.
     * </pre>
     *
     * Protobuf type {@code prometheus.TimeSeries}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:prometheus.TimeSeries)
        prometheus.Types.TimeSeriesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return prometheus.Types.internal_static_prometheus_TimeSeries_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return prometheus.Types.internal_static_prometheus_TimeSeries_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                prometheus.Types.TimeSeries.class, prometheus.Types.TimeSeries.Builder.class);
      }

      // Construct using prometheus.Types.TimeSeries.newBuilder()
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
          getLabelsFieldBuilder();
          getSamplesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          labelsBuilder_.clear();
        }
        if (samplesBuilder_ == null) {
          samples_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          samplesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return prometheus.Types.internal_static_prometheus_TimeSeries_descriptor;
      }

      @java.lang.Override
      public prometheus.Types.TimeSeries getDefaultInstanceForType() {
        return prometheus.Types.TimeSeries.getDefaultInstance();
      }

      @java.lang.Override
      public prometheus.Types.TimeSeries build() {
        prometheus.Types.TimeSeries result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public prometheus.Types.TimeSeries buildPartial() {
        prometheus.Types.TimeSeries result = new prometheus.Types.TimeSeries(this);
        int from_bitField0_ = bitField0_;
        if (labelsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            labels_ = java.util.Collections.unmodifiableList(labels_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.labels_ = labels_;
        } else {
          result.labels_ = labelsBuilder_.build();
        }
        if (samplesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            samples_ = java.util.Collections.unmodifiableList(samples_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.samples_ = samples_;
        } else {
          result.samples_ = samplesBuilder_.build();
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
        if (other instanceof prometheus.Types.TimeSeries) {
          return mergeFrom((prometheus.Types.TimeSeries)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(prometheus.Types.TimeSeries other) {
        if (other == prometheus.Types.TimeSeries.getDefaultInstance()) return this;
        if (labelsBuilder_ == null) {
          if (!other.labels_.isEmpty()) {
            if (labels_.isEmpty()) {
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLabelsIsMutable();
              labels_.addAll(other.labels_);
            }
            onChanged();
          }
        } else {
          if (!other.labels_.isEmpty()) {
            if (labelsBuilder_.isEmpty()) {
              labelsBuilder_.dispose();
              labelsBuilder_ = null;
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
              labelsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLabelsFieldBuilder() : null;
            } else {
              labelsBuilder_.addAllMessages(other.labels_);
            }
          }
        }
        if (samplesBuilder_ == null) {
          if (!other.samples_.isEmpty()) {
            if (samples_.isEmpty()) {
              samples_ = other.samples_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureSamplesIsMutable();
              samples_.addAll(other.samples_);
            }
            onChanged();
          }
        } else {
          if (!other.samples_.isEmpty()) {
            if (samplesBuilder_.isEmpty()) {
              samplesBuilder_.dispose();
              samplesBuilder_ = null;
              samples_ = other.samples_;
              bitField0_ = (bitField0_ & ~0x00000002);
              samplesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSamplesFieldBuilder() : null;
            } else {
              samplesBuilder_.addAllMessages(other.samples_);
            }
          }
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
        prometheus.Types.TimeSeries parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (prometheus.Types.TimeSeries) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<prometheus.Types.Label> labels_ =
        java.util.Collections.emptyList();
      private void ensureLabelsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          labels_ = new java.util.ArrayList<prometheus.Types.Label>(labels_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          prometheus.Types.Label, prometheus.Types.Label.Builder, prometheus.Types.LabelOrBuilder> labelsBuilder_;

      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<prometheus.Types.Label> getLabelsList() {
        if (labelsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(labels_);
        } else {
          return labelsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public int getLabelsCount() {
        if (labelsBuilder_ == null) {
          return labels_.size();
        } else {
          return labelsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label getLabels(int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);
        } else {
          return labelsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, prometheus.Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.set(index, value);
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, prometheus.Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.set(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(prometheus.Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, prometheus.Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(index, value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          prometheus.Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, prometheus.Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllLabels(
          java.lang.Iterable<? extends prometheus.Types.Label> values) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, labels_);
          onChanged();
        } else {
          labelsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearLabels() {
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          labelsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeLabels(int index) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.remove(index);
          onChanged();
        } else {
          labelsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label.Builder getLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.LabelOrBuilder getLabelsOrBuilder(
          int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);  } else {
          return labelsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends prometheus.Types.LabelOrBuilder> 
           getLabelsOrBuilderList() {
        if (labelsBuilder_ != null) {
          return labelsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(labels_);
        }
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label.Builder addLabelsBuilder() {
        return getLabelsFieldBuilder().addBuilder(
            prometheus.Types.Label.getDefaultInstance());
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label.Builder addLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().addBuilder(
            index, prometheus.Types.Label.getDefaultInstance());
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<prometheus.Types.Label.Builder> 
           getLabelsBuilderList() {
        return getLabelsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          prometheus.Types.Label, prometheus.Types.Label.Builder, prometheus.Types.LabelOrBuilder> 
          getLabelsFieldBuilder() {
        if (labelsBuilder_ == null) {
          labelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              prometheus.Types.Label, prometheus.Types.Label.Builder, prometheus.Types.LabelOrBuilder>(
                  labels_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          labels_ = null;
        }
        return labelsBuilder_;
      }

      private java.util.List<prometheus.Types.Sample> samples_ =
        java.util.Collections.emptyList();
      private void ensureSamplesIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          samples_ = new java.util.ArrayList<prometheus.Types.Sample>(samples_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          prometheus.Types.Sample, prometheus.Types.Sample.Builder, prometheus.Types.SampleOrBuilder> samplesBuilder_;

      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<prometheus.Types.Sample> getSamplesList() {
        if (samplesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(samples_);
        } else {
          return samplesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public int getSamplesCount() {
        if (samplesBuilder_ == null) {
          return samples_.size();
        } else {
          return samplesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Sample getSamples(int index) {
        if (samplesBuilder_ == null) {
          return samples_.get(index);
        } else {
          return samplesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setSamples(
          int index, prometheus.Types.Sample value) {
        if (samplesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSamplesIsMutable();
          samples_.set(index, value);
          onChanged();
        } else {
          samplesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setSamples(
          int index, prometheus.Types.Sample.Builder builderForValue) {
        if (samplesBuilder_ == null) {
          ensureSamplesIsMutable();
          samples_.set(index, builderForValue.build());
          onChanged();
        } else {
          samplesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addSamples(prometheus.Types.Sample value) {
        if (samplesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSamplesIsMutable();
          samples_.add(value);
          onChanged();
        } else {
          samplesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addSamples(
          int index, prometheus.Types.Sample value) {
        if (samplesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSamplesIsMutable();
          samples_.add(index, value);
          onChanged();
        } else {
          samplesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addSamples(
          prometheus.Types.Sample.Builder builderForValue) {
        if (samplesBuilder_ == null) {
          ensureSamplesIsMutable();
          samples_.add(builderForValue.build());
          onChanged();
        } else {
          samplesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addSamples(
          int index, prometheus.Types.Sample.Builder builderForValue) {
        if (samplesBuilder_ == null) {
          ensureSamplesIsMutable();
          samples_.add(index, builderForValue.build());
          onChanged();
        } else {
          samplesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllSamples(
          java.lang.Iterable<? extends prometheus.Types.Sample> values) {
        if (samplesBuilder_ == null) {
          ensureSamplesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, samples_);
          onChanged();
        } else {
          samplesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearSamples() {
        if (samplesBuilder_ == null) {
          samples_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          samplesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeSamples(int index) {
        if (samplesBuilder_ == null) {
          ensureSamplesIsMutable();
          samples_.remove(index);
          onChanged();
        } else {
          samplesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Sample.Builder getSamplesBuilder(
          int index) {
        return getSamplesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.SampleOrBuilder getSamplesOrBuilder(
          int index) {
        if (samplesBuilder_ == null) {
          return samples_.get(index);  } else {
          return samplesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends prometheus.Types.SampleOrBuilder> 
           getSamplesOrBuilderList() {
        if (samplesBuilder_ != null) {
          return samplesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(samples_);
        }
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Sample.Builder addSamplesBuilder() {
        return getSamplesFieldBuilder().addBuilder(
            prometheus.Types.Sample.getDefaultInstance());
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Sample.Builder addSamplesBuilder(
          int index) {
        return getSamplesFieldBuilder().addBuilder(
            index, prometheus.Types.Sample.getDefaultInstance());
      }
      /**
       * <code>repeated .prometheus.Sample samples = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<prometheus.Types.Sample.Builder> 
           getSamplesBuilderList() {
        return getSamplesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          prometheus.Types.Sample, prometheus.Types.Sample.Builder, prometheus.Types.SampleOrBuilder> 
          getSamplesFieldBuilder() {
        if (samplesBuilder_ == null) {
          samplesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              prometheus.Types.Sample, prometheus.Types.Sample.Builder, prometheus.Types.SampleOrBuilder>(
                  samples_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          samples_ = null;
        }
        return samplesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:prometheus.TimeSeries)
    }

    // @@protoc_insertion_point(class_scope:prometheus.TimeSeries)
    private static final prometheus.Types.TimeSeries DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new prometheus.Types.TimeSeries();
    }

    public static prometheus.Types.TimeSeries getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TimeSeries>
        PARSER = new com.google.protobuf.AbstractParser<TimeSeries>() {
      @java.lang.Override
      public TimeSeries parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TimeSeries(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TimeSeries> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TimeSeries> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public prometheus.Types.TimeSeries getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LabelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:prometheus.Label)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string value = 2;</code>
     * @return The value.
     */
    java.lang.String getValue();
    /**
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    com.google.protobuf.ByteString
        getValueBytes();
  }
  /**
   * Protobuf type {@code prometheus.Label}
   */
  public static final class Label extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:prometheus.Label)
      LabelOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Label.newBuilder() to construct.
    private Label(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Label() {
      name_ = "";
      value_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Label();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Label(
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

              name_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              value_ = s;
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
      return prometheus.Types.internal_static_prometheus_Label_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return prometheus.Types.internal_static_prometheus_Label_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              prometheus.Types.Label.class, prometheus.Types.Label.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
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

    public static final int VALUE_FIELD_NUMBER = 2;
    private volatile java.lang.Object value_;
    /**
     * <code>string value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      }
    }
    /**
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!getValueBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!getValueBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
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
      if (!(obj instanceof prometheus.Types.Label)) {
        return super.equals(obj);
      }
      prometheus.Types.Label other = (prometheus.Types.Label) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getValue()
          .equals(other.getValue())) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static prometheus.Types.Label parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Label parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Label parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Label parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Label parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Label parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Label parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.Label parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.Label parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static prometheus.Types.Label parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.Label parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.Label parseFrom(
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
    public static Builder newBuilder(prometheus.Types.Label prototype) {
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
     * Protobuf type {@code prometheus.Label}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:prometheus.Label)
        prometheus.Types.LabelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return prometheus.Types.internal_static_prometheus_Label_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return prometheus.Types.internal_static_prometheus_Label_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                prometheus.Types.Label.class, prometheus.Types.Label.Builder.class);
      }

      // Construct using prometheus.Types.Label.newBuilder()
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
        name_ = "";

        value_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return prometheus.Types.internal_static_prometheus_Label_descriptor;
      }

      @java.lang.Override
      public prometheus.Types.Label getDefaultInstanceForType() {
        return prometheus.Types.Label.getDefaultInstance();
      }

      @java.lang.Override
      public prometheus.Types.Label build() {
        prometheus.Types.Label result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public prometheus.Types.Label buildPartial() {
        prometheus.Types.Label result = new prometheus.Types.Label(this);
        result.name_ = name_;
        result.value_ = value_;
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
        if (other instanceof prometheus.Types.Label) {
          return mergeFrom((prometheus.Types.Label)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(prometheus.Types.Label other) {
        if (other == prometheus.Types.Label.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getValue().isEmpty()) {
          value_ = other.value_;
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
        prometheus.Types.Label parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (prometheus.Types.Label) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
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
       * <code>string name = 1;</code>
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
       * <code>string name = 1;</code>
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
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
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

      private java.lang.Object value_ = "";
      /**
       * <code>string value = 2;</code>
       * @return The value.
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string value = 2;</code>
       * @return The bytes for value.
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string value = 2;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string value = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>string value = 2;</code>
       * @param value The bytes for value to set.
       * @return This builder for chaining.
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        value_ = value;
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


      // @@protoc_insertion_point(builder_scope:prometheus.Label)
    }

    // @@protoc_insertion_point(class_scope:prometheus.Label)
    private static final prometheus.Types.Label DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new prometheus.Types.Label();
    }

    public static prometheus.Types.Label getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Label>
        PARSER = new com.google.protobuf.AbstractParser<Label>() {
      @java.lang.Override
      public Label parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Label(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Label> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Label> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public prometheus.Types.Label getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LabelsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:prometheus.Labels)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<prometheus.Types.Label> 
        getLabelsList();
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    prometheus.Types.Label getLabels(int index);
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    int getLabelsCount();
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends prometheus.Types.LabelOrBuilder> 
        getLabelsOrBuilderList();
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    prometheus.Types.LabelOrBuilder getLabelsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code prometheus.Labels}
   */
  public static final class Labels extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:prometheus.Labels)
      LabelsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Labels.newBuilder() to construct.
    private Labels(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Labels() {
      labels_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Labels();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Labels(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                labels_ = new java.util.ArrayList<prometheus.Types.Label>();
                mutable_bitField0_ |= 0x00000001;
              }
              labels_.add(
                  input.readMessage(prometheus.Types.Label.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return prometheus.Types.internal_static_prometheus_Labels_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return prometheus.Types.internal_static_prometheus_Labels_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              prometheus.Types.Labels.class, prometheus.Types.Labels.Builder.class);
    }

    public static final int LABELS_FIELD_NUMBER = 1;
    private java.util.List<prometheus.Types.Label> labels_;
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<prometheus.Types.Label> getLabelsList() {
      return labels_;
    }
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<? extends prometheus.Types.LabelOrBuilder> 
        getLabelsOrBuilderList() {
      return labels_;
    }
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public prometheus.Types.Label getLabels(int index) {
      return labels_.get(index);
    }
    /**
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public prometheus.Types.LabelOrBuilder getLabelsOrBuilder(
        int index) {
      return labels_.get(index);
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
      for (int i = 0; i < labels_.size(); i++) {
        output.writeMessage(1, labels_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < labels_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, labels_.get(i));
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
      if (!(obj instanceof prometheus.Types.Labels)) {
        return super.equals(obj);
      }
      prometheus.Types.Labels other = (prometheus.Types.Labels) obj;

      if (!getLabelsList()
          .equals(other.getLabelsList())) return false;
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
      if (getLabelsCount() > 0) {
        hash = (37 * hash) + LABELS_FIELD_NUMBER;
        hash = (53 * hash) + getLabelsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static prometheus.Types.Labels parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Labels parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Labels parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Labels parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Labels parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Labels parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Labels parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.Labels parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.Labels parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static prometheus.Types.Labels parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.Labels parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.Labels parseFrom(
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
    public static Builder newBuilder(prometheus.Types.Labels prototype) {
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
     * Protobuf type {@code prometheus.Labels}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:prometheus.Labels)
        prometheus.Types.LabelsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return prometheus.Types.internal_static_prometheus_Labels_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return prometheus.Types.internal_static_prometheus_Labels_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                prometheus.Types.Labels.class, prometheus.Types.Labels.Builder.class);
      }

      // Construct using prometheus.Types.Labels.newBuilder()
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
          getLabelsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          labelsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return prometheus.Types.internal_static_prometheus_Labels_descriptor;
      }

      @java.lang.Override
      public prometheus.Types.Labels getDefaultInstanceForType() {
        return prometheus.Types.Labels.getDefaultInstance();
      }

      @java.lang.Override
      public prometheus.Types.Labels build() {
        prometheus.Types.Labels result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public prometheus.Types.Labels buildPartial() {
        prometheus.Types.Labels result = new prometheus.Types.Labels(this);
        int from_bitField0_ = bitField0_;
        if (labelsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            labels_ = java.util.Collections.unmodifiableList(labels_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.labels_ = labels_;
        } else {
          result.labels_ = labelsBuilder_.build();
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
        if (other instanceof prometheus.Types.Labels) {
          return mergeFrom((prometheus.Types.Labels)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(prometheus.Types.Labels other) {
        if (other == prometheus.Types.Labels.getDefaultInstance()) return this;
        if (labelsBuilder_ == null) {
          if (!other.labels_.isEmpty()) {
            if (labels_.isEmpty()) {
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLabelsIsMutable();
              labels_.addAll(other.labels_);
            }
            onChanged();
          }
        } else {
          if (!other.labels_.isEmpty()) {
            if (labelsBuilder_.isEmpty()) {
              labelsBuilder_.dispose();
              labelsBuilder_ = null;
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
              labelsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLabelsFieldBuilder() : null;
            } else {
              labelsBuilder_.addAllMessages(other.labels_);
            }
          }
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
        prometheus.Types.Labels parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (prometheus.Types.Labels) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<prometheus.Types.Label> labels_ =
        java.util.Collections.emptyList();
      private void ensureLabelsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          labels_ = new java.util.ArrayList<prometheus.Types.Label>(labels_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          prometheus.Types.Label, prometheus.Types.Label.Builder, prometheus.Types.LabelOrBuilder> labelsBuilder_;

      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<prometheus.Types.Label> getLabelsList() {
        if (labelsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(labels_);
        } else {
          return labelsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public int getLabelsCount() {
        if (labelsBuilder_ == null) {
          return labels_.size();
        } else {
          return labelsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label getLabels(int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);
        } else {
          return labelsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, prometheus.Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.set(index, value);
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, prometheus.Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.set(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(prometheus.Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, prometheus.Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(index, value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          prometheus.Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, prometheus.Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllLabels(
          java.lang.Iterable<? extends prometheus.Types.Label> values) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, labels_);
          onChanged();
        } else {
          labelsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearLabels() {
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          labelsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeLabels(int index) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.remove(index);
          onChanged();
        } else {
          labelsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label.Builder getLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.LabelOrBuilder getLabelsOrBuilder(
          int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);  } else {
          return labelsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends prometheus.Types.LabelOrBuilder> 
           getLabelsOrBuilderList() {
        if (labelsBuilder_ != null) {
          return labelsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(labels_);
        }
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label.Builder addLabelsBuilder() {
        return getLabelsFieldBuilder().addBuilder(
            prometheus.Types.Label.getDefaultInstance());
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label.Builder addLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().addBuilder(
            index, prometheus.Types.Label.getDefaultInstance());
      }
      /**
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<prometheus.Types.Label.Builder> 
           getLabelsBuilderList() {
        return getLabelsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          prometheus.Types.Label, prometheus.Types.Label.Builder, prometheus.Types.LabelOrBuilder> 
          getLabelsFieldBuilder() {
        if (labelsBuilder_ == null) {
          labelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              prometheus.Types.Label, prometheus.Types.Label.Builder, prometheus.Types.LabelOrBuilder>(
                  labels_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          labels_ = null;
        }
        return labelsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:prometheus.Labels)
    }

    // @@protoc_insertion_point(class_scope:prometheus.Labels)
    private static final prometheus.Types.Labels DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new prometheus.Types.Labels();
    }

    public static prometheus.Types.Labels getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Labels>
        PARSER = new com.google.protobuf.AbstractParser<Labels>() {
      @java.lang.Override
      public Labels parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Labels(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Labels> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Labels> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public prometheus.Types.Labels getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LabelMatcherOrBuilder extends
      // @@protoc_insertion_point(interface_extends:prometheus.LabelMatcher)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.prometheus.LabelMatcher.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.prometheus.LabelMatcher.Type type = 1;</code>
     * @return The type.
     */
    prometheus.Types.LabelMatcher.Type getType();

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string value = 3;</code>
     * @return The value.
     */
    java.lang.String getValue();
    /**
     * <code>string value = 3;</code>
     * @return The bytes for value.
     */
    com.google.protobuf.ByteString
        getValueBytes();
  }
  /**
   * <pre>
   * Matcher specifies a rule, which can match or set of labels or not.
   * </pre>
   *
   * Protobuf type {@code prometheus.LabelMatcher}
   */
  public static final class LabelMatcher extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:prometheus.LabelMatcher)
      LabelMatcherOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LabelMatcher.newBuilder() to construct.
    private LabelMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LabelMatcher() {
      type_ = 0;
      name_ = "";
      value_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LabelMatcher();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LabelMatcher(
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
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              value_ = s;
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
      return prometheus.Types.internal_static_prometheus_LabelMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return prometheus.Types.internal_static_prometheus_LabelMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              prometheus.Types.LabelMatcher.class, prometheus.Types.LabelMatcher.Builder.class);
    }

    /**
     * Protobuf enum {@code prometheus.LabelMatcher.Type}
     */
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>EQ = 0;</code>
       */
      EQ(0),
      /**
       * <code>NEQ = 1;</code>
       */
      NEQ(1),
      /**
       * <code>RE = 2;</code>
       */
      RE(2),
      /**
       * <code>NRE = 3;</code>
       */
      NRE(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>EQ = 0;</code>
       */
      public static final int EQ_VALUE = 0;
      /**
       * <code>NEQ = 1;</code>
       */
      public static final int NEQ_VALUE = 1;
      /**
       * <code>RE = 2;</code>
       */
      public static final int RE_VALUE = 2;
      /**
       * <code>NRE = 3;</code>
       */
      public static final int NRE_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Type forNumber(int value) {
        switch (value) {
          case 0: return EQ;
          case 1: return NEQ;
          case 2: return RE;
          case 3: return NRE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return prometheus.Types.LabelMatcher.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
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

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:prometheus.LabelMatcher.Type)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.prometheus.LabelMatcher.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.prometheus.LabelMatcher.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override public prometheus.Types.LabelMatcher.Type getType() {
      @SuppressWarnings("deprecation")
      prometheus.Types.LabelMatcher.Type result = prometheus.Types.LabelMatcher.Type.valueOf(type_);
      return result == null ? prometheus.Types.LabelMatcher.Type.UNRECOGNIZED : result;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2;</code>
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
     * <code>string name = 2;</code>
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

    public static final int VALUE_FIELD_NUMBER = 3;
    private volatile java.lang.Object value_;
    /**
     * <code>string value = 3;</code>
     * @return The value.
     */
    @java.lang.Override
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      }
    }
    /**
     * <code>string value = 3;</code>
     * @return The bytes for value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
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
      if (type_ != prometheus.Types.LabelMatcher.Type.EQ.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (!getValueBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != prometheus.Types.LabelMatcher.Type.EQ.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (!getValueBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
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
      if (!(obj instanceof prometheus.Types.LabelMatcher)) {
        return super.equals(obj);
      }
      prometheus.Types.LabelMatcher other = (prometheus.Types.LabelMatcher) obj;

      if (type_ != other.type_) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (!getValue()
          .equals(other.getValue())) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static prometheus.Types.LabelMatcher parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.LabelMatcher parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.LabelMatcher parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.LabelMatcher parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.LabelMatcher parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.LabelMatcher parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.LabelMatcher parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.LabelMatcher parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.LabelMatcher parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static prometheus.Types.LabelMatcher parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.LabelMatcher parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.LabelMatcher parseFrom(
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
    public static Builder newBuilder(prometheus.Types.LabelMatcher prototype) {
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
     * Matcher specifies a rule, which can match or set of labels or not.
     * </pre>
     *
     * Protobuf type {@code prometheus.LabelMatcher}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:prometheus.LabelMatcher)
        prometheus.Types.LabelMatcherOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return prometheus.Types.internal_static_prometheus_LabelMatcher_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return prometheus.Types.internal_static_prometheus_LabelMatcher_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                prometheus.Types.LabelMatcher.class, prometheus.Types.LabelMatcher.Builder.class);
      }

      // Construct using prometheus.Types.LabelMatcher.newBuilder()
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
        type_ = 0;

        name_ = "";

        value_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return prometheus.Types.internal_static_prometheus_LabelMatcher_descriptor;
      }

      @java.lang.Override
      public prometheus.Types.LabelMatcher getDefaultInstanceForType() {
        return prometheus.Types.LabelMatcher.getDefaultInstance();
      }

      @java.lang.Override
      public prometheus.Types.LabelMatcher build() {
        prometheus.Types.LabelMatcher result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public prometheus.Types.LabelMatcher buildPartial() {
        prometheus.Types.LabelMatcher result = new prometheus.Types.LabelMatcher(this);
        result.type_ = type_;
        result.name_ = name_;
        result.value_ = value_;
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
        if (other instanceof prometheus.Types.LabelMatcher) {
          return mergeFrom((prometheus.Types.LabelMatcher)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(prometheus.Types.LabelMatcher other) {
        if (other == prometheus.Types.LabelMatcher.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getValue().isEmpty()) {
          value_ = other.value_;
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
        prometheus.Types.LabelMatcher parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (prometheus.Types.LabelMatcher) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.prometheus.LabelMatcher.Type type = 1;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.prometheus.LabelMatcher.Type type = 1;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.prometheus.LabelMatcher.Type type = 1;</code>
       * @return The type.
       */
      @java.lang.Override
      public prometheus.Types.LabelMatcher.Type getType() {
        @SuppressWarnings("deprecation")
        prometheus.Types.LabelMatcher.Type result = prometheus.Types.LabelMatcher.Type.valueOf(type_);
        return result == null ? prometheus.Types.LabelMatcher.Type.UNRECOGNIZED : result;
      }
      /**
       * <code>.prometheus.LabelMatcher.Type type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(prometheus.Types.LabelMatcher.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.prometheus.LabelMatcher.Type type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
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
       * <code>string name = 2;</code>
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
       * <code>string name = 2;</code>
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
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
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

      private java.lang.Object value_ = "";
      /**
       * <code>string value = 3;</code>
       * @return The value.
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string value = 3;</code>
       * @return The bytes for value.
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string value = 3;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string value = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>string value = 3;</code>
       * @param value The bytes for value to set.
       * @return This builder for chaining.
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        value_ = value;
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


      // @@protoc_insertion_point(builder_scope:prometheus.LabelMatcher)
    }

    // @@protoc_insertion_point(class_scope:prometheus.LabelMatcher)
    private static final prometheus.Types.LabelMatcher DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new prometheus.Types.LabelMatcher();
    }

    public static prometheus.Types.LabelMatcher getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LabelMatcher>
        PARSER = new com.google.protobuf.AbstractParser<LabelMatcher>() {
      @java.lang.Override
      public LabelMatcher parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LabelMatcher(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LabelMatcher> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LabelMatcher> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public prometheus.Types.LabelMatcher getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ReadHintsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:prometheus.ReadHints)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Query step size in milliseconds.
     * </pre>
     *
     * <code>int64 step_ms = 1;</code>
     * @return The stepMs.
     */
    long getStepMs();

    /**
     * <pre>
     * String representation of surrounding function or aggregation.
     * </pre>
     *
     * <code>string func = 2;</code>
     * @return The func.
     */
    java.lang.String getFunc();
    /**
     * <pre>
     * String representation of surrounding function or aggregation.
     * </pre>
     *
     * <code>string func = 2;</code>
     * @return The bytes for func.
     */
    com.google.protobuf.ByteString
        getFuncBytes();

    /**
     * <pre>
     * Start time in milliseconds.
     * </pre>
     *
     * <code>int64 start_ms = 3;</code>
     * @return The startMs.
     */
    long getStartMs();

    /**
     * <pre>
     * End time in milliseconds.
     * </pre>
     *
     * <code>int64 end_ms = 4;</code>
     * @return The endMs.
     */
    long getEndMs();

    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @return A list containing the grouping.
     */
    java.util.List<java.lang.String>
        getGroupingList();
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @return The count of grouping.
     */
    int getGroupingCount();
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @param index The index of the element to return.
     * @return The grouping at the given index.
     */
    java.lang.String getGrouping(int index);
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the grouping at the given index.
     */
    com.google.protobuf.ByteString
        getGroupingBytes(int index);

    /**
     * <pre>
     * Indicate whether it is without or by.
     * </pre>
     *
     * <code>bool by = 6;</code>
     * @return The by.
     */
    boolean getBy();

    /**
     * <pre>
     * Range vector selector range in milliseconds.
     * </pre>
     *
     * <code>int64 range_ms = 7;</code>
     * @return The rangeMs.
     */
    long getRangeMs();
  }
  /**
   * Protobuf type {@code prometheus.ReadHints}
   */
  public static final class ReadHints extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:prometheus.ReadHints)
      ReadHintsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReadHints.newBuilder() to construct.
    private ReadHints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReadHints() {
      func_ = "";
      grouping_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReadHints();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReadHints(
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
            case 8: {

              stepMs_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              func_ = s;
              break;
            }
            case 24: {

              startMs_ = input.readInt64();
              break;
            }
            case 32: {

              endMs_ = input.readInt64();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                grouping_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              grouping_.add(s);
              break;
            }
            case 48: {

              by_ = input.readBool();
              break;
            }
            case 56: {

              rangeMs_ = input.readInt64();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          grouping_ = grouping_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return prometheus.Types.internal_static_prometheus_ReadHints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return prometheus.Types.internal_static_prometheus_ReadHints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              prometheus.Types.ReadHints.class, prometheus.Types.ReadHints.Builder.class);
    }

    public static final int STEP_MS_FIELD_NUMBER = 1;
    private long stepMs_;
    /**
     * <pre>
     * Query step size in milliseconds.
     * </pre>
     *
     * <code>int64 step_ms = 1;</code>
     * @return The stepMs.
     */
    @java.lang.Override
    public long getStepMs() {
      return stepMs_;
    }

    public static final int FUNC_FIELD_NUMBER = 2;
    private volatile java.lang.Object func_;
    /**
     * <pre>
     * String representation of surrounding function or aggregation.
     * </pre>
     *
     * <code>string func = 2;</code>
     * @return The func.
     */
    @java.lang.Override
    public java.lang.String getFunc() {
      java.lang.Object ref = func_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        func_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * String representation of surrounding function or aggregation.
     * </pre>
     *
     * <code>string func = 2;</code>
     * @return The bytes for func.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFuncBytes() {
      java.lang.Object ref = func_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        func_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int START_MS_FIELD_NUMBER = 3;
    private long startMs_;
    /**
     * <pre>
     * Start time in milliseconds.
     * </pre>
     *
     * <code>int64 start_ms = 3;</code>
     * @return The startMs.
     */
    @java.lang.Override
    public long getStartMs() {
      return startMs_;
    }

    public static final int END_MS_FIELD_NUMBER = 4;
    private long endMs_;
    /**
     * <pre>
     * End time in milliseconds.
     * </pre>
     *
     * <code>int64 end_ms = 4;</code>
     * @return The endMs.
     */
    @java.lang.Override
    public long getEndMs() {
      return endMs_;
    }

    public static final int GROUPING_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList grouping_;
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @return A list containing the grouping.
     */
    public com.google.protobuf.ProtocolStringList
        getGroupingList() {
      return grouping_;
    }
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @return The count of grouping.
     */
    public int getGroupingCount() {
      return grouping_.size();
    }
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @param index The index of the element to return.
     * @return The grouping at the given index.
     */
    public java.lang.String getGrouping(int index) {
      return grouping_.get(index);
    }
    /**
     * <pre>
     * List of label names used in aggregation.
     * </pre>
     *
     * <code>repeated string grouping = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the grouping at the given index.
     */
    public com.google.protobuf.ByteString
        getGroupingBytes(int index) {
      return grouping_.getByteString(index);
    }

    public static final int BY_FIELD_NUMBER = 6;
    private boolean by_;
    /**
     * <pre>
     * Indicate whether it is without or by.
     * </pre>
     *
     * <code>bool by = 6;</code>
     * @return The by.
     */
    @java.lang.Override
    public boolean getBy() {
      return by_;
    }

    public static final int RANGE_MS_FIELD_NUMBER = 7;
    private long rangeMs_;
    /**
     * <pre>
     * Range vector selector range in milliseconds.
     * </pre>
     *
     * <code>int64 range_ms = 7;</code>
     * @return The rangeMs.
     */
    @java.lang.Override
    public long getRangeMs() {
      return rangeMs_;
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
      if (stepMs_ != 0L) {
        output.writeInt64(1, stepMs_);
      }
      if (!getFuncBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, func_);
      }
      if (startMs_ != 0L) {
        output.writeInt64(3, startMs_);
      }
      if (endMs_ != 0L) {
        output.writeInt64(4, endMs_);
      }
      for (int i = 0; i < grouping_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, grouping_.getRaw(i));
      }
      if (by_ != false) {
        output.writeBool(6, by_);
      }
      if (rangeMs_ != 0L) {
        output.writeInt64(7, rangeMs_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stepMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, stepMs_);
      }
      if (!getFuncBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, func_);
      }
      if (startMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, startMs_);
      }
      if (endMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, endMs_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < grouping_.size(); i++) {
          dataSize += computeStringSizeNoTag(grouping_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getGroupingList().size();
      }
      if (by_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, by_);
      }
      if (rangeMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, rangeMs_);
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
      if (!(obj instanceof prometheus.Types.ReadHints)) {
        return super.equals(obj);
      }
      prometheus.Types.ReadHints other = (prometheus.Types.ReadHints) obj;

      if (getStepMs()
          != other.getStepMs()) return false;
      if (!getFunc()
          .equals(other.getFunc())) return false;
      if (getStartMs()
          != other.getStartMs()) return false;
      if (getEndMs()
          != other.getEndMs()) return false;
      if (!getGroupingList()
          .equals(other.getGroupingList())) return false;
      if (getBy()
          != other.getBy()) return false;
      if (getRangeMs()
          != other.getRangeMs()) return false;
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
      hash = (37 * hash) + STEP_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStepMs());
      hash = (37 * hash) + FUNC_FIELD_NUMBER;
      hash = (53 * hash) + getFunc().hashCode();
      hash = (37 * hash) + START_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStartMs());
      hash = (37 * hash) + END_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEndMs());
      if (getGroupingCount() > 0) {
        hash = (37 * hash) + GROUPING_FIELD_NUMBER;
        hash = (53 * hash) + getGroupingList().hashCode();
      }
      hash = (37 * hash) + BY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBy());
      hash = (37 * hash) + RANGE_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRangeMs());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static prometheus.Types.ReadHints parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.ReadHints parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.ReadHints parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.ReadHints parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.ReadHints parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.ReadHints parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.ReadHints parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.ReadHints parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.ReadHints parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static prometheus.Types.ReadHints parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.ReadHints parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.ReadHints parseFrom(
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
    public static Builder newBuilder(prometheus.Types.ReadHints prototype) {
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
     * Protobuf type {@code prometheus.ReadHints}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:prometheus.ReadHints)
        prometheus.Types.ReadHintsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return prometheus.Types.internal_static_prometheus_ReadHints_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return prometheus.Types.internal_static_prometheus_ReadHints_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                prometheus.Types.ReadHints.class, prometheus.Types.ReadHints.Builder.class);
      }

      // Construct using prometheus.Types.ReadHints.newBuilder()
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
        stepMs_ = 0L;

        func_ = "";

        startMs_ = 0L;

        endMs_ = 0L;

        grouping_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        by_ = false;

        rangeMs_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return prometheus.Types.internal_static_prometheus_ReadHints_descriptor;
      }

      @java.lang.Override
      public prometheus.Types.ReadHints getDefaultInstanceForType() {
        return prometheus.Types.ReadHints.getDefaultInstance();
      }

      @java.lang.Override
      public prometheus.Types.ReadHints build() {
        prometheus.Types.ReadHints result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public prometheus.Types.ReadHints buildPartial() {
        prometheus.Types.ReadHints result = new prometheus.Types.ReadHints(this);
        int from_bitField0_ = bitField0_;
        result.stepMs_ = stepMs_;
        result.func_ = func_;
        result.startMs_ = startMs_;
        result.endMs_ = endMs_;
        if (((bitField0_ & 0x00000001) != 0)) {
          grouping_ = grouping_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.grouping_ = grouping_;
        result.by_ = by_;
        result.rangeMs_ = rangeMs_;
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
        if (other instanceof prometheus.Types.ReadHints) {
          return mergeFrom((prometheus.Types.ReadHints)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(prometheus.Types.ReadHints other) {
        if (other == prometheus.Types.ReadHints.getDefaultInstance()) return this;
        if (other.getStepMs() != 0L) {
          setStepMs(other.getStepMs());
        }
        if (!other.getFunc().isEmpty()) {
          func_ = other.func_;
          onChanged();
        }
        if (other.getStartMs() != 0L) {
          setStartMs(other.getStartMs());
        }
        if (other.getEndMs() != 0L) {
          setEndMs(other.getEndMs());
        }
        if (!other.grouping_.isEmpty()) {
          if (grouping_.isEmpty()) {
            grouping_ = other.grouping_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupingIsMutable();
            grouping_.addAll(other.grouping_);
          }
          onChanged();
        }
        if (other.getBy() != false) {
          setBy(other.getBy());
        }
        if (other.getRangeMs() != 0L) {
          setRangeMs(other.getRangeMs());
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
        prometheus.Types.ReadHints parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (prometheus.Types.ReadHints) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long stepMs_ ;
      /**
       * <pre>
       * Query step size in milliseconds.
       * </pre>
       *
       * <code>int64 step_ms = 1;</code>
       * @return The stepMs.
       */
      @java.lang.Override
      public long getStepMs() {
        return stepMs_;
      }
      /**
       * <pre>
       * Query step size in milliseconds.
       * </pre>
       *
       * <code>int64 step_ms = 1;</code>
       * @param value The stepMs to set.
       * @return This builder for chaining.
       */
      public Builder setStepMs(long value) {
        
        stepMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Query step size in milliseconds.
       * </pre>
       *
       * <code>int64 step_ms = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStepMs() {
        
        stepMs_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object func_ = "";
      /**
       * <pre>
       * String representation of surrounding function or aggregation.
       * </pre>
       *
       * <code>string func = 2;</code>
       * @return The func.
       */
      public java.lang.String getFunc() {
        java.lang.Object ref = func_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          func_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * String representation of surrounding function or aggregation.
       * </pre>
       *
       * <code>string func = 2;</code>
       * @return The bytes for func.
       */
      public com.google.protobuf.ByteString
          getFuncBytes() {
        java.lang.Object ref = func_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          func_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * String representation of surrounding function or aggregation.
       * </pre>
       *
       * <code>string func = 2;</code>
       * @param value The func to set.
       * @return This builder for chaining.
       */
      public Builder setFunc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        func_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * String representation of surrounding function or aggregation.
       * </pre>
       *
       * <code>string func = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFunc() {
        
        func_ = getDefaultInstance().getFunc();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * String representation of surrounding function or aggregation.
       * </pre>
       *
       * <code>string func = 2;</code>
       * @param value The bytes for func to set.
       * @return This builder for chaining.
       */
      public Builder setFuncBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        func_ = value;
        onChanged();
        return this;
      }

      private long startMs_ ;
      /**
       * <pre>
       * Start time in milliseconds.
       * </pre>
       *
       * <code>int64 start_ms = 3;</code>
       * @return The startMs.
       */
      @java.lang.Override
      public long getStartMs() {
        return startMs_;
      }
      /**
       * <pre>
       * Start time in milliseconds.
       * </pre>
       *
       * <code>int64 start_ms = 3;</code>
       * @param value The startMs to set.
       * @return This builder for chaining.
       */
      public Builder setStartMs(long value) {
        
        startMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Start time in milliseconds.
       * </pre>
       *
       * <code>int64 start_ms = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartMs() {
        
        startMs_ = 0L;
        onChanged();
        return this;
      }

      private long endMs_ ;
      /**
       * <pre>
       * End time in milliseconds.
       * </pre>
       *
       * <code>int64 end_ms = 4;</code>
       * @return The endMs.
       */
      @java.lang.Override
      public long getEndMs() {
        return endMs_;
      }
      /**
       * <pre>
       * End time in milliseconds.
       * </pre>
       *
       * <code>int64 end_ms = 4;</code>
       * @param value The endMs to set.
       * @return This builder for chaining.
       */
      public Builder setEndMs(long value) {
        
        endMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * End time in milliseconds.
       * </pre>
       *
       * <code>int64 end_ms = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndMs() {
        
        endMs_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList grouping_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureGroupingIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          grouping_ = new com.google.protobuf.LazyStringArrayList(grouping_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @return A list containing the grouping.
       */
      public com.google.protobuf.ProtocolStringList
          getGroupingList() {
        return grouping_.getUnmodifiableView();
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @return The count of grouping.
       */
      public int getGroupingCount() {
        return grouping_.size();
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param index The index of the element to return.
       * @return The grouping at the given index.
       */
      public java.lang.String getGrouping(int index) {
        return grouping_.get(index);
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param index The index of the value to return.
       * @return The bytes of the grouping at the given index.
       */
      public com.google.protobuf.ByteString
          getGroupingBytes(int index) {
        return grouping_.getByteString(index);
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param index The index to set the value at.
       * @param value The grouping to set.
       * @return This builder for chaining.
       */
      public Builder setGrouping(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureGroupingIsMutable();
        grouping_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param value The grouping to add.
       * @return This builder for chaining.
       */
      public Builder addGrouping(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureGroupingIsMutable();
        grouping_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param values The grouping to add.
       * @return This builder for chaining.
       */
      public Builder addAllGrouping(
          java.lang.Iterable<java.lang.String> values) {
        ensureGroupingIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, grouping_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGrouping() {
        grouping_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of label names used in aggregation.
       * </pre>
       *
       * <code>repeated string grouping = 5;</code>
       * @param value The bytes of the grouping to add.
       * @return This builder for chaining.
       */
      public Builder addGroupingBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureGroupingIsMutable();
        grouping_.add(value);
        onChanged();
        return this;
      }

      private boolean by_ ;
      /**
       * <pre>
       * Indicate whether it is without or by.
       * </pre>
       *
       * <code>bool by = 6;</code>
       * @return The by.
       */
      @java.lang.Override
      public boolean getBy() {
        return by_;
      }
      /**
       * <pre>
       * Indicate whether it is without or by.
       * </pre>
       *
       * <code>bool by = 6;</code>
       * @param value The by to set.
       * @return This builder for chaining.
       */
      public Builder setBy(boolean value) {
        
        by_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Indicate whether it is without or by.
       * </pre>
       *
       * <code>bool by = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearBy() {
        
        by_ = false;
        onChanged();
        return this;
      }

      private long rangeMs_ ;
      /**
       * <pre>
       * Range vector selector range in milliseconds.
       * </pre>
       *
       * <code>int64 range_ms = 7;</code>
       * @return The rangeMs.
       */
      @java.lang.Override
      public long getRangeMs() {
        return rangeMs_;
      }
      /**
       * <pre>
       * Range vector selector range in milliseconds.
       * </pre>
       *
       * <code>int64 range_ms = 7;</code>
       * @param value The rangeMs to set.
       * @return This builder for chaining.
       */
      public Builder setRangeMs(long value) {
        
        rangeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Range vector selector range in milliseconds.
       * </pre>
       *
       * <code>int64 range_ms = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRangeMs() {
        
        rangeMs_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:prometheus.ReadHints)
    }

    // @@protoc_insertion_point(class_scope:prometheus.ReadHints)
    private static final prometheus.Types.ReadHints DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new prometheus.Types.ReadHints();
    }

    public static prometheus.Types.ReadHints getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReadHints>
        PARSER = new com.google.protobuf.AbstractParser<ReadHints>() {
      @java.lang.Override
      public ReadHints parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadHints(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReadHints> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReadHints> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public prometheus.Types.ReadHints getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ChunkOrBuilder extends
      // @@protoc_insertion_point(interface_extends:prometheus.Chunk)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 min_time_ms = 1;</code>
     * @return The minTimeMs.
     */
    long getMinTimeMs();

    /**
     * <code>int64 max_time_ms = 2;</code>
     * @return The maxTimeMs.
     */
    long getMaxTimeMs();

    /**
     * <code>.prometheus.Chunk.Encoding type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.prometheus.Chunk.Encoding type = 3;</code>
     * @return The type.
     */
    prometheus.Types.Chunk.Encoding getType();

    /**
     * <code>bytes data = 4;</code>
     * @return The data.
     */
    com.google.protobuf.ByteString getData();
  }
  /**
   * <pre>
   * Chunk represents a TSDB chunk.
   * Time range [min, max] is inclusive.
   * </pre>
   *
   * Protobuf type {@code prometheus.Chunk}
   */
  public static final class Chunk extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:prometheus.Chunk)
      ChunkOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Chunk.newBuilder() to construct.
    private Chunk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Chunk() {
      type_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Chunk();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Chunk(
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
            case 8: {

              minTimeMs_ = input.readInt64();
              break;
            }
            case 16: {

              maxTimeMs_ = input.readInt64();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 34: {

              data_ = input.readBytes();
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
      return prometheus.Types.internal_static_prometheus_Chunk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return prometheus.Types.internal_static_prometheus_Chunk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              prometheus.Types.Chunk.class, prometheus.Types.Chunk.Builder.class);
    }

    /**
     * <pre>
     * We require this to match chunkenc.Encoding.
     * </pre>
     *
     * Protobuf enum {@code prometheus.Chunk.Encoding}
     */
    public enum Encoding
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>XOR = 1;</code>
       */
      XOR(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>XOR = 1;</code>
       */
      public static final int XOR_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Encoding valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Encoding forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return XOR;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Encoding>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Encoding> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Encoding>() {
              public Encoding findValueByNumber(int number) {
                return Encoding.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return prometheus.Types.Chunk.getDescriptor().getEnumTypes().get(0);
      }

      private static final Encoding[] VALUES = values();

      public static Encoding valueOf(
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

      private Encoding(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:prometheus.Chunk.Encoding)
    }

    public static final int MIN_TIME_MS_FIELD_NUMBER = 1;
    private long minTimeMs_;
    /**
     * <code>int64 min_time_ms = 1;</code>
     * @return The minTimeMs.
     */
    @java.lang.Override
    public long getMinTimeMs() {
      return minTimeMs_;
    }

    public static final int MAX_TIME_MS_FIELD_NUMBER = 2;
    private long maxTimeMs_;
    /**
     * <code>int64 max_time_ms = 2;</code>
     * @return The maxTimeMs.
     */
    @java.lang.Override
    public long getMaxTimeMs() {
      return maxTimeMs_;
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>.prometheus.Chunk.Encoding type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.prometheus.Chunk.Encoding type = 3;</code>
     * @return The type.
     */
    @java.lang.Override public prometheus.Types.Chunk.Encoding getType() {
      @SuppressWarnings("deprecation")
      prometheus.Types.Chunk.Encoding result = prometheus.Types.Chunk.Encoding.valueOf(type_);
      return result == null ? prometheus.Types.Chunk.Encoding.UNRECOGNIZED : result;
    }

    public static final int DATA_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>bytes data = 4;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
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
      if (minTimeMs_ != 0L) {
        output.writeInt64(1, minTimeMs_);
      }
      if (maxTimeMs_ != 0L) {
        output.writeInt64(2, maxTimeMs_);
      }
      if (type_ != prometheus.Types.Chunk.Encoding.UNKNOWN.getNumber()) {
        output.writeEnum(3, type_);
      }
      if (!data_.isEmpty()) {
        output.writeBytes(4, data_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (minTimeMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, minTimeMs_);
      }
      if (maxTimeMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, maxTimeMs_);
      }
      if (type_ != prometheus.Types.Chunk.Encoding.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
      }
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, data_);
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
      if (!(obj instanceof prometheus.Types.Chunk)) {
        return super.equals(obj);
      }
      prometheus.Types.Chunk other = (prometheus.Types.Chunk) obj;

      if (getMinTimeMs()
          != other.getMinTimeMs()) return false;
      if (getMaxTimeMs()
          != other.getMaxTimeMs()) return false;
      if (type_ != other.type_) return false;
      if (!getData()
          .equals(other.getData())) return false;
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
      hash = (37 * hash) + MIN_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMinTimeMs());
      hash = (37 * hash) + MAX_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMaxTimeMs());
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static prometheus.Types.Chunk parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Chunk parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Chunk parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Chunk parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Chunk parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.Chunk parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.Chunk parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.Chunk parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.Chunk parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static prometheus.Types.Chunk parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.Chunk parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.Chunk parseFrom(
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
    public static Builder newBuilder(prometheus.Types.Chunk prototype) {
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
     * Chunk represents a TSDB chunk.
     * Time range [min, max] is inclusive.
     * </pre>
     *
     * Protobuf type {@code prometheus.Chunk}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:prometheus.Chunk)
        prometheus.Types.ChunkOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return prometheus.Types.internal_static_prometheus_Chunk_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return prometheus.Types.internal_static_prometheus_Chunk_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                prometheus.Types.Chunk.class, prometheus.Types.Chunk.Builder.class);
      }

      // Construct using prometheus.Types.Chunk.newBuilder()
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
        minTimeMs_ = 0L;

        maxTimeMs_ = 0L;

        type_ = 0;

        data_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return prometheus.Types.internal_static_prometheus_Chunk_descriptor;
      }

      @java.lang.Override
      public prometheus.Types.Chunk getDefaultInstanceForType() {
        return prometheus.Types.Chunk.getDefaultInstance();
      }

      @java.lang.Override
      public prometheus.Types.Chunk build() {
        prometheus.Types.Chunk result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public prometheus.Types.Chunk buildPartial() {
        prometheus.Types.Chunk result = new prometheus.Types.Chunk(this);
        result.minTimeMs_ = minTimeMs_;
        result.maxTimeMs_ = maxTimeMs_;
        result.type_ = type_;
        result.data_ = data_;
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
        if (other instanceof prometheus.Types.Chunk) {
          return mergeFrom((prometheus.Types.Chunk)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(prometheus.Types.Chunk other) {
        if (other == prometheus.Types.Chunk.getDefaultInstance()) return this;
        if (other.getMinTimeMs() != 0L) {
          setMinTimeMs(other.getMinTimeMs());
        }
        if (other.getMaxTimeMs() != 0L) {
          setMaxTimeMs(other.getMaxTimeMs());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
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
        prometheus.Types.Chunk parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (prometheus.Types.Chunk) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long minTimeMs_ ;
      /**
       * <code>int64 min_time_ms = 1;</code>
       * @return The minTimeMs.
       */
      @java.lang.Override
      public long getMinTimeMs() {
        return minTimeMs_;
      }
      /**
       * <code>int64 min_time_ms = 1;</code>
       * @param value The minTimeMs to set.
       * @return This builder for chaining.
       */
      public Builder setMinTimeMs(long value) {
        
        minTimeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 min_time_ms = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinTimeMs() {
        
        minTimeMs_ = 0L;
        onChanged();
        return this;
      }

      private long maxTimeMs_ ;
      /**
       * <code>int64 max_time_ms = 2;</code>
       * @return The maxTimeMs.
       */
      @java.lang.Override
      public long getMaxTimeMs() {
        return maxTimeMs_;
      }
      /**
       * <code>int64 max_time_ms = 2;</code>
       * @param value The maxTimeMs to set.
       * @return This builder for chaining.
       */
      public Builder setMaxTimeMs(long value) {
        
        maxTimeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 max_time_ms = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxTimeMs() {
        
        maxTimeMs_ = 0L;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.prometheus.Chunk.Encoding type = 3;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.prometheus.Chunk.Encoding type = 3;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.prometheus.Chunk.Encoding type = 3;</code>
       * @return The type.
       */
      @java.lang.Override
      public prometheus.Types.Chunk.Encoding getType() {
        @SuppressWarnings("deprecation")
        prometheus.Types.Chunk.Encoding result = prometheus.Types.Chunk.Encoding.valueOf(type_);
        return result == null ? prometheus.Types.Chunk.Encoding.UNRECOGNIZED : result;
      }
      /**
       * <code>.prometheus.Chunk.Encoding type = 3;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(prometheus.Types.Chunk.Encoding value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.prometheus.Chunk.Encoding type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes data = 4;</code>
       * @return The data.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>bytes data = 4;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes data = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
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


      // @@protoc_insertion_point(builder_scope:prometheus.Chunk)
    }

    // @@protoc_insertion_point(class_scope:prometheus.Chunk)
    private static final prometheus.Types.Chunk DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new prometheus.Types.Chunk();
    }

    public static prometheus.Types.Chunk getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Chunk>
        PARSER = new com.google.protobuf.AbstractParser<Chunk>() {
      @java.lang.Override
      public Chunk parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Chunk(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Chunk> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Chunk> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public prometheus.Types.Chunk getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ChunkedSeriesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:prometheus.ChunkedSeries)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<prometheus.Types.Label> 
        getLabelsList();
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    prometheus.Types.Label getLabels(int index);
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    int getLabelsCount();
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends prometheus.Types.LabelOrBuilder> 
        getLabelsOrBuilderList();
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    prometheus.Types.LabelOrBuilder getLabelsOrBuilder(
        int index);

    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<prometheus.Types.Chunk> 
        getChunksList();
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    prometheus.Types.Chunk getChunks(int index);
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    int getChunksCount();
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends prometheus.Types.ChunkOrBuilder> 
        getChunksOrBuilderList();
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    prometheus.Types.ChunkOrBuilder getChunksOrBuilder(
        int index);
  }
  /**
   * <pre>
   * ChunkedSeries represents single, encoded time series.
   * </pre>
   *
   * Protobuf type {@code prometheus.ChunkedSeries}
   */
  public static final class ChunkedSeries extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:prometheus.ChunkedSeries)
      ChunkedSeriesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChunkedSeries.newBuilder() to construct.
    private ChunkedSeries(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChunkedSeries() {
      labels_ = java.util.Collections.emptyList();
      chunks_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChunkedSeries();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChunkedSeries(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                labels_ = new java.util.ArrayList<prometheus.Types.Label>();
                mutable_bitField0_ |= 0x00000001;
              }
              labels_.add(
                  input.readMessage(prometheus.Types.Label.parser(), extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                chunks_ = new java.util.ArrayList<prometheus.Types.Chunk>();
                mutable_bitField0_ |= 0x00000002;
              }
              chunks_.add(
                  input.readMessage(prometheus.Types.Chunk.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          chunks_ = java.util.Collections.unmodifiableList(chunks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return prometheus.Types.internal_static_prometheus_ChunkedSeries_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return prometheus.Types.internal_static_prometheus_ChunkedSeries_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              prometheus.Types.ChunkedSeries.class, prometheus.Types.ChunkedSeries.Builder.class);
    }

    public static final int LABELS_FIELD_NUMBER = 1;
    private java.util.List<prometheus.Types.Label> labels_;
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<prometheus.Types.Label> getLabelsList() {
      return labels_;
    }
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<? extends prometheus.Types.LabelOrBuilder> 
        getLabelsOrBuilderList() {
      return labels_;
    }
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public prometheus.Types.Label getLabels(int index) {
      return labels_.get(index);
    }
    /**
     * <pre>
     * Labels should be sorted.
     * </pre>
     *
     * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public prometheus.Types.LabelOrBuilder getLabelsOrBuilder(
        int index) {
      return labels_.get(index);
    }

    public static final int CHUNKS_FIELD_NUMBER = 2;
    private java.util.List<prometheus.Types.Chunk> chunks_;
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<prometheus.Types.Chunk> getChunksList() {
      return chunks_;
    }
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<? extends prometheus.Types.ChunkOrBuilder> 
        getChunksOrBuilderList() {
      return chunks_;
    }
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public int getChunksCount() {
      return chunks_.size();
    }
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public prometheus.Types.Chunk getChunks(int index) {
      return chunks_.get(index);
    }
    /**
     * <pre>
     * Chunks will be in start time order and may overlap.
     * </pre>
     *
     * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public prometheus.Types.ChunkOrBuilder getChunksOrBuilder(
        int index) {
      return chunks_.get(index);
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
      for (int i = 0; i < labels_.size(); i++) {
        output.writeMessage(1, labels_.get(i));
      }
      for (int i = 0; i < chunks_.size(); i++) {
        output.writeMessage(2, chunks_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < labels_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, labels_.get(i));
      }
      for (int i = 0; i < chunks_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, chunks_.get(i));
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
      if (!(obj instanceof prometheus.Types.ChunkedSeries)) {
        return super.equals(obj);
      }
      prometheus.Types.ChunkedSeries other = (prometheus.Types.ChunkedSeries) obj;

      if (!getLabelsList()
          .equals(other.getLabelsList())) return false;
      if (!getChunksList()
          .equals(other.getChunksList())) return false;
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
      if (getLabelsCount() > 0) {
        hash = (37 * hash) + LABELS_FIELD_NUMBER;
        hash = (53 * hash) + getLabelsList().hashCode();
      }
      if (getChunksCount() > 0) {
        hash = (37 * hash) + CHUNKS_FIELD_NUMBER;
        hash = (53 * hash) + getChunksList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static prometheus.Types.ChunkedSeries parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.ChunkedSeries parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.ChunkedSeries parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.ChunkedSeries parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.ChunkedSeries parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static prometheus.Types.ChunkedSeries parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static prometheus.Types.ChunkedSeries parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.ChunkedSeries parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.ChunkedSeries parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static prometheus.Types.ChunkedSeries parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static prometheus.Types.ChunkedSeries parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static prometheus.Types.ChunkedSeries parseFrom(
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
    public static Builder newBuilder(prometheus.Types.ChunkedSeries prototype) {
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
     * ChunkedSeries represents single, encoded time series.
     * </pre>
     *
     * Protobuf type {@code prometheus.ChunkedSeries}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:prometheus.ChunkedSeries)
        prometheus.Types.ChunkedSeriesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return prometheus.Types.internal_static_prometheus_ChunkedSeries_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return prometheus.Types.internal_static_prometheus_ChunkedSeries_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                prometheus.Types.ChunkedSeries.class, prometheus.Types.ChunkedSeries.Builder.class);
      }

      // Construct using prometheus.Types.ChunkedSeries.newBuilder()
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
          getLabelsFieldBuilder();
          getChunksFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          labelsBuilder_.clear();
        }
        if (chunksBuilder_ == null) {
          chunks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          chunksBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return prometheus.Types.internal_static_prometheus_ChunkedSeries_descriptor;
      }

      @java.lang.Override
      public prometheus.Types.ChunkedSeries getDefaultInstanceForType() {
        return prometheus.Types.ChunkedSeries.getDefaultInstance();
      }

      @java.lang.Override
      public prometheus.Types.ChunkedSeries build() {
        prometheus.Types.ChunkedSeries result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public prometheus.Types.ChunkedSeries buildPartial() {
        prometheus.Types.ChunkedSeries result = new prometheus.Types.ChunkedSeries(this);
        int from_bitField0_ = bitField0_;
        if (labelsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            labels_ = java.util.Collections.unmodifiableList(labels_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.labels_ = labels_;
        } else {
          result.labels_ = labelsBuilder_.build();
        }
        if (chunksBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            chunks_ = java.util.Collections.unmodifiableList(chunks_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.chunks_ = chunks_;
        } else {
          result.chunks_ = chunksBuilder_.build();
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
        if (other instanceof prometheus.Types.ChunkedSeries) {
          return mergeFrom((prometheus.Types.ChunkedSeries)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(prometheus.Types.ChunkedSeries other) {
        if (other == prometheus.Types.ChunkedSeries.getDefaultInstance()) return this;
        if (labelsBuilder_ == null) {
          if (!other.labels_.isEmpty()) {
            if (labels_.isEmpty()) {
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLabelsIsMutable();
              labels_.addAll(other.labels_);
            }
            onChanged();
          }
        } else {
          if (!other.labels_.isEmpty()) {
            if (labelsBuilder_.isEmpty()) {
              labelsBuilder_.dispose();
              labelsBuilder_ = null;
              labels_ = other.labels_;
              bitField0_ = (bitField0_ & ~0x00000001);
              labelsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLabelsFieldBuilder() : null;
            } else {
              labelsBuilder_.addAllMessages(other.labels_);
            }
          }
        }
        if (chunksBuilder_ == null) {
          if (!other.chunks_.isEmpty()) {
            if (chunks_.isEmpty()) {
              chunks_ = other.chunks_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureChunksIsMutable();
              chunks_.addAll(other.chunks_);
            }
            onChanged();
          }
        } else {
          if (!other.chunks_.isEmpty()) {
            if (chunksBuilder_.isEmpty()) {
              chunksBuilder_.dispose();
              chunksBuilder_ = null;
              chunks_ = other.chunks_;
              bitField0_ = (bitField0_ & ~0x00000002);
              chunksBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getChunksFieldBuilder() : null;
            } else {
              chunksBuilder_.addAllMessages(other.chunks_);
            }
          }
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
        prometheus.Types.ChunkedSeries parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (prometheus.Types.ChunkedSeries) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<prometheus.Types.Label> labels_ =
        java.util.Collections.emptyList();
      private void ensureLabelsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          labels_ = new java.util.ArrayList<prometheus.Types.Label>(labels_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          prometheus.Types.Label, prometheus.Types.Label.Builder, prometheus.Types.LabelOrBuilder> labelsBuilder_;

      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<prometheus.Types.Label> getLabelsList() {
        if (labelsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(labels_);
        } else {
          return labelsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public int getLabelsCount() {
        if (labelsBuilder_ == null) {
          return labels_.size();
        } else {
          return labelsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label getLabels(int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);
        } else {
          return labelsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, prometheus.Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.set(index, value);
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setLabels(
          int index, prometheus.Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.set(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(prometheus.Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, prometheus.Types.Label value) {
        if (labelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLabelsIsMutable();
          labels_.add(index, value);
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          prometheus.Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addLabels(
          int index, prometheus.Types.Label.Builder builderForValue) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.add(index, builderForValue.build());
          onChanged();
        } else {
          labelsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllLabels(
          java.lang.Iterable<? extends prometheus.Types.Label> values) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, labels_);
          onChanged();
        } else {
          labelsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearLabels() {
        if (labelsBuilder_ == null) {
          labels_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          labelsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeLabels(int index) {
        if (labelsBuilder_ == null) {
          ensureLabelsIsMutable();
          labels_.remove(index);
          onChanged();
        } else {
          labelsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label.Builder getLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.LabelOrBuilder getLabelsOrBuilder(
          int index) {
        if (labelsBuilder_ == null) {
          return labels_.get(index);  } else {
          return labelsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends prometheus.Types.LabelOrBuilder> 
           getLabelsOrBuilderList() {
        if (labelsBuilder_ != null) {
          return labelsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(labels_);
        }
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label.Builder addLabelsBuilder() {
        return getLabelsFieldBuilder().addBuilder(
            prometheus.Types.Label.getDefaultInstance());
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Label.Builder addLabelsBuilder(
          int index) {
        return getLabelsFieldBuilder().addBuilder(
            index, prometheus.Types.Label.getDefaultInstance());
      }
      /**
       * <pre>
       * Labels should be sorted.
       * </pre>
       *
       * <code>repeated .prometheus.Label labels = 1 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<prometheus.Types.Label.Builder> 
           getLabelsBuilderList() {
        return getLabelsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          prometheus.Types.Label, prometheus.Types.Label.Builder, prometheus.Types.LabelOrBuilder> 
          getLabelsFieldBuilder() {
        if (labelsBuilder_ == null) {
          labelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              prometheus.Types.Label, prometheus.Types.Label.Builder, prometheus.Types.LabelOrBuilder>(
                  labels_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          labels_ = null;
        }
        return labelsBuilder_;
      }

      private java.util.List<prometheus.Types.Chunk> chunks_ =
        java.util.Collections.emptyList();
      private void ensureChunksIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          chunks_ = new java.util.ArrayList<prometheus.Types.Chunk>(chunks_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          prometheus.Types.Chunk, prometheus.Types.Chunk.Builder, prometheus.Types.ChunkOrBuilder> chunksBuilder_;

      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<prometheus.Types.Chunk> getChunksList() {
        if (chunksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(chunks_);
        } else {
          return chunksBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public int getChunksCount() {
        if (chunksBuilder_ == null) {
          return chunks_.size();
        } else {
          return chunksBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Chunk getChunks(int index) {
        if (chunksBuilder_ == null) {
          return chunks_.get(index);
        } else {
          return chunksBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setChunks(
          int index, prometheus.Types.Chunk value) {
        if (chunksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunksIsMutable();
          chunks_.set(index, value);
          onChanged();
        } else {
          chunksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setChunks(
          int index, prometheus.Types.Chunk.Builder builderForValue) {
        if (chunksBuilder_ == null) {
          ensureChunksIsMutable();
          chunks_.set(index, builderForValue.build());
          onChanged();
        } else {
          chunksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addChunks(prometheus.Types.Chunk value) {
        if (chunksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunksIsMutable();
          chunks_.add(value);
          onChanged();
        } else {
          chunksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addChunks(
          int index, prometheus.Types.Chunk value) {
        if (chunksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChunksIsMutable();
          chunks_.add(index, value);
          onChanged();
        } else {
          chunksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addChunks(
          prometheus.Types.Chunk.Builder builderForValue) {
        if (chunksBuilder_ == null) {
          ensureChunksIsMutable();
          chunks_.add(builderForValue.build());
          onChanged();
        } else {
          chunksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addChunks(
          int index, prometheus.Types.Chunk.Builder builderForValue) {
        if (chunksBuilder_ == null) {
          ensureChunksIsMutable();
          chunks_.add(index, builderForValue.build());
          onChanged();
        } else {
          chunksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllChunks(
          java.lang.Iterable<? extends prometheus.Types.Chunk> values) {
        if (chunksBuilder_ == null) {
          ensureChunksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, chunks_);
          onChanged();
        } else {
          chunksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearChunks() {
        if (chunksBuilder_ == null) {
          chunks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          chunksBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removeChunks(int index) {
        if (chunksBuilder_ == null) {
          ensureChunksIsMutable();
          chunks_.remove(index);
          onChanged();
        } else {
          chunksBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Chunk.Builder getChunksBuilder(
          int index) {
        return getChunksFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.ChunkOrBuilder getChunksOrBuilder(
          int index) {
        if (chunksBuilder_ == null) {
          return chunks_.get(index);  } else {
          return chunksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends prometheus.Types.ChunkOrBuilder> 
           getChunksOrBuilderList() {
        if (chunksBuilder_ != null) {
          return chunksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(chunks_);
        }
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Chunk.Builder addChunksBuilder() {
        return getChunksFieldBuilder().addBuilder(
            prometheus.Types.Chunk.getDefaultInstance());
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public prometheus.Types.Chunk.Builder addChunksBuilder(
          int index) {
        return getChunksFieldBuilder().addBuilder(
            index, prometheus.Types.Chunk.getDefaultInstance());
      }
      /**
       * <pre>
       * Chunks will be in start time order and may overlap.
       * </pre>
       *
       * <code>repeated .prometheus.Chunk chunks = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<prometheus.Types.Chunk.Builder> 
           getChunksBuilderList() {
        return getChunksFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          prometheus.Types.Chunk, prometheus.Types.Chunk.Builder, prometheus.Types.ChunkOrBuilder> 
          getChunksFieldBuilder() {
        if (chunksBuilder_ == null) {
          chunksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              prometheus.Types.Chunk, prometheus.Types.Chunk.Builder, prometheus.Types.ChunkOrBuilder>(
                  chunks_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          chunks_ = null;
        }
        return chunksBuilder_;
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


      // @@protoc_insertion_point(builder_scope:prometheus.ChunkedSeries)
    }

    // @@protoc_insertion_point(class_scope:prometheus.ChunkedSeries)
    private static final prometheus.Types.ChunkedSeries DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new prometheus.Types.ChunkedSeries();
    }

    public static prometheus.Types.ChunkedSeries getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChunkedSeries>
        PARSER = new com.google.protobuf.AbstractParser<ChunkedSeries>() {
      @java.lang.Override
      public ChunkedSeries parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChunkedSeries(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChunkedSeries> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChunkedSeries> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public prometheus.Types.ChunkedSeries getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_Sample_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_Sample_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_TimeSeries_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_TimeSeries_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_Label_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_Label_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_Labels_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_Labels_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_LabelMatcher_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_LabelMatcher_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_ReadHints_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_ReadHints_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_Chunk_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_Chunk_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prometheus_ChunkedSeries_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prometheus_ChunkedSeries_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013types.proto\022\nprometheus\032\024gogoproto/gog" +
      "o.proto\"*\n\006Sample\022\r\n\005value\030\001 \001(\001\022\021\n\ttime" +
      "stamp\030\002 \001(\003\"`\n\nTimeSeries\022\'\n\006labels\030\001 \003(" +
      "\0132\021.prometheus.LabelB\004\310\336\037\000\022)\n\007samples\030\002 " +
      "\003(\0132\022.prometheus.SampleB\004\310\336\037\000\"$\n\005Label\022\014" +
      "\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"1\n\006Labels\022\'\n" +
      "\006labels\030\001 \003(\0132\021.prometheus.LabelB\004\310\336\037\000\"\202" +
      "\001\n\014LabelMatcher\022+\n\004type\030\001 \001(\0162\035.promethe" +
      "us.LabelMatcher.Type\022\014\n\004name\030\002 \001(\t\022\r\n\005va" +
      "lue\030\003 \001(\t\"(\n\004Type\022\006\n\002EQ\020\000\022\007\n\003NEQ\020\001\022\006\n\002RE" +
      "\020\002\022\007\n\003NRE\020\003\"|\n\tReadHints\022\017\n\007step_ms\030\001 \001(" +
      "\003\022\014\n\004func\030\002 \001(\t\022\020\n\010start_ms\030\003 \001(\003\022\016\n\006end" +
      "_ms\030\004 \001(\003\022\020\n\010grouping\030\005 \003(\t\022\n\n\002by\030\006 \001(\010\022" +
      "\020\n\010range_ms\030\007 \001(\003\"\213\001\n\005Chunk\022\023\n\013min_time_" +
      "ms\030\001 \001(\003\022\023\n\013max_time_ms\030\002 \001(\003\022(\n\004type\030\003 " +
      "\001(\0162\032.prometheus.Chunk.Encoding\022\014\n\004data\030" +
      "\004 \001(\014\" \n\010Encoding\022\013\n\007UNKNOWN\020\000\022\007\n\003XOR\020\001\"" +
      "a\n\rChunkedSeries\022\'\n\006labels\030\001 \003(\0132\021.prome" +
      "theus.LabelB\004\310\336\037\000\022\'\n\006chunks\030\002 \003(\0132\021.prom" +
      "etheus.ChunkB\004\310\336\037\000B\010Z\006prompbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_prometheus_Sample_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_prometheus_Sample_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_Sample_descriptor,
        new java.lang.String[] { "Value", "Timestamp", });
    internal_static_prometheus_TimeSeries_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_prometheus_TimeSeries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_TimeSeries_descriptor,
        new java.lang.String[] { "Labels", "Samples", });
    internal_static_prometheus_Label_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_prometheus_Label_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_Label_descriptor,
        new java.lang.String[] { "Name", "Value", });
    internal_static_prometheus_Labels_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_prometheus_Labels_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_Labels_descriptor,
        new java.lang.String[] { "Labels", });
    internal_static_prometheus_LabelMatcher_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_prometheus_LabelMatcher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_LabelMatcher_descriptor,
        new java.lang.String[] { "Type", "Name", "Value", });
    internal_static_prometheus_ReadHints_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_prometheus_ReadHints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_ReadHints_descriptor,
        new java.lang.String[] { "StepMs", "Func", "StartMs", "EndMs", "Grouping", "By", "RangeMs", });
    internal_static_prometheus_Chunk_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_prometheus_Chunk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_Chunk_descriptor,
        new java.lang.String[] { "MinTimeMs", "MaxTimeMs", "Type", "Data", });
    internal_static_prometheus_ChunkedSeries_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_prometheus_ChunkedSeries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prometheus_ChunkedSeries_descriptor,
        new java.lang.String[] { "Labels", "Chunks", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
