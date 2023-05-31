// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for SqlResources DeleteSqlContainer. */
public final class SqlResourcesDeleteSqlContainerSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-03-15-preview/examples/CosmosDBSqlContainerDelete.json
     */
    /**
     * Sample code: CosmosDBSqlContainerDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlContainerDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .deleteSqlContainer("rg1", "ddb1", "databaseName", "containerName", com.azure.core.util.Context.NONE);
    }
}
