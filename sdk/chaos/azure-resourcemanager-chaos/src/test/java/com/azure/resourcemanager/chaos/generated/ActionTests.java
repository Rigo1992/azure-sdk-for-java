// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.Action;
import org.junit.jupiter.api.Assertions;

public final class ActionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Action model = BinaryData.fromString("{\"type\":\"Action\",\"name\":\"ucww\"}").toObject(Action.class);
        Assertions.assertEquals("ucww", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Action model = new Action().withName("ucww");
        model = BinaryData.fromObject(model).toObject(Action.class);
        Assertions.assertEquals("ucww", model.name());
    }
}