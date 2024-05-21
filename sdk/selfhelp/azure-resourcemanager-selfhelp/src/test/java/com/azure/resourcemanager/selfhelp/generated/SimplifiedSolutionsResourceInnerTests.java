// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.fluent.models.SimplifiedSolutionsResourceInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SimplifiedSolutionsResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimplifiedSolutionsResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"solutionId\":\"ymuctqhjfbebrj\",\"parameters\":{\"xfvjrbirp\":\"rfuwutt\",\"jky\":\"xepcyvahfn\",\"ljyoxgvcltb\":\"xjvuujqgidokg\"},\"title\":\"ncghkje\",\"appendix\":{\"smx\":\"hbijhtxfvgxb\",\"pvecxgodeb\":\"eh\",\"pukgriwflzlfb\":\"qkkrb\"},\"content\":\"puz\",\"provisioningState\":\"PartialComplete\"},\"id\":\"pnq\",\"name\":\"ahmgkbrp\",\"type\":\"y\"}")
            .toObject(SimplifiedSolutionsResourceInner.class);
        Assertions.assertEquals("ymuctqhjfbebrj", model.solutionId());
        Assertions.assertEquals("rfuwutt", model.parameters().get("xfvjrbirp"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimplifiedSolutionsResourceInner model = new SimplifiedSolutionsResourceInner().withSolutionId("ymuctqhjfbebrj")
            .withParameters(mapOf("xfvjrbirp", "rfuwutt", "jky", "xepcyvahfn", "ljyoxgvcltb", "xjvuujqgidokg"));
        model = BinaryData.fromObject(model).toObject(SimplifiedSolutionsResourceInner.class);
        Assertions.assertEquals("ymuctqhjfbebrj", model.solutionId());
        Assertions.assertEquals("rfuwutt", model.parameters().get("xfvjrbirp"));
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
