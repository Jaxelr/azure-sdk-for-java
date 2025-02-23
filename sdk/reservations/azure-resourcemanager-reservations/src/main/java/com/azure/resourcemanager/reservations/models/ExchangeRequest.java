// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Exchange request.
 */
@Fluent
public final class ExchangeRequest implements JsonSerializable<ExchangeRequest> {
    /*
     * Exchange request properties
     */
    private ExchangeRequestProperties properties;

    /**
     * Creates an instance of ExchangeRequest class.
     */
    public ExchangeRequest() {
    }

    /**
     * Get the properties property: Exchange request properties.
     * 
     * @return the properties value.
     */
    public ExchangeRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Exchange request properties.
     * 
     * @param properties the properties value to set.
     * @return the ExchangeRequest object itself.
     */
    public ExchangeRequest withProperties(ExchangeRequestProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExchangeRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExchangeRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExchangeRequest.
     */
    public static ExchangeRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExchangeRequest deserializedExchangeRequest = new ExchangeRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedExchangeRequest.properties = ExchangeRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExchangeRequest;
        });
    }
}
