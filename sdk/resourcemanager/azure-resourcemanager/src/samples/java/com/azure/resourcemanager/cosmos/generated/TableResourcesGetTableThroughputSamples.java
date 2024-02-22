// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for TableResources GetTableThroughput.
 */
public final class TableResourcesGetTableThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-11-15/examples/
     * CosmosDBTableThroughputGet.json
     */
    /**
     * Sample code: CosmosDBTableThroughputGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBTableThroughputGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getTableResources().getTableThroughputWithResponse("rg1",
            "ddb1", "tableName", com.azure.core.util.Context.NONE);
    }
}
