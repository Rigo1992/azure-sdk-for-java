// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.FailoverPolicies;
import com.azure.resourcemanager.cosmos.models.FailoverPolicy;
import java.util.Arrays;

/** Samples for DatabaseAccounts FailoverPriorityChange. */
public final class DatabaseAccountsFailoverPriorityChangeSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-09-15-preview/examples/CosmosDBDatabaseAccountFailoverPriorityChange.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountFailoverPriorityChange.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBDatabaseAccountFailoverPriorityChange(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getDatabaseAccounts()
            .failoverPriorityChange(
                "rg1",
                "ddb1-failover",
                new FailoverPolicies()
                    .withFailoverPolicies(
                        Arrays
                            .asList(
                                new FailoverPolicy().withLocationName("eastus").withFailoverPriority(0),
                                new FailoverPolicy().withLocationName("westus").withFailoverPriority(1))),
                com.azure.core.util.Context.NONE);
    }
}
