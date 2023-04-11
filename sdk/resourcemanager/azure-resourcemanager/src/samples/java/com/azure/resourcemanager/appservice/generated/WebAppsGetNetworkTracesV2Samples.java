// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for WebApps GetNetworkTracesV2. */
public final class WebAppsGetNetworkTracesV2Samples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/GetWebSiteNetworkTraces.json
     */
    /**
     * Sample code: Get NetworkTraces for a site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getNetworkTracesForASite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .getNetworkTracesV2WithResponse(
                "testrg123", "SampleApp", "c291433b-53ad-4c49-8cae-0a293eae1c6d", com.azure.core.util.Context.NONE);
    }
}
