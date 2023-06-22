// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AbsoluteDeleteOption;
import org.junit.jupiter.api.Assertions;

public final class AbsoluteDeleteOptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AbsoluteDeleteOption model =
            BinaryData
                .fromString("{\"objectType\":\"AbsoluteDeleteOption\",\"duration\":\"yf\"}")
                .toObject(AbsoluteDeleteOption.class);
        Assertions.assertEquals("yf", model.duration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AbsoluteDeleteOption model = new AbsoluteDeleteOption().withDuration("yf");
        model = BinaryData.fromObject(model).toObject(AbsoluteDeleteOption.class);
        Assertions.assertEquals("yf", model.duration());
    }
}
