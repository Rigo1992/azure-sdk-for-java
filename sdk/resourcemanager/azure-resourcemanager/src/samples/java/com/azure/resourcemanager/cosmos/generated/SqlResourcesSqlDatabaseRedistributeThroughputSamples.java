// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.PhysicalPartitionThroughputInfoResource;
import com.azure.resourcemanager.cosmos.models.RedistributeThroughputParameters;
import com.azure.resourcemanager.cosmos.models.RedistributeThroughputPropertiesResource;
import com.azure.resourcemanager.cosmos.models.ThroughputPolicyType;
import java.util.Arrays;

/**
 * Samples for SqlResources SqlDatabaseRedistributeThroughput.
 */
public final class SqlResourcesSqlDatabaseRedistributeThroughputSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBSqlDatabaseRedistributeThroughput.json
     */
    /**
     * Sample code: CosmosDBSqlDatabaseRedistributeThroughput.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlDatabaseRedistributeThroughput(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getSqlResources()
            .sqlDatabaseRedistributeThroughput("rg1", "ddb1", "databaseName",
                new RedistributeThroughputParameters().withResource(new RedistributeThroughputPropertiesResource()
                    .withThroughputPolicy(ThroughputPolicyType.CUSTOM)
                    .withTargetPhysicalPartitionThroughputInfo(
                        Arrays.asList(new PhysicalPartitionThroughputInfoResource().withId("0").withThroughput(5000.0D),
                            new PhysicalPartitionThroughputInfoResource().withId("1").withThroughput(5000.0D)))
                    .withSourcePhysicalPartitionThroughputInfo(
                        Arrays.asList(new PhysicalPartitionThroughputInfoResource().withId("2").withThroughput(5000.0D),
                            new PhysicalPartitionThroughputInfoResource().withId("3")))),
                com.azure.core.util.Context.NONE);
    }
}
