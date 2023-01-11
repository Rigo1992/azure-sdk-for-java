// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.TransparentDataEncryptionName;

/** Samples for ManagedDatabaseTransparentDataEncryption Get. */
public final class ManagedDatabaseTransparentDataEncryptionGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedTransparentDataEncryptionGet.json
     */
    /**
     * Sample code: Get a database's transparent data encryption.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getADatabaseSTransparentDataEncryption(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedDatabaseTransparentDataEncryptions()
            .getWithResponse(
                "security-tde-resourcegroup",
                "securitytde",
                "testdb",
                TransparentDataEncryptionName.CURRENT,
                Context.NONE);
    }
}
