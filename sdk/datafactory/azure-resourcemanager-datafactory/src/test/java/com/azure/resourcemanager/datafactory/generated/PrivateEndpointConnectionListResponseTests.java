// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.PrivateEndpointConnectionResourceInner;
import com.azure.resourcemanager.datafactory.models.ArmIdWrapper;
import com.azure.resourcemanager.datafactory.models.PrivateEndpointConnectionListResponse;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionState;
import com.azure.resourcemanager.datafactory.models.RemotePrivateEndpointConnection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"mhdroznnhdrlktg\",\"privateEndpoint\":{\"id\":\"gguxhemlwyw\"},\"privateLinkServiceConnectionState\":{\"status\":\"czg\",\"description\":\"ukklelss\",\"actionsRequired\":\"lycsxz\"}},\"name\":\"ksrl\",\"type\":\"desqplpvmjcdo\",\"etag\":\"bidyv\",\"id\":\"owx\"}],\"nextLink\":\"piudeugfsxzecpa\"}")
            .toObject(PrivateEndpointConnectionListResponse.class);
        Assertions.assertEquals("owx", model.value().get(0).id());
        Assertions.assertEquals("czg", model.value().get(0).properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ukklelss",
            model.value().get(0).properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("lycsxz",
            model.value().get(0).properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("piudeugfsxzecpa", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionListResponse model
            = new PrivateEndpointConnectionListResponse()
                .withValue(Arrays.asList(new PrivateEndpointConnectionResourceInner().withId("owx")
                    .withProperties(new RemotePrivateEndpointConnection().withPrivateEndpoint(new ArmIdWrapper())
                        .withPrivateLinkServiceConnectionState(new PrivateLinkConnectionState().withStatus("czg")
                            .withDescription("ukklelss").withActionsRequired("lycsxz")))))
                .withNextLink("piudeugfsxzecpa");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResponse.class);
        Assertions.assertEquals("owx", model.value().get(0).id());
        Assertions.assertEquals("czg", model.value().get(0).properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ukklelss",
            model.value().get(0).properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("lycsxz",
            model.value().get(0).properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("piudeugfsxzecpa", model.nextLink());
    }
}
