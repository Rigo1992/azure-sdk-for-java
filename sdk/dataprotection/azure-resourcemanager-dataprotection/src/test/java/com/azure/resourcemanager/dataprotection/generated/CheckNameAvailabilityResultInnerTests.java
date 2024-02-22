// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.CheckNameAvailabilityResultInner;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityResultInner model = BinaryData
            .fromString("{\"message\":\"nfnbacfionlebxe\",\"nameAvailable\":false,\"reason\":\"zxdpnqbqqw\"}")
            .toObject(CheckNameAvailabilityResultInner.class);
        Assertions.assertEquals("nfnbacfionlebxe", model.message());
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("zxdpnqbqqw", model.reason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityResultInner model = new CheckNameAvailabilityResultInner().withMessage("nfnbacfionlebxe")
            .withNameAvailable(false).withReason("zxdpnqbqqw");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityResultInner.class);
        Assertions.assertEquals("nfnbacfionlebxe", model.message());
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("zxdpnqbqqw", model.reason());
    }
}
