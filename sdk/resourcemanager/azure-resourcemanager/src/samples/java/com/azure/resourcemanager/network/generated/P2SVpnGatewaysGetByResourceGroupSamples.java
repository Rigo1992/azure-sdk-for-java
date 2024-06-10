// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for P2SVpnGateways GetByResourceGroup.
 */
public final class P2SVpnGatewaysGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/P2SVpnGatewayGet.json
     */
    /**
     * Sample code: P2SVpnGatewayGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void p2SVpnGatewayGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getP2SVpnGateways()
            .getByResourceGroupWithResponse("rg1", "p2sVpnGateway1", com.azure.core.util.Context.NONE);
    }
}
