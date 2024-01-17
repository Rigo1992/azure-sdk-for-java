// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/** Samples for Origins Delete. */
public final class OriginsDeleteSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Origins_Delete.json
     */
    /**
     * Sample code: Origins_Delete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void originsDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getOrigins()
            .delete("RG", "profile1", "endpoint1", "origin1", com.azure.core.util.Context.NONE);
    }
}
