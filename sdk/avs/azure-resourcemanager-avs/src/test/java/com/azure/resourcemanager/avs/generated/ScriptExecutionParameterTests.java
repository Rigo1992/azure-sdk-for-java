// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.ScriptExecutionParameter;
import org.junit.jupiter.api.Assertions;

public final class ScriptExecutionParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptExecutionParameter model =
            BinaryData
                .fromString("{\"type\":\"ScriptExecutionParameter\",\"name\":\"tppn\"}")
                .toObject(ScriptExecutionParameter.class);
        Assertions.assertEquals("tppn", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptExecutionParameter model = new ScriptExecutionParameter().withName("tppn");
        model = BinaryData.fromObject(model).toObject(ScriptExecutionParameter.class);
        Assertions.assertEquals("tppn", model.name());
    }
}
