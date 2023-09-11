// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.resourcemanager.dynatrace.models.LinkableEnvironmentRequest;

/** Samples for Monitors ListLinkableEnvironments. */
public final class MonitorsListLinkableEnvironmentsSamples {
    /*
     * x-ms-original-file: specification/dynatrace/resource-manager/Dynatrace.Observability/stable/2023-04-27/examples/Monitors_ListLinkableEnvironments_MinimumSet_Gen.json
     */
    /**
     * Sample code: Monitors_ListLinkableEnvironments_MinimumSet_Gen.
     *
     * @param manager Entry point to DynatraceManager.
     */
    public static void monitorsListLinkableEnvironmentsMinimumSetGen(
        com.azure.resourcemanager.dynatrace.DynatraceManager manager) {
        manager
            .monitors()
            .listLinkableEnvironments(
                "myResourceGroup",
                "myMonitor",
                new LinkableEnvironmentRequest()
                    .withTenantId("00000000-0000-0000-0000-000000000000")
                    .withUserPrincipal("alice@microsoft.com")
                    .withRegion("East US"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dynatrace/resource-manager/Dynatrace.Observability/stable/2023-04-27/examples/Monitors_ListLinkableEnvironments_MaximumSet_Gen.json
     */
    /**
     * Sample code: Monitors_ListLinkableEnvironments_MaximumSet_Gen.
     *
     * @param manager Entry point to DynatraceManager.
     */
    public static void monitorsListLinkableEnvironmentsMaximumSetGen(
        com.azure.resourcemanager.dynatrace.DynatraceManager manager) {
        manager
            .monitors()
            .listLinkableEnvironments(
                "myResourceGroup",
                "myMonitor",
                new LinkableEnvironmentRequest()
                    .withTenantId("00000000-0000-0000-0000-000000000000")
                    .withUserPrincipal("alice@microsoft.com")
                    .withRegion("East US"),
                com.azure.core.util.Context.NONE);
    }
}
