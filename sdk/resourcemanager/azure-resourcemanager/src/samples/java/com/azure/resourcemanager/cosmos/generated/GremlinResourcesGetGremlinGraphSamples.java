// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for GremlinResources GetGremlinGraph. */
public final class GremlinResourcesGetGremlinGraphSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBGremlinGraphGet.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBGremlinGraphGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getGremlinResources()
            .getGremlinGraphWithResponse(
                "rgName", "ddb1", "databaseName", "graphName", com.azure.core.util.Context.NONE);
    }
}
