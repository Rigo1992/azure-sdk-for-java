// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.resourcemanager.recoveryservicesbackup.models.ListRecoveryPointsRecommendedForMoveRequest;
import java.util.Arrays;

/**
 * Samples for RecoveryPointsRecommendedForMove List.
 */
public final class RecoveryPointsRecommendedForMoveListSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/
     * AzureIaasVm/RecoveryPointsRecommendedForMove_List.json
     */
    /**
     * Sample code: Get Protected Azure Vm Recovery Points Recommended for Move.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getProtectedAzureVmRecoveryPointsRecommendedForMove(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.recoveryPointsRecommendedForMoves().list("rshvault", "rshhtestmdvmrg", "Azure",
            "IaasVMContainer;iaasvmcontainerv2;rshhtestmdvmrg;rshmdvmsmall",
            "VM;iaasvmcontainerv2;rshhtestmdvmrg;rshmdvmsmall",
            new ListRecoveryPointsRecommendedForMoveRequest()
                .withObjectType("ListRecoveryPointsRecommendedForMoveRequest").withExcludedRPList(
                    Arrays.asList("348916168024334", "348916168024335")),
            com.azure.core.util.Context.NONE);
    }
}
