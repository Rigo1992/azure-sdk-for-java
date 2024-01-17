// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureMariaDBTableDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMariaDBTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMariaDBTableDataset model = BinaryData.fromString(
            "{\"type\":\"AzureMariaDBTable\",\"typeProperties\":{\"tableName\":\"datatn\"},\"description\":\"jewihcigaahm\",\"structure\":\"dataspkdnx\",\"schema\":\"dataz\",\"linkedServiceName\":{\"referenceName\":\"tertnzrrwsc\",\"parameters\":{\"nvtolzj\":\"datahdwi\",\"haknklthqwppv\":\"datafkryxs\"}},\"parameters\":{\"bkabhvxjuaivx\":{\"type\":\"Int\",\"defaultValue\":\"datarvpvdrohul\"},\"kg\":{\"type\":\"Array\",\"defaultValue\":\"datarnygti\"},\"rxzpqditu\":{\"type\":\"Bool\",\"defaultValue\":\"datamkphvdl\"},\"e\":{\"type\":\"String\",\"defaultValue\":\"datatfcieil\"}},\"annotations\":[\"datakehldopjsxvbbwsg\",\"datakkmibnmdp\",\"datad\",\"datapwtgzwmzhcmrloqa\"],\"folder\":{\"name\":\"yzavky\"},\"\":{\"bngzldvvd\":\"dataudnmbj\",\"pmq\":\"dataoptythctoxo\",\"sfzsgzgus\":\"dataerwhemvids\"}}")
            .toObject(AzureMariaDBTableDataset.class);
        Assertions.assertEquals("jewihcigaahm", model.description());
        Assertions.assertEquals("tertnzrrwsc", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("bkabhvxjuaivx").type());
        Assertions.assertEquals("yzavky", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMariaDBTableDataset model = new AzureMariaDBTableDataset().withDescription("jewihcigaahm")
            .withStructure("dataspkdnx").withSchema("dataz")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("tertnzrrwsc")
                .withParameters(mapOf("nvtolzj", "datahdwi", "haknklthqwppv", "datafkryxs")))
            .withParameters(mapOf("bkabhvxjuaivx",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datarvpvdrohul"), "kg",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datarnygti"), "rxzpqditu",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datamkphvdl"), "e",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datatfcieil")))
            .withAnnotations(Arrays.asList("datakehldopjsxvbbwsg", "datakkmibnmdp", "datad", "datapwtgzwmzhcmrloqa"))
            .withFolder(new DatasetFolder().withName("yzavky")).withTableName("datatn");
        model = BinaryData.fromObject(model).toObject(AzureMariaDBTableDataset.class);
        Assertions.assertEquals("jewihcigaahm", model.description());
        Assertions.assertEquals("tertnzrrwsc", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("bkabhvxjuaivx").type());
        Assertions.assertEquals("yzavky", model.folder().name());
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
