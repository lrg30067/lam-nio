// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Foo.proto

package lam.serialization.protobuf;

public final class FooProto {
  private FooProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FooOrBuilder extends
      // @@protoc_insertion_point(interface_extends:lam.serialization.protobuf.Foo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;int32, string&gt; map_field = 1;</code>
     */
    int getMapFieldCount();
    /**
     * <code>map&lt;int32, string&gt; map_field = 1;</code>
     */
    boolean containsMapField(
        int key);
    /**
     * Use {@link #getMapFieldMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.String>
    getMapField();
    /**
     * <code>map&lt;int32, string&gt; map_field = 1;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.String>
    getMapFieldMap();
    /**
     * <code>map&lt;int32, string&gt; map_field = 1;</code>
     */

    java.lang.String getMapFieldOrDefault(
        int key,
        java.lang.String defaultValue);
    /**
     * <code>map&lt;int32, string&gt; map_field = 1;</code>
     */

    java.lang.String getMapFieldOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code lam.serialization.protobuf.Foo}
   */
  public  static final class Foo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:lam.serialization.protobuf.Foo)
      FooOrBuilder {
    // Use Foo.newBuilder() to construct.
    private Foo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Foo() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Foo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                mapField_ = com.google.protobuf.MapField.newMapField(
                    MapFieldDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
              mapField = input.readMessage(
                  MapFieldDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              mapField_.getMutableMap().put(mapField.getKey(), mapField.getValue());
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
      return lam.serialization.protobuf.FooProto.internal_static_lam_serialization_protobuf_Foo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMapField();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lam.serialization.protobuf.FooProto.internal_static_lam_serialization_protobuf_Foo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lam.serialization.protobuf.FooProto.Foo.class, lam.serialization.protobuf.FooProto.Foo.Builder.class);
    }

    public static final int MAP_FIELD_FIELD_NUMBER = 1;
    private static final class MapFieldDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.String> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.String>newDefaultInstance(
                  lam.serialization.protobuf.FooProto.internal_static_lam_serialization_protobuf_Foo_MapFieldEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.INT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.String> mapField_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
    internalGetMapField() {
      if (mapField_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MapFieldDefaultEntryHolder.defaultEntry);
      }
      return mapField_;
    }

    public int getMapFieldCount() {
      return internalGetMapField().getMap().size();
    }
    /**
     * <code>map&lt;int32, string&gt; map_field = 1;</code>
     */

    public boolean containsMapField(
        int key) {
      
      return internalGetMapField().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMapFieldMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.String> getMapField() {
      return getMapFieldMap();
    }
    /**
     * <code>map&lt;int32, string&gt; map_field = 1;</code>
     */

    public java.util.Map<java.lang.Integer, java.lang.String> getMapFieldMap() {
      return internalGetMapField().getMap();
    }
    /**
     * <code>map&lt;int32, string&gt; map_field = 1;</code>
     */

    public java.lang.String getMapFieldOrDefault(
        int key,
        java.lang.String defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.String> map =
          internalGetMapField().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, string&gt; map_field = 1;</code>
     */

    public java.lang.String getMapFieldOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.String> map =
          internalGetMapField().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry
           : internalGetMapField().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
        mapField = MapFieldDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        output.writeMessage(1, mapField);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry
           : internalGetMapField().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
        mapField = MapFieldDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, mapField);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof lam.serialization.protobuf.FooProto.Foo)) {
        return super.equals(obj);
      }
      lam.serialization.protobuf.FooProto.Foo other = (lam.serialization.protobuf.FooProto.Foo) obj;

      boolean result = true;
      result = result && internalGetMapField().equals(
          other.internalGetMapField());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (!internalGetMapField().getMap().isEmpty()) {
        hash = (37 * hash) + MAP_FIELD_FIELD_NUMBER;
        hash = (53 * hash) + internalGetMapField().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static lam.serialization.protobuf.FooProto.Foo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static lam.serialization.protobuf.FooProto.Foo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static lam.serialization.protobuf.FooProto.Foo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static lam.serialization.protobuf.FooProto.Foo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static lam.serialization.protobuf.FooProto.Foo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static lam.serialization.protobuf.FooProto.Foo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static lam.serialization.protobuf.FooProto.Foo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static lam.serialization.protobuf.FooProto.Foo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static lam.serialization.protobuf.FooProto.Foo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static lam.serialization.protobuf.FooProto.Foo parseFrom(
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
    public static Builder newBuilder(lam.serialization.protobuf.FooProto.Foo prototype) {
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
     * Protobuf type {@code lam.serialization.protobuf.Foo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:lam.serialization.protobuf.Foo)
        lam.serialization.protobuf.FooProto.FooOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return lam.serialization.protobuf.FooProto.internal_static_lam_serialization_protobuf_Foo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMapField();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMutableMapField();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return lam.serialization.protobuf.FooProto.internal_static_lam_serialization_protobuf_Foo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                lam.serialization.protobuf.FooProto.Foo.class, lam.serialization.protobuf.FooProto.Foo.Builder.class);
      }

      // Construct using lam.serialization.protobuf.FooProto.Foo.newBuilder()
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
      public Builder clear() {
        super.clear();
        internalGetMutableMapField().clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return lam.serialization.protobuf.FooProto.internal_static_lam_serialization_protobuf_Foo_descriptor;
      }

      public lam.serialization.protobuf.FooProto.Foo getDefaultInstanceForType() {
        return lam.serialization.protobuf.FooProto.Foo.getDefaultInstance();
      }

      public lam.serialization.protobuf.FooProto.Foo build() {
        lam.serialization.protobuf.FooProto.Foo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public lam.serialization.protobuf.FooProto.Foo buildPartial() {
        lam.serialization.protobuf.FooProto.Foo result = new lam.serialization.protobuf.FooProto.Foo(this);
        int from_bitField0_ = bitField0_;
        result.mapField_ = internalGetMapField();
        result.mapField_.makeImmutable();
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
        if (other instanceof lam.serialization.protobuf.FooProto.Foo) {
          return mergeFrom((lam.serialization.protobuf.FooProto.Foo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(lam.serialization.protobuf.FooProto.Foo other) {
        if (other == lam.serialization.protobuf.FooProto.Foo.getDefaultInstance()) return this;
        internalGetMutableMapField().mergeFrom(
            other.internalGetMapField());
        this.mergeUnknownFields(other.unknownFields);
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
        lam.serialization.protobuf.FooProto.Foo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (lam.serialization.protobuf.FooProto.Foo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.String> mapField_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
      internalGetMapField() {
        if (mapField_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              MapFieldDefaultEntryHolder.defaultEntry);
        }
        return mapField_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
      internalGetMutableMapField() {
        onChanged();;
        if (mapField_ == null) {
          mapField_ = com.google.protobuf.MapField.newMapField(
              MapFieldDefaultEntryHolder.defaultEntry);
        }
        if (!mapField_.isMutable()) {
          mapField_ = mapField_.copy();
        }
        return mapField_;
      }

      public int getMapFieldCount() {
        return internalGetMapField().getMap().size();
      }
      /**
       * <code>map&lt;int32, string&gt; map_field = 1;</code>
       */

      public boolean containsMapField(
          int key) {
        
        return internalGetMapField().getMap().containsKey(key);
      }
      /**
       * Use {@link #getMapFieldMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.String> getMapField() {
        return getMapFieldMap();
      }
      /**
       * <code>map&lt;int32, string&gt; map_field = 1;</code>
       */

      public java.util.Map<java.lang.Integer, java.lang.String> getMapFieldMap() {
        return internalGetMapField().getMap();
      }
      /**
       * <code>map&lt;int32, string&gt; map_field = 1;</code>
       */

      public java.lang.String getMapFieldOrDefault(
          int key,
          java.lang.String defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.String> map =
            internalGetMapField().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;int32, string&gt; map_field = 1;</code>
       */

      public java.lang.String getMapFieldOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.String> map =
            internalGetMapField().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearMapField() {
        getMutableMapField().clear();
        return this;
      }
      /**
       * <code>map&lt;int32, string&gt; map_field = 1;</code>
       */

      public Builder removeMapField(
          int key) {
        
        getMutableMapField().remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.String>
      getMutableMapField() {
        return internalGetMutableMapField().getMutableMap();
      }
      /**
       * <code>map&lt;int32, string&gt; map_field = 1;</code>
       */
      public Builder putMapField(
          int key,
          java.lang.String value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        getMutableMapField().put(key, value);
        return this;
      }
      /**
       * <code>map&lt;int32, string&gt; map_field = 1;</code>
       */

      public Builder putAllMapField(
          java.util.Map<java.lang.Integer, java.lang.String> values) {
        getMutableMapField().putAll(values);
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:lam.serialization.protobuf.Foo)
    }

    // @@protoc_insertion_point(class_scope:lam.serialization.protobuf.Foo)
    private static final lam.serialization.protobuf.FooProto.Foo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new lam.serialization.protobuf.FooProto.Foo();
    }

    public static lam.serialization.protobuf.FooProto.Foo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Foo>
        PARSER = new com.google.protobuf.AbstractParser<Foo>() {
      public Foo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Foo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Foo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Foo> getParserForType() {
      return PARSER;
    }

    public lam.serialization.protobuf.FooProto.Foo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lam_serialization_protobuf_Foo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lam_serialization_protobuf_Foo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lam_serialization_protobuf_Foo_MapFieldEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lam_serialization_protobuf_Foo_MapFieldEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tFoo.proto\022\032lam.serialization.protobuf\"" +
      "x\n\003Foo\022@\n\tmap_field\030\001 \003(\0132-.lam.serializ" +
      "ation.protobuf.Foo.MapFieldEntry\032/\n\rMapF" +
      "ieldEntry\022\013\n\003key\030\001 \001(\005\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001B&\n\032lam.serialization.protobufB\010FooProt" +
      "o"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_lam_serialization_protobuf_Foo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lam_serialization_protobuf_Foo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lam_serialization_protobuf_Foo_descriptor,
        new java.lang.String[] { "MapField", });
    internal_static_lam_serialization_protobuf_Foo_MapFieldEntry_descriptor =
      internal_static_lam_serialization_protobuf_Foo_descriptor.getNestedTypes().get(0);
    internal_static_lam_serialization_protobuf_Foo_MapFieldEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lam_serialization_protobuf_Foo_MapFieldEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}