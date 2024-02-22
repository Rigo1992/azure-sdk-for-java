// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpoint;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.elasticsan.models.PrivateLinkServiceConnectionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"privateEndpoint\":{\"id\":\"tjixhbkuofqweyk\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"evfyexfwhybcib\",\"actionsRequired\":\"vdcsitynn\"},\"groupIds\":[\"dectehfiqsc\",\"eypvhezrkg\",\"hcjrefovgmk\",\"sle\"]},\"id\":\"vxyqjpkcattpngjc\",\"name\":\"cczsq\",\"type\":\"jh\"}")
            .toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("evfyexfwhybcib", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("vdcsitynn", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("dectehfiqsc", model.groupIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionInner model
            = new PrivateEndpointConnectionInner().withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                        .withDescription("evfyexfwhybcib").withActionsRequired("vdcsitynn"))
                .withGroupIds(Arrays.asList("dectehfiqsc", "eypvhezrkg", "hcjrefovgmk", "sle"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("evfyexfwhybcib", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("vdcsitynn", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("dectehfiqsc", model.groupIds().get(0));
    }
}
