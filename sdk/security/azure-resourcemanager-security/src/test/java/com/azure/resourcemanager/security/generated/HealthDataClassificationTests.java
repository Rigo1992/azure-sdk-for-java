// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.HealthDataClassification;
import com.azure.resourcemanager.security.models.ScopeName;
import org.junit.jupiter.api.Assertions;

public final class HealthDataClassificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HealthDataClassification model =
            BinaryData
                .fromString("{\"component\":\"fxjelg\",\"scenario\":\"pzqjhhhq\",\"scope\":\"Connectors\"}")
                .toObject(HealthDataClassification.class);
        Assertions.assertEquals("fxjelg", model.component());
        Assertions.assertEquals("pzqjhhhq", model.scenario());
        Assertions.assertEquals(ScopeName.CONNECTORS, model.scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HealthDataClassification model =
            new HealthDataClassification()
                .withComponent("fxjelg")
                .withScenario("pzqjhhhq")
                .withScope(ScopeName.CONNECTORS);
        model = BinaryData.fromObject(model).toObject(HealthDataClassification.class);
        Assertions.assertEquals("fxjelg", model.component());
        Assertions.assertEquals("pzqjhhhq", model.scenario());
        Assertions.assertEquals(ScopeName.CONNECTORS, model.scope());
    }
}
