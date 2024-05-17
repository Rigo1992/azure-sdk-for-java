// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for Alerts ListResourceGroupLevelByRegion.
 */
public final class AlertsListResourceGroupLevelByRegionSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2022-01-01/examples/Alerts/GetAlertsResourceGroupLocation_example.json
     */
    /**
     * Sample code: Get security alerts on a resource group from a security data location.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getSecurityAlertsOnAResourceGroupFromASecurityDataLocation(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.alerts().listResourceGroupLevelByRegion("westeurope", "myRg1", com.azure.core.util.Context.NONE);
    }
}
