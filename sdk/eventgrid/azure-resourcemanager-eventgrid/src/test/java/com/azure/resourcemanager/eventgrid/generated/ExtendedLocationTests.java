// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.ExtendedLocation;
import org.junit.jupiter.api.Assertions;

public final class ExtendedLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExtendedLocation model = BinaryData.fromString("{\"name\":\"uskbrreq\",\"type\":\"kceysfaqegplw\"}")
            .toObject(ExtendedLocation.class);
        Assertions.assertEquals("uskbrreq", model.name());
        Assertions.assertEquals("kceysfaqegplw", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExtendedLocation model = new ExtendedLocation().withName("uskbrreq").withType("kceysfaqegplw");
        model = BinaryData.fromObject(model).toObject(ExtendedLocation.class);
        Assertions.assertEquals("uskbrreq", model.name());
        Assertions.assertEquals("kceysfaqegplw", model.type());
    }
}
