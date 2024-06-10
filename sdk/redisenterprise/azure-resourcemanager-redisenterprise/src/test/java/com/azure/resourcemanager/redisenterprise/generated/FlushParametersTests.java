// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.models.FlushParameters;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FlushParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FlushParameters model = BinaryData.fromString("{\"ids\":[\"wgipwhono\"]}").toObject(FlushParameters.class);
        Assertions.assertEquals("wgipwhono", model.ids().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FlushParameters model = new FlushParameters().withIds(Arrays.asList("wgipwhono"));
        model = BinaryData.fromObject(model).toObject(FlushParameters.class);
        Assertions.assertEquals("wgipwhono", model.ids().get(0));
    }
}
