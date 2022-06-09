// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.util.Context;

/** Samples for IotDpsResource ListByResourceGroup. */
public final class IotDpsResourceListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/stable/2022-02-05/examples/DPSListByResourceGroup.json
     */
    /**
     * Sample code: DPSListByResourceGroup.
     *
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSListByResourceGroup(
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
