// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.SkuAvailabilityInner;

/**
 * An immutable client-side representation of SkuAvailability.
 */
public interface SkuAvailability {
    /**
     * Gets the dedicatedAvailabilityZoneId property: CloudSimple Availability Zone id.
     * 
     * @return the dedicatedAvailabilityZoneId value.
     */
    String dedicatedAvailabilityZoneId();

    /**
     * Gets the dedicatedAvailabilityZoneName property: CloudSimple Availability Zone Name.
     * 
     * @return the dedicatedAvailabilityZoneName value.
     */
    String dedicatedAvailabilityZoneName();

    /**
     * Gets the dedicatedPlacementGroupId property: CloudSimple Placement Group Id.
     * 
     * @return the dedicatedPlacementGroupId value.
     */
    String dedicatedPlacementGroupId();

    /**
     * Gets the dedicatedPlacementGroupName property: CloudSimple Placement Group name.
     * 
     * @return the dedicatedPlacementGroupName value.
     */
    String dedicatedPlacementGroupName();

    /**
     * Gets the limit property: indicates how many resources of a given SKU is available in a AZ-&gt;PG.
     * 
     * @return the limit value.
     */
    int limit();

    /**
     * Gets the resourceType property: resource type e.g. DedicatedCloudNodes.
     * 
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the skuId property: sku id.
     * 
     * @return the skuId value.
     */
    String skuId();

    /**
     * Gets the skuName property: sku name.
     * 
     * @return the skuName value.
     */
    String skuName();

    /**
     * Gets the inner com.azure.resourcemanager.vmwarecloudsimple.fluent.models.SkuAvailabilityInner object.
     * 
     * @return the inner object.
     */
    SkuAvailabilityInner innerModel();
}
