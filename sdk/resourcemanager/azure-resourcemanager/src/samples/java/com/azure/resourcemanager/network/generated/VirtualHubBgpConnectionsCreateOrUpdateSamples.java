// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.BgpConnectionInner;

/** Samples for VirtualHubBgpConnections CreateOrUpdate. */
public final class VirtualHubBgpConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/VirtualHubBgpConnectionPut.json
     */
    /**
     * Sample code: VirtualHubRouteTableV2Put.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualHubRouteTableV2Put(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualHubBgpConnections()
            .createOrUpdate(
                "rg1",
                "hub1",
                "conn1",
                new BgpConnectionInner()
                    .withPeerAsn(20000L)
                    .withPeerIp("192.168.1.5")
                    .withHubVirtualNetworkConnection(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/hub1/hubVirtualNetworkConnections/hubVnetConn1")),
                Context.NONE);
    }
}
