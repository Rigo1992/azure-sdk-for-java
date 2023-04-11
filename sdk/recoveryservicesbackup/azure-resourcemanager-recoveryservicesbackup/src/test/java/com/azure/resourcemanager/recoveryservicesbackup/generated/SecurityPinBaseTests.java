// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.SecurityPinBase;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SecurityPinBaseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityPinBase model =
            BinaryData
                .fromString("{\"resourceGuardOperationRequests\":[\"yrqufegxuvwz\",\"bnhlmc\"]}")
                .toObject(SecurityPinBase.class);
        Assertions.assertEquals("yrqufegxuvwz", model.resourceGuardOperationRequests().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityPinBase model =
            new SecurityPinBase().withResourceGuardOperationRequests(Arrays.asList("yrqufegxuvwz", "bnhlmc"));
        model = BinaryData.fromObject(model).toObject(SecurityPinBase.class);
        Assertions.assertEquals("yrqufegxuvwz", model.resourceGuardOperationRequests().get(0));
    }
}
