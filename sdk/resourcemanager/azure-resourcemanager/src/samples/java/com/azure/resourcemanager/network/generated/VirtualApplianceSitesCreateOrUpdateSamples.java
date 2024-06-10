// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.VirtualApplianceSiteInner;
import com.azure.resourcemanager.network.models.BreakOutCategoryPolicies;
import com.azure.resourcemanager.network.models.Office365PolicyProperties;

/**
 * Samples for VirtualApplianceSites CreateOrUpdate.
 */
public final class VirtualApplianceSitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/NetworkVirtualApplianceSitePut.json
     */
    /**
     * Sample code: Create Network Virtual Appliance Site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createNetworkVirtualApplianceSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualApplianceSites()
            .createOrUpdate("rg1", "nva", "site1",
                new VirtualApplianceSiteInner().withAddressPrefix("192.168.1.0/24")
                    .withO365Policy(new Office365PolicyProperties().withBreakOutCategories(
                        new BreakOutCategoryPolicies().withAllow(true).withOptimize(true).withDefaultProperty(true))),
                com.azure.core.util.Context.NONE);
    }
}
