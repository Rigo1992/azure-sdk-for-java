// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for DiskAccesses GetPrivateLinkResources. */
public final class DiskAccessesGetPrivateLinkResourcesSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-12-01/examples/GetDiskAccessPrivateLinkResources.json
     */
    /**
     * Sample code: List all possible private link resources under disk access resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllPossiblePrivateLinkResourcesUnderDiskAccessResource(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDiskAccesses()
            .getPrivateLinkResourcesWithResponse("myResourceGroup", "myDiskAccess", Context.NONE);
    }
}
