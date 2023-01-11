// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for TargetComputeSizes ListByReplicationProtectedItems. */
public final class TargetComputeSizesListByReplicationProtectedIte {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/TargetComputeSizes_ListByReplicationProtectedItems.json
     */
    /**
     * Sample code: Gets the list of target compute sizes for the replication protected item.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfTargetComputeSizesForTheReplicationProtectedItem(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .targetComputeSizes()
            .listByReplicationProtectedItems(
                "avraiMgDiskVault",
                "avraiMgDiskVaultRG",
                "asr-a2a-default-centraluseuap",
                "asr-a2a-default-centraluseuap-container",
                "468c912d-b1ab-4ea2-97eb-4b5095155db2",
                Context.NONE);
    }
}
