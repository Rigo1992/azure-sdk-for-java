// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for RestorableMongodbDatabases List.
 */
public final class RestorableMongodbDatabasesListSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-11-15/examples/
     * CosmosDBRestorableMongodbDatabaseList.json
     */
    /**
     * Sample code: CosmosDBRestorableMongodbDatabaseList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBRestorableMongodbDatabaseList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getRestorableMongodbDatabases().list("WestUS",
            "d9b26648-2f53-4541-b3d8-3044f4f9810d", com.azure.core.util.Context.NONE);
    }
}
