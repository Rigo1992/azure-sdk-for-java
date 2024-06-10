// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.VpnSiteInner;
import com.azure.resourcemanager.network.fluent.models.VpnSiteLinkInner;
import com.azure.resourcemanager.network.models.AddressSpace;
import com.azure.resourcemanager.network.models.O365BreakOutCategoryPolicies;
import com.azure.resourcemanager.network.models.O365PolicyProperties;
import com.azure.resourcemanager.network.models.VpnLinkBgpSettings;
import com.azure.resourcemanager.network.models.VpnLinkProviderProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for VpnSites CreateOrUpdate.
 */
public final class VpnSitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/VpnSitePut.json
     */
    /**
     * Sample code: VpnSiteCreate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vpnSiteCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVpnSites()
            .createOrUpdate("rg1", "vpnSite1", new VpnSiteInner().withLocation("West US")
                .withTags(mapOf("key1", "fakeTokenPlaceholder"))
                .withVirtualWan(new SubResource()
                    .withId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualWANs/wan1"))
                .withAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.0.0.0/16")))
                .withIsSecuritySite(false)
                .withVpnSiteLinks(Arrays.asList(new VpnSiteLinkInner().withName("vpnSiteLink1")
                    .withLinkProperties(
                        new VpnLinkProviderProperties().withLinkProviderName("vendor1").withLinkSpeedInMbps(0))
                    .withIpAddress("50.50.50.56")
                    .withFqdn("link1.vpnsite1.contoso.com")
                    .withBgpProperties(new VpnLinkBgpSettings().withAsn(1234L).withBgpPeeringAddress("192.168.0.0"))))
                .withO365Policy(new O365PolicyProperties().withBreakOutCategories(
                    new O365BreakOutCategoryPolicies().withAllow(true).withOptimize(true).withDefaultProperty(false))),
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
