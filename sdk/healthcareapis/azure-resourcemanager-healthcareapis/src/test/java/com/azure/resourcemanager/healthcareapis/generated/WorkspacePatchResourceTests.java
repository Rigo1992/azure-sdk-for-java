// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.WorkspacePatchResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkspacePatchResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspacePatchResource model = BinaryData.fromString(
            "{\"tags\":{\"yzydagfuaxbezyi\":\"dsfcpkvxodpuoz\",\"ywqsmbsurexim\":\"okktwhrdxw\",\"stkiiuxhqyud\":\"ryocfsfksymdd\",\"rq\":\"o\"}}")
            .toObject(WorkspacePatchResource.class);
        Assertions.assertEquals("dsfcpkvxodpuoz", model.tags().get("yzydagfuaxbezyi"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspacePatchResource model = new WorkspacePatchResource().withTags(mapOf("yzydagfuaxbezyi", "dsfcpkvxodpuoz",
            "ywqsmbsurexim", "okktwhrdxw", "stkiiuxhqyud", "ryocfsfksymdd", "rq", "o"));
        model = BinaryData.fromObject(model).toObject(WorkspacePatchResource.class);
        Assertions.assertEquals("dsfcpkvxodpuoz", model.tags().get("yzydagfuaxbezyi"));
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
