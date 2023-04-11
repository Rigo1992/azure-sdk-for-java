// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.resourcemanager.mediaservices.models.Asset;

/** Samples for Assets Update. */
public final class AssetsUpdateSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/assets-update.json
     */
    /**
     * Sample code: Update an Asset.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void updateAnAsset(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        Asset resource =
            manager
                .assets()
                .getWithResponse("contosorg", "contosomedia", "ClimbingMountBaker", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withDescription("A documentary showing the ascent of Mount Baker in HD").apply();
    }
}
