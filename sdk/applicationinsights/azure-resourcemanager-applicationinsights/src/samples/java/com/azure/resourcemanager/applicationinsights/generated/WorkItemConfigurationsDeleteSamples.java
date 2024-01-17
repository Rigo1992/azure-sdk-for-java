// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

/** Samples for WorkItemConfigurations Delete. */
public final class WorkItemConfigurationsDeleteSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2015-05-01/examples/WorkItemConfigDelete.json
     */
    /**
     * Sample code: WorkItemConfigurationDelete.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workItemConfigurationDelete(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .workItemConfigurations()
            .deleteWithResponse(
                "my-resource-group", "my-component", "Visual Studio Team Services", com.azure.core.util.Context.NONE);
    }
}
