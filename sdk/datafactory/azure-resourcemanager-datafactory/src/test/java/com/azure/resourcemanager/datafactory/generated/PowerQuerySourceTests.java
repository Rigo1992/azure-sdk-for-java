// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.PowerQuerySource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PowerQuerySourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PowerQuerySource model = BinaryData.fromString(
            "{\"script\":\"krehyhtmj\",\"schemaLinkedService\":{\"referenceName\":\"uif\",\"parameters\":{\"gdezvjqwahoy\":\"dataxfaryrvj\",\"nvovbooqbmdqrxy\":\"datayaxqvjweiwtczkd\"}},\"name\":\"laetscflwtjdtlr\",\"description\":\"fooy\",\"dataset\":{\"referenceName\":\"uxdtzcq\",\"parameters\":{\"lantolamlb\":\"datadudgcozzomeh\",\"z\":\"datajuxkqll\"}},\"linkedService\":{\"referenceName\":\"vwdtgckzdqiqdl\",\"parameters\":{\"uwxsuykznhrfgsl\":\"datarkwxo\",\"eo\":\"datalhpryjfzihuio\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"jtfeyvkbdgddkr\",\"datasetParameters\":\"dataccxbeuuqutkz\",\"parameters\":{\"xfn\":\"datawwguzytij\",\"ckcatuqbhpo\":\"datandegjdydhqkkkbj\",\"toakatprytgrhz\":\"datacnxtpzdlysei\",\"wrp\":\"dataqfdpf\"},\"\":{\"tbqgdirdamm\":\"datashtkutzc\",\"bwjjirmuydgf\":\"datazjgcfjfx\",\"uoft\":\"datatmdofgeoag\",\"aj\":\"dataxodwxm\"}}}")
            .toObject(PowerQuerySource.class);
        Assertions.assertEquals("laetscflwtjdtlr", model.name());
        Assertions.assertEquals("fooy", model.description());
        Assertions.assertEquals("uxdtzcq", model.dataset().referenceName());
        Assertions.assertEquals("vwdtgckzdqiqdl", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("jtfeyvkbdgddkr", model.flowlet().referenceName());
        Assertions.assertEquals("uif", model.schemaLinkedService().referenceName());
        Assertions.assertEquals("krehyhtmj", model.script());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PowerQuerySource model = new PowerQuerySource().withName("laetscflwtjdtlr")
            .withDescription("fooy")
            .withDataset(new DatasetReference().withReferenceName("uxdtzcq")
                .withParameters(mapOf("lantolamlb", "datadudgcozzomeh", "z", "datajuxkqll")))
            .withLinkedService(new LinkedServiceReference().withReferenceName("vwdtgckzdqiqdl")
                .withParameters(mapOf("uwxsuykznhrfgsl", "datarkwxo", "eo", "datalhpryjfzihuio")))
            .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                .withReferenceName("jtfeyvkbdgddkr")
                .withDatasetParameters("dataccxbeuuqutkz")
                .withParameters(mapOf("xfn", "datawwguzytij", "ckcatuqbhpo", "datandegjdydhqkkkbj", "toakatprytgrhz",
                    "datacnxtpzdlysei", "wrp", "dataqfdpf"))
                .withAdditionalProperties(mapOf()))
            .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("uif")
                .withParameters(mapOf("gdezvjqwahoy", "dataxfaryrvj", "nvovbooqbmdqrxy", "datayaxqvjweiwtczkd")))
            .withScript("krehyhtmj");
        model = BinaryData.fromObject(model).toObject(PowerQuerySource.class);
        Assertions.assertEquals("laetscflwtjdtlr", model.name());
        Assertions.assertEquals("fooy", model.description());
        Assertions.assertEquals("uxdtzcq", model.dataset().referenceName());
        Assertions.assertEquals("vwdtgckzdqiqdl", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("jtfeyvkbdgddkr", model.flowlet().referenceName());
        Assertions.assertEquals("uif", model.schemaLinkedService().referenceName());
        Assertions.assertEquals("krehyhtmj", model.script());
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
