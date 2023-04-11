// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for Tasks ListByResourceGroup. */
public final class TasksListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2015-06-01-preview/examples/Tasks/GetTasksResourceGroupLocation_example.json
     */
    /**
     * Sample code: Get security recommendation tasks in a resource group.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getSecurityRecommendationTasksInAResourceGroup(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.tasks().listByResourceGroup("myRg", "westeurope", null, com.azure.core.util.Context.NONE);
    }
}
