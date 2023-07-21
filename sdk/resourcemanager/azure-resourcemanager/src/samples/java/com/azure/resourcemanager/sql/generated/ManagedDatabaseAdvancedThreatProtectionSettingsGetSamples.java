// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.AdvancedThreatProtectionName;

/** Samples for ManagedDatabaseAdvancedThreatProtectionSettings Get. */
public final class ManagedDatabaseAdvancedThreatProtectionSettingsGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/ManagedDatabaseAdvancedThreatProtectionSettingsGet.json
     */
    /**
     * Sample code: Get a managed database's Advanced Threat Protection settings.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAManagedDatabaseSAdvancedThreatProtectionSettings(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedDatabaseAdvancedThreatProtectionSettings()
            .getWithResponse(
                "threatprotection-6852",
                "threatprotection-2080",
                "testdb",
                AdvancedThreatProtectionName.DEFAULT,
                com.azure.core.util.Context.NONE);
    }
}
