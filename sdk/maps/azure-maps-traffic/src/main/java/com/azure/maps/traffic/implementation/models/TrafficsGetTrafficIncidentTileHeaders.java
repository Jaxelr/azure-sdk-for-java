// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TrafficsGetTrafficIncidentTileHeaders model. */
@Fluent
public final class TrafficsGetTrafficIncidentTileHeaders {
    /*
     * The Content-Type property.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /**
     * Get the contentType property: The Content-Type property.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The Content-Type property.
     *
     * @param contentType the contentType value to set.
     * @return the TrafficsGetTrafficIncidentTileHeaders object itself.
     */
    public TrafficsGetTrafficIncidentTileHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}