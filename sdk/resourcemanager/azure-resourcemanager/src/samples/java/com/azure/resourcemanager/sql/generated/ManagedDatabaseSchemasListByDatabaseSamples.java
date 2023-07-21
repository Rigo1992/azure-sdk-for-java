// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for ManagedDatabaseSchemas ListByDatabase. */
public final class ManagedDatabaseSchemasListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ManagedDatabaseSchemaListByDatabase.json
     */
    /**
     * Sample code: List managed database schemas.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagedDatabaseSchemas(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedDatabaseSchemas()
            .listByDatabase("myRG", "myManagedInstanceName", "myDatabase", null, com.azure.core.util.Context.NONE);
    }
}
