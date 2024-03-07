// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated;

/**
 * Samples for PrivateEndpointConnections Delete.
 */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/search/resource-manager/Microsoft.Search/preview/2024-03-01-preview/examples/
     * DeletePrivateEndpointConnection.json
     */
    /**
     * Sample code: PrivateEndpointConnectionDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void privateEndpointConnectionDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.searchServices().manager().serviceClient().getPrivateEndpointConnections().deleteWithResponse("rg1",
            "mysearchservice", "testEndpoint.50bf4fbe-d7c1-4b48-a642-4f5892642546", null,
            com.azure.core.util.Context.NONE);
    }
}
