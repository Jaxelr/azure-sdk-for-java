// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.Context;

/** Samples for StorageSpacesOperation GetByResourceGroup. */
public final class StorageSpacesOperationGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/preview/2022-05-01-preview/examples/GetStorageSpace.json
     */
    /**
     * Sample code: GetStorageSpace.
     *
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void getStorageSpace(
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager
            .storageSpacesOperations()
            .getByResourceGroupWithResponse("test-arcappliance-resgrp", "test-storage", Context.NONE);
    }
}