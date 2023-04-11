// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for WebApps GetSlot. */
public final class WebAppsGetSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/GetWebAppSlot.json
     */
    /**
     * Sample code: Get Web App Slot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getWebAppSlot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .getSlotWithResponse("testrg123", "sitef6141", "staging", com.azure.core.util.Context.NONE);
    }
}
