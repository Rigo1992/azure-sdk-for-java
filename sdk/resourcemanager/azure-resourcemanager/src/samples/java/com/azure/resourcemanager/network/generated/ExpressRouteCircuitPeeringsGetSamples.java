// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRouteCircuitPeerings Get.
 */
public final class ExpressRouteCircuitPeeringsGetSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/ExpressRouteCircuitPeeringGet
     * .json
     */
    /**
     * Sample code: Get ExpressRouteCircuit Peering.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getExpressRouteCircuitPeering(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getExpressRouteCircuitPeerings().getWithResponse("rg1",
            "circuitName", "MicrosoftPeering", com.azure.core.util.Context.NONE);
    }
}
