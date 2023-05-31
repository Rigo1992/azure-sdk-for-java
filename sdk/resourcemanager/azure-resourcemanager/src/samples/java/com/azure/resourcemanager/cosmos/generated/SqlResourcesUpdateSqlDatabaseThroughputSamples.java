// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.ThroughputSettingsResource;
import com.azure.resourcemanager.cosmos.models.ThroughputSettingsUpdateParameters;
import java.util.HashMap;
import java.util.Map;

/** Samples for SqlResources UpdateSqlDatabaseThroughput. */
public final class SqlResourcesUpdateSqlDatabaseThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-03-15-preview/examples/CosmosDBSqlDatabaseThroughputUpdate.json
     */
    /**
     * Sample code: CosmosDBSqlDatabaseThroughputUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlDatabaseThroughputUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .updateSqlDatabaseThroughput(
                "rg1",
                "ddb1",
                "databaseName",
                new ThroughputSettingsUpdateParameters()
                    .withLocation("West US")
                    .withTags(mapOf())
                    .withResource(new ThroughputSettingsResource().withThroughput(400)),
                com.azure.core.util.Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
