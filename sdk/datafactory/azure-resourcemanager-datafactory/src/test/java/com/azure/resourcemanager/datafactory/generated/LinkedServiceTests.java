// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LinkedServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LinkedService model = BinaryData.fromString(
            "{\"type\":\"LinkedService\",\"connectVia\":{\"referenceName\":\"tdum\",\"parameters\":{\"hjpglkf\":\"datapxebmnzbt\"}},\"description\":\"hdneuelfph\",\"parameters\":{\"uvxzxclvi\":{\"type\":\"Array\",\"defaultValue\":\"dataozfikdowwq\"},\"dsjnka\":{\"type\":\"String\",\"defaultValue\":\"dataqzonosggbhcohf\"},\"k\":{\"type\":\"String\",\"defaultValue\":\"datatiiswacffg\"},\"ppfufl\":{\"type\":\"Bool\",\"defaultValue\":\"datawkfvhqcrailvp\"}},\"annotations\":[\"datamh\",\"datalxyjr\",\"datasag\"],\"\":{\"bcvkcvqvpkeq\":\"datanihgwqapnedg\",\"obzdopcjwvnhdl\":\"datacvdrhvoodsot\",\"mutwuoe\":\"datawmgxcxrsl\",\"yqsluic\":\"datarpkhjwn\"}}")
            .toObject(LinkedService.class);
        Assertions.assertEquals("tdum", model.connectVia().referenceName());
        Assertions.assertEquals("hdneuelfph", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("uvxzxclvi").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LinkedService model = new LinkedService()
            .withConnectVia(new IntegrationRuntimeReference()
                .withReferenceName("tdum").withParameters(mapOf("hjpglkf", "datapxebmnzbt")))
            .withDescription("hdneuelfph")
            .withParameters(mapOf("uvxzxclvi",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("dataozfikdowwq"), "dsjnka",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataqzonosggbhcohf"), "k",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datatiiswacffg"),
                "ppfufl",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datawkfvhqcrailvp")))
            .withAnnotations(Arrays.asList("datamh", "datalxyjr", "datasag"))
            .withAdditionalProperties(mapOf("type", "LinkedService"));
        model = BinaryData.fromObject(model).toObject(LinkedService.class);
        Assertions.assertEquals("tdum", model.connectVia().referenceName());
        Assertions.assertEquals("hdneuelfph", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("uvxzxclvi").type());
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
