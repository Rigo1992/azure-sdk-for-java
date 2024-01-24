// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for ThroughputPoolAccounts List.
 */
public final class ThroughputPoolAccountsListSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/throughputPool/
     * CosmosDBThroughputPoolAccountsList.json
     */
    /**
     * Sample code: CosmosDB ThroughputPool Account List.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBThroughputPoolAccountList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getThroughputPoolAccounts().list("rgName", "tp1",
            com.azure.core.util.Context.NONE);
    }
}
