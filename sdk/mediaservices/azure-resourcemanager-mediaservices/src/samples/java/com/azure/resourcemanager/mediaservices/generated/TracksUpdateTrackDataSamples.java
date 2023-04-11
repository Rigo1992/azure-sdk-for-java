// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/** Samples for Tracks UpdateTrackData. */
public final class TracksUpdateTrackDataSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/asset-tracks-update-data.json
     */
    /**
     * Sample code: Update the data for a tracks.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void updateTheDataForATracks(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .tracks()
            .updateTrackData(
                "contosorg", "contosomedia", "ClimbingMountRainer", "text2", com.azure.core.util.Context.NONE);
    }
}
