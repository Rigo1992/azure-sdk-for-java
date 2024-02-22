// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualHubBgpConnections ListAdvertisedRoutes.
 */
public final class VirtualHubBgpConnectionsListAdvertisedRoutesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * VirtualRouterPeerListAdvertisedRoute.json
     */
    /**
     * Sample code: VirtualRouterPeerListAdvertisedRoutes.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualRouterPeerListAdvertisedRoutes(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVirtualHubBgpConnections().listAdvertisedRoutes("rg1",
            "virtualRouter1", "peer1", com.azure.core.util.Context.NONE);
    }
}
