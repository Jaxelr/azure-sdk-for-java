// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dataprotection.fluent.models.DeletedBackupInstanceResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of DeletedBackupInstance resources. */
@Fluent
public final class DeletedBackupInstanceResourceList extends DppResourceList {
    /*
     * List of resources.
     */
    @JsonProperty(value = "value")
    private List<DeletedBackupInstanceResourceInner> value;

    /** Creates an instance of DeletedBackupInstanceResourceList class. */
    public DeletedBackupInstanceResourceList() {
    }

    /**
     * Get the value property: List of resources.
     *
     * @return the value value.
     */
    public List<DeletedBackupInstanceResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources.
     *
     * @param value the value value to set.
     * @return the DeletedBackupInstanceResourceList object itself.
     */
    public DeletedBackupInstanceResourceList withValue(List<DeletedBackupInstanceResourceInner> value) {
        this.value = value;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DeletedBackupInstanceResourceList withNextLink(String nextLink) {
        super.withNextLink(nextLink);
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
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}