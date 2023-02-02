// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

/** Samples for ConfigurationAssignments List. */
public final class ConfigurationAssignmentsListSamples {
    /*
     * x-ms-original-file: specification/maintenance/resource-manager/Microsoft.Maintenance/stable/2021-05-01/examples/ConfigurationAssignments_List.json
     */
    /**
     * Sample code: ConfigurationAssignments_List.
     *
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsList(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager
            .configurationAssignments()
            .list(
                "examplerg",
                "Microsoft.Compute",
                "virtualMachineScaleSets",
                "smdtest1",
                com.azure.core.util.Context.NONE);
    }
}
