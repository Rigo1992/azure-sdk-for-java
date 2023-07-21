// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for ManagedDatabaseTables ListBySchema. */
public final class ManagedDatabaseTablesListBySchemaSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ManagedDatabaseTableListBySchema.json
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
            .listBySchema("myRG", "myManagedInstanceName", "myDatabase", "dbo", null, com.azure.core.util.Context.NONE);
    }
}
