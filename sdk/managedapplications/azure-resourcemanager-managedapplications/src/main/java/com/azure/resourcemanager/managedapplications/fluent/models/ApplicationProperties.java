// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managedapplications.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The managed application properties. */
@Fluent
public final class ApplicationProperties {
    /*
     * The managed resource group Id.
     */
    @JsonProperty(value = "managedResourceGroupId", required = true)
    private String managedResourceGroupId;

    /*
     * The fully qualified path of managed application definition Id.
     */
    @JsonProperty(value = "applicationDefinitionId")
    private String applicationDefinitionId;

    /*
     * Name and value pairs that define the managed application parameters. It can be a JObject or a well formed JSON
     * string.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /*
     * Name and value pairs that define the managed application outputs.
     */
    @JsonProperty(value = "outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /*
     * The managed application provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of ApplicationProperties class. */
    public ApplicationProperties() {
    }

    /**
     * Get the managedResourceGroupId property: The managed resource group Id.
     *
     * @return the managedResourceGroupId value.
     */
    public String managedResourceGroupId() {
        return this.managedResourceGroupId;
    }

    /**
     * Set the managedResourceGroupId property: The managed resource group Id.
     *
     * @param managedResourceGroupId the managedResourceGroupId value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withManagedResourceGroupId(String managedResourceGroupId) {
        this.managedResourceGroupId = managedResourceGroupId;
        return this;
    }

    /**
     * Get the applicationDefinitionId property: The fully qualified path of managed application definition Id.
     *
     * @return the applicationDefinitionId value.
     */
    public String applicationDefinitionId() {
        return this.applicationDefinitionId;
    }

    /**
     * Set the applicationDefinitionId property: The fully qualified path of managed application definition Id.
     *
     * @param applicationDefinitionId the applicationDefinitionId value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withApplicationDefinitionId(String applicationDefinitionId) {
        this.applicationDefinitionId = applicationDefinitionId;
        return this;
    }

    /**
     * Get the parameters property: Name and value pairs that define the managed application parameters. It can be a
     * JObject or a well formed JSON string.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Name and value pairs that define the managed application parameters. It can be a
     * JObject or a well formed JSON string.
     *
     * @param parameters the parameters value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the outputs property: Name and value pairs that define the managed application outputs.
     *
     * @return the outputs value.
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get the provisioningState property: The managed application provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (managedResourceGroupId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property managedResourceGroupId in model ApplicationProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationProperties.class);
}