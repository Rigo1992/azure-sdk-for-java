// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for PrivateEndpointConnections ListByDatabaseAccount. */
public final class PrivateEndpointConnectionsListByDatabaseAccountSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-04-15/examples/CosmosDBPrivateEndpointConnectionListGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsPrivateEndpointConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getPrivateEndpointConnections()
            .listByDatabaseAccount("rg1", "ddb1", com.azure.core.util.Context.NONE);
    }
}
