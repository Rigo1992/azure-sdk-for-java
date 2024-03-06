// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResolveHealthError;
import org.junit.jupiter.api.Assertions;

public final class ResolveHealthErrorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResolveHealthError model
            = BinaryData.fromString("{\"healthErrorId\":\"txifqj\"}").toObject(ResolveHealthError.class);
        Assertions.assertEquals("txifqj", model.healthErrorId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResolveHealthError model = new ResolveHealthError().withHealthErrorId("txifqj");
        model = BinaryData.fromObject(model).toObject(ResolveHealthError.class);
        Assertions.assertEquals("txifqj", model.healthErrorId());
    }
}
