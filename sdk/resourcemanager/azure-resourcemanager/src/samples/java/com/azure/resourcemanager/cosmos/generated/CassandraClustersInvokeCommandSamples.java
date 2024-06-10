// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.CommandPostBody;

/**
 * Samples for CassandraClusters InvokeCommand.
 */
public final class CassandraClustersInvokeCommandSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/CosmosDBManagedCassandraCommand.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraCommand.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBManagedCassandraCommand(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getCassandraClusters()
            .invokeCommand("cassandra-prod-rg", "cassandra-prod",
                new CommandPostBody().withCommand("nodetool status").withHost("10.0.1.12"),
                com.azure.core.util.Context.NONE);
    }
}
