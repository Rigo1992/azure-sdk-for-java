// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for SqlResources DeleteSqlUserDefinedFunction.
 */
public final class SqlResourcesDeleteSqlUserDefinedFunctionSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBSqlUserDefinedFunctionDelete.json
     */
    /**
     * Sample code: CosmosDBSqlUserDefinedFunctionDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlUserDefinedFunctionDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getSqlResources().deleteSqlUserDefinedFunction("rg1", "ddb1",
            "databaseName", "containerName", "userDefinedFunctionName", com.azure.core.util.Context.NONE);
    }
}
