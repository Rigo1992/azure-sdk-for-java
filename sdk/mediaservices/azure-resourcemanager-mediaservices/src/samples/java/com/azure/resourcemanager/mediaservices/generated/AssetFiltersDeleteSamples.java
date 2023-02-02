// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/** Samples for AssetFilters Delete. */
public final class AssetFiltersDeleteSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/assetFilters-delete.json
     */
    /**
     * Sample code: Delete an Asset Filter.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void deleteAnAssetFilter(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .assetFilters()
            .deleteWithResponse(
                "contoso",
                "contosomedia",
                "ClimbingMountRainer",
                "assetFilterWithTimeWindowAndTrack",
                com.azure.core.util.Context.NONE);
    }
}
