// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.fluent.models.AscOperationProperties;
import java.util.HashMap;
import java.util.Map;

public final class AscOperationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AscOperationProperties model =
            BinaryData
                .fromString(
                    "{\"output\":{\"lsicohoqqnwv\":\"datalwh\",\"yxzk\":\"dataryavwhheunmmqh\",\"koklya\":\"datanoc\"}}")
                .toObject(AscOperationProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AscOperationProperties model =
            new AscOperationProperties()
                .withOutput(mapOf("lsicohoqqnwv", "datalwh", "yxzk", "dataryavwhheunmmqh", "koklya", "datanoc"));
        model = BinaryData.fromObject(model).toObject(AscOperationProperties.class);
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
