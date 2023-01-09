// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for DatabaseTables ListBySchema. */
public final class DatabaseTablesListBySchemaSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/DatabaseTableListBySchema.json
     */
    /**
     * Sample code: List database tables.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listDatabaseTables(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabaseTables()
            .listBySchema("myRG", "serverName", "myDatabase", "dbo", null, Context.NONE);
    }
}