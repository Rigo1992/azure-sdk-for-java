// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for Alerts UpdateSubscriptionLevelStateToActivate.
 */
public final class AlertsUpdateSubscriptionLevelStateToActivateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2022-01-01/examples/Alerts/UpdateAlertSubscriptionLocation_activate_example.json
     */
    /**
     * Sample code: Update security alert state on a subscription from a security data location.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updateSecurityAlertStateOnASubscriptionFromASecurityDataLocation(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.alerts()
            .updateSubscriptionLevelStateToActivateWithResponse("westeurope",
                "2518298467986649999_4d25bfef-2d77-4a08-adc0-3e35715cc92a", com.azure.core.util.Context.NONE);
    }
}
