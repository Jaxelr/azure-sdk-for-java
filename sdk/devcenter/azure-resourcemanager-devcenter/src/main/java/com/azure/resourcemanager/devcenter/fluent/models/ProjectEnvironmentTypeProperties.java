// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.models.EnvironmentTypeEnableStatus;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import com.azure.resourcemanager.devcenter.models.UserRoleAssignmentValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Properties of a project environment type.
 */
@Fluent
public final class ProjectEnvironmentTypeProperties extends ProjectEnvironmentTypeUpdateProperties {
    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The number of environments of this type.
     */
    @JsonProperty(value = "environmentCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer environmentCount;

    /**
     * Creates an instance of ProjectEnvironmentTypeProperties class.
     */
    public ProjectEnvironmentTypeProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the environmentCount property: The number of environments of this type.
     * 
     * @return the environmentCount value.
     */
    public Integer environmentCount() {
        return this.environmentCount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEnvironmentTypeProperties withDeploymentTargetId(String deploymentTargetId) {
        super.withDeploymentTargetId(deploymentTargetId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEnvironmentTypeProperties withDisplayName(String displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEnvironmentTypeProperties withStatus(EnvironmentTypeEnableStatus status) {
        super.withStatus(status);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEnvironmentTypeProperties
        withCreatorRoleAssignment(ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment creatorRoleAssignment) {
        super.withCreatorRoleAssignment(creatorRoleAssignment);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEnvironmentTypeProperties
        withUserRoleAssignments(Map<String, UserRoleAssignmentValue> userRoleAssignments) {
        super.withUserRoleAssignments(userRoleAssignments);
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
    }
}
