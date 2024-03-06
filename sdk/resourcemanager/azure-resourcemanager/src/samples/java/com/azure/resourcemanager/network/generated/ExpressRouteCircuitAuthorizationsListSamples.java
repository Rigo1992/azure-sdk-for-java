// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRouteCircuitAuthorizations List.
 */
public final class ExpressRouteCircuitAuthorizationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * ExpressRouteCircuitAuthorizationList.json
     */
    /**
     * Sample code: List ExpressRouteCircuit Authorization.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listExpressRouteCircuitAuthorization(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getExpressRouteCircuitAuthorizations().list("rg1", "circuitName",
            com.azure.core.util.Context.NONE);
    }
}
