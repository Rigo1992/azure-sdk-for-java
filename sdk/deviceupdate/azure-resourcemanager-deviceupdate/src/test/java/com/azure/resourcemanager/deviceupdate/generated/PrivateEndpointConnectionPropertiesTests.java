// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.deviceupdate.models.PrivateEndpoint;
import com.azure.resourcemanager.deviceupdate.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkServiceConnectionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model = BinaryData.fromString(
            "{\"privateEndpoint\":{\"id\":\"bpf\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"n\",\"actionsRequired\":\"v\"},\"groupIds\":[\"rwzoxxjtfelluwf\",\"it\"],\"provisioningState\":\"Deleting\"}")
            .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("n", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("v", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("rwzoxxjtfelluwf", model.groupIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model
            = new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                        .withDescription("n").withActionsRequired("v"))
                .withGroupIds(Arrays.asList("rwzoxxjtfelluwf", "it"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("n", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("v", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("rwzoxxjtfelluwf", model.groupIds().get(0));
    }
}
