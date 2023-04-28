// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

/** Samples for ActivityLogAlerts GetByResourceGroup. */
public final class ActivityLogAlertsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2020-10-01/examples/ActivityLogAlertRule_Get.json
     */
    /**
     * Sample code: Get an Activity Log Alert rule.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAnActivityLogAlertRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getActivityLogAlerts()
            .getByResourceGroupWithResponse(
                "MyResourceGroup", "SampleActivityLogAlertRule", com.azure.core.util.Context.NONE);
    }
}
