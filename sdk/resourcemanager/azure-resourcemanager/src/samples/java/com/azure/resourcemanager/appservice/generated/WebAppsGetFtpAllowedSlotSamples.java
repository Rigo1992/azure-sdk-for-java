// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for WebApps GetFtpAllowedSlot. */
public final class WebAppsGetFtpAllowedSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/GetPublishingCredentialsPolicySlot.json
     */
    /**
     * Sample code: Get FTP Allowed.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getFTPAllowed(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .getFtpAllowedSlotWithResponse("rg", "testSite", "stage", Context.NONE);
    }
}
