// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrivateEndpoint;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"groupIds\":[\"dytdxwitx\",\"rjaw\"],\"privateEndpoint\":{\"id\":\"gxhnisk\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"py\",\"actionsRequired\":\"klwndnhjdauwhv\"},\"provisioningState\":\"Creating\"},\"id\":\"btdhxujznbm\",\"name\":\"ow\",\"type\":\"wpr\"}")
                .toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("py", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("klwndnhjdauwhv", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionInner model =
            new PrivateEndpointConnectionInner()
                .withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("py")
                        .withActionsRequired("klwndnhjdauwhv"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("py", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("klwndnhjdauwhv", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
