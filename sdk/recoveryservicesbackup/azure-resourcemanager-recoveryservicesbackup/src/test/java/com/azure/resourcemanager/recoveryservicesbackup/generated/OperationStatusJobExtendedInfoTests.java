// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatusJobExtendedInfo;
import org.junit.jupiter.api.Assertions;

public final class OperationStatusJobExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationStatusJobExtendedInfo model =
            BinaryData
                .fromString("{\"objectType\":\"OperationStatusJobExtendedInfo\",\"jobId\":\"spyd\"}")
                .toObject(OperationStatusJobExtendedInfo.class);
        Assertions.assertEquals("spyd", model.jobId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationStatusJobExtendedInfo model = new OperationStatusJobExtendedInfo().withJobId("spyd");
        model = BinaryData.fromObject(model).toObject(OperationStatusJobExtendedInfo.class);
        Assertions.assertEquals("spyd", model.jobId());
    }
}
