// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.DatabaseStatistics;
import org.junit.jupiter.api.Assertions;

public final class DatabaseStatisticsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseStatistics model = BinaryData.fromString("{\"size\":9.833252}").toObject(DatabaseStatistics.class);
        Assertions.assertEquals(9.833252F, model.size());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseStatistics model = new DatabaseStatistics().withSize(9.833252F);
        model = BinaryData.fromObject(model).toObject(DatabaseStatistics.class);
        Assertions.assertEquals(9.833252F, model.size());
    }
}
