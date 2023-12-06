// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.models.StaticSiteCustomDomainRequestPropertiesArmResource;

/**
 * Samples for StaticSites CreateOrUpdateStaticSiteCustomDomain.
 */
public final class StaticSitesCreateOrUpdateStaticSiteCustomDomainSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/CreateOrUpdateStaticSiteCustomDomain.
     * json
     */
    /**
     * Sample code: Create or update a custom domain for a static site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateACustomDomainForAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getStaticSites().createOrUpdateStaticSiteCustomDomain("rg",
            "testStaticSite0", "custom.domain.net", new StaticSiteCustomDomainRequestPropertiesArmResource(),
            com.azure.core.util.Context.NONE);
    }
}
