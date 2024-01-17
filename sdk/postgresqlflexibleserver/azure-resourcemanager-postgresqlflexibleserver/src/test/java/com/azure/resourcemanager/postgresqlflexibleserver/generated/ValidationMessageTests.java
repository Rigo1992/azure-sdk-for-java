// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ValidationMessage;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ValidationState;
import org.junit.jupiter.api.Assertions;

public final class ValidationMessageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidationMessage model =
            BinaryData.fromString("{\"state\":\"Succeeded\",\"message\":\"rvtp\"}").toObject(ValidationMessage.class);
        Assertions.assertEquals(ValidationState.SUCCEEDED, model.state());
        Assertions.assertEquals("rvtp", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidationMessage model = new ValidationMessage().withState(ValidationState.SUCCEEDED).withMessage("rvtp");
        model = BinaryData.fromObject(model).toObject(ValidationMessage.class);
        Assertions.assertEquals(ValidationState.SUCCEEDED, model.state());
        Assertions.assertEquals("rvtp", model.message());
    }
}
