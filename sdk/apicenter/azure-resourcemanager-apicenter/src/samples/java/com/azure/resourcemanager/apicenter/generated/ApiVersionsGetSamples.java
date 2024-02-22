// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

/**
 * Samples for ApiVersions Get.
 */
public final class ApiVersionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/apicenter/resource-manager/Microsoft.ApiCenter/stable/2024-03-01/examples/ApiVersions_Get.json
     */
    /**
     * Sample code: ApiVersions_Get.
     * 
     * @param manager Entry point to ApiCenterManager.
     */
    public static void apiVersionsGet(com.azure.resourcemanager.apicenter.ApiCenterManager manager) {
        manager.apiVersions().getWithResponse("contoso-resources", "contoso", "default", "echo-api", "2023-01-01",
            com.azure.core.util.Context.NONE);
    }
}
