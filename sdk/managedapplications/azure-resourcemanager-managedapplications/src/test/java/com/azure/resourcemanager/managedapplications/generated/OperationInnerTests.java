// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.fluent.models.OperationInner;
import com.azure.resourcemanager.managedapplications.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"esaagdfm\",\"display\":{\"provider\":\"lhjxr\",\"resource\":\"kwm\",\"operation\":\"ktsizntocipaou\"}}")
                .toObject(OperationInner.class);
        Assertions.assertEquals("esaagdfm", model.name());
        Assertions.assertEquals("lhjxr", model.display().provider());
        Assertions.assertEquals("kwm", model.display().resource());
        Assertions.assertEquals("ktsizntocipaou", model.display().operation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model =
            new OperationInner()
                .withName("esaagdfm")
                .withDisplay(
                    new OperationDisplay().withProvider("lhjxr").withResource("kwm").withOperation("ktsizntocipaou"));
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals("esaagdfm", model.name());
        Assertions.assertEquals("lhjxr", model.display().provider());
        Assertions.assertEquals("kwm", model.display().resource());
        Assertions.assertEquals("ktsizntocipaou", model.display().operation());
    }
}
