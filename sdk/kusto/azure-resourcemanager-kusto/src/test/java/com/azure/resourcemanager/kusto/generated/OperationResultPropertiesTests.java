// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.OperationResultProperties;
import org.junit.jupiter.api.Assertions;

public final class OperationResultPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationResultProperties model =
            BinaryData
                .fromString(
                    "{\"operationKind\":\"zfttsttktlahb\",\"provisioningState\":\"Creating\",\"operationState\":\"xtgzukxitmmqtgqq\"}")
                .toObject(OperationResultProperties.class);
        Assertions.assertEquals("zfttsttktlahb", model.operationKind());
        Assertions.assertEquals("xtgzukxitmmqtgqq", model.operationState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationResultProperties model =
            new OperationResultProperties().withOperationKind("zfttsttktlahb").withOperationState("xtgzukxitmmqtgqq");
        model = BinaryData.fromObject(model).toObject(OperationResultProperties.class);
        Assertions.assertEquals("zfttsttktlahb", model.operationKind());
        Assertions.assertEquals("xtgzukxitmmqtgqq", model.operationState());
    }
}
