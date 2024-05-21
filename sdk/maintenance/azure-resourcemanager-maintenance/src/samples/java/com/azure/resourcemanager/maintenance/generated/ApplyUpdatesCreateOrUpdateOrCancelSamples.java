// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner;
import com.azure.resourcemanager.maintenance.models.UpdateStatus;

/**
 * Samples for ApplyUpdates CreateOrUpdateOrCancel.
 */
public final class ApplyUpdatesCreateOrUpdateOrCancelSamples {
    /*
     * x-ms-original-file: specification/maintenance/resource-manager/Microsoft.Maintenance/preview/2023-10-01-preview/examples/ApplyUpdates_CreateOrUpdateOnly_NoCancellation.json
     */
    /**
     * Sample code: ApplyUpdates_CreateOrUpdateOnly_NoCancellation.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        applyUpdatesCreateOrUpdateOnlyNoCancellation(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.applyUpdates()
            .createOrUpdateOrCancelWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "20230901121200", new ApplyUpdateInner(), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/maintenance/resource-manager/Microsoft.Maintenance/preview/2023-10-01-preview/examples/ApplyUpdates_CreateOrUpdate_CancelMaintenance.json
     */
    /**
     * Sample code: ApplyUpdates_CreateOrUpdateOrCancel.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        applyUpdatesCreateOrUpdateOrCancel(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.applyUpdates()
            .createOrUpdateOrCancelWithResponse("examplerg", "Microsoft.Maintenance", "maintenanceConfigurations",
                "maintenanceConfig1", "20230901121200", new ApplyUpdateInner().withStatus(UpdateStatus.CANCEL),
                com.azure.core.util.Context.NONE);
    }
}
