// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for ResourceHealthMetadata ListBySite. */
public final class ResourceHealthMetadataListBySiteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/ListResourceHealthMetadataBySite.json
     */
    /**
     * Sample code: List ResourceHealthMetadata for a site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listResourceHealthMetadataForASite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getResourceHealthMetadatas()
            .listBySite("Default-Web-NorthCentralUS", "newsiteinnewASE-NCUS", Context.NONE);
    }
}
