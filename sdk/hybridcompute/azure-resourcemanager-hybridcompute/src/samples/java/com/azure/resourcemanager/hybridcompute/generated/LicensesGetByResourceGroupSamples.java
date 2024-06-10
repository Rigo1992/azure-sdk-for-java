// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for Licenses GetByResourceGroup.
 */
public final class LicensesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-03-31-preview/examples/license/License_Get.json
     */
    /**
     * Sample code: Get License.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void getLicense(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.licenses()
            .getByResourceGroupWithResponse("myResourceGroup", "{licenseName}", com.azure.core.util.Context.NONE);
    }
}
