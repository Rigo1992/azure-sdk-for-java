// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupResourceConfigResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceConfig;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageType;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageTypeState;

/**
 * Samples for BackupResourceStorageConfigsNonCrr Update.
 */
public final class BackupResourceStorageConfigsNonCrrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/
     * Common/BackupStorageConfig_Put.json
     */
    /**
     * Sample code: Update Vault Storage Configuration.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void updateVaultStorageConfiguration(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupResourceStorageConfigsNonCrrs().updateWithResponse("PySDKBackupTestRsVault",
            "PythonSDKBackupTestRg",
            new BackupResourceConfigResourceInner().withProperties(new BackupResourceConfig()
                .withStorageType(StorageType.LOCALLY_REDUNDANT).withStorageTypeState(StorageTypeState.UNLOCKED)),
            com.azure.core.util.Context.NONE);
    }
}
