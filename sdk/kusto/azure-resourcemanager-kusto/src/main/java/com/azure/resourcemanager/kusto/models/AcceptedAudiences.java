// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents an accepted audience trusted by the cluster.
 */
@Fluent
public final class AcceptedAudiences implements JsonSerializable<AcceptedAudiences> {
    /*
     * GUID or valid URL representing an accepted audience.
     */
    private String value;

    /**
     * Creates an instance of AcceptedAudiences class.
     */
    public AcceptedAudiences() {
    }

    /**
     * Get the value property: GUID or valid URL representing an accepted audience.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: GUID or valid URL representing an accepted audience.
     * 
     * @param value the value value to set.
     * @return the AcceptedAudiences object itself.
     */
    public AcceptedAudiences withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcceptedAudiences from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcceptedAudiences if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcceptedAudiences.
     */
    public static AcceptedAudiences fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcceptedAudiences deserializedAcceptedAudiences = new AcceptedAudiences();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedAcceptedAudiences.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAcceptedAudiences;
        });
    }
}
