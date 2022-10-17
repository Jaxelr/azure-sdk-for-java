// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningState;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningStatusStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.Mode;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The AgentPoolProperties model. */
@Fluent
public final class AgentPoolProperties extends AgentPoolProfile {
    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AgentPoolProvisioningState provisioningState;

    /*
     * HybridAKSNodePoolStatus defines the observed state of HybridAKSNodePool
     */
    @JsonProperty(value = "status")
    private AgentPoolProvisioningStatusStatus status;

    /** Creates an instance of AgentPoolProperties class. */
    public AgentPoolProperties() {
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public AgentPoolProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: HybridAKSNodePoolStatus defines the observed state of HybridAKSNodePool.
     *
     * @return the status value.
     */
    public AgentPoolProvisioningStatusStatus status() {
        return this.status;
    }

    /**
     * Set the status property: HybridAKSNodePoolStatus defines the observed state of HybridAKSNodePool.
     *
     * @param status the status value to set.
     * @return the AgentPoolProperties object itself.
     */
    public AgentPoolProperties withStatus(AgentPoolProvisioningStatusStatus status) {
        this.status = status;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withCount(Integer count) {
        super.withCount(count);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withAvailabilityZones(List<String> availabilityZones) {
        super.withAvailabilityZones(availabilityZones);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withMaxCount(Integer maxCount) {
        super.withMaxCount(maxCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withMaxPods(Integer maxPods) {
        super.withMaxPods(maxPods);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withMinCount(Integer minCount) {
        super.withMinCount(minCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withMode(Mode mode) {
        super.withMode(mode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withNodeLabels(Map<String, String> nodeLabels) {
        super.withNodeLabels(nodeLabels);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withNodeTaints(List<String> nodeTaints) {
        super.withNodeTaints(nodeTaints);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withOsType(OsType osType) {
        super.withOsType(osType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withNodeImageVersion(String nodeImageVersion) {
        super.withNodeImageVersion(nodeImageVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withVmSize(String vmSize) {
        super.withVmSize(vmSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolProperties withCloudProviderProfile(CloudProviderProfile cloudProviderProfile) {
        super.withCloudProviderProfile(cloudProviderProfile);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (status() != null) {
            status().validate();
        }
    }
}