// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for CassandraResources DeleteCassandraKeyspace. */
public final class CassandraResourcesDeleteCassandraKeyspaceSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-03-15-preview/examples/CosmosDBCassandraKeyspaceDelete.json
     */
    /**
     * Sample code: CosmosDBCassandraKeyspaceDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBCassandraKeyspaceDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getCassandraResources()
            .deleteCassandraKeyspace("rg1", "ddb1", "keyspaceName", com.azure.core.util.Context.NONE);
    }
}
