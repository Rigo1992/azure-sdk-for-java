// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.MongoUserDefinitionCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.models.Role;
import java.util.Arrays;

/** Samples for MongoDBResources CreateUpdateMongoUserDefinition. */
public final class MongoDBResourcesCreateUpdateMongoUserDefinitionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-09-15-preview/examples/CosmosDBMongoDBUserDefinitionCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBMongoDBUserDefinitionCreateUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBMongoDBUserDefinitionCreateUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getMongoDBResources()
            .createUpdateMongoUserDefinition(
                "myMongoUserDefinitionId",
                "myResourceGroupName",
                "myAccountName",
                new MongoUserDefinitionCreateUpdateParameters()
                    .withUsername("myUserName")
                    .withPassword("fakeTokenPlaceholder")
                    .withDatabaseName("sales")
                    .withCustomData("My custom data")
                    .withRoles(Arrays.asList(new Role().withDb("sales").withRole("myReadRole")))
                    .withMechanisms("SCRAM-SHA-256"),
                com.azure.core.util.Context.NONE);
    }
}
