// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.TensorFlow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TensorFlowTests {
    @Test
    public void testDeserialize() {
        TensorFlow model =
            BinaryData
                .fromString(
                    "{\"distributionType\":\"TensorFlow\",\"parameterServerCount\":1873881024,\"workerCount\":131974478}")
                .toObject(TensorFlow.class);
        Assertions.assertEquals(1873881024, model.parameterServerCount());
        Assertions.assertEquals(131974478, model.workerCount());
    }

    @Test
    public void testSerialize() {
        TensorFlow model = new TensorFlow().withParameterServerCount(1873881024).withWorkerCount(131974478);
        model = BinaryData.fromObject(model).toObject(TensorFlow.class);
        Assertions.assertEquals(1873881024, model.parameterServerCount());
        Assertions.assertEquals(131974478, model.workerCount());
    }
}
