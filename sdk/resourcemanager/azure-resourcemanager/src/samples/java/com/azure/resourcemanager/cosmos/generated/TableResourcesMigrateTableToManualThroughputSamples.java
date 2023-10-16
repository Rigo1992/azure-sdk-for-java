// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for TableResources MigrateTableToManualThroughput. */
public final class TableResourcesMigrateTableToManualThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-09-15-preview/examples/CosmosDBTableMigrateToManualThroughput.json
     */
    /**
     * Sample code: CosmosDBTableMigrateToManualThroughput.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBTableMigrateToManualThroughput(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getTableResources()
            .migrateTableToManualThroughput("rg1", "ddb1", "tableName", com.azure.core.util.Context.NONE);
    }
}
