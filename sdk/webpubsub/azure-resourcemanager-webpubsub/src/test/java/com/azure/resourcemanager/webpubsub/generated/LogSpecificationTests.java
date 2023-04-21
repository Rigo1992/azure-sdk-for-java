// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.LogSpecification;
import org.junit.jupiter.api.Assertions;

public final class LogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogSpecification model =
            BinaryData
                .fromString("{\"name\":\"iksqr\",\"displayName\":\"ssainqpjwnzll\"}")
                .toObject(LogSpecification.class);
        Assertions.assertEquals("iksqr", model.name());
        Assertions.assertEquals("ssainqpjwnzll", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogSpecification model = new LogSpecification().withName("iksqr").withDisplayName("ssainqpjwnzll");
        model = BinaryData.fromObject(model).toObject(LogSpecification.class);
        Assertions.assertEquals("iksqr", model.name());
        Assertions.assertEquals("ssainqpjwnzll", model.displayName());
    }
}
