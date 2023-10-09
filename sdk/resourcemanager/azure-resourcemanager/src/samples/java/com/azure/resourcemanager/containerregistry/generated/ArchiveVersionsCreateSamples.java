// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for ArchiveVersions Create. */
public final class ArchiveVersionsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-08-01-preview/examples/ArchiveVersionCreate.json
     */
    /**
     * Sample code: ArchiveVersionCreate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void archiveVersionCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getArchiveVersions()
            .create(
                "myResourceGroup",
                "myRegistry",
                "rpm",
                "myArchiveName",
                "myArchiveVersionName",
                com.azure.core.util.Context.NONE);
    }
}
