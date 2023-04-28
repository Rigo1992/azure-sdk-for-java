// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

/** Samples for MetricAlerts List. */
public final class MetricAlertsListSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2018-03-01/examples/listMetricAlert.json
     */
    /**
     * Sample code: List metric alert rules.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listMetricAlertRules(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings().manager().serviceClient().getMetricAlerts().list(com.azure.core.util.Context.NONE);
    }
}
