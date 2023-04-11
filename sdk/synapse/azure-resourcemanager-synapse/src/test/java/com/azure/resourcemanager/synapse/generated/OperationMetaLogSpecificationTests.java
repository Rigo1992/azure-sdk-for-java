// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.OperationMetaLogSpecification;
import org.junit.jupiter.api.Assertions;

public final class OperationMetaLogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationMetaLogSpecification model =
            BinaryData
                .fromString("{\"displayName\":\"toqcjmklja\",\"blobDuration\":\"qidtqajzyu\",\"name\":\"kudjkrlkhb\"}")
                .toObject(OperationMetaLogSpecification.class);
        Assertions.assertEquals("toqcjmklja", model.displayName());
        Assertions.assertEquals("qidtqajzyu", model.blobDuration());
        Assertions.assertEquals("kudjkrlkhb", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationMetaLogSpecification model =
            new OperationMetaLogSpecification()
                .withDisplayName("toqcjmklja")
                .withBlobDuration("qidtqajzyu")
                .withName("kudjkrlkhb");
        model = BinaryData.fromObject(model).toObject(OperationMetaLogSpecification.class);
        Assertions.assertEquals("toqcjmklja", model.displayName());
        Assertions.assertEquals("qidtqajzyu", model.blobDuration());
        Assertions.assertEquals("kudjkrlkhb", model.name());
    }
}
