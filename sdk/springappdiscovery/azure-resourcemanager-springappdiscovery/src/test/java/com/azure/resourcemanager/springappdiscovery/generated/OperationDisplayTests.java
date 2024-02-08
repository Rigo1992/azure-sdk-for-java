// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.springappdiscovery.models.OperationDisplay;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model = BinaryData.fromString(
            "{\"provider\":\"eotusivyevc\",\"resource\":\"qi\",\"operation\":\"hungbwjzrnf\",\"description\":\"xgispemvtzfkufu\"}")
            .toObject(OperationDisplay.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model = new OperationDisplay();
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
    }
}
