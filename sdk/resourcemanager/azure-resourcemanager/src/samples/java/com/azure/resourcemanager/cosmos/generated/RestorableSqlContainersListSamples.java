// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for RestorableSqlContainers List. */
public final class RestorableSqlContainersListSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBRestorableSqlContainerList.json
     */
    /**
     * Sample code: CosmosDBRestorableSqlContainerList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBRestorableSqlContainerList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getRestorableSqlContainers()
            .list(
                "WestUS",
                "98a570f2-63db-4117-91f0-366327b7b353",
                "3fu-hg==",
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
