// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

/**
 * Samples for UpdateRuns Delete.
 */
public final class UpdateRunsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/stable/2024-04-01/examples/UpdateRuns_Delete.json
     */
    /**
     * Sample code: Delete an updateRun resource.
     * 
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void deleteAnUpdateRunResource(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.updateRuns().delete("rg1", "fleet1", "run1", null, com.azure.core.util.Context.NONE);
    }
}
