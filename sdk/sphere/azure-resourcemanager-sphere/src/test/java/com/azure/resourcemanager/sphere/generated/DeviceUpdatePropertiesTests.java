// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.DeviceUpdateProperties;
import org.junit.jupiter.api.Assertions;

public final class DeviceUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeviceUpdateProperties model =
            BinaryData.fromString("{\"deviceGroupId\":\"swzts\"}").toObject(DeviceUpdateProperties.class);
        Assertions.assertEquals("swzts", model.deviceGroupId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeviceUpdateProperties model = new DeviceUpdateProperties().withDeviceGroupId("swzts");
        model = BinaryData.fromObject(model).toObject(DeviceUpdateProperties.class);
        Assertions.assertEquals("swzts", model.deviceGroupId());
    }
}