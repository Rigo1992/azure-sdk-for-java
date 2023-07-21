// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for IPv6FirewallRules ListByServer. */
public final class IPv6FirewallRulesListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-11-01-preview/examples/IPv6FirewallRuleList.json
     */
    /**
     * Sample code: List IPv6 Firewall Rules.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listIPv6FirewallRules(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getIPv6FirewallRules()
            .listByServer("firewallrulecrudtest-12", "firewallrulecrudtest-6285", com.azure.core.util.Context.NONE);
    }
}
