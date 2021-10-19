// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.resourcemanager.apimanagement.models.KeyVaultContractCreateProperties;
import java.util.Arrays;

/** Samples for NamedValue CreateOrUpdate. */
public final class NamedValueCreateOrUpdateSamples {
    /*
     * operationId: NamedValue_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateNamedValue
     */
    /**
     * Sample code: ApiManagementCreateNamedValue.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateNamedValue(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .namedValues()
            .define("testprop2")
            .withExistingService("rg1", "apimService1")
            .withTags(Arrays.asList("foo", "bar"))
            .withDisplayName("prop3name")
            .withValue("propValue")
            .withSecret(false)
            .create();
    }

    /*
     * operationId: NamedValue_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateNamedValueWithKeyVault
     */
    /**
     * Sample code: ApiManagementCreateNamedValueWithKeyVault.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateNamedValueWithKeyVault(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .namedValues()
            .define("testprop6")
            .withExistingService("rg1", "apimService1")
            .withTags(Arrays.asList("foo", "bar"))
            .withDisplayName("prop6namekv")
            .withKeyVault(
                new KeyVaultContractCreateProperties()
                    .withSecretIdentifier("https://contoso.vault.azure.net/secrets/aadSecret")
                    .withIdentityClientId("ceaa6b06-c00f-43ef-99ac-f53d1fe876a0"))
            .withSecret(true)
            .create();
    }
}
