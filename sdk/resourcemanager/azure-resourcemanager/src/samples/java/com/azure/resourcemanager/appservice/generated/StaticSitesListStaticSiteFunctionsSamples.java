// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for StaticSites ListStaticSiteFunctions. */
public final class StaticSitesListStaticSiteFunctionsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/ListStaticSiteFunctions.json
     */
    /**
     * Sample code: Gets the functions of a static site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsTheFunctionsOfAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .listStaticSiteFunctions("rg", "testStaticSite0", Context.NONE);
    }
}
