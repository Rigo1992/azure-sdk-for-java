// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for Disks ListByResourceGroup.
 */
public final class DisksListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-04-02/examples/diskExamples/
     * Disk_ListByResourceGroup.json
     */
    /**
     * Sample code: List all managed disks in a resource group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllManagedDisksInAResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks().listByResourceGroup("myResourceGroup",
            com.azure.core.util.Context.NONE);
    }
}
