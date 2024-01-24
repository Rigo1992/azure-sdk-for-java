// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for MongoDBResources DeleteMongoRoleDefinition.
 */
public final class MongoDBResourcesDeleteMongoRoleDefinitionSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBMongoDBRoleDefinitionDelete.json
     */
    /**
     * Sample code: CosmosDBMongoDBRoleDefinitionDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBMongoDBRoleDefinitionDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getMongoDBResources().deleteMongoRoleDefinition(
            "myMongoRoleDefinitionId", "myResourceGroupName", "myAccountName", com.azure.core.util.Context.NONE);
    }
}
