// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.TaggedResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TaggedResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TaggedResource model = BinaryData.fromString(
            "{\"tags\":{\"zj\":\"gwdkcglhsl\"},\"location\":\"ggd\",\"etag\":\"ixhbkuofqweykhm\",\"id\":\"n\",\"name\":\"vfyexfw\",\"type\":\"ybcibvyvdcsit\"}")
            .toObject(TaggedResource.class);
        Assertions.assertEquals("ixhbkuofqweykhm", model.etag());
        Assertions.assertEquals("ggd", model.location());
        Assertions.assertEquals("gwdkcglhsl", model.tags().get("zj"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TaggedResource model
            = new TaggedResource().withEtag("ixhbkuofqweykhm").withLocation("ggd").withTags(mapOf("zj", "gwdkcglhsl"));
        model = BinaryData.fromObject(model).toObject(TaggedResource.class);
        Assertions.assertEquals("ixhbkuofqweykhm", model.etag());
        Assertions.assertEquals("ggd", model.location());
        Assertions.assertEquals("gwdkcglhsl", model.tags().get("zj"));
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
