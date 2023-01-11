// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ExtendedDatabaseBlobAuditingPolicies ListByDatabase. */
public final class ExtendedDatabaseBlobAuditingPoliciesListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/DatabaseExtendedAuditingSettingsList.json
     */
    /**
     * Sample code: List extended auditing settings of a database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listExtendedAuditingSettingsOfADatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getExtendedDatabaseBlobAuditingPolicies()
            .listByDatabase("blobauditingtest-6852", "blobauditingtest-2080", "testdb", Context.NONE);
    }
}
