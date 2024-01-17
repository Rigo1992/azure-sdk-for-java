// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointConnectionDataModel;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointProperty;
import com.azure.resourcemanager.hybridcompute.models.PrivateLinkServiceConnectionStateProperty;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionDataModelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionDataModel model =
            BinaryData
                .fromString(
                    "{\"id\":\"ky\",\"name\":\"beddgssofw\",\"type\":\"zqalkrmnjijpx\",\"properties\":{\"privateEndpoint\":{\"id\":\"udfnbyxba\"},\"privateLinkServiceConnectionState\":{\"status\":\"bjyvay\",\"description\":\"fimrzrtuzqogse\",\"actionsRequired\":\"evfdnwnwm\"},\"provisioningState\":\"zsyyceuzso\",\"groupIds\":[\"ud\",\"frxtrthzvaytdwk\"]}}")
                .toObject(PrivateEndpointConnectionDataModel.class);
        Assertions.assertEquals("udfnbyxba", model.properties().privateEndpoint().id());
        Assertions.assertEquals("bjyvay", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("fimrzrtuzqogse", model.properties().privateLinkServiceConnectionState().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionDataModel model =
            new PrivateEndpointConnectionDataModel()
                .withProperties(
                    new PrivateEndpointConnectionProperties()
                        .withPrivateEndpoint(new PrivateEndpointProperty().withId("udfnbyxba"))
                        .withPrivateLinkServiceConnectionState(
                            new PrivateLinkServiceConnectionStateProperty()
                                .withStatus("bjyvay")
                                .withDescription("fimrzrtuzqogse")));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionDataModel.class);
        Assertions.assertEquals("udfnbyxba", model.properties().privateEndpoint().id());
        Assertions.assertEquals("bjyvay", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("fimrzrtuzqogse", model.properties().privateLinkServiceConnectionState().description());
    }
}
