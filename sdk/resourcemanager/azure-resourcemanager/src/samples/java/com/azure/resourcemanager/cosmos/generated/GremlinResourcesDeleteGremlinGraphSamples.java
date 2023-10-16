// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for GremlinResources DeleteGremlinGraph. */
public final class GremlinResourcesDeleteGremlinGraphSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-09-15-preview/examples/CosmosDBGremlinGraphDelete.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBGremlinGraphDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getGremlinResources()
            .deleteGremlinGraph("rg1", "ddb1", "databaseName", "graphName", com.azure.core.util.Context.NONE);
    }
}
