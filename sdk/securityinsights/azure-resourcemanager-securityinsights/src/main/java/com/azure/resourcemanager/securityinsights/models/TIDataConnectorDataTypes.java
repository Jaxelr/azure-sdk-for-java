// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The available data types for TI (Threat Intelligence) data connector. */
@Fluent
public final class TIDataConnectorDataTypes {
    /*
     * Data type for indicators connection.
     */
    @JsonProperty(value = "indicators", required = true)
    private TIDataConnectorDataTypesIndicators indicators;

    /**
     * Get the indicators property: Data type for indicators connection.
     *
     * @return the indicators value.
     */
    public TIDataConnectorDataTypesIndicators indicators() {
        return this.indicators;
    }

    /**
     * Set the indicators property: Data type for indicators connection.
     *
     * @param indicators the indicators value to set.
     * @return the TIDataConnectorDataTypes object itself.
     */
    public TIDataConnectorDataTypes withIndicators(TIDataConnectorDataTypesIndicators indicators) {
        this.indicators = indicators;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (indicators() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property indicators in model TIDataConnectorDataTypes"));
        } else {
            indicators().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TIDataConnectorDataTypes.class);
}
