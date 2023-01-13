// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.SecurityPolicyLink;
import org.junit.jupiter.api.Assertions;

public final class SecurityPolicyLinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityPolicyLink model = BinaryData.fromString("{\"id\":\"ax\"}").toObject(SecurityPolicyLink.class);
        Assertions.assertEquals("ax", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityPolicyLink model = new SecurityPolicyLink().withId("ax");
        model = BinaryData.fromObject(model).toObject(SecurityPolicyLink.class);
        Assertions.assertEquals("ax", model.id());
    }
}
