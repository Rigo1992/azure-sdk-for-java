// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for CassandraDataCenters Get.
 */
public final class CassandraDataCentersGetSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBManagedCassandraDataCenterGet.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraDataCenterGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBManagedCassandraDataCenterGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getCassandraDataCenters()
            .getWithResponse("cassandra-prod-rg", "cassandra-prod", "dc1", com.azure.core.util.Context.NONE);
    }
}
