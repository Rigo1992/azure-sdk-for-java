// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/** Samples for AssetFilters List. */
public final class AssetFiltersListSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/assetFilters-list-all.json
     */
    /**
     * Sample code: List all Asset Filters.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listAllAssetFilters(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.assetFilters().list("contoso", "contosomedia", "ClimbingMountRainer", com.azure.core.util.Context.NONE);
    }
}
