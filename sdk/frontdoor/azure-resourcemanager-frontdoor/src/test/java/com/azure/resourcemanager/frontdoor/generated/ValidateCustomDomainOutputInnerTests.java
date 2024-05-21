// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.ValidateCustomDomainOutputInner;

public final class ValidateCustomDomainOutputInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidateCustomDomainOutputInner model = BinaryData
            .fromString("{\"customDomainValidated\":false,\"reason\":\"odbzevwrdnhf\",\"message\":\"uvsj\"}")
            .toObject(ValidateCustomDomainOutputInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidateCustomDomainOutputInner model = new ValidateCustomDomainOutputInner();
        model = BinaryData.fromObject(model).toObject(ValidateCustomDomainOutputInner.class);
    }
}
