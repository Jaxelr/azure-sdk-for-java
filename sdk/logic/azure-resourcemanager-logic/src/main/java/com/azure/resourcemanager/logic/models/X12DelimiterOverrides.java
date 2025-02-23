// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The X12 delimiter override settings.
 */
@Fluent
public final class X12DelimiterOverrides implements JsonSerializable<X12DelimiterOverrides> {
    /*
     * The protocol version.
     */
    private String protocolVersion;

    /*
     * The message id.
     */
    private String messageId;

    /*
     * The data element separator.
     */
    private int dataElementSeparator;

    /*
     * The component separator.
     */
    private int componentSeparator;

    /*
     * The segment terminator.
     */
    private int segmentTerminator;

    /*
     * The segment terminator suffix.
     */
    private SegmentTerminatorSuffix segmentTerminatorSuffix;

    /*
     * The replacement character.
     */
    private int replaceCharacter;

    /*
     * The value indicating whether to replace separators in payload.
     */
    private boolean replaceSeparatorsInPayload;

    /*
     * The target namespace on which this delimiter settings has to be applied.
     */
    private String targetNamespace;

    /**
     * Creates an instance of X12DelimiterOverrides class.
     */
    public X12DelimiterOverrides() {
    }

    /**
     * Get the protocolVersion property: The protocol version.
     * 
     * @return the protocolVersion value.
     */
    public String protocolVersion() {
        return this.protocolVersion;
    }

    /**
     * Set the protocolVersion property: The protocol version.
     * 
     * @param protocolVersion the protocolVersion value to set.
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    /**
     * Get the messageId property: The message id.
     * 
     * @return the messageId value.
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The message id.
     * 
     * @param messageId the messageId value to set.
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the dataElementSeparator property: The data element separator.
     * 
     * @return the dataElementSeparator value.
     */
    public int dataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * Set the dataElementSeparator property: The data element separator.
     * 
     * @param dataElementSeparator the dataElementSeparator value to set.
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withDataElementSeparator(int dataElementSeparator) {
        this.dataElementSeparator = dataElementSeparator;
        return this;
    }

    /**
     * Get the componentSeparator property: The component separator.
     * 
     * @return the componentSeparator value.
     */
    public int componentSeparator() {
        return this.componentSeparator;
    }

    /**
     * Set the componentSeparator property: The component separator.
     * 
     * @param componentSeparator the componentSeparator value to set.
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withComponentSeparator(int componentSeparator) {
        this.componentSeparator = componentSeparator;
        return this;
    }

    /**
     * Get the segmentTerminator property: The segment terminator.
     * 
     * @return the segmentTerminator value.
     */
    public int segmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * Set the segmentTerminator property: The segment terminator.
     * 
     * @param segmentTerminator the segmentTerminator value to set.
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withSegmentTerminator(int segmentTerminator) {
        this.segmentTerminator = segmentTerminator;
        return this;
    }

    /**
     * Get the segmentTerminatorSuffix property: The segment terminator suffix.
     * 
     * @return the segmentTerminatorSuffix value.
     */
    public SegmentTerminatorSuffix segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * Set the segmentTerminatorSuffix property: The segment terminator suffix.
     * 
     * @param segmentTerminatorSuffix the segmentTerminatorSuffix value to set.
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withSegmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
        this.segmentTerminatorSuffix = segmentTerminatorSuffix;
        return this;
    }

    /**
     * Get the replaceCharacter property: The replacement character.
     * 
     * @return the replaceCharacter value.
     */
    public int replaceCharacter() {
        return this.replaceCharacter;
    }

    /**
     * Set the replaceCharacter property: The replacement character.
     * 
     * @param replaceCharacter the replaceCharacter value to set.
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withReplaceCharacter(int replaceCharacter) {
        this.replaceCharacter = replaceCharacter;
        return this;
    }

    /**
     * Get the replaceSeparatorsInPayload property: The value indicating whether to replace separators in payload.
     * 
     * @return the replaceSeparatorsInPayload value.
     */
    public boolean replaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
    }

    /**
     * Set the replaceSeparatorsInPayload property: The value indicating whether to replace separators in payload.
     * 
     * @param replaceSeparatorsInPayload the replaceSeparatorsInPayload value to set.
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withReplaceSeparatorsInPayload(boolean replaceSeparatorsInPayload) {
        this.replaceSeparatorsInPayload = replaceSeparatorsInPayload;
        return this;
    }

    /**
     * Get the targetNamespace property: The target namespace on which this delimiter settings has to be applied.
     * 
     * @return the targetNamespace value.
     */
    public String targetNamespace() {
        return this.targetNamespace;
    }

    /**
     * Set the targetNamespace property: The target namespace on which this delimiter settings has to be applied.
     * 
     * @param targetNamespace the targetNamespace value to set.
     * @return the X12DelimiterOverrides object itself.
     */
    public X12DelimiterOverrides withTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (segmentTerminatorSuffix() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property segmentTerminatorSuffix in model X12DelimiterOverrides"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(X12DelimiterOverrides.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("dataElementSeparator", this.dataElementSeparator);
        jsonWriter.writeIntField("componentSeparator", this.componentSeparator);
        jsonWriter.writeIntField("segmentTerminator", this.segmentTerminator);
        jsonWriter.writeStringField("segmentTerminatorSuffix",
            this.segmentTerminatorSuffix == null ? null : this.segmentTerminatorSuffix.toString());
        jsonWriter.writeIntField("replaceCharacter", this.replaceCharacter);
        jsonWriter.writeBooleanField("replaceSeparatorsInPayload", this.replaceSeparatorsInPayload);
        jsonWriter.writeStringField("protocolVersion", this.protocolVersion);
        jsonWriter.writeStringField("messageId", this.messageId);
        jsonWriter.writeStringField("targetNamespace", this.targetNamespace);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of X12DelimiterOverrides from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of X12DelimiterOverrides if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the X12DelimiterOverrides.
     */
    public static X12DelimiterOverrides fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            X12DelimiterOverrides deserializedX12DelimiterOverrides = new X12DelimiterOverrides();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataElementSeparator".equals(fieldName)) {
                    deserializedX12DelimiterOverrides.dataElementSeparator = reader.getInt();
                } else if ("componentSeparator".equals(fieldName)) {
                    deserializedX12DelimiterOverrides.componentSeparator = reader.getInt();
                } else if ("segmentTerminator".equals(fieldName)) {
                    deserializedX12DelimiterOverrides.segmentTerminator = reader.getInt();
                } else if ("segmentTerminatorSuffix".equals(fieldName)) {
                    deserializedX12DelimiterOverrides.segmentTerminatorSuffix
                        = SegmentTerminatorSuffix.fromString(reader.getString());
                } else if ("replaceCharacter".equals(fieldName)) {
                    deserializedX12DelimiterOverrides.replaceCharacter = reader.getInt();
                } else if ("replaceSeparatorsInPayload".equals(fieldName)) {
                    deserializedX12DelimiterOverrides.replaceSeparatorsInPayload = reader.getBoolean();
                } else if ("protocolVersion".equals(fieldName)) {
                    deserializedX12DelimiterOverrides.protocolVersion = reader.getString();
                } else if ("messageId".equals(fieldName)) {
                    deserializedX12DelimiterOverrides.messageId = reader.getString();
                } else if ("targetNamespace".equals(fieldName)) {
                    deserializedX12DelimiterOverrides.targetNamespace = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedX12DelimiterOverrides;
        });
    }
}
