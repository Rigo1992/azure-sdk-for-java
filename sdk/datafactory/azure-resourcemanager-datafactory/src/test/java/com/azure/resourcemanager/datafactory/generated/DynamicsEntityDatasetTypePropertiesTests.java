// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DynamicsEntityDatasetTypeProperties;

public final class DynamicsEntityDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DynamicsEntityDatasetTypeProperties model
            = BinaryData.fromString("{\"entityName\":\"datarho\"}").toObject(DynamicsEntityDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DynamicsEntityDatasetTypeProperties model = new DynamicsEntityDatasetTypeProperties().withEntityName("datarho");
        model = BinaryData.fromObject(model).toObject(DynamicsEntityDatasetTypeProperties.class);
    }
}
