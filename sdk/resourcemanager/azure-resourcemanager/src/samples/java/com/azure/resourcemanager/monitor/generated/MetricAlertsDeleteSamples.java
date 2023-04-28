// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

/** Samples for MetricAlerts Delete. */
public final class MetricAlertsDeleteSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2018-03-01/examples/deleteMetricAlert.json
     */
    /**
     * Sample code: Delete an alert rule.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAnAlertRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getMetricAlerts()
            .deleteWithResponse("gigtest", "chiricutin", com.azure.core.util.Context.NONE);
    }
}
