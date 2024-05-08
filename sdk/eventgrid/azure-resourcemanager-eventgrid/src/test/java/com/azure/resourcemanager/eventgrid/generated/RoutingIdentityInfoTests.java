// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.RoutingIdentityInfo;
import com.azure.resourcemanager.eventgrid.models.RoutingIdentityType;
import org.junit.jupiter.api.Assertions;

public final class RoutingIdentityInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoutingIdentityInfo model
            = BinaryData.fromString("{\"type\":\"SystemAssigned\",\"userAssignedIdentity\":\"cvpa\"}")
                .toObject(RoutingIdentityInfo.class);
        Assertions.assertEquals(RoutingIdentityType.SYSTEM_ASSIGNED, model.type());
        Assertions.assertEquals("cvpa", model.userAssignedIdentity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoutingIdentityInfo model
            = new RoutingIdentityInfo().withType(RoutingIdentityType.SYSTEM_ASSIGNED).withUserAssignedIdentity("cvpa");
        model = BinaryData.fromObject(model).toObject(RoutingIdentityInfo.class);
        Assertions.assertEquals(RoutingIdentityType.SYSTEM_ASSIGNED, model.type());
        Assertions.assertEquals("cvpa", model.userAssignedIdentity());
    }
}
