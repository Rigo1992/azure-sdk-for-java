// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.dashboard.models.ApiKey;
import com.azure.resourcemanager.dashboard.models.AzureMonitorWorkspaceIntegration;
import com.azure.resourcemanager.dashboard.models.DeterministicOutboundIp;
import com.azure.resourcemanager.dashboard.models.GrafanaIntegrations;
import com.azure.resourcemanager.dashboard.models.ManagedGrafana;
import com.azure.resourcemanager.dashboard.models.ManagedGrafanaPropertiesUpdateParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Grafana Update. */
public final class GrafanaUpdateSamples {
    /*
     * x-ms-original-file: specification/dashboard/resource-manager/Microsoft.Dashboard/stable/2022-08-01/examples/Grafana_Update.json
     */
    /**
     * Sample code: Grafana_Update.
     *
     * @param manager Entry point to DashboardManager.
     */
    public static void grafanaUpdate(com.azure.resourcemanager.dashboard.DashboardManager manager) {
        ManagedGrafana resource =
            manager
                .grafanas()
                .getByResourceGroupWithResponse("myResourceGroup", "myWorkspace", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("Environment", "Dev 2"))
            .withProperties(
                new ManagedGrafanaPropertiesUpdateParameters()
                    .withApiKey(ApiKey.ENABLED)
                    .withDeterministicOutboundIp(DeterministicOutboundIp.ENABLED)
                    .withGrafanaIntegrations(
                        new GrafanaIntegrations()
                            .withAzureMonitorWorkspaceIntegrations(
                                Arrays
                                    .asList(
                                        new AzureMonitorWorkspaceIntegration()
                                            .withAzureMonitorWorkspaceResourceId(
                                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/microsoft.monitor/accounts/myAzureMonitorWorkspace")))))
            .apply();
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
