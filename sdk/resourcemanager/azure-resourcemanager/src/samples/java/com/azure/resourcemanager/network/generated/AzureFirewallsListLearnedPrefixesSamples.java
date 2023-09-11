// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for AzureFirewalls ListLearnedPrefixes. */
public final class AzureFirewallsListLearnedPrefixesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/AzureFirewallListLearnedIPPrefixes.json
     */
    /**
     * Sample code: AzureFirewallListLearnedPrefixes.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void azureFirewallListLearnedPrefixes(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getAzureFirewalls()
            .listLearnedPrefixes("rg1", "azureFirewall1", com.azure.core.util.Context.NONE);
    }
}
