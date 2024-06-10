// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for Database ListUsages.
 */
public final class DatabaseListUsagesSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/CosmosDBDatabaseGetUsages.json
     */
    /**
     * Sample code: CosmosDBDatabaseGetUsages.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBDatabaseGetUsages(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getDatabases()
            .listUsages("rg1", "ddb1", "databaseRid", "$filter=name.value eq 'Storage'",
                com.azure.core.util.Context.NONE);
    }
}
