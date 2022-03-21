// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for Diagnostics GetSiteDetectorSlot. */
public final class DiagnosticsGetSiteDetectorSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/Diagnostics_GetSiteDetector.json
     */
    /**
     * Sample code: Get App Detector.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppDetector(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getDiagnostics()
            .getSiteDetectorSlotWithResponse(
                "Sample-WestUSResourceGroup", "SampleApp", "availability", "sitecrashes", "Production", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/Diagnostics_GetSiteDetectorSlot.json
     */
    /**
     * Sample code: Get App Slot Detector.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppSlotDetector(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getDiagnostics()
            .getSiteDetectorSlotWithResponse(
                "Sample-WestUSResourceGroup", "SampleApp", "availability", "sitecrashes", "staging", Context.NONE);
    }
}
