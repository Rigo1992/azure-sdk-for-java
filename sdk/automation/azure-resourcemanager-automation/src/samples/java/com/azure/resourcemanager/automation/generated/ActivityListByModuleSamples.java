// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.Context;

/** Samples for Activity ListByModule. */
public final class ActivityListByModuleSamples {
    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listActivitiesByModule.json
     */
    /**
     * Sample code: List activities by a module.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listActivitiesByAModule(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.activities().listByModule("rg", "myAutomationAccount33", "OmsCompositeResources", Context.NONE);
    }
}
