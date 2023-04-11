// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.VolumeRelocationProperties;
import org.junit.jupiter.api.Assertions;

public final class VolumeRelocationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeRelocationProperties model =
            BinaryData
                .fromString("{\"relocationRequested\":false,\"readyToBeFinalized\":true}")
                .toObject(VolumeRelocationProperties.class);
        Assertions.assertEquals(false, model.relocationRequested());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeRelocationProperties model = new VolumeRelocationProperties().withRelocationRequested(false);
        model = BinaryData.fromObject(model).toObject(VolumeRelocationProperties.class);
        Assertions.assertEquals(false, model.relocationRequested());
    }
}
