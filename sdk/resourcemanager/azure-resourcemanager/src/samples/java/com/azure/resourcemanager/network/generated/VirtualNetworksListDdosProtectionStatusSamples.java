// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworks ListDdosProtectionStatus.
 */
public final class VirtualNetworksListDdosProtectionStatusSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * VirtualNetworkGetDdosProtectionStatus.json
     */
    /**
     * Sample code: Get Ddos Protection Status of a Virtual Network.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDdosProtectionStatusOfAVirtualNetwork(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVirtualNetworks().listDdosProtectionStatus("rg1", "test-vnet", 75,
            null, com.azure.core.util.Context.NONE);
    }
}
