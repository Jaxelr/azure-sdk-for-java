// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appcontainers.models.ExecutionStatus;
import com.azure.resourcemanager.appcontainers.models.JobExecutionRunningState;
import com.azure.resourcemanager.appcontainers.models.JobExecutionTemplate;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Container Apps Job execution.
 */
@Fluent
public final class JobExecutionInner implements JsonSerializable<JobExecutionInner> {
    /*
     * Job execution Name.
     */
    private String name;

    /*
     * Job execution Id.
     */
    private String id;

    /*
     * Job execution type
     */
    private String type;

    /*
     * Container Apps Job execution specific properties.
     */
    private JobExecutionProperties innerProperties;

    /**
     * Creates an instance of JobExecutionInner class.
     */
    public JobExecutionInner() {
    }

    /**
     * Get the name property: Job execution Name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Job execution Name.
     * 
     * @param name the name value to set.
     * @return the JobExecutionInner object itself.
     */
    public JobExecutionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: Job execution Id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Job execution Id.
     * 
     * @param id the id value to set.
     * @return the JobExecutionInner object itself.
     */
    public JobExecutionInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Job execution type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Job execution type.
     * 
     * @param type the type value to set.
     * @return the JobExecutionInner object itself.
     */
    public JobExecutionInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the innerProperties property: Container Apps Job execution specific properties.
     * 
     * @return the innerProperties value.
     */
    private JobExecutionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the status property: Current running State of the job.
     * 
     * @return the status value.
     */
    public JobExecutionRunningState status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the startTime property: Job execution start time.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: Job execution start time.
     * 
     * @param startTime the startTime value to set.
     * @return the JobExecutionInner object itself.
     */
    public JobExecutionInner withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobExecutionProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: Job execution end time.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Set the endTime property: Job execution end time.
     * 
     * @param endTime the endTime value to set.
     * @return the JobExecutionInner object itself.
     */
    public JobExecutionInner withEndTime(OffsetDateTime endTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobExecutionProperties();
        }
        this.innerProperties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the template property: Job's execution container.
     * 
     * @return the template value.
     */
    public JobExecutionTemplate template() {
        return this.innerProperties() == null ? null : this.innerProperties().template();
    }

    /**
     * Set the template property: Job's execution container.
     * 
     * @param template the template value to set.
     * @return the JobExecutionInner object itself.
     */
    public JobExecutionInner withTemplate(JobExecutionTemplate template) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobExecutionProperties();
        }
        this.innerProperties().withTemplate(template);
        return this;
    }

    /**
     * Get the detailedStatus property: Detailed status of the job execution.
     * 
     * @return the detailedStatus value.
     */
    public ExecutionStatus detailedStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatus();
    }

    /**
     * Set the detailedStatus property: Detailed status of the job execution.
     * 
     * @param detailedStatus the detailedStatus value to set.
     * @return the JobExecutionInner object itself.
     */
    public JobExecutionInner withDetailedStatus(ExecutionStatus detailedStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobExecutionProperties();
        }
        this.innerProperties().withDetailedStatus(detailedStatus);
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobExecutionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobExecutionInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the JobExecutionInner.
     */
    public static JobExecutionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobExecutionInner deserializedJobExecutionInner = new JobExecutionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedJobExecutionInner.name = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedJobExecutionInner.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedJobExecutionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedJobExecutionInner.innerProperties = JobExecutionProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobExecutionInner;
        });
    }
}
