// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for DatabaseAccounts ListMetricDefinitions.
 */
public final class DatabaseAccountsListMetricDefinitionsSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBDatabaseAccountGetMetricDefinitions.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountGetMetricDefinitions.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        cosmosDBDatabaseAccountGetMetricDefinitions(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getDatabaseAccounts().listMetricDefinitions("rg1", "ddb1",
            com.azure.core.util.Context.NONE);
    }
}
