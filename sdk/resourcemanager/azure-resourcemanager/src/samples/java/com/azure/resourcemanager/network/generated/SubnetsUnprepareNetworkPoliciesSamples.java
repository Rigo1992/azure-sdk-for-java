// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.UnprepareNetworkPoliciesRequest;

/**
 * Samples for Subnets UnprepareNetworkPolicies.
 */
public final class SubnetsUnprepareNetworkPoliciesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * SubnetUnprepareNetworkPolicies.json
     */
    /**
     * Sample code: Unprepare Network Policies.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void unprepareNetworkPolicies(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getSubnets().unprepareNetworkPolicies("rg1", "test-vnet", "subnet1",
            new UnprepareNetworkPoliciesRequest().withServiceName("Microsoft.Sql/managedInstances"),
            com.azure.core.util.Context.NONE);
    }
}
