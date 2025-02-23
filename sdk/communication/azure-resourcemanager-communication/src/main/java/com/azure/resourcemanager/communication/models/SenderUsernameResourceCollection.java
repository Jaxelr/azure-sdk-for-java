// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.communication.fluent.models.SenderUsernameResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * A class representing a Domains SenderUsernames collection.
 */
@Fluent
public final class SenderUsernameResourceCollection implements JsonSerializable<SenderUsernameResourceCollection> {
    /*
     * List of SenderUsernames
     */
    private List<SenderUsernameResourceInner> value;

    /*
     * The URL the client should use to fetch the next page (per server side paging).
     */
    private String nextLink;

    /**
     * Creates an instance of SenderUsernameResourceCollection class.
     */
    public SenderUsernameResourceCollection() {
    }

    /**
     * Get the value property: List of SenderUsernames.
     * 
     * @return the value value.
     */
    public List<SenderUsernameResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of SenderUsernames.
     * 
     * @param value the value value to set.
     * @return the SenderUsernameResourceCollection object itself.
     */
    public SenderUsernameResourceCollection withValue(List<SenderUsernameResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL the client should use to fetch the next page (per server side paging).
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL the client should use to fetch the next page (per server side paging).
     * 
     * @param nextLink the nextLink value to set.
     * @return the SenderUsernameResourceCollection object itself.
     */
    public SenderUsernameResourceCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SenderUsernameResourceCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SenderUsernameResourceCollection if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SenderUsernameResourceCollection.
     */
    public static SenderUsernameResourceCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SenderUsernameResourceCollection deserializedSenderUsernameResourceCollection
                = new SenderUsernameResourceCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SenderUsernameResourceInner> value
                        = reader.readArray(reader1 -> SenderUsernameResourceInner.fromJson(reader1));
                    deserializedSenderUsernameResourceCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSenderUsernameResourceCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSenderUsernameResourceCollection;
        });
    }
}
