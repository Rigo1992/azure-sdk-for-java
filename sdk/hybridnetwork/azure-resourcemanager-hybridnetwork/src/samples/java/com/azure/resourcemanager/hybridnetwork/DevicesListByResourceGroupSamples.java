// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork;

import com.azure.core.util.Context;

/** Samples for Devices ListByResourceGroup. */
public final class DevicesListByResourceGroupSamples {
    /**
     * Sample code: List all devices in resource group.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void listAllDevicesInResourceGroup(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.devices().listByResourceGroup("rg1", Context.NONE);
    }
}
