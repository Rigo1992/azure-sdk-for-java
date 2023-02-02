// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/** Samples for Transforms List. */
public final class TransformsListSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Encoding/stable/2022-07-01/examples/transforms-list-all-filter-by-created.json
     */
    /**
     * Sample code: Lists the Transforms filter by created.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsTheTransformsFilterByCreated(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .transforms()
            .list(
                "contosoresources",
                "contosomedia",
                "properties/created gt 2021-06-01T00:00:00.0000000Z and properties/created le"
                    + " 2021-06-01T00:00:10.0000000Z",
                "properties/created",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Encoding/stable/2022-07-01/examples/transforms-list-all-filter-by-name.json
     */
    /**
     * Sample code: Lists the Transforms filter by name.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsTheTransformsFilterByName(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .transforms()
            .list(
                "contosoresources",
                "contosomedia",
                "(name eq 'sampleEncode') or (name eq 'sampleEncodeAndVideoIndex')",
                "name desc",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Encoding/stable/2022-07-01/examples/transforms-list-all-filter-by-lastmodified.json
     */
    /**
     * Sample code: Lists the Transforms filter by lastmodified.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsTheTransformsFilterByLastmodified(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .transforms()
            .list(
                "contosoresources",
                "contosomedia",
                "properties/lastmodified gt 2021-06-01T00:00:00.0000000Z and properties/lastmodified le"
                    + " 2021-06-01T00:00:10.0000000Z",
                "properties/lastmodified desc",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Encoding/stable/2022-07-01/examples/transforms-list-all.json
     */
    /**
     * Sample code: Lists the Transforms.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsTheTransforms(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.transforms().list("contosoresources", "contosomedia", null, null, com.azure.core.util.Context.NONE);
    }
}
