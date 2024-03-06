// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.resourcemanager.dataprotection.models.AlertsState;
import com.azure.resourcemanager.dataprotection.models.AzureMonitorAlertSettings;
import com.azure.resourcemanager.dataprotection.models.BackupVault;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreState;
import com.azure.resourcemanager.dataprotection.models.DppIdentityDetails;
import com.azure.resourcemanager.dataprotection.models.FeatureSettings;
import com.azure.resourcemanager.dataprotection.models.MonitoringSettings;
import com.azure.resourcemanager.dataprotection.models.SecuritySettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteSettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteState;
import com.azure.resourcemanager.dataprotection.models.StorageSetting;
import com.azure.resourcemanager.dataprotection.models.StorageSettingStoreTypes;
import com.azure.resourcemanager.dataprotection.models.StorageSettingTypes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for BackupVaults CreateOrUpdate.
 */
public final class BackupVaultsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2023-11-01/examples/VaultCRUD/
     * PutBackupVault.json
     */
    /**
     * Sample code: Create BackupVault.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void createBackupVault(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupVaults().define("swaggerExample").withRegion("WestUS")
            .withExistingResourceGroup("SampleResourceGroup")
            .withProperties(new BackupVault()
                .withMonitoringSettings(new MonitoringSettings().withAzureMonitorAlertSettings(
                    new AzureMonitorAlertSettings().withAlertsForAllJobFailures(AlertsState.ENABLED)))
                .withSecuritySettings(new SecuritySettings().withSoftDeleteSettings(new SoftDeleteSettings()
                    .withState(SoftDeleteState.fromString("Enabled")).withRetentionDurationInDays(14.0D)))
                .withStorageSettings(
                    Arrays.asList(new StorageSetting().withDatastoreType(StorageSettingStoreTypes.VAULT_STORE)
                        .withType(StorageSettingTypes.LOCALLY_REDUNDANT)))
                .withFeatureSettings(new FeatureSettings().withCrossRegionRestoreSettings(
                    new CrossRegionRestoreSettings().withState(CrossRegionRestoreState.ENABLED))))
            .withTags(mapOf("key1", "fakeTokenPlaceholder")).withIdentity(new DppIdentityDetails().withType("None"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2023-11-01/examples/VaultCRUD/
     * PutBackupVaultWithMSI.json
     */
    /**
     * Sample code: Create BackupVault With MSI.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void
        createBackupVaultWithMSI(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupVaults().define("swaggerExample").withRegion("WestUS")
            .withExistingResourceGroup("SampleResourceGroup")
            .withProperties(new BackupVault()
                .withMonitoringSettings(new MonitoringSettings().withAzureMonitorAlertSettings(
                    new AzureMonitorAlertSettings().withAlertsForAllJobFailures(AlertsState.ENABLED)))
                .withSecuritySettings(new SecuritySettings().withSoftDeleteSettings(new SoftDeleteSettings()
                    .withState(SoftDeleteState.fromString("Enabled")).withRetentionDurationInDays(14.0D)))
                .withStorageSettings(
                    Arrays.asList(new StorageSetting().withDatastoreType(StorageSettingStoreTypes.VAULT_STORE)
                        .withType(StorageSettingTypes.LOCALLY_REDUNDANT)))
                .withFeatureSettings(new FeatureSettings().withCrossRegionRestoreSettings(
                    new CrossRegionRestoreSettings().withState(CrossRegionRestoreState.ENABLED))))
            .withTags(mapOf("key1", "fakeTokenPlaceholder"))
            .withIdentity(new DppIdentityDetails().withType("systemAssigned")).create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
