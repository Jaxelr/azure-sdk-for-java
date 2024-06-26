// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpoint;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnection;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateLinkServiceConnectionState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Private Endpoint Connection resource. */
@Fluent
public final class PrivateEndpointConnectionWithSystemDataInner extends PrivateEndpointConnection {
    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of PrivateEndpointConnectionWithSystemDataInner class. */
    public PrivateEndpointConnectionWithSystemDataInner() {
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateEndpointConnectionWithSystemDataInner withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        super.withPrivateEndpoint(privateEndpoint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateEndpointConnectionWithSystemDataInner withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        super.withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
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
