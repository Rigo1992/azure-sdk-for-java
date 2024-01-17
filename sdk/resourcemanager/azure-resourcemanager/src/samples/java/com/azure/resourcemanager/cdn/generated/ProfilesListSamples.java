// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/** Samples for Profiles List. */
public final class ProfilesListSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Profiles_List.json
     */
    /**
     * Sample code: Profiles_List.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void profilesList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cdnProfiles().manager().serviceClient().getProfiles().list(com.azure.core.util.Context.NONE);
    }
}
