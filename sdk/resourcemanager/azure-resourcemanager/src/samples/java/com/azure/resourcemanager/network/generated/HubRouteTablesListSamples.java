// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for HubRouteTables List.
 */
public final class HubRouteTablesListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/HubRouteTableList.json
     */
    /**
     * Sample code: RouteTableList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void routeTableList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getHubRouteTables().list("rg1", "virtualHub1",
            com.azure.core.util.Context.NONE);
    }
}
