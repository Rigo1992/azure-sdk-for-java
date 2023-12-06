// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.HubspotObjectDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HubspotObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HubspotObjectDataset model = BinaryData.fromString(
            "{\"type\":\"HubspotObject\",\"typeProperties\":{\"tableName\":\"dataqixpsybq\"},\"description\":\"gvmxwbohxd\",\"structure\":\"dataoexb\",\"schema\":\"datagnaka\",\"linkedServiceName\":{\"referenceName\":\"wscmneev\",\"parameters\":{\"yhmgq\":\"dataqeumz\",\"gbzgfhzdzahktxv\":\"dataeivjqutxr\",\"pxjvtwk\":\"databicfecthotbkjwhz\",\"pqiwuzr\":\"datajdpayx\"}},\"parameters\":{\"qqjobsyn\":{\"type\":\"Float\",\"defaultValue\":\"datafkgb\"},\"q\":{\"type\":\"Object\",\"defaultValue\":\"dataion\"},\"sxjwfudmpfh\":{\"type\":\"Int\",\"defaultValue\":\"datae\"}},\"annotations\":[\"datap\",\"datatjtntc\",\"datagpdbbglaecc\",\"dataokfsp\"],\"folder\":{\"name\":\"ds\"},\"\":{\"prftyptwjwiyyeoh\":\"datar\"}}")
            .toObject(HubspotObjectDataset.class);
        Assertions.assertEquals("gvmxwbohxd", model.description());
        Assertions.assertEquals("wscmneev", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("qqjobsyn").type());
        Assertions.assertEquals("ds", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HubspotObjectDataset model
            = new HubspotObjectDataset().withDescription("gvmxwbohxd").withStructure("dataoexb").withSchema("datagnaka")
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("wscmneev")
                    .withParameters(mapOf("yhmgq", "dataqeumz", "gbzgfhzdzahktxv", "dataeivjqutxr", "pxjvtwk",
                        "databicfecthotbkjwhz", "pqiwuzr", "datajdpayx")))
                .withParameters(mapOf("qqjobsyn",
                    new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datafkgb"), "q",
                    new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("dataion"),
                    "sxjwfudmpfh", new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datae")))
                .withAnnotations(Arrays.asList("datap", "datatjtntc", "datagpdbbglaecc", "dataokfsp"))
                .withFolder(new DatasetFolder().withName("ds")).withTableName("dataqixpsybq");
        model = BinaryData.fromObject(model).toObject(HubspotObjectDataset.class);
        Assertions.assertEquals("gvmxwbohxd", model.description());
        Assertions.assertEquals("wscmneev", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("qqjobsyn").type());
        Assertions.assertEquals("ds", model.folder().name());
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
