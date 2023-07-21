// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for LongTermRetentionBackups GetByResourceGroup. */
public final class LongTermRetentionBackupsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-05-01-preview/examples/ResourceGroupBasedLongTermRetentionBackupGet.json
     */
    /**
     * Sample code: Get the long term retention backup.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getTheLongTermRetentionBackup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getLongTermRetentionBackups()
            .getByResourceGroupWithResponse(
                "testResourceGroup",
                "japaneast",
                "testserver",
                "testDatabase",
                "55555555-6666-7777-8888-999999999999;131637960820000000",
                com.azure.core.util.Context.NONE);
    }
}
