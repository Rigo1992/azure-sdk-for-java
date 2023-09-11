// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for BareMetalMachines Reimage. */
public final class BareMetalMachinesReimageSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/BareMetalMachines_Reimage.json
     */
    /**
     * Sample code: Reimage bare metal machine.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void reimageBareMetalMachine(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .bareMetalMachines()
            .reimage("resourceGroupName", "bareMetalMachineName", com.azure.core.util.Context.NONE);
    }
}
