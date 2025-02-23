// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;
import java.util.List;

/**
 * Properties for Adls Gen2 storage account.
 */
@Fluent
public final class AdlsGen2ArtifactProperties implements JsonSerializable<AdlsGen2ArtifactProperties> {
    /*
     * Location of the storage account.
     */
    private String location;

    /*
     * A list of Adls Gen2 storage account paths.
     */
    private List<StorageAccountPath> paths;

    /**
     * Creates an instance of AdlsGen2ArtifactProperties class.
     */
    public AdlsGen2ArtifactProperties() {
    }

    /**
     * Get the location property: Location of the storage account.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Get the paths property: A list of Adls Gen2 storage account paths.
     *
     * @return the paths value.
     */
    public List<StorageAccountPath> getPaths() {
        return this.paths;
    }

    /**
     * Set the paths property: A list of Adls Gen2 storage account paths.
     *
     * @param paths the paths value to set.
     * @return the AdlsGen2ArtifactProperties object itself.
     */
    public AdlsGen2ArtifactProperties setPaths(List<StorageAccountPath> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("paths", this.paths, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AdlsGen2ArtifactProperties from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AdlsGen2ArtifactProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AdlsGen2ArtifactProperties.
     */
    public static AdlsGen2ArtifactProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AdlsGen2ArtifactProperties deserializedAdlsGen2ArtifactProperties = new AdlsGen2ArtifactProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("paths".equals(fieldName)) {
                    List<StorageAccountPath> paths = reader.readArray(reader1 -> StorageAccountPath.fromJson(reader1));
                    deserializedAdlsGen2ArtifactProperties.paths = paths;
                } else if ("location".equals(fieldName)) {
                    deserializedAdlsGen2ArtifactProperties.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAdlsGen2ArtifactProperties;
        });
    }
}
