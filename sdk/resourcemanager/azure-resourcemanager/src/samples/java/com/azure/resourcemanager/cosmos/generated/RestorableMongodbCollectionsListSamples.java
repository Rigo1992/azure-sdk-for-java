// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for RestorableMongodbCollections List. */
public final class RestorableMongodbCollectionsListSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBRestorableMongodbCollectionList.json
     */
    /**
     * Sample code: CosmosDBRestorableMongodbCollectionList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBRestorableMongodbCollectionList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getRestorableMongodbCollections()
            .list(
                "WestUS",
                "98a570f2-63db-4117-91f0-366327b7b353",
                "PD5DALigDgw=",
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
