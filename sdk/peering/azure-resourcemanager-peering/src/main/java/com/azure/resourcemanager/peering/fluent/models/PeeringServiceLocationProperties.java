// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that define connectivity to the Peering Service Location. */
@Fluent
public final class PeeringServiceLocationProperties {
    /*
     * Country of the customer
     */
    @JsonProperty(value = "country")
    private String country;

    /*
     * State of the customer
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * Azure region for the location
     */
    @JsonProperty(value = "azureRegion")
    private String azureRegion;

    /** Creates an instance of PeeringServiceLocationProperties class. */
    public PeeringServiceLocationProperties() {
    }

    /**
     * Get the country property: Country of the customer.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: Country of the customer.
     *
     * @param country the country value to set.
     * @return the PeeringServiceLocationProperties object itself.
     */
    public PeeringServiceLocationProperties withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the state property: State of the customer.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: State of the customer.
     *
     * @param state the state value to set.
     * @return the PeeringServiceLocationProperties object itself.
     */
    public PeeringServiceLocationProperties withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the azureRegion property: Azure region for the location.
     *
     * @return the azureRegion value.
     */
    public String azureRegion() {
        return this.azureRegion;
    }

    /**
     * Set the azureRegion property: Azure region for the location.
     *
     * @param azureRegion the azureRegion value to set.
     * @return the PeeringServiceLocationProperties object itself.
     */
    public PeeringServiceLocationProperties withAzureRegion(String azureRegion) {
        this.azureRegion = azureRegion;
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