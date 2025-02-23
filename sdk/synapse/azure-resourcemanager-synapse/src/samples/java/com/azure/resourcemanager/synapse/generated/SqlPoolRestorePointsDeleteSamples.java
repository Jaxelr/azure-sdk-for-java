// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/**
 * Samples for SqlPoolRestorePoints Delete.
 */
public final class SqlPoolRestorePointsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/SqlPoolRestorePointsDelete.
     * json
     */
    /**
     * Sample code: Deletes a restore point.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void deletesARestorePoint(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.sqlPoolRestorePoints()
            .deleteWithResponse("Default-SQL-SouthEastAsia", "testws", "testpool", "131546477590000000",
                com.azure.core.util.Context.NONE);
    }
}
