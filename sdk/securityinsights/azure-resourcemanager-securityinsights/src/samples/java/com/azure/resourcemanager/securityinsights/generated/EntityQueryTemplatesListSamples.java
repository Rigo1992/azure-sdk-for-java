// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.models.Constant69;

/** Samples for EntityQueryTemplates List. */
public final class EntityQueryTemplatesListSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2021-09-01-preview/examples/entityQueryTemplates/GetEntityQueryTemplates.json
     */
    /**
     * Sample code: Get all entity query templates.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllEntityQueryTemplates(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.entityQueryTemplates().list("myRg", "myWorkspace", Constant69.ACTIVITY, Context.NONE);
    }
}
