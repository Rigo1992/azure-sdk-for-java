// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

import com.azure.core.util.Context;

/** Samples for ConfigurationProfileAssignments Delete. */
public final class ConfigurationProfileAssignmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/automanage/resource-manager/Microsoft.Automanage/preview/2021-04-30-preview/examples/deleteConfigurationProfileAssignment.json
     */
    /**
     * Sample code: Delete an configuration profile assignment.
     *
     * @param manager Entry point to AutomanageManager.
     */
    public static void deleteAnConfigurationProfileAssignment(
        com.azure.resourcemanager.automanage.AutomanageManager manager) {
        manager
            .configurationProfileAssignments()
            .deleteWithResponse("myResourceGroupName", "default", "myVMName", Context.NONE);
    }
}
