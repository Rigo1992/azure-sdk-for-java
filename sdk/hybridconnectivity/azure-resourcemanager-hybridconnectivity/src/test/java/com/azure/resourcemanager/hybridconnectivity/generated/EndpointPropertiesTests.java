// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridconnectivity.models.EndpointProperties;
import com.azure.resourcemanager.hybridconnectivity.models.Type;
import org.junit.jupiter.api.Assertions;

public final class EndpointPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointProperties model =
            BinaryData
                .fromString(
                    "{\"type\":\"custom\",\"resourceId\":\"dmailzydehojw\",\"provisioningState\":\"huxinpmqnj\"}")
                .toObject(EndpointProperties.class);
        Assertions.assertEquals(Type.CUSTOM, model.type());
        Assertions.assertEquals("dmailzydehojw", model.resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointProperties model = new EndpointProperties().withType(Type.CUSTOM).withResourceId("dmailzydehojw");
        model = BinaryData.fromObject(model).toObject(EndpointProperties.class);
        Assertions.assertEquals(Type.CUSTOM, model.type());
        Assertions.assertEquals("dmailzydehojw", model.resourceId());
    }
}
