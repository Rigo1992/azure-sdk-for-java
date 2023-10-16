// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for SqlResources ListClientEncryptionKeys. */
public final class SqlResourcesListClientEncryptionKeysSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-09-15-preview/examples/CosmosDBSqlClientEncryptionKeysList.json
     */
    /**
     * Sample code: CosmosDBClientEncryptionKeysList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBClientEncryptionKeysList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .listClientEncryptionKeys("rgName", "accountName", "databaseName", com.azure.core.util.Context.NONE);
    }
}
