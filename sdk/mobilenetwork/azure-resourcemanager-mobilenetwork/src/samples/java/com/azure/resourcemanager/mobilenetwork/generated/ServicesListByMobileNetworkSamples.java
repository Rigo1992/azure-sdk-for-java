// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/** Samples for Services ListByMobileNetwork. */
public final class ServicesListByMobileNetworkSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2022-11-01/examples/ServiceListByMobileNetwork.json
     */
    /**
     * Sample code: List services in a mobile network.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void listServicesInAMobileNetwork(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager
            .services()
            .listByMobileNetwork("testResourceGroupName", "testMobileNetwork", com.azure.core.util.Context.NONE);
    }
}
