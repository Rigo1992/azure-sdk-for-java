// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for TableResources DeleteTable. */
public final class TableResourcesDeleteTableSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBTableDelete.json
     */
    /**
     * Sample code: CosmosDBTableDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBTableDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getTableResources()
            .deleteTable("rg1", "ddb1", "tableName", com.azure.core.util.Context.NONE);
    }
}
