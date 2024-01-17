// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for DiskEncryptionSets ListAssociatedResources.
 */
public final class DiskEncryptionSetsListAssociatedResourcesSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-04-02/examples/
     * diskEncryptionSetExamples/DiskEncryptionSet_ListAssociatedResources.json
     */
    /**
     * Sample code: List all resources that are encrypted with this disk encryption set.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllResourcesThatAreEncryptedWithThisDiskEncryptionSet(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDiskEncryptionSets()
            .listAssociatedResources("myResourceGroup", "myDiskEncryptionSet", com.azure.core.util.Context.NONE);
    }
}
