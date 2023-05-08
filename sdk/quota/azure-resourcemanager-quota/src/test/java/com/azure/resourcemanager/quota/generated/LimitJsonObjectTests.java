// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.models.LimitJsonObject;

public final class LimitJsonObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LimitJsonObject model =
            BinaryData.fromString("{\"limitObjectType\":\"LimitJsonObject\"}").toObject(LimitJsonObject.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LimitJsonObject model = new LimitJsonObject();
        model = BinaryData.fromObject(model).toObject(LimitJsonObject.class);
    }
}
