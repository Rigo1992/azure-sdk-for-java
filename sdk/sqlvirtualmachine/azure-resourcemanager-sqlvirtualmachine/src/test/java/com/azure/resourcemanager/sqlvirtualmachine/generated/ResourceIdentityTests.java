// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.models.IdentityType;
import com.azure.resourcemanager.sqlvirtualmachine.models.ResourceIdentity;
import org.junit.jupiter.api.Assertions;

public final class ResourceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceIdentity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"69302b8f-5663-4c3b-932a-ee7af2f94b9f\",\"type\":\"None\",\"tenantId\":\"570ff5b7-a1c1-4e0b-809d-2547824d6276\"}")
                .toObject(ResourceIdentity.class);
        Assertions.assertEquals(IdentityType.NONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceIdentity model = new ResourceIdentity().withType(IdentityType.NONE);
        model = BinaryData.fromObject(model).toObject(ResourceIdentity.class);
        Assertions.assertEquals(IdentityType.NONE, model.type());
    }
}
