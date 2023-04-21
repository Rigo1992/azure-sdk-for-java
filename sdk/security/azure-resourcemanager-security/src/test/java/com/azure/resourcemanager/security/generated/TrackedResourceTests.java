// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.TrackedResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TrackedResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrackedResource model =
            BinaryData
                .fromString(
                    "{\"location\":\"rykqgaifmvikl\",\"kind\":\"dvk\",\"etag\":\"ejd\",\"tags\":{\"volvtn\":\"cvdsrhnj\"},\"id\":\"v\",\"name\":\"fzg\",\"type\":\"mjdftu\"}")
                .toObject(TrackedResource.class);
        Assertions.assertEquals("rykqgaifmvikl", model.location());
        Assertions.assertEquals("dvk", model.kind());
        Assertions.assertEquals("ejd", model.etag());
        Assertions.assertEquals("cvdsrhnj", model.tags().get("volvtn"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrackedResource model =
            new TrackedResource()
                .withLocation("rykqgaifmvikl")
                .withKind("dvk")
                .withEtag("ejd")
                .withTags(mapOf("volvtn", "cvdsrhnj"));
        model = BinaryData.fromObject(model).toObject(TrackedResource.class);
        Assertions.assertEquals("rykqgaifmvikl", model.location());
        Assertions.assertEquals("dvk", model.kind());
        Assertions.assertEquals("ejd", model.etag());
        Assertions.assertEquals("cvdsrhnj", model.tags().get("volvtn"));
    }

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
