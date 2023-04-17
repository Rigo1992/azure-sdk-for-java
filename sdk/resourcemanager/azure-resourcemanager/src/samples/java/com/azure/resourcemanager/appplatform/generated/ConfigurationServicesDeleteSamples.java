// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/** Samples for ConfigurationServices Delete. */
public final class ConfigurationServicesDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2023-03-01-preview/examples/ConfigurationServices_Delete.json
     */
    /**
     * Sample code: ConfigurationServices_Delete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void configurationServicesDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getConfigurationServices()
            .delete("myResourceGroup", "myservice", "default", com.azure.core.util.Context.NONE);
    }
}
