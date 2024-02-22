// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualHubBgpConnections List.
 */
public final class VirtualHubBgpConnectionsListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/VirtualHubBgpConnectionList.
     * json
     */
    /**
     * Sample code: VirtualHubRouteTableV2List.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualHubRouteTableV2List(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVirtualHubBgpConnections().list("rg1", "hub1",
            com.azure.core.util.Context.NONE);
    }
}
