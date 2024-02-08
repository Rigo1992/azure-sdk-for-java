// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for ApplicationLiveViews Get.
 */
public final class ApplicationLiveViewsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * ApplicationLiveViews_Get.json
     */
    /**
     * Sample code: ApplicationLiveViews_Get.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void applicationLiveViewsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices().manager().serviceClient().getApplicationLiveViews().getWithResponse("myResourceGroup",
            "myservice", "default", com.azure.core.util.Context.NONE);
    }
}
