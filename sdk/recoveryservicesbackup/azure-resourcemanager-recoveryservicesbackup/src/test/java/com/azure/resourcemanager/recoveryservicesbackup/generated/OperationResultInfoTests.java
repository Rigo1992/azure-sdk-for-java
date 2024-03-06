// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationResultInfo;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationResultInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationResultInfo model
            = BinaryData.fromString("{\"objectType\":\"OperationResultInfo\",\"jobList\":[\"crqctmxxdtddmflh\"]}")
                .toObject(OperationResultInfo.class);
        Assertions.assertEquals("crqctmxxdtddmflh", model.jobList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationResultInfo model = new OperationResultInfo().withJobList(Arrays.asList("crqctmxxdtddmflh"));
        model = BinaryData.fromObject(model).toObject(OperationResultInfo.class);
        Assertions.assertEquals("crqctmxxdtddmflh", model.jobList().get(0));
    }
}
