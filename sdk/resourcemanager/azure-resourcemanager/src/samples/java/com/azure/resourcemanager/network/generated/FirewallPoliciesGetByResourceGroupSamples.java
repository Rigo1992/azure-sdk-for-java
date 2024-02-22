// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for FirewallPolicies GetByResourceGroup.
 */
public final class FirewallPoliciesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/FirewallPolicyGet.json
     */
    /**
     * Sample code: Get FirewallPolicy.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getFirewallPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getFirewallPolicies().getByResourceGroupWithResponse("rg1",
            "firewallPolicy", null, com.azure.core.util.Context.NONE);
    }
}
