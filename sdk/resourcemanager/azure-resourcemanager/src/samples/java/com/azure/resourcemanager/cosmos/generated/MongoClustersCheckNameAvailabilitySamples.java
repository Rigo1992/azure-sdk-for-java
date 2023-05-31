// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.CheckNameAvailabilityRequest;

/** Samples for MongoClusters CheckNameAvailability. */
public final class MongoClustersCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-03-15-preview/examples/mongo-cluster/CosmosDBMongoClusterNameAvailability_AlreadyExists.json
     */
    /**
     * Sample code: Check name availability already exists result.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void checkNameAvailabilityAlreadyExistsResult(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getMongoClusters()
            .checkNameAvailabilityWithResponse(
                "westus2",
                new CheckNameAvailabilityRequest()
                    .withName("existingmongocluster")
                    .withType("Microsoft.DocumentDB/mongoClusters"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-03-15-preview/examples/mongo-cluster/CosmosDBMongoClusterNameAvailability.json
     */
    /**
     * Sample code: Check name availability.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void checkNameAvailability(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getMongoClusters()
            .checkNameAvailabilityWithResponse(
                "westus2",
                new CheckNameAvailabilityRequest()
                    .withName("newmongocluster")
                    .withType("Microsoft.DocumentDB/mongoClusters"),
                com.azure.core.util.Context.NONE);
    }
}
