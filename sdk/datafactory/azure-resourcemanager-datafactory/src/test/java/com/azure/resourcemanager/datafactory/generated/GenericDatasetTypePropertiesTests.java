// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.GenericDatasetTypeProperties;

public final class GenericDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GenericDatasetTypeProperties model
            = BinaryData.fromString("{\"tableName\":\"dataypkcpwsrqnn\"}").toObject(GenericDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GenericDatasetTypeProperties model = new GenericDatasetTypeProperties().withTableName("dataypkcpwsrqnn");
        model = BinaryData.fromObject(model).toObject(GenericDatasetTypeProperties.class);
    }
}
