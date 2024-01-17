// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/** Samples for Profiles Delete. */
public final class ProfilesDeleteSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Profiles_Delete.json
     */
    /**
     * Sample code: Profiles_Delete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void profilesDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getProfiles()
            .delete("RG", "profile1", com.azure.core.util.Context.NONE);
    }
}
