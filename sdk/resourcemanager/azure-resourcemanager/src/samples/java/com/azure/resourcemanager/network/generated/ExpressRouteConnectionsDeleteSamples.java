// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteConnections Delete. */
public final class ExpressRouteConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/ExpressRouteConnectionDelete.json
     */
    /**
     * Sample code: ExpressRouteConnectionDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRouteConnectionDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteConnections()
            .delete("resourceGroupName", "expressRouteGatewayName", "connectionName", Context.NONE);
    }
}
