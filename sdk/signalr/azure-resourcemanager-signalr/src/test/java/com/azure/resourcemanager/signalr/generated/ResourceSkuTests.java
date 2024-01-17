// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.ResourceSku;
import com.azure.resourcemanager.signalr.models.SignalRSkuTier;
import org.junit.jupiter.api.Assertions;

public final class ResourceSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSku model =
            BinaryData
                .fromString(
                    "{\"name\":\"dlhewp\",\"tier\":\"Basic\",\"size\":\"ttwvogvbbe\",\"family\":\"cngqqmoakufgmjz\",\"capacity\":1463483261}")
                .toObject(ResourceSku.class);
        Assertions.assertEquals("dlhewp", model.name());
        Assertions.assertEquals(SignalRSkuTier.BASIC, model.tier());
        Assertions.assertEquals(1463483261, model.capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceSku model =
            new ResourceSku().withName("dlhewp").withTier(SignalRSkuTier.BASIC).withCapacity(1463483261);
        model = BinaryData.fromObject(model).toObject(ResourceSku.class);
        Assertions.assertEquals("dlhewp", model.name());
        Assertions.assertEquals(SignalRSkuTier.BASIC, model.tier());
        Assertions.assertEquals(1463483261, model.capacity());
    }
}
