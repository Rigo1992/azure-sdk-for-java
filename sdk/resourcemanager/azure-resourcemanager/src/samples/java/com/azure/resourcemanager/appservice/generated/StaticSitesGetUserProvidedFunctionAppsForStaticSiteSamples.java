// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for StaticSites GetUserProvidedFunctionAppsForStaticSite.
 */
public final class StaticSitesGetUserProvidedFunctionAppsForStaticSiteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetUserProvidedFunctionAppsForStaticSite.json
     */
    /**
     * Sample code: Get details of the user provided function apps registered with a static site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDetailsOfTheUserProvidedFunctionAppsRegisteredWithAStaticSite(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .getUserProvidedFunctionAppsForStaticSite("rg", "testStaticSite0", com.azure.core.util.Context.NONE);
    }
}
