// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for MongoClusters ListFirewallRules.
 */
public final class MongoClustersListFirewallRulesSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/mongo-cluster/
     * CosmosDBMongoClusterFirewallRuleList.json
     */
    /**
     * Sample code: List firewall rules of the mongo cluster.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listFirewallRulesOfTheMongoCluster(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getMongoClusters().listFirewallRules("TestGroup",
            "myMongoCluster", com.azure.core.util.Context.NONE);
    }
}
