// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.OperationInfo;
import org.junit.jupiter.api.Assertions;

public final class OperationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInfo model = BinaryData.fromString(
            "{\"provider\":\"ynhdwdigum\",\"resource\":\"raauzzpt\",\"operation\":\"zysdzh\",\"description\":\"wwvaiqyuvvfonk\"}")
            .toObject(OperationInfo.class);
        Assertions.assertEquals("ynhdwdigum", model.provider());
        Assertions.assertEquals("raauzzpt", model.resource());
        Assertions.assertEquals("zysdzh", model.operation());
        Assertions.assertEquals("wwvaiqyuvvfonk", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInfo model = new OperationInfo().withProvider("ynhdwdigum").withResource("raauzzpt")
            .withOperation("zysdzh").withDescription("wwvaiqyuvvfonk");
        model = BinaryData.fromObject(model).toObject(OperationInfo.class);
        Assertions.assertEquals("ynhdwdigum", model.provider());
        Assertions.assertEquals("raauzzpt", model.resource());
        Assertions.assertEquals("zysdzh", model.operation());
        Assertions.assertEquals("wwvaiqyuvvfonk", model.description());
    }
}
