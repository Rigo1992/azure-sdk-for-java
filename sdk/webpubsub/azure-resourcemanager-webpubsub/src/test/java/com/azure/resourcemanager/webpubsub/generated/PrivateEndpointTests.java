// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpoint;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpoint model = BinaryData.fromString("{\"id\":\"sbzkf\"}").toObject(PrivateEndpoint.class);
        Assertions.assertEquals("sbzkf", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpoint model = new PrivateEndpoint().withId("sbzkf");
        model = BinaryData.fromObject(model).toObject(PrivateEndpoint.class);
        Assertions.assertEquals("sbzkf", model.id());
    }
}
