// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.CustomDnsSuffixConfigurationInner;

/**
 * Samples for AppServiceEnvironments UpdateAseCustomDnsSuffixConfiguration.
 */
public final class AppServiceEnvironmentsUpdateAseCustomDnsSuffixConfigurationSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/UpdateAseCustomDnsSuffixConfiguration.json
     */
    /**
     * Sample code: Update ASE custom DNS suffix configuration.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateASECustomDNSSuffixConfiguration(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .updateAseCustomDnsSuffixConfigurationWithResponse("test-rg", "test-ase",
                new CustomDnsSuffixConfigurationInner().withDnsSuffix("contoso.com")
                    .withCertificateUrl("https://test-kv.vault.azure.net/secrets/contosocert")
                    .withKeyVaultReferenceIdentity("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
