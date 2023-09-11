// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for VirtualHubIpConfiguration List. */
public final class VirtualHubIpConfigurationListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/VirtualHubIpConfigurationList.json
     */
    /**
     * Sample code: VirtualHubRouteTableV2List.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualHubRouteTableV2List(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualHubIpConfigurations()
            .list("rg1", "hub1", com.azure.core.util.Context.NONE);
    }
}
