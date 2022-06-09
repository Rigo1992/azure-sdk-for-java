// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.util.Context;

/** Samples for Monitors GetByResourceGroup. */
public final class MonitorsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/dynatrace/resource-manager/Dynatrace.Observability/preview/2021-09-01-preview/examples/Monitors_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: Monitors_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to DynatraceManager.
     */
    public static void monitorsGetMinimumSetGen(com.azure.resourcemanager.dynatrace.DynatraceManager manager) {
        manager.monitors().getByResourceGroupWithResponse("myResourceGroup", "myMonitor", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dynatrace/resource-manager/Dynatrace.Observability/preview/2021-09-01-preview/examples/Monitors_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Monitors_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to DynatraceManager.
     */
    public static void monitorsGetMaximumSetGen(com.azure.resourcemanager.dynatrace.DynatraceManager manager) {
        manager.monitors().getByResourceGroupWithResponse("myResourceGroup", "myMonitor", Context.NONE);
    }
}
