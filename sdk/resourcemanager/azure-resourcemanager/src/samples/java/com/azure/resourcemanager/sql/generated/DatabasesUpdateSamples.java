// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.AlwaysEncryptedEnclaveType;
import com.azure.resourcemanager.sql.models.DatabaseIdentity;
import com.azure.resourcemanager.sql.models.DatabaseIdentityType;
import com.azure.resourcemanager.sql.models.DatabaseKey;
import com.azure.resourcemanager.sql.models.DatabaseLicenseType;
import com.azure.resourcemanager.sql.models.DatabaseUpdate;
import com.azure.resourcemanager.sql.models.DatabaseUserIdentity;
import com.azure.resourcemanager.sql.models.Sku;
import java.util.HashMap;
import java.util.Map;

/** Samples for Databases Update. */
public final class DatabasesUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/PatchVCoreDatabaseAssignMaintenanceConfiguration.json
     */
    /**
     * Sample code: Assigns maintenance window to a database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void assignsMaintenanceWindowToADatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabases()
            .update(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                "testdb",
                new DatabaseUpdate()
                    .withSku(new Sku().withName("BC_Gen5_4"))
                    .withMaintenanceConfigurationId(
                        "/subscriptions/00000000-1111-2222-3333-444444444444/providers/Microsoft.Maintenance/publicMaintenanceConfigurations/SQL_SouthEastAsia_1"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/PatchDatabaseVBSEnclave.json
     */
    /**
     * Sample code: Creates a database with VBS enclave type.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createsADatabaseWithVBSEnclaveType(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabases()
            .update(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                "testdb",
                new DatabaseUpdate().withPreferredEnclaveType(AlwaysEncryptedEnclaveType.VBS),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/PatchVCoreDatabaseResetMaintenanceConfiguration.json
     */
    /**
     * Sample code: Resets maintenance window of a database to default.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void resetsMaintenanceWindowOfADatabaseToDefault(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabases()
            .update(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                "testdb",
                new DatabaseUpdate()
                    .withSku(new Sku().withName("BC_Gen5_4"))
                    .withMaintenanceConfigurationId(
                        "/subscriptions/00000000-1111-2222-3333-444444444444/providers/Microsoft.Maintenance/publicMaintenanceConfigurations/SQL_Default"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/PatchVCoreDatabaseWithKeysAndEncryptionProtector.json
     */
    /**
     * Sample code: Patch a database with database-level customer managed keys.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchADatabaseWithDatabaseLevelCustomerManagedKeys(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabases()
            .update(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                "testdb",
                new DatabaseUpdate()
                    .withSku(new Sku().withName("S0").withTier("Standard"))
                    .withIdentity(
                        new DatabaseIdentity()
                            .withType(DatabaseIdentityType.USER_ASSIGNED)
                            .withUserAssignedIdentities(
                                mapOf(
                                    "/subscriptions/00000000-1111-2222-3333-444444444444/resourcegroups/Default-SQL-SouthEastAsia/providers/Microsoft.ManagedIdentity/userAssignedIdentities/umi",
                                    new DatabaseUserIdentity(),
                                    "/subscriptions/00000000-1111-2222-3333-444444444444/resourcegroups/Default-SQL-SouthEastAsia/providers/Microsoft.ManagedIdentity/userAssignedIdentities/umiToDelete",
                                    null)))
                    .withKeys(
                        mapOf(
                            "https://your-key-vault-name.vault.azure.net/yourKey/yourKeyVersion",
                            new DatabaseKey(),
                            "https://your-key-vault-name.vault.azure.net/yourKey2/yourKey2VersionToDelete",
                            null))
                    .withEncryptionProtector("https://your-key-vault-name.vault.azure.net/yourKey/yourKeyVersion"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/PatchDatabaseDefaultEnclave.json
     */
    /**
     * Sample code: Updates a database with Default enclave type.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updatesADatabaseWithDefaultEnclaveType(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabases()
            .update(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                "testdb",
                new DatabaseUpdate().withPreferredEnclaveType(AlwaysEncryptedEnclaveType.DEFAULT),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/PatchVCoreDatabase.json
     */
    /**
     * Sample code: Updates a database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updatesADatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabases()
            .update(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                "testdb",
                new DatabaseUpdate()
                    .withSku(new Sku().withName("BC_Gen4_4"))
                    .withMaxSizeBytes(1073741824L)
                    .withLicenseType(DatabaseLicenseType.LICENSE_INCLUDED),
                com.azure.core.util.Context.NONE);
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
