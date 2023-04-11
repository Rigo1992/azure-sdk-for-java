// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for Snapshots GetByResourceGroup. */
public final class SnapshotsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-01-01/examples/SnapshotsGet.json
     */
    /**
     * Sample code: Get Snapshot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSnapshot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getSnapshots()
            .getByResourceGroupWithResponse("rg1", "snapshot1", com.azure.core.util.Context.NONE);
    }
}
