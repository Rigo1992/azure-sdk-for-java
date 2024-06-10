// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for AppServiceEnvironments DeleteAseCustomDnsSuffixConfiguration.
 */
public final class AppServiceEnvironmentsDeleteAseCustomDnsSuffixConfigurationSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/DeleteAseCustomDnsSuffixConfiguration.json
     */
    /**
     * Sample code: Delete ASE custom DNS suffix configuration.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteASECustomDNSSuffixConfiguration(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .deleteAseCustomDnsSuffixConfigurationWithResponse("test-rg", "test-ase", com.azure.core.util.Context.NONE);
    }
}
