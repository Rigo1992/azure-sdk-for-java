// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"ummajtjaod\",\"resource\":\"bnbdxkqpxokajion\",\"operation\":\"mexgstxgcp\",\"description\":\"gmaajrm\"}")
                .toObject(OperationDisplay.class);
        Assertions.assertEquals("ummajtjaod", model.provider());
        Assertions.assertEquals("bnbdxkqpxokajion", model.resource());
        Assertions.assertEquals("mexgstxgcp", model.operation());
        Assertions.assertEquals("gmaajrm", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model =
            new OperationDisplay()
                .withProvider("ummajtjaod")
                .withResource("bnbdxkqpxokajion")
                .withOperation("mexgstxgcp")
                .withDescription("gmaajrm");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("ummajtjaod", model.provider());
        Assertions.assertEquals("bnbdxkqpxokajion", model.resource());
        Assertions.assertEquals("mexgstxgcp", model.operation());
        Assertions.assertEquals("gmaajrm", model.description());
    }
}
