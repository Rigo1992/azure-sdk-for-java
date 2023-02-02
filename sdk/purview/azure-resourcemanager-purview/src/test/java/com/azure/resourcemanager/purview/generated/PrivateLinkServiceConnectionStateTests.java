// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.purview.models.Status;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString("{\"actionsRequired\":\"bqidtqaj\",\"description\":\"ulpkudjkrl\",\"status\":\"Approved\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals("bqidtqaj", model.actionsRequired());
        Assertions.assertEquals("ulpkudjkrl", model.description());
        Assertions.assertEquals(Status.APPROVED, model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withActionsRequired("bqidtqaj")
                .withDescription("ulpkudjkrl")
                .withStatus(Status.APPROVED);
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals("bqidtqaj", model.actionsRequired());
        Assertions.assertEquals("ulpkudjkrl", model.description());
        Assertions.assertEquals(Status.APPROVED, model.status());
    }
}
