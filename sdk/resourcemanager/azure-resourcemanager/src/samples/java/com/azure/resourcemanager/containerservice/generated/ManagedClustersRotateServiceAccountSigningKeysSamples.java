// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/**
 * Samples for ManagedClusters RotateServiceAccountSigningKeys.
 */
public final class ManagedClustersRotateServiceAccountSigningKeysSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-10-01/examples/
     * ManagedClustersRotateServiceAccountSigningKeys.json
     */
    /**
     * Sample code: Rotate Cluster Service Account Signing Keys.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void rotateClusterServiceAccountSigningKeys(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters().manager().serviceClient().getManagedClusters().rotateServiceAccountSigningKeys("rg1",
            "clustername1", com.azure.core.util.Context.NONE);
    }
}
