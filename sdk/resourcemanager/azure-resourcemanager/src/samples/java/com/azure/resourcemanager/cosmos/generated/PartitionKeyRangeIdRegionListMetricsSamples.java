// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for PartitionKeyRangeIdRegion ListMetrics. */
public final class PartitionKeyRangeIdRegionListMetricsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-03-15-preview/examples/CosmosDBPKeyRangeIdRegionGetMetrics.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountRegionGetMetrics.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBDatabaseAccountRegionGetMetrics(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getPartitionKeyRangeIdRegions()
            .listMetrics(
                "rg1",
                "ddb1",
                "West US",
                "databaseRid",
                "collectionRid",
                "0",
                "$filter=(name.value eq 'Max RUs Per Second') and timeGrain eq duration'PT1M' and startTime eq"
                    + " '2017-11-19T23:53:55.2780000Z' and endTime eq '2017-11-20T23:58:55.2780000Z",
                com.azure.core.util.Context.NONE);
    }
}
