// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequest;

public final class RestoreRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestoreRequest model
            = BinaryData.fromString("{\"objectType\":\"RestoreRequest\"}").toObject(RestoreRequest.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestoreRequest model = new RestoreRequest();
        model = BinaryData.fromObject(model).toObject(RestoreRequest.class);
    }
}
