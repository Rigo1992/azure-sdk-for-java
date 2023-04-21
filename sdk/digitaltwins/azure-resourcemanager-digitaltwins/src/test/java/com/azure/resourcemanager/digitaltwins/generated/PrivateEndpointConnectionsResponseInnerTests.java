// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.digitaltwins.fluent.models.PrivateEndpointConnectionsResponseInner;
import com.azure.resourcemanager.digitaltwins.models.ConnectionProperties;
import java.util.Arrays;

public final class PrivateEndpointConnectionsResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionsResponseInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Disconnected\",\"groupIds\":[]},\"id\":\"xdeoejzic\",\"name\":\"ifsjttgzfbishcb\",\"type\":\"hajdeyeamdpha\"}]}")
                .toObject(PrivateEndpointConnectionsResponseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionsResponseInner model =
            new PrivateEndpointConnectionsResponseInner()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateEndpointConnectionInner()
                                .withProperties(new ConnectionProperties().withGroupIds(Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionsResponseInner.class);
    }
}
