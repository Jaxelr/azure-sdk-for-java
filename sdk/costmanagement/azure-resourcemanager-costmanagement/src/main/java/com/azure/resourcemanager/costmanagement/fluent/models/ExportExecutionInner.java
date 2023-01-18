// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.costmanagement.models.ExecutionStatus;
import com.azure.resourcemanager.costmanagement.models.ExecutionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An export execution. */
@Fluent
public final class ExportExecutionInner extends ProxyResource {
    /*
     * The properties of the export execution.
     */
    @JsonProperty(value = "properties")
    private ExportExecutionPropertiesInner innerProperties;

    /*
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the
     * user is updating the latest version or not.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /** Creates an instance of ExportExecutionInner class. */
    public ExportExecutionInner() {
    }

    /**
     * Get the innerProperties property: The properties of the export execution.
     *
     * @return the innerProperties value.
     */
    private ExportExecutionPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @param etag the etag value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the executionType property: The type of the export execution.
     *
     * @return the executionType value.
     */
    public ExecutionType executionType() {
        return this.innerProperties() == null ? null : this.innerProperties().executionType();
    }

    /**
     * Set the executionType property: The type of the export execution.
     *
     * @param executionType the executionType value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withExecutionType(ExecutionType executionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportExecutionPropertiesInner();
        }
        this.innerProperties().withExecutionType(executionType);
        return this;
    }

    /**
     * Get the status property: The last known status of the export execution.
     *
     * @return the status value.
     */
    public ExecutionStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The last known status of the export execution.
     *
     * @param status the status value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withStatus(ExecutionStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportExecutionPropertiesInner();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the submittedBy property: The identifier for the entity that executed the export. For OnDemand executions it
     * is the user email. For scheduled executions it is 'System'.
     *
     * @return the submittedBy value.
     */
    public String submittedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().submittedBy();
    }

    /**
     * Set the submittedBy property: The identifier for the entity that executed the export. For OnDemand executions it
     * is the user email. For scheduled executions it is 'System'.
     *
     * @param submittedBy the submittedBy value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withSubmittedBy(String submittedBy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportExecutionPropertiesInner();
        }
        this.innerProperties().withSubmittedBy(submittedBy);
        return this;
    }

    /**
     * Get the submittedTime property: The time when export was queued to be executed.
     *
     * @return the submittedTime value.
     */
    public OffsetDateTime submittedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().submittedTime();
    }

    /**
     * Set the submittedTime property: The time when export was queued to be executed.
     *
     * @param submittedTime the submittedTime value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withSubmittedTime(OffsetDateTime submittedTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportExecutionPropertiesInner();
        }
        this.innerProperties().withSubmittedTime(submittedTime);
        return this;
    }

    /**
     * Get the processingStartTime property: The time when export was picked up to be executed.
     *
     * @return the processingStartTime value.
     */
    public OffsetDateTime processingStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().processingStartTime();
    }

    /**
     * Set the processingStartTime property: The time when export was picked up to be executed.
     *
     * @param processingStartTime the processingStartTime value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withProcessingStartTime(OffsetDateTime processingStartTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportExecutionPropertiesInner();
        }
        this.innerProperties().withProcessingStartTime(processingStartTime);
        return this;
    }

    /**
     * Get the processingEndTime property: The time when the export execution finished.
     *
     * @return the processingEndTime value.
     */
    public OffsetDateTime processingEndTime() {
        return this.innerProperties() == null ? null : this.innerProperties().processingEndTime();
    }

    /**
     * Set the processingEndTime property: The time when the export execution finished.
     *
     * @param processingEndTime the processingEndTime value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withProcessingEndTime(OffsetDateTime processingEndTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportExecutionPropertiesInner();
        }
        this.innerProperties().withProcessingEndTime(processingEndTime);
        return this;
    }

    /**
     * Get the fileName property: The name of the exported file.
     *
     * @return the fileName value.
     */
    public String fileName() {
        return this.innerProperties() == null ? null : this.innerProperties().fileName();
    }

    /**
     * Set the fileName property: The name of the exported file.
     *
     * @param fileName the fileName value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withFileName(String fileName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportExecutionPropertiesInner();
        }
        this.innerProperties().withFileName(fileName);
        return this;
    }

    /**
     * Get the runSettings property: The export settings that were in effect for this execution.
     *
     * @return the runSettings value.
     */
    public CommonExportPropertiesInner runSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().runSettings();
    }

    /**
     * Set the runSettings property: The export settings that were in effect for this execution.
     *
     * @param runSettings the runSettings value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withRunSettings(CommonExportPropertiesInner runSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportExecutionPropertiesInner();
        }
        this.innerProperties().withRunSettings(runSettings);
        return this;
    }

    /**
     * Get the error property: The details of any error.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Set the error property: The details of any error.
     *
     * @param error the error value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withError(ManagementError error) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportExecutionPropertiesInner();
        }
        this.innerProperties().withError(error);
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
}