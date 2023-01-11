// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.digitaltwins.models.Reason;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CheckNameResultInnerTests {
    @Test
    public void testDeserialize() {
        CheckNameResultInner model =
            BinaryData
                .fromString("{\"nameAvailable\":false,\"message\":\"ulexxbczwtr\",\"reason\":\"Invalid\"}")
                .toObject(CheckNameResultInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("ulexxbczwtr", model.message());
        Assertions.assertEquals(Reason.INVALID, model.reason());
    }

    @Test
    public void testSerialize() {
        CheckNameResultInner model =
            new CheckNameResultInner().withNameAvailable(false).withMessage("ulexxbczwtr").withReason(Reason.INVALID);
        model = BinaryData.fromObject(model).toObject(CheckNameResultInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("ulexxbczwtr", model.message());
        Assertions.assertEquals(Reason.INVALID, model.reason());
    }
}
