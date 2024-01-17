// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.DetachDiskProperties;
import org.junit.jupiter.api.Assertions;

public final class DetachDiskPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DetachDiskProperties model =
            BinaryData.fromString("{\"leasedByLabVmId\":\"ylhjlm\"}").toObject(DetachDiskProperties.class);
        Assertions.assertEquals("ylhjlm", model.leasedByLabVmId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DetachDiskProperties model = new DetachDiskProperties().withLeasedByLabVmId("ylhjlm");
        model = BinaryData.fromObject(model).toObject(DetachDiskProperties.class);
        Assertions.assertEquals("ylhjlm", model.leasedByLabVmId());
    }
}
