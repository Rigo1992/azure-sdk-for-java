// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.PhysicalPartitionId;
import com.azure.resourcemanager.cosmos.models.RetrieveThroughputParameters;
import com.azure.resourcemanager.cosmos.models.RetrieveThroughputPropertiesResource;
import java.util.Arrays;

/**
 * Samples for MongoDBResources MongoDBDatabaseRetrieveThroughputDistribution.
 */
public final class MongoDBResourcesMongoDBDatabaseRetrieveThroughputDistributionSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBMongoDBDatabaseRetrieveThroughputDistribution.json
     */
    /**
     * Sample code: CosmosDBMongoDBDatabaseRetrieveThroughputDistribution.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        cosmosDBMongoDBDatabaseRetrieveThroughputDistribution(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getMongoDBResources()
            .mongoDBDatabaseRetrieveThroughputDistribution("rg1", "ddb1", "databaseName",
                new RetrieveThroughputParameters()
                    .withResource(new RetrieveThroughputPropertiesResource().withPhysicalPartitionIds(
                        Arrays.asList(new PhysicalPartitionId().withId("0"), new PhysicalPartitionId().withId("1")))),
                com.azure.core.util.Context.NONE);
    }
}
