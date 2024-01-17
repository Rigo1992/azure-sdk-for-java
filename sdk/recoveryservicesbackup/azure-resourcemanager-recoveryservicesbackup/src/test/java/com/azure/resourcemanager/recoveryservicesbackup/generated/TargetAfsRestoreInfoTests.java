// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetAfsRestoreInfo;
import org.junit.jupiter.api.Assertions;

public final class TargetAfsRestoreInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TargetAfsRestoreInfo model =
            BinaryData
                .fromString("{\"name\":\"mrhublwpc\",\"targetResourceId\":\"utr\"}")
                .toObject(TargetAfsRestoreInfo.class);
        Assertions.assertEquals("mrhublwpc", model.name());
        Assertions.assertEquals("utr", model.targetResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TargetAfsRestoreInfo model = new TargetAfsRestoreInfo().withName("mrhublwpc").withTargetResourceId("utr");
        model = BinaryData.fromObject(model).toObject(TargetAfsRestoreInfo.class);
        Assertions.assertEquals("mrhublwpc", model.name());
        Assertions.assertEquals("utr", model.targetResourceId());
    }
}
