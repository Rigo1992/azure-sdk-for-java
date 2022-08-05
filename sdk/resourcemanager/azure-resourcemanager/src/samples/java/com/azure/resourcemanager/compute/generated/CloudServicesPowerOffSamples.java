// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for CloudServices PowerOff. */
public final class CloudServicesPowerOffSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-04-04/examples/CloudService_PowerOff.json
     */
    /**
     * Sample code: Stop or PowerOff Cloud Service.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void stopOrPowerOffCloudService(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getCloudServices()
            .powerOff("ConstosoRG", "{cs-name}", Context.NONE);
    }
}
