// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.FunctionBinding;

public final class FunctionBindingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FunctionBinding model = BinaryData.fromString("{\"type\":\"FunctionBinding\"}").toObject(FunctionBinding.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FunctionBinding model = new FunctionBinding();
        model = BinaryData.fromObject(model).toObject(FunctionBinding.class);
    }
}
