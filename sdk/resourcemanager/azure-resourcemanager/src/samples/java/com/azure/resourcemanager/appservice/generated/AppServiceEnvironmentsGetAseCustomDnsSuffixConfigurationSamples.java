// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for AppServiceEnvironments GetAseCustomDnsSuffixConfiguration.
 */
public final class AppServiceEnvironmentsGetAseCustomDnsSuffixConfigurationSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetAseCustomDnsSuffixConfiguration.json
     */
    /**
     * Sample code: Get ASE custom DNS suffix configuration.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getASECustomDNSSuffixConfiguration(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .getAseCustomDnsSuffixConfigurationWithResponse("test-rg", "test-ase", com.azure.core.util.Context.NONE);
    }
}
