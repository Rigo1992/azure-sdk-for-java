// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.FirewallRuleInner;

/** Samples for FirewallRules CreateOrUpdate. */
public final class FirewallRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/FirewallRuleCreate.json
     */
    /**
     * Sample code: Create a firewall rule max/min.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAFirewallRuleMaxMin(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getFirewallRules()
            .createOrUpdateWithResponse(
                "firewallrulecrudtest-12",
                "firewallrulecrudtest-6285",
                "firewallrulecrudtest-5370",
                new FirewallRuleInner().withStartIpAddress("0.0.0.3").withEndIpAddress("0.0.0.3"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/FirewallRuleUpdate.json
     */
    /**
     * Sample code: Update a firewall rule max/min.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAFirewallRuleMaxMin(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getFirewallRules()
            .createOrUpdateWithResponse(
                "firewallrulecrudtest-12",
                "firewallrulecrudtest-6285",
                "firewallrulecrudtest-3927",
                new FirewallRuleInner().withStartIpAddress("0.0.0.1").withEndIpAddress("0.0.0.1"),
                Context.NONE);
    }
}
