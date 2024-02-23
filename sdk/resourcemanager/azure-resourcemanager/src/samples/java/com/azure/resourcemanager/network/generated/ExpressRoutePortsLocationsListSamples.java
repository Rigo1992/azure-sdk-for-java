// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRoutePortsLocations List.
 */
public final class ExpressRoutePortsLocationsListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/ExpressRoutePortsLocationList
     * .json
     */
    /**
     * Sample code: ExpressRoutePortsLocationList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRoutePortsLocationList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getExpressRoutePortsLocations()
            .list(com.azure.core.util.Context.NONE);
    }
}
