// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a active directory only authentication for Managed Instance. */
@Fluent
public final class ManagedInstanceAzureADOnlyAuthProperties {
    /*
     * Azure Active Directory only Authentication enabled.
     */
    @JsonProperty(value = "azureADOnlyAuthentication", required = true)
    private boolean azureADOnlyAuthentication;

    /** Creates an instance of ManagedInstanceAzureADOnlyAuthProperties class. */
    public ManagedInstanceAzureADOnlyAuthProperties() {
    }

    /**
     * Get the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @return the azureADOnlyAuthentication value.
     */
    public boolean azureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }

    /**
     * Set the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @param azureADOnlyAuthentication the azureADOnlyAuthentication value to set.
     * @return the ManagedInstanceAzureADOnlyAuthProperties object itself.
     */
    public ManagedInstanceAzureADOnlyAuthProperties withAzureADOnlyAuthentication(boolean azureADOnlyAuthentication) {
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
