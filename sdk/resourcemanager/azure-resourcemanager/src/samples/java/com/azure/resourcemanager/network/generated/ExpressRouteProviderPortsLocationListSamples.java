// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteProviderPortsLocation List. */
public final class ExpressRouteProviderPortsLocationListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/expressRouteProviderPortList.json
     */
    /**
     * Sample code: ExpressRouteProviderPortList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRouteProviderPortList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteProviderPortsLocations()
            .listWithResponse(null, Context.NONE);
    }
}
