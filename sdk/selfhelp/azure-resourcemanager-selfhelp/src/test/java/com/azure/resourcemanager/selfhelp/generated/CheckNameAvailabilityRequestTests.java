// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.models.CheckNameAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityRequest model =
            BinaryData.fromString("{\"name\":\"a\",\"type\":\"th\"}").toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("a", model.name());
        Assertions.assertEquals("th", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityRequest model = new CheckNameAvailabilityRequest().withName("a").withType("th");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("a", model.name());
        Assertions.assertEquals("th", model.type());
    }
}
