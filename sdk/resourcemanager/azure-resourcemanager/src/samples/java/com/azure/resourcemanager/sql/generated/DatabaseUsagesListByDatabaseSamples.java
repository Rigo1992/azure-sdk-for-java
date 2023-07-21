// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for DatabaseUsages ListByDatabase. */
public final class DatabaseUsagesListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-02-01-preview/examples/GetDatabaseUsages.json
     */
    /**
     * Sample code: Gets database usages.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsDatabaseUsages(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabaseUsages()
            .listByDatabase("Default-SQL-SouthEastAsia", "testsvr", "testdb", com.azure.core.util.Context.NONE);
    }
}
