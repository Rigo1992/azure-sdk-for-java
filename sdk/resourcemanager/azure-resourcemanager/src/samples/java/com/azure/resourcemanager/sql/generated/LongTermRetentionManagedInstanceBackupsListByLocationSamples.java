// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for LongTermRetentionManagedInstanceBackups ListByLocation. */
public final class LongTermRetentionManagedInstanceBackupsListByLocationSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-05-01-preview/examples/ManagedInstanceLongTermRetentionBackupListByLocation.json
     */
    /**
     * Sample code: Get all long term retention backups under the location.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAllLongTermRetentionBackupsUnderTheLocation(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getLongTermRetentionManagedInstanceBackups()
            .listByLocation("japaneast", null, null, com.azure.core.util.Context.NONE);
    }
}
