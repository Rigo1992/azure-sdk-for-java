// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hardwaresecuritymodules.models.Error;

public final class ErrorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Error model = BinaryData.fromString(
            "{\"innererror\":{\"innererror\":{\"innererror\":{\"innererror\":{\"innererror\":{\"innererror\":{}}}}}}}")
            .toObject(Error.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Error model = new Error();
        model = BinaryData.fromObject(model).toObject(Error.class);
    }
}
