// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for ApiPortalCustomDomains List.
 */
public final class ApiPortalCustomDomainsListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * ApiPortalCustomDomains_List.json
     */
    /**
     * Sample code: ApiPortalCustomDomains_List.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void apiPortalCustomDomainsList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices().manager().serviceClient().getApiPortalCustomDomains().list("myResourceGroup",
            "myservice", "default", com.azure.core.util.Context.NONE);
    }
}
