// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/**
 * Samples for RuleSets Delete.
 */
public final class RuleSetsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/cdn/resource-manager/Microsoft.Cdn/stable/2024-02-01/examples/RuleSets_Delete.json
     */
    /**
     * Sample code: RuleSets_Delete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void ruleSetsDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cdnProfiles().manager().serviceClient().getRuleSets().delete("RG", "profile1", "ruleSet1",
            com.azure.core.util.Context.NONE);
    }
}
