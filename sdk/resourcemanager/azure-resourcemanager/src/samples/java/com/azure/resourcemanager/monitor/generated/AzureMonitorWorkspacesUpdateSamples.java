// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.resourcemanager.monitor.models.AzureMonitorWorkspaceResourceForUpdate;
import java.util.HashMap;
import java.util.Map;

/** Samples for AzureMonitorWorkspaces Update. */
public final class AzureMonitorWorkspacesUpdateSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Monitor/preview/2021-06-03-preview/examples/AzureMonitorWorkspacesUpdate.json
     */
    /**
     * Sample code: Update workspace.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateWorkspace(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getAzureMonitorWorkspaces()
            .updateWithResponse(
                "myResourceGroup",
                "myAzureMonitorWorkspace",
                new AzureMonitorWorkspaceResourceForUpdate().withTags(mapOf("tag1", "A", "tag2", "B", "tag3", "C")),
                com.azure.core.util.Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
