// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRouteCircuits List.
 */
public final class ExpressRouteCircuitsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * ExpressRouteCircuitListBySubscription.json
     */
    /**
     * Sample code: List ExpressRouteCircuits in a subscription.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listExpressRouteCircuitsInASubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getExpressRouteCircuits().list(com.azure.core.util.Context.NONE);
    }
}
