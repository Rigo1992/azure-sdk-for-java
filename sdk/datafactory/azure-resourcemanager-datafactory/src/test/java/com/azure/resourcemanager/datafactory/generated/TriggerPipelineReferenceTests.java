// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TriggerPipelineReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TriggerPipelineReference model = BinaryData.fromString(
            "{\"pipelineReference\":{\"referenceName\":\"wkpphefsb\",\"name\":\"lbzxomeikjc\"},\"parameters\":{\"qbxyxoyfpuqqi\":\"dataacnmwpfsuqtaaz\"}}")
            .toObject(TriggerPipelineReference.class);
        Assertions.assertEquals("wkpphefsb", model.pipelineReference().referenceName());
        Assertions.assertEquals("lbzxomeikjc", model.pipelineReference().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TriggerPipelineReference model = new TriggerPipelineReference()
            .withPipelineReference(new PipelineReference().withReferenceName("wkpphefsb").withName("lbzxomeikjc"))
            .withParameters(mapOf("qbxyxoyfpuqqi", "dataacnmwpfsuqtaaz"));
        model = BinaryData.fromObject(model).toObject(TriggerPipelineReference.class);
        Assertions.assertEquals("wkpphefsb", model.pipelineReference().referenceName());
        Assertions.assertEquals("lbzxomeikjc", model.pipelineReference().name());
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
