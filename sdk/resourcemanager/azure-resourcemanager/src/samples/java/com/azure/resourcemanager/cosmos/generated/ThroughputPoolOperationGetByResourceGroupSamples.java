// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for ThroughputPoolOperation GetByResourceGroup.
 */
public final class ThroughputPoolOperationGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/throughputPool/
     * CosmosDBThroughputPoolGet.json
     */
    /**
     * Sample code: CosmosDB ThroughputPool Get.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBThroughputPoolGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getThroughputPoolOperations()
            .getByResourceGroupWithResponse("rgName", "tp1", com.azure.core.util.Context.NONE);
    }
}
