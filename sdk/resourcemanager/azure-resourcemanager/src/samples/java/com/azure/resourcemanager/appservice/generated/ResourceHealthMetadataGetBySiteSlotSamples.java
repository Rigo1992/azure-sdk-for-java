// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for ResourceHealthMetadata GetBySiteSlot. */
public final class ResourceHealthMetadataGetBySiteSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/GetResourceHealthMetadataBySite.json
     */
    /**
     * Sample code: Get ResourceHealthMetadata.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getResourceHealthMetadata(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getResourceHealthMetadatas()
            .getBySiteSlotWithResponse(
                "Default-Web-NorthCentralUS", "newsiteinnewASE-NCUS", "Production", Context.NONE);
    }
}
