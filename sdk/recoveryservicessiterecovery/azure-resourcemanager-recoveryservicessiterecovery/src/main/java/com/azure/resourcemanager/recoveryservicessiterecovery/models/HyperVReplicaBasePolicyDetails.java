// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base class for HyperVReplica policy details.
 */
@Fluent
public final class HyperVReplicaBasePolicyDetails extends PolicyProviderSpecificDetails {
    /*
     * Gets the class type. Overridden in derived classes.
     */
    private String instanceType = "HyperVReplicaBasePolicyDetails";

    /*
     * A value indicating the number of recovery points.
     */
    private Integer recoveryPoints;

    /*
     * A value indicating the application consistent frequency.
     */
    private Integer applicationConsistentSnapshotFrequencyInHours;

    /*
     * A value indicating whether compression has to be enabled.
     */
    private String compression;

    /*
     * A value indicating whether IR is online.
     */
    private String initialReplicationMethod;

    /*
     * A value indicating the online IR start time.
     */
    private String onlineReplicationStartTime;

    /*
     * A value indicating the offline IR import path.
     */
    private String offlineReplicationImportPath;

    /*
     * A value indicating the offline IR export path.
     */
    private String offlineReplicationExportPath;

    /*
     * A value indicating the recovery HTTPS port.
     */
    private Integer replicationPort;

    /*
     * A value indicating the authentication type.
     */
    private Integer allowedAuthenticationType;

    /*
     * A value indicating whether the VM has to be auto deleted. Supported Values: String.Empty, None, OnRecoveryCloud.
     */
    private String replicaDeletionOption;

    /**
     * Creates an instance of HyperVReplicaBasePolicyDetails class.
     */
    public HyperVReplicaBasePolicyDetails() {
    }

    /**
     * Get the instanceType property: Gets the class type. Overridden in derived classes.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the recoveryPoints property: A value indicating the number of recovery points.
     * 
     * @return the recoveryPoints value.
     */
    public Integer recoveryPoints() {
        return this.recoveryPoints;
    }

    /**
     * Set the recoveryPoints property: A value indicating the number of recovery points.
     * 
     * @param recoveryPoints the recoveryPoints value to set.
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withRecoveryPoints(Integer recoveryPoints) {
        this.recoveryPoints = recoveryPoints;
        return this;
    }

    /**
     * Get the applicationConsistentSnapshotFrequencyInHours property: A value indicating the application consistent
     * frequency.
     * 
     * @return the applicationConsistentSnapshotFrequencyInHours value.
     */
    public Integer applicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours;
    }

    /**
     * Set the applicationConsistentSnapshotFrequencyInHours property: A value indicating the application consistent
     * frequency.
     * 
     * @param applicationConsistentSnapshotFrequencyInHours the applicationConsistentSnapshotFrequencyInHours value to
     * set.
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails
        withApplicationConsistentSnapshotFrequencyInHours(Integer applicationConsistentSnapshotFrequencyInHours) {
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        return this;
    }

    /**
     * Get the compression property: A value indicating whether compression has to be enabled.
     * 
     * @return the compression value.
     */
    public String compression() {
        return this.compression;
    }

    /**
     * Set the compression property: A value indicating whether compression has to be enabled.
     * 
     * @param compression the compression value to set.
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withCompression(String compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Get the initialReplicationMethod property: A value indicating whether IR is online.
     * 
     * @return the initialReplicationMethod value.
     */
    public String initialReplicationMethod() {
        return this.initialReplicationMethod;
    }

    /**
     * Set the initialReplicationMethod property: A value indicating whether IR is online.
     * 
     * @param initialReplicationMethod the initialReplicationMethod value to set.
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withInitialReplicationMethod(String initialReplicationMethod) {
        this.initialReplicationMethod = initialReplicationMethod;
        return this;
    }

    /**
     * Get the onlineReplicationStartTime property: A value indicating the online IR start time.
     * 
     * @return the onlineReplicationStartTime value.
     */
    public String onlineReplicationStartTime() {
        return this.onlineReplicationStartTime;
    }

    /**
     * Set the onlineReplicationStartTime property: A value indicating the online IR start time.
     * 
     * @param onlineReplicationStartTime the onlineReplicationStartTime value to set.
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withOnlineReplicationStartTime(String onlineReplicationStartTime) {
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        return this;
    }

    /**
     * Get the offlineReplicationImportPath property: A value indicating the offline IR import path.
     * 
     * @return the offlineReplicationImportPath value.
     */
    public String offlineReplicationImportPath() {
        return this.offlineReplicationImportPath;
    }

    /**
     * Set the offlineReplicationImportPath property: A value indicating the offline IR import path.
     * 
     * @param offlineReplicationImportPath the offlineReplicationImportPath value to set.
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withOfflineReplicationImportPath(String offlineReplicationImportPath) {
        this.offlineReplicationImportPath = offlineReplicationImportPath;
        return this;
    }

    /**
     * Get the offlineReplicationExportPath property: A value indicating the offline IR export path.
     * 
     * @return the offlineReplicationExportPath value.
     */
    public String offlineReplicationExportPath() {
        return this.offlineReplicationExportPath;
    }

    /**
     * Set the offlineReplicationExportPath property: A value indicating the offline IR export path.
     * 
     * @param offlineReplicationExportPath the offlineReplicationExportPath value to set.
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withOfflineReplicationExportPath(String offlineReplicationExportPath) {
        this.offlineReplicationExportPath = offlineReplicationExportPath;
        return this;
    }

    /**
     * Get the replicationPort property: A value indicating the recovery HTTPS port.
     * 
     * @return the replicationPort value.
     */
    public Integer replicationPort() {
        return this.replicationPort;
    }

    /**
     * Set the replicationPort property: A value indicating the recovery HTTPS port.
     * 
     * @param replicationPort the replicationPort value to set.
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withReplicationPort(Integer replicationPort) {
        this.replicationPort = replicationPort;
        return this;
    }

    /**
     * Get the allowedAuthenticationType property: A value indicating the authentication type.
     * 
     * @return the allowedAuthenticationType value.
     */
    public Integer allowedAuthenticationType() {
        return this.allowedAuthenticationType;
    }

    /**
     * Set the allowedAuthenticationType property: A value indicating the authentication type.
     * 
     * @param allowedAuthenticationType the allowedAuthenticationType value to set.
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withAllowedAuthenticationType(Integer allowedAuthenticationType) {
        this.allowedAuthenticationType = allowedAuthenticationType;
        return this;
    }

    /**
     * Get the replicaDeletionOption property: A value indicating whether the VM has to be auto deleted. Supported
     * Values: String.Empty, None, OnRecoveryCloud.
     * 
     * @return the replicaDeletionOption value.
     */
    public String replicaDeletionOption() {
        return this.replicaDeletionOption;
    }

    /**
     * Set the replicaDeletionOption property: A value indicating whether the VM has to be auto deleted. Supported
     * Values: String.Empty, None, OnRecoveryCloud.
     * 
     * @param replicaDeletionOption the replicaDeletionOption value to set.
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withReplicaDeletionOption(String replicaDeletionOption) {
        this.replicaDeletionOption = replicaDeletionOption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeNumberField("recoveryPoints", this.recoveryPoints);
        jsonWriter.writeNumberField("applicationConsistentSnapshotFrequencyInHours",
            this.applicationConsistentSnapshotFrequencyInHours);
        jsonWriter.writeStringField("compression", this.compression);
        jsonWriter.writeStringField("initialReplicationMethod", this.initialReplicationMethod);
        jsonWriter.writeStringField("onlineReplicationStartTime", this.onlineReplicationStartTime);
        jsonWriter.writeStringField("offlineReplicationImportPath", this.offlineReplicationImportPath);
        jsonWriter.writeStringField("offlineReplicationExportPath", this.offlineReplicationExportPath);
        jsonWriter.writeNumberField("replicationPort", this.replicationPort);
        jsonWriter.writeNumberField("allowedAuthenticationType", this.allowedAuthenticationType);
        jsonWriter.writeStringField("replicaDeletionOption", this.replicaDeletionOption);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HyperVReplicaBasePolicyDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HyperVReplicaBasePolicyDetails if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HyperVReplicaBasePolicyDetails.
     */
    public static HyperVReplicaBasePolicyDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HyperVReplicaBasePolicyDetails deserializedHyperVReplicaBasePolicyDetails
                = new HyperVReplicaBasePolicyDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.instanceType = reader.getString();
                } else if ("recoveryPoints".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.recoveryPoints = reader.getNullable(JsonReader::getInt);
                } else if ("applicationConsistentSnapshotFrequencyInHours".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.applicationConsistentSnapshotFrequencyInHours
                        = reader.getNullable(JsonReader::getInt);
                } else if ("compression".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.compression = reader.getString();
                } else if ("initialReplicationMethod".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.initialReplicationMethod = reader.getString();
                } else if ("onlineReplicationStartTime".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.onlineReplicationStartTime = reader.getString();
                } else if ("offlineReplicationImportPath".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.offlineReplicationImportPath = reader.getString();
                } else if ("offlineReplicationExportPath".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.offlineReplicationExportPath = reader.getString();
                } else if ("replicationPort".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.replicationPort = reader.getNullable(JsonReader::getInt);
                } else if ("allowedAuthenticationType".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.allowedAuthenticationType
                        = reader.getNullable(JsonReader::getInt);
                } else if ("replicaDeletionOption".equals(fieldName)) {
                    deserializedHyperVReplicaBasePolicyDetails.replicaDeletionOption = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHyperVReplicaBasePolicyDetails;
        });
    }
}
