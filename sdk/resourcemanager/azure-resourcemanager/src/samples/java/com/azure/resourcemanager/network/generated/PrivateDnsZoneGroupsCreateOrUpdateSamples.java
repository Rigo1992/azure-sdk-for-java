// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.PrivateDnsZoneGroupInner;
import com.azure.resourcemanager.network.models.PrivateDnsZoneConfig;
import java.util.Arrays;

/** Samples for PrivateDnsZoneGroups CreateOrUpdate. */
public final class PrivateDnsZoneGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/PrivateEndpointDnsZoneGroupCreate.json
     */
    /**
     * Sample code: Create private dns zone group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createPrivateDnsZoneGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPrivateDnsZoneGroups()
            .createOrUpdate(
                "rg1",
                "testPe",
                "testPdnsgroup",
                new PrivateDnsZoneGroupInner()
                    .withPrivateDnsZoneConfigs(
                        Arrays
                            .asList(
                                new PrivateDnsZoneConfig()
                                    .withPrivateDnsZoneId(
                                        "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/privateDnsZones/zone1.com"))),
                Context.NONE);
    }
}
