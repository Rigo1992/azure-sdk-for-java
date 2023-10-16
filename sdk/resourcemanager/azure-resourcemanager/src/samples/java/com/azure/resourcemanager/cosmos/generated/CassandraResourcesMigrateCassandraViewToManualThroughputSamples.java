// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for CassandraResources MigrateCassandraViewToManualThroughput. */
public final class CassandraResourcesMigrateCassandraViewToManualThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-09-15-preview/examples/CosmosDBCassandraViewMigrateToManualThroughput.json
     */
    /**
     * Sample code: CosmosDBCassandraViewMigrateToManualThroughput.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBCassandraViewMigrateToManualThroughput(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getCassandraResources()
            .migrateCassandraViewToManualThroughput(
                "rg1", "ddb1", "keyspacename", "viewname", com.azure.core.util.Context.NONE);
    }
}
