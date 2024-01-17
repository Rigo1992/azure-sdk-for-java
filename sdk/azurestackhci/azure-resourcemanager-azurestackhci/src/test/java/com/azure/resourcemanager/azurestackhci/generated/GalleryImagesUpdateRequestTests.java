// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.GalleryImagesUpdateRequest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GalleryImagesUpdateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GalleryImagesUpdateRequest model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"anzwuxzdxta\":\"y\",\"hfpmrqobmtukknr\":\"rlhm\",\"gnwzsymglzufc\":\"rtihfxtijbpz\",\"hdbihan\":\"zk\"}}")
                .toObject(GalleryImagesUpdateRequest.class);
        Assertions.assertEquals("y", model.tags().get("anzwuxzdxta"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GalleryImagesUpdateRequest model =
            new GalleryImagesUpdateRequest()
                .withTags(
                    mapOf(
                        "anzwuxzdxta",
                        "y",
                        "hfpmrqobmtukknr",
                        "rlhm",
                        "gnwzsymglzufc",
                        "rtihfxtijbpz",
                        "hdbihan",
                        "zk"));
        model = BinaryData.fromObject(model).toObject(GalleryImagesUpdateRequest.class);
        Assertions.assertEquals("y", model.tags().get("anzwuxzdxta"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
