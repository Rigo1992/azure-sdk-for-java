// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.MigrationNameAvailabilityResourceInner;
import org.junit.jupiter.api.Assertions;

public final class MigrationNameAvailabilityResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrationNameAvailabilityResourceInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"cdl\",\"type\":\"h\",\"nameAvailable\":true,\"reason\":\"Invalid\",\"message\":\"acstwityk\"}")
                .toObject(MigrationNameAvailabilityResourceInner.class);
        Assertions.assertEquals("cdl", model.name());
        Assertions.assertEquals("h", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrationNameAvailabilityResourceInner model =
            new MigrationNameAvailabilityResourceInner().withName("cdl").withType("h");
        model = BinaryData.fromObject(model).toObject(MigrationNameAvailabilityResourceInner.class);
        Assertions.assertEquals("cdl", model.name());
        Assertions.assertEquals("h", model.type());
    }
}
