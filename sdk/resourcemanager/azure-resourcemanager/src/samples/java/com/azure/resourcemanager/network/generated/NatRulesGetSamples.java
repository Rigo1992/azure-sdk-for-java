// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NatRules Get.
 */
public final class NatRulesGetSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/NatRuleGet.json
     */
    /**
     * Sample code: NatRuleGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void natRuleGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getNatRules().getWithResponse("rg1", "gateway1", "natRule1",
            com.azure.core.util.Context.NONE);
    }
}
