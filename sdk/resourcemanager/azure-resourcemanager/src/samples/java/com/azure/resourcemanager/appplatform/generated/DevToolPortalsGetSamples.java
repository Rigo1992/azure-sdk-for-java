// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/** Samples for DevToolPortals Get. */
public final class DevToolPortalsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2023-03-01-preview/examples/DevToolPortals_Get.json
     */
    /**
     * Sample code: DevToolPortals_Get.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void devToolPortalsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getDevToolPortals()
            .getWithResponse("myResourceGroup", "myservice", "default", com.azure.core.util.Context.NONE);
    }
}
