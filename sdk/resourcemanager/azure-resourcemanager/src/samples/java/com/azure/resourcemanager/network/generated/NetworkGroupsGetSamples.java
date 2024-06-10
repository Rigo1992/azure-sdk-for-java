// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkGroups Get.
 */
public final class NetworkGroupsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/NetworkManagerGroupGet.json
     */
    /**
     * Sample code: NetworkGroupsGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkGroupsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkGroups()
            .getWithResponse("rg1", "testNetworkManager", "testNetworkGroup", com.azure.core.util.Context.NONE);
    }
}
