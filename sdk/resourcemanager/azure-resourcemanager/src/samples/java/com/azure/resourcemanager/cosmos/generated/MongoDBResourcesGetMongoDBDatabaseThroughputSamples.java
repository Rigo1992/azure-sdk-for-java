// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for MongoDBResources GetMongoDBDatabaseThroughput.
 */
public final class MongoDBResourcesGetMongoDBDatabaseThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-11-15/examples/
     * CosmosDBMongoDBDatabaseThroughputGet.json
     */
    /**
     * Sample code: CosmosDBMongoDBDatabaseThroughputGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBMongoDBDatabaseThroughputGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getMongoDBResources()
            .getMongoDBDatabaseThroughputWithResponse("rg1", "ddb1", "databaseName", com.azure.core.util.Context.NONE);
    }
}
