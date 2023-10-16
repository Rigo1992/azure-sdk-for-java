// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for MongoClusters List. */
public final class MongoClustersListSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-09-15-preview/examples/mongo-cluster/CosmosDBMongoClusterList.json
     */
    /**
     * Sample code: List all the mongo clusters.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllTheMongoClusters(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getMongoClusters().list(com.azure.core.util.Context.NONE);
    }
}
