// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.DetectorResponseProperties;
import org.junit.jupiter.api.Assertions;

public final class DetectorResponsePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DetectorResponseProperties model
            = BinaryData.fromString("{\"value\":\"z\"}").toObject(DetectorResponseProperties.class);
        Assertions.assertEquals("z", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DetectorResponseProperties model = new DetectorResponseProperties().withValue("z");
        model = BinaryData.fromObject(model).toObject(DetectorResponseProperties.class);
        Assertions.assertEquals("z", model.value());
    }
}
