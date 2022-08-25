// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.generated;

import com.azure.core.util.Context;

/** Samples for PrivateZones List. */
public final class PrivateZonesListSamples {
    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2020-06-01/examples/PrivateZoneListInSubscription.json
     */
    /**
     * Sample code: GET Private DNS Zone by Subscription.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void gETPrivateDNSZoneBySubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.privateDnsZones().manager().serviceClient().getPrivateZones().list(null, Context.NONE);
    }
}
