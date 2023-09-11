// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/** Samples for WorkloadNetworks DeleteVMGroup. */
public final class WorkloadNetworksDeleteVMGroupSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2023-03-01/examples/WorkloadNetworks_DeleteVMGroups.json
     */
    /**
     * Sample code: WorkloadNetworks_DeleteVMGroup.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksDeleteVMGroup(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks().deleteVMGroup("group1", "vmGroup1", "cloud1", com.azure.core.util.Context.NONE);
    }
}
