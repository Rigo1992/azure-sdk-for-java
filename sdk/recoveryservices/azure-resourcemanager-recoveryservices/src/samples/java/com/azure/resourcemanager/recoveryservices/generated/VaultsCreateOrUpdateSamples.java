// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.resourcemanager.recoveryservices.models.AlertsState;
import com.azure.resourcemanager.recoveryservices.models.AzureMonitorAlertSettings;
import com.azure.resourcemanager.recoveryservices.models.ClassicAlertSettings;
import com.azure.resourcemanager.recoveryservices.models.CmkKekIdentity;
import com.azure.resourcemanager.recoveryservices.models.CmkKeyVaultProperties;
import com.azure.resourcemanager.recoveryservices.models.IdentityData;
import com.azure.resourcemanager.recoveryservices.models.InfrastructureEncryptionState;
import com.azure.resourcemanager.recoveryservices.models.MonitoringSettings;
import com.azure.resourcemanager.recoveryservices.models.PublicNetworkAccess;
import com.azure.resourcemanager.recoveryservices.models.ResourceIdentityType;
import com.azure.resourcemanager.recoveryservices.models.Sku;
import com.azure.resourcemanager.recoveryservices.models.SkuName;
import com.azure.resourcemanager.recoveryservices.models.UserIdentity;
import com.azure.resourcemanager.recoveryservices.models.VaultProperties;
import com.azure.resourcemanager.recoveryservices.models.VaultPropertiesEncryption;
import java.util.HashMap;
import java.util.Map;

/** Samples for Vaults CreateOrUpdate. */
public final class VaultsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2023-01-01/examples/PUTVault_WithCMK.json
     */
    /**
     * Sample code: Create or Update Vault with CustomerManagedKeys.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void createOrUpdateVaultWithCustomerManagedKeys(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager
            .vaults()
            .define("swaggerExample")
            .withRegion("West US")
            .withExistingResourceGroup("Default-RecoveryServices-ResourceGroup")
            .withIdentity(
                new IdentityData()
                    .withType(ResourceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/85bf5e8c-3084-4f42-add2-746ebb7e97b2/resourcegroups/defaultrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/examplemsi",
                            new UserIdentity())))
            .withProperties(
                new VaultProperties()
                    .withEncryption(
                        new VaultPropertiesEncryption()
                            .withKeyVaultProperties(new CmkKeyVaultProperties().withKeyUri("fakeTokenPlaceholder"))
                            .withKekIdentity(
                                new CmkKekIdentity()
                                    .withUserAssignedIdentity(
                                        "/subscriptions/85bf5e8c-3084-4f42-add2-746ebb7e97b2/resourcegroups/defaultrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/examplemsi"))
                            .withInfrastructureEncryption(InfrastructureEncryptionState.ENABLED))
                    .withPublicNetworkAccess(PublicNetworkAccess.ENABLED))
            .withSku(new Sku().withName(SkuName.STANDARD))
            .create();
    }

    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2023-01-01/examples/PUTVault.json
     */
    /**
     * Sample code: Create or Update Recovery Services vault.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void createOrUpdateRecoveryServicesVault(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager
            .vaults()
            .define("swaggerExample")
            .withRegion("West US")
            .withExistingResourceGroup("Default-RecoveryServices-ResourceGroup")
            .withIdentity(new IdentityData().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withProperties(new VaultProperties().withPublicNetworkAccess(PublicNetworkAccess.ENABLED))
            .withSku(new Sku().withName(SkuName.STANDARD))
            .create();
    }

    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2023-01-01/examples/PUTVault_WithUserAssignedIdentity.json
     */
    /**
     * Sample code: Create or Update Vault with User Assigned Identity.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void createOrUpdateVaultWithUserAssignedIdentity(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager
            .vaults()
            .define("swaggerExample")
            .withRegion("West US")
            .withExistingResourceGroup("Default-RecoveryServices-ResourceGroup")
            .withIdentity(
                new IdentityData()
                    .withType(ResourceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/85bf5e8c-3084-4f42-add2-746ebb7e97b2/resourcegroups/defaultrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/examplemsi",
                            new UserIdentity())))
            .withProperties(new VaultProperties().withPublicNetworkAccess(PublicNetworkAccess.ENABLED))
            .withSku(new Sku().withName(SkuName.STANDARD))
            .create();
    }

    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2023-01-01/examples/PUTVault_WithMonitoringSettings.json
     */
    /**
     * Sample code: Create or Update Vault With Monitoring Setting.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void createOrUpdateVaultWithMonitoringSetting(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager
            .vaults()
            .define("swaggerExample")
            .withRegion("West US")
            .withExistingResourceGroup("Default-RecoveryServices-ResourceGroup")
            .withIdentity(new IdentityData().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withProperties(
                new VaultProperties()
                    .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                    .withMonitoringSettings(
                        new MonitoringSettings()
                            .withAzureMonitorAlertSettings(
                                new AzureMonitorAlertSettings().withAlertsForAllJobFailures(AlertsState.ENABLED))
                            .withClassicAlertSettings(
                                new ClassicAlertSettings().withAlertsForCriticalOperations(AlertsState.DISABLED))))
            .withSku(new Sku().withName(SkuName.STANDARD))
            .create();
    }

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
