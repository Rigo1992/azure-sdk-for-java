// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/** Samples for DataNetworks Delete. */
public final class DataNetworksDeleteSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2023-06-01/examples/DataNetworkDelete.json
     */
    /**
     * Sample code: Delete data network.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void deleteDataNetwork(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.dataNetworks().delete("rg1", "testMobileNetwork", "testDataNetwork", com.azure.core.util.Context.NONE);
    }
}
