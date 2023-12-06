// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for StaticSites UnlinkBackendFromBuild.
 */
public final class StaticSitesUnlinkBackendFromBuildSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/UnlinkBackendFromStaticSiteBuild.json
     */
    /**
     * Sample code: Unlink a backend from a static site build.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void unlinkABackendFromAStaticSiteBuild(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getStaticSites().unlinkBackendFromBuildWithResponse("rg",
            "testStaticSite0", "12", "testBackend", null, com.azure.core.util.Context.NONE);
    }
}
