// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.resourcemanager.managednetworkfabric.models.NetworkInterface;

/**
 * Samples for NetworkInterfaces Update.
 */
public final class NetworkInterfacesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/stable/2023-06-15/examples/
     * NetworkInterfaces_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkInterfaces_Update_MaximumSet_Gen.
     * 
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void networkInterfacesUpdateMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        NetworkInterface resource = manager.networkInterfaces()
            .getWithResponse("example-rg", "example-device", "example-interface", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withAnnotation("annotation").apply();
    }
}
