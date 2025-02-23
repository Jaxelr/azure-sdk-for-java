// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.automation.models.GroupTypeEnum;
import com.azure.resourcemanager.automation.models.RunAsCredentialAssociationProperty;
import java.io.IOException;

/**
 * Definition of hybrid runbook worker group.
 */
@Fluent
public final class HybridRunbookWorkerGroupInner extends ProxyResource {
    /*
     * Gets or sets the hybrid worker group properties.
     */
    private HybridRunbookWorkerGroupProperties innerProperties;

    /*
     * Resource system metadata.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of HybridRunbookWorkerGroupInner class.
     */
    public HybridRunbookWorkerGroupInner() {
    }

    /**
     * Get the innerProperties property: Gets or sets the hybrid worker group properties.
     * 
     * @return the innerProperties value.
     */
    private HybridRunbookWorkerGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Resource system metadata.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the groupType property: Type of the HybridWorkerGroup.
     * 
     * @return the groupType value.
     */
    public GroupTypeEnum groupType() {
        return this.innerProperties() == null ? null : this.innerProperties().groupType();
    }

    /**
     * Set the groupType property: Type of the HybridWorkerGroup.
     * 
     * @param groupType the groupType value to set.
     * @return the HybridRunbookWorkerGroupInner object itself.
     */
    public HybridRunbookWorkerGroupInner withGroupType(GroupTypeEnum groupType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridRunbookWorkerGroupProperties();
        }
        this.innerProperties().withGroupType(groupType);
        return this;
    }

    /**
     * Get the credential property: Sets the credential of a worker group.
     * 
     * @return the credential value.
     */
    public RunAsCredentialAssociationProperty credential() {
        return this.innerProperties() == null ? null : this.innerProperties().credential();
    }

    /**
     * Set the credential property: Sets the credential of a worker group.
     * 
     * @param credential the credential value to set.
     * @return the HybridRunbookWorkerGroupInner object itself.
     */
    public HybridRunbookWorkerGroupInner withCredential(RunAsCredentialAssociationProperty credential) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridRunbookWorkerGroupProperties();
        }
        this.innerProperties().withCredential(credential);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HybridRunbookWorkerGroupInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HybridRunbookWorkerGroupInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HybridRunbookWorkerGroupInner.
     */
    public static HybridRunbookWorkerGroupInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HybridRunbookWorkerGroupInner deserializedHybridRunbookWorkerGroupInner
                = new HybridRunbookWorkerGroupInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedHybridRunbookWorkerGroupInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedHybridRunbookWorkerGroupInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedHybridRunbookWorkerGroupInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedHybridRunbookWorkerGroupInner.innerProperties
                        = HybridRunbookWorkerGroupProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedHybridRunbookWorkerGroupInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHybridRunbookWorkerGroupInner;
        });
    }
}
