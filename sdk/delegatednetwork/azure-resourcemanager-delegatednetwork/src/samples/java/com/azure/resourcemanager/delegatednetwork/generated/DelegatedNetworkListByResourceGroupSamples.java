// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.generated;

/** Samples for DelegatedNetwork ListByResourceGroup. */
public final class DelegatedNetworkListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/dnc/resource-manager/Microsoft.DelegatedNetwork/stable/2021-03-15/examples/controllerListByRG.json
     */
    /**
     * Sample code: Get DelegatedNetwork resources by resource group.
     *
     * @param manager Entry point to DelegatedNetworkManager.
     */
    public static void getDelegatedNetworkResourcesByResourceGroup(
        com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager manager) {
        manager.delegatedNetworks().listByResourceGroup("testRG", com.azure.core.util.Context.NONE);
    }
}
