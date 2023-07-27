// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.fluent.models.ExperimentStatusProperties;

public final class ExperimentStatusPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentStatusProperties model =
            BinaryData
                .fromString(
                    "{\"status\":\"hprwmdyv\",\"createdDateUtc\":\"2021-07-01T04:16:54Z\",\"endDateUtc\":\"2021-07-25T12:29:44Z\"}")
                .toObject(ExperimentStatusProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentStatusProperties model = new ExperimentStatusProperties();
        model = BinaryData.fromObject(model).toObject(ExperimentStatusProperties.class);
    }
}