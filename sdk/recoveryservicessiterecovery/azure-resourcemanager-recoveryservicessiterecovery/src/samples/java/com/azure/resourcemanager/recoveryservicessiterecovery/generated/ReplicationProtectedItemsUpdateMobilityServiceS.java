// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateMobilityServiceRequest;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateMobilityServiceRequestProperties;

/**
 * Samples for ReplicationProtectedItems UpdateMobilityService.
 */
public final class ReplicationProtectedItemsUpdateMobilityServiceS {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-08-01/examples
     * /ReplicationProtectedItems_UpdateMobilityService.json
     */
    /**
     * Sample code: Update the mobility service on a protected item.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void updateTheMobilityServiceOnAProtectedItem(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationProtectedItems().updateMobilityService("WCUSVault", "wcusValidations", "WIN-JKKJ31QI8U2",
            "cloud_c6780228-83bd-4f3e-a70e-cb46b7da33a0", "79dd20ab-2b40-11e7-9791-0050568f387e",
            new UpdateMobilityServiceRequest()
                .withProperties(new UpdateMobilityServiceRequestProperties().withRunAsAccountId("2")),
            com.azure.core.util.Context.NONE);
    }
}
