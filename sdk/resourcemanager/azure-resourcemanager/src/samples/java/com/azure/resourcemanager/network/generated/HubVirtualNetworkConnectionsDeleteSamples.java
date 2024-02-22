// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for HubVirtualNetworkConnections Delete.
 */
public final class HubVirtualNetworkConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * HubVirtualNetworkConnectionDelete.json
     */
    /**
     * Sample code: HubVirtualNetworkConnectionDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void hubVirtualNetworkConnectionDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getHubVirtualNetworkConnections().delete("rg1", "virtualHub1",
            "connection1", com.azure.core.util.Context.NONE);
    }
}
