// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for CassandraResources GetCassandraKeyspace.
 */
public final class CassandraResourcesGetCassandraKeyspaceSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBCassandraKeyspaceGet.json
     */
    /**
     * Sample code: CosmosDBCassandraKeyspaceGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBCassandraKeyspaceGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getCassandraResources()
            .getCassandraKeyspaceWithResponse("rg1", "ddb1", "keyspaceName", com.azure.core.util.Context.NONE);
    }
}
