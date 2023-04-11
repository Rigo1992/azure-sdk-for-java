// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.resourcemanager.workloads.fluent.models.SapLandscapeMonitorInner;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitorMetricThresholds;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitorPropertiesGrouping;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitorSidMapping;
import java.util.Arrays;

/** Samples for SapLandscapeMonitor Create. */
public final class SapLandscapeMonitorCreateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/SapLandscapeMonitor_Create.json
     */
    /**
     * Sample code: Create for SAP Landscape monitor Dashboard.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createForSAPLandscapeMonitorDashboard(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapLandscapeMonitors()
            .createWithResponse(
                "myResourceGroup",
                "mySapMonitor",
                new SapLandscapeMonitorInner()
                    .withGrouping(
                        new SapLandscapeMonitorPropertiesGrouping()
                            .withLandscape(
                                Arrays
                                    .asList(
                                        new SapLandscapeMonitorSidMapping()
                                            .withName("Prod")
                                            .withTopSid(Arrays.asList("SID1", "SID2"))))
                            .withSapApplication(
                                Arrays
                                    .asList(
                                        new SapLandscapeMonitorSidMapping()
                                            .withName("ERP1")
                                            .withTopSid(Arrays.asList("SID1", "SID2")))))
                    .withTopMetricsThresholds(
                        Arrays
                            .asList(
                                new SapLandscapeMonitorMetricThresholds()
                                    .withName("Instance Availability")
                                    .withGreen(90.0F)
                                    .withYellow(75.0F)
                                    .withRed(50.0F))),
                com.azure.core.util.Context.NONE);
    }
}
