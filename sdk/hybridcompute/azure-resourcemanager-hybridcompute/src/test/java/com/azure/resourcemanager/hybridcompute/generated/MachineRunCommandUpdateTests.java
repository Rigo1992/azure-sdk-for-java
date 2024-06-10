// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.MachineRunCommandUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MachineRunCommandUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineRunCommandUpdate model
            = BinaryData.fromString("{\"tags\":{\"lwwrl\":\"jhxbld\"}}").toObject(MachineRunCommandUpdate.class);
        Assertions.assertEquals("jhxbld", model.tags().get("lwwrl"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineRunCommandUpdate model = new MachineRunCommandUpdate().withTags(mapOf("lwwrl", "jhxbld"));
        model = BinaryData.fromObject(model).toObject(MachineRunCommandUpdate.class);
        Assertions.assertEquals("jhxbld", model.tags().get("lwwrl"));
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
