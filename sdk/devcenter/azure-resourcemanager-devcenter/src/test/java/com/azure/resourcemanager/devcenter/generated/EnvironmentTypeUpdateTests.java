// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.EnvironmentTypeUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class EnvironmentTypeUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnvironmentTypeUpdate model =
            BinaryData
                .fromString("{\"properties\":{\"displayName\":\"p\"},\"tags\":{\"nfyhx\":\"drqjsdpy\"}}")
                .toObject(EnvironmentTypeUpdate.class);
        Assertions.assertEquals("drqjsdpy", model.tags().get("nfyhx"));
        Assertions.assertEquals("p", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnvironmentTypeUpdate model =
            new EnvironmentTypeUpdate().withTags(mapOf("nfyhx", "drqjsdpy")).withDisplayName("p");
        model = BinaryData.fromObject(model).toObject(EnvironmentTypeUpdate.class);
        Assertions.assertEquals("drqjsdpy", model.tags().get("nfyhx"));
        Assertions.assertEquals("p", model.displayName());
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
