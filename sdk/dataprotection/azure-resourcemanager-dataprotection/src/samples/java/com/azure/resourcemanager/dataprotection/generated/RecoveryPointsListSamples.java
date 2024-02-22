// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

/**
 * Samples for RecoveryPoints List.
 */
public final class RecoveryPointsListSamples {
    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2023-11-01/examples/
     * BackupInstanceOperations/ListRecoveryPoints.json
     */
    /**
     * Sample code: List Recovery Points in a Vault.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void
        listRecoveryPointsInAVault(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.recoveryPoints().list("000pikumar", "PratikPrivatePreviewVault1", "testInstance1", null, null,
            com.azure.core.util.Context.NONE);
    }
}
