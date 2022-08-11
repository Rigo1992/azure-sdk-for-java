// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.util.Context;

/** Samples for CollectionRegion ListMetrics. */
public final class CollectionRegionListMetricsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-05-15/examples/CosmosDBRegionCollectionGetMetrics.json
     */
    /**
     * Sample code: CosmosDBRegionCollectionGetMetrics.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBRegionCollectionGetMetrics(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getCollectionRegions()
            .listMetrics(
                "rg1",
                "ddb1",
                "North Europe",
                "databaseRid",
                "collectionRid",
                "$filter=(name.value eq 'Total Requests') and timeGrain eq duration'PT5M' and startTime eq"
                    + " '2017-11-19T23:53:55.2780000Z' and endTime eq '2017-11-20T00:13:55.2780000Z",
                Context.NONE);
    }
}
