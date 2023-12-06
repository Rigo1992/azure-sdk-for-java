// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

/**
 * Samples for Sites ListByResourceGroup.
 */
public final class SitesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * SiteListByResourceGroup.json
     */
    /**
     * Sample code: List all network sites.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void listAllNetworkSites(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.sites().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
