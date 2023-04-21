// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for VirtualApplianceSkus List. */
public final class VirtualApplianceSkusListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/NetworkVirtualApplianceSkuList.json
     */
    /**
     * Sample code: NetworkVirtualApplianceSkuListResult.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkVirtualApplianceSkuListResult(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVirtualApplianceSkus().list(com.azure.core.util.Context.NONE);
    }
}
