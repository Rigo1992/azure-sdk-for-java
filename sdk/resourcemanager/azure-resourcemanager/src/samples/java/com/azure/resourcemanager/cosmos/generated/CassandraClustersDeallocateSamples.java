// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for CassandraClusters Deallocate. */
public final class CassandraClustersDeallocateSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-09-15-preview/examples/CosmosDBManagedCassandraClusterDeallocate.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraClusterDeallocate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBManagedCassandraClusterDeallocate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getCassandraClusters()
            .deallocate("cassandra-prod-rg", "cassandra-prod", null, com.azure.core.util.Context.NONE);
    }
}
