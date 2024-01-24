// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for GremlinResources ListGremlinGraphs.
 */
public final class GremlinResourcesListGremlinGraphsSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBGremlinGraphList.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBGremlinGraphList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getGremlinResources().listGremlinGraphs("rgName", "ddb1",
            "databaseName", com.azure.core.util.Context.NONE);
    }
}
