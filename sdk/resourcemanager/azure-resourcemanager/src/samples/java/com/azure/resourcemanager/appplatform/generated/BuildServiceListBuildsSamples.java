// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/** Samples for BuildService ListBuilds. */
public final class BuildServiceListBuildsSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2023-03-01-preview/examples/BuildService_ListBuilds.json
     */
    /**
     * Sample code: BuildService_ListBuilds.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void buildServiceListBuilds(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getBuildServices()
            .listBuilds("myResourceGroup", "myservice", "default", com.azure.core.util.Context.NONE);
    }
}
