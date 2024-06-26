// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.fluidrelay.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of a Fluid Relay Container resource. */
@Immutable
public final class FluidRelayContainerProperties {
    /*
     * The Fluid tenantId for this container
     */
    @JsonProperty(value = "frsTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String frsTenantId;

    /*
     * The frsContainerId for this container
     */
    @JsonProperty(value = "frsContainerId", access = JsonProperty.Access.WRITE_ONLY)
    private String frsContainerId;

    /*
     * Provision states for FluidRelay RP
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The creation time of this resource
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Last time when user access this resource
     */
    @JsonProperty(value = "lastAccessTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastAccessTime;

    /**
     * Get the frsTenantId property: The Fluid tenantId for this container.
     *
     * @return the frsTenantId value.
     */
    public String frsTenantId() {
        return this.frsTenantId;
    }

    /**
     * Get the frsContainerId property: The frsContainerId for this container.
     *
     * @return the frsContainerId value.
     */
    public String frsContainerId() {
        return this.frsContainerId;
    }

    /**
     * Get the provisioningState property: Provision states for FluidRelay RP.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the creationTime property: The creation time of this resource.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastAccessTime property: Last time when user access this resource.
     *
     * @return the lastAccessTime value.
     */
    public OffsetDateTime lastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
