// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.ContinuousBackupRestoreLocation;

/** Samples for GremlinResources RetrieveContinuousBackupInformation. */
public final class GremlinResourcesRetrieveContinuousBackupInformationSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-09-15-preview/examples/CosmosDBGremlinGraphBackupInformation.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphBackupInformation.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBGremlinGraphBackupInformation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getGremlinResources()
            .retrieveContinuousBackupInformation(
                "rgName",
                "ddb1",
                "databaseName",
                "graphName",
                new ContinuousBackupRestoreLocation().withLocation("North Europe"),
                com.azure.core.util.Context.NONE);
    }
}
