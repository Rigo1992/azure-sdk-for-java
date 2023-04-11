// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for LoadBalancers GetByResourceGroup. */
public final class LoadBalancersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/LoadBalancerGet.json
     */
    /**
     * Sample code: Get load balancer.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getLoadBalancer(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLoadBalancers()
            .getByResourceGroupWithResponse("rg1", "lb", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/LoadBalancerGetInboundNatRulePortMapping.json
     */
    /**
     * Sample code: Get load balancer with inbound NAT rule port mapping.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getLoadBalancerWithInboundNATRulePortMapping(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLoadBalancers()
            .getByResourceGroupWithResponse("rg1", "lb", null, com.azure.core.util.Context.NONE);
    }
}
