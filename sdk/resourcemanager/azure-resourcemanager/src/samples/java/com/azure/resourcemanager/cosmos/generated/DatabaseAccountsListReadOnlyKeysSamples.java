// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for DatabaseAccounts ListReadOnlyKeys. */
public final class DatabaseAccountsListReadOnlyKeysSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-03-15/examples/CosmosDBDatabaseAccountListReadOnlyKeys.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountListReadOnlyKeys.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBDatabaseAccountListReadOnlyKeys(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getDatabaseAccounts()
            .listReadOnlyKeysWithResponse("rg1", "ddb1", com.azure.core.util.Context.NONE);
    }
}
