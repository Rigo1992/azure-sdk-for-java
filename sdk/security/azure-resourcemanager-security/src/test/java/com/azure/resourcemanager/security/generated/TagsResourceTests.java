// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.TagsResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TagsResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagsResource model
            = BinaryData.fromString("{\"tags\":{\"ycjimryvwgcwwpbm\":\"oafcluqvox\"}}").toObject(TagsResource.class);
        Assertions.assertEquals("oafcluqvox", model.tags().get("ycjimryvwgcwwpbm"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagsResource model = new TagsResource().withTags(mapOf("ycjimryvwgcwwpbm", "oafcluqvox"));
        model = BinaryData.fromObject(model).toObject(TagsResource.class);
        Assertions.assertEquals("oafcluqvox", model.tags().get("ycjimryvwgcwwpbm"));
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
