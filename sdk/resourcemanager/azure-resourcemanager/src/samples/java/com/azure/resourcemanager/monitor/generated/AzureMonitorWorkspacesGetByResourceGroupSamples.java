// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

/** Samples for AzureMonitorWorkspaces GetByResourceGroup. */
public final class AzureMonitorWorkspacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Monitor/preview/2021-06-03-preview/examples/AzureMonitorWorkspacesGet.json
     */
    /**
     * Sample code: Get workspace.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getWorkspace(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getAzureMonitorWorkspaces()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myAzureMonitorWorkspace", com.azure.core.util.Context.NONE);
    }
}
