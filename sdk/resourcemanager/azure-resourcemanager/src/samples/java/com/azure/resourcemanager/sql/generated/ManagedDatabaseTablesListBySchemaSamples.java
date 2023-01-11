// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ManagedDatabaseTables ListBySchema. */
public final class ManagedDatabaseTablesListBySchemaSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedDatabaseTableListBySchema.json
     */
    /**
     * Sample code: List managed database tables.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagedDatabaseTables(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedDatabaseTables()
            .listBySchema("myRG", "myManagedInstanceName", "myDatabase", "dbo", null, Context.NONE);
    }
}
