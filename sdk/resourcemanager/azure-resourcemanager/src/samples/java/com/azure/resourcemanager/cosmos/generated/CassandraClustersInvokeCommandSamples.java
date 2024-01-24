// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.cosmos.models.CommandPostBody;
import java.io.IOException;

/**
 * Samples for CassandraClusters InvokeCommand.
 */
public final class CassandraClustersInvokeCommandSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBManagedCassandraCommand.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraCommand.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBManagedCassandraCommand(com.azure.resourcemanager.AzureResourceManager azure)
        throws IOException {
        azure.cosmosDBAccounts().manager().serviceClient().getCassandraClusters().invokeCommand("cassandra-prod-rg",
            "cassandra-prod",
            new CommandPostBody().withCommand("nodetool")
                .withArguments(SerializerFactory.createDefaultManagementSerializerAdapter()
                    .deserialize("{\"status\":\"\"}", Object.class, SerializerEncoding.JSON))
                .withHost("10.0.1.12"),
            com.azure.core.util.Context.NONE);
    }
}
