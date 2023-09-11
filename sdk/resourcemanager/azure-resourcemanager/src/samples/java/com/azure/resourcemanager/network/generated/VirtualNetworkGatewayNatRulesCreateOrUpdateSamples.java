// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.VirtualNetworkGatewayNatRuleInner;
import com.azure.resourcemanager.network.models.VpnNatRuleMapping;
import com.azure.resourcemanager.network.models.VpnNatRuleMode;
import com.azure.resourcemanager.network.models.VpnNatRuleType;
import java.util.Arrays;

/** Samples for VirtualNetworkGatewayNatRules CreateOrUpdate. */
public final class VirtualNetworkGatewayNatRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/VirtualNetworkGatewayNatRulePut.json
     */
    /**
     * Sample code: VirtualNetworkGatewayNatRulePut.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualNetworkGatewayNatRulePut(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGatewayNatRules()
            .createOrUpdate(
                "rg1",
                "gateway1",
                "natRule1",
                new VirtualNetworkGatewayNatRuleInner()
                    .withTypePropertiesType(VpnNatRuleType.STATIC)
                    .withMode(VpnNatRuleMode.EGRESS_SNAT)
                    .withInternalMappings(
                        Arrays.asList(new VpnNatRuleMapping().withAddressSpace("10.4.0.0/24").withPortRange("200-300")))
                    .withExternalMappings(
                        Arrays
                            .asList(
                                new VpnNatRuleMapping().withAddressSpace("192.168.21.0/24").withPortRange("300-400")))
                    .withIpConfigurationId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/gateway1/ipConfigurations/default"),
                com.azure.core.util.Context.NONE);
    }
}
