// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the resource properties. */
@Fluent
public final class HybridIdentityMetadataProperties {
    /*
     * Unique id of the parent provisioned cluster resource.
     */
    @JsonProperty(value = "resourceUid")
    private String resourceUid;

    /*
     * Onboarding public key for provisioning the Managed identity for the HybridAKS cluster.
     */
    @JsonProperty(value = "publicKey")
    private String publicKey;

    /*
     * The identity of the provisioned cluster.
     */
    @JsonProperty(value = "identity")
    private ProvisionedClusterIdentity identity;

    /*
     * provisioning state of the hybridIdentityMetadata resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /** Creates an instance of HybridIdentityMetadataProperties class. */
    public HybridIdentityMetadataProperties() {
    }

    /**
     * Get the resourceUid property: Unique id of the parent provisioned cluster resource.
     *
     * @return the resourceUid value.
     */
    public String resourceUid() {
        return this.resourceUid;
    }

    /**
     * Set the resourceUid property: Unique id of the parent provisioned cluster resource.
     *
     * @param resourceUid the resourceUid value to set.
     * @return the HybridIdentityMetadataProperties object itself.
     */
    public HybridIdentityMetadataProperties withResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }

    /**
     * Get the publicKey property: Onboarding public key for provisioning the Managed identity for the HybridAKS
     * cluster.
     *
     * @return the publicKey value.
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Set the publicKey property: Onboarding public key for provisioning the Managed identity for the HybridAKS
     * cluster.
     *
     * @param publicKey the publicKey value to set.
     * @return the HybridIdentityMetadataProperties object itself.
     */
    public HybridIdentityMetadataProperties withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get the identity property: The identity of the provisioned cluster.
     *
     * @return the identity value.
     */
    public ProvisionedClusterIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the provisioned cluster.
     *
     * @param identity the identity value to set.
     * @return the HybridIdentityMetadataProperties object itself.
     */
    public HybridIdentityMetadataProperties withIdentity(ProvisionedClusterIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState property: provisioning state of the hybridIdentityMetadata resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}