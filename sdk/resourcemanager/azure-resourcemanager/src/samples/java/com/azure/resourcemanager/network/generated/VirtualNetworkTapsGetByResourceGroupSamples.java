// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworkTaps GetByResourceGroup.
 */
public final class VirtualNetworkTapsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/VirtualNetworkTapGet.json
     */
    /**
     * Sample code: Get Virtual Network Tap.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualNetworkTap(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkTaps()
            .getByResourceGroupWithResponse("rg1", "testvtap", com.azure.core.util.Context.NONE);
    }
}
