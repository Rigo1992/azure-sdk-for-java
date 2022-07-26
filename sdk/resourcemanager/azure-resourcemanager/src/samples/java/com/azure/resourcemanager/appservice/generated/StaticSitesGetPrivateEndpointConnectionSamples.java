// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for StaticSites GetPrivateEndpointConnection. */
public final class StaticSitesGetPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/GetSitePrivateEndpointConnection.json
     */
    /**
     * Sample code: Get a private endpoint connection for a site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAPrivateEndpointConnectionForASite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .getPrivateEndpointConnectionWithResponse("rg", "testSite", "connection", Context.NONE);
    }
}
