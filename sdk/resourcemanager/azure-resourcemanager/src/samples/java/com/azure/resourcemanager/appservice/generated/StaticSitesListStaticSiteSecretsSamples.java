// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for StaticSites ListStaticSiteSecrets.
 */
public final class StaticSitesListStaticSiteSecretsSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/ListStaticSiteSecrets.json
     */
    /**
     * Sample code: List secrets for a static site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listSecretsForAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getStaticSites().listStaticSiteSecretsWithResponse("rg",
            "testStaticSite0", com.azure.core.util.Context.NONE);
    }
}
