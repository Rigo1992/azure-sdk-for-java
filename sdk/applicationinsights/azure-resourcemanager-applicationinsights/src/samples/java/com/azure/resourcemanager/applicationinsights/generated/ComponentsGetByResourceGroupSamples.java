// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.Context;

/** Samples for Components GetByResourceGroup. */
public final class ComponentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2020-02-02/examples/ComponentsGet.json
     */
    /**
     * Sample code: ComponentGet.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void componentGet(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.components().getByResourceGroupWithResponse("my-resource-group", "my-component", Context.NONE);
    }
}
