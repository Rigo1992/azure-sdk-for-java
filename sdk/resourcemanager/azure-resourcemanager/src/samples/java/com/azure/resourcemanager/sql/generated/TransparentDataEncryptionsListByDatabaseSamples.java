// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for TransparentDataEncryptions ListByDatabase. */
public final class TransparentDataEncryptionsListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/TransparentDataEncryptionList.json
     */
    /**
     * Sample code: Get a list of the database's transparent data encryption.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAListOfTheDatabaseSTransparentDataEncryption(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getTransparentDataEncryptions()
            .listByDatabase("security-tde-resourcegroup", "securitytde", "testdb", com.azure.core.util.Context.NONE);
    }
}
