// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork;

import com.azure.core.util.Context;

/** Samples for VendorSkuPreview Get. */
public final class VendorSkuPreviewGetSamples {
    /**
     * Sample code: Get preview subscription of vendor sku sub resource.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void getPreviewSubscriptionOfVendorSkuSubResource(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.vendorSkuPreviews().getWithResponse("TestVendor", "TestSku", "previewSub", Context.NONE);
    }
}
