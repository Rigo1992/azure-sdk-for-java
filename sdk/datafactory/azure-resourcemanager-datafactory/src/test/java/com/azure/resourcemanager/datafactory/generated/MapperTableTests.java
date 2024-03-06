// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MapperDslConnectorProperties;
import com.azure.resourcemanager.datafactory.models.MapperTable;
import com.azure.resourcemanager.datafactory.models.MapperTableSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MapperTableTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MapperTable model = BinaryData.fromString(
            "{\"name\":\"kj\",\"properties\":{\"schema\":[{\"name\":\"abnsmj\",\"dataType\":\"ynq\"}],\"dslConnectorProperties\":[{\"name\":\"qs\",\"value\":\"datavwjtqpkevmyltjc\"},{\"name\":\"pxklurccl\",\"value\":\"dataxa\"},{\"name\":\"noytzposewxigp\",\"value\":\"datakqma\"},{\"name\":\"xvpif\",\"value\":\"dataaifyzyzeyuubeids\"}]}}")
            .toObject(MapperTable.class);
        Assertions.assertEquals("kj", model.name());
        Assertions.assertEquals("abnsmj", model.schema().get(0).name());
        Assertions.assertEquals("ynq", model.schema().get(0).dataType());
        Assertions.assertEquals("qs", model.dslConnectorProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MapperTable model = new MapperTable().withName("kj")
            .withSchema(Arrays.asList(new MapperTableSchema().withName("abnsmj").withDataType("ynq")))
            .withDslConnectorProperties(
                Arrays.asList(new MapperDslConnectorProperties().withName("qs").withValue("datavwjtqpkevmyltjc"),
                    new MapperDslConnectorProperties().withName("pxklurccl").withValue("dataxa"),
                    new MapperDslConnectorProperties().withName("noytzposewxigp").withValue("datakqma"),
                    new MapperDslConnectorProperties().withName("xvpif").withValue("dataaifyzyzeyuubeids")));
        model = BinaryData.fromObject(model).toObject(MapperTable.class);
        Assertions.assertEquals("kj", model.name());
        Assertions.assertEquals("abnsmj", model.schema().get(0).name());
        Assertions.assertEquals("ynq", model.schema().get(0).dataType());
        Assertions.assertEquals("qs", model.dslConnectorProperties().get(0).name());
    }
}
