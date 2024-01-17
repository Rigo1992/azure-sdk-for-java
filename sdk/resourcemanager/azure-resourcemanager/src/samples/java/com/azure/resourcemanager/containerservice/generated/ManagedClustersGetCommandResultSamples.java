// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/**
 * Samples for ManagedClusters GetCommandResult.
 */
public final class ManagedClustersGetCommandResultSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-10-01/examples/
     * RunCommandResultFailed.json
     */
    /**
     * Sample code: commandFailedResult.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void commandFailedResult(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters().manager().serviceClient().getManagedClusters().getCommandResultWithResponse("rg1",
            "clustername1", "def7b3ea71bd4f7e9d226ddbc0f00ad9", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-10-01/examples/
     * RunCommandResultSucceed.json
     */
    /**
     * Sample code: commandSucceedResult.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void commandSucceedResult(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters().manager().serviceClient().getManagedClusters().getCommandResultWithResponse("rg1",
            "clustername1", "def7b3ea71bd4f7e9d226ddbc0f00ad9", com.azure.core.util.Context.NONE);
    }
}
