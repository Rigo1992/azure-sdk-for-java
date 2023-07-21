// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.EncryptionProtectorName;

/** Samples for DatabaseEncryptionProtectors Revert. */
public final class DatabaseEncryptionProtectorsRevertSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/DatabaseEncryptionProtectorRevert.json
     */
    /**
     * Sample code: Reverts the encryption protector for a particular database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void revertsTheEncryptionProtectorForAParticularDatabase(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabaseEncryptionProtectors()
            .revert(
                "sqlcrudtest-7398",
                "sqlcrudtest-4645",
                "sqlcrudtestdb-2342",
                EncryptionProtectorName.CURRENT,
                com.azure.core.util.Context.NONE);
    }
}
