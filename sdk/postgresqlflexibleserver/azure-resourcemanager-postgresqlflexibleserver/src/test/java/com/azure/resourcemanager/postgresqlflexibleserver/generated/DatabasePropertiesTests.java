// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.DatabaseProperties;
import org.junit.jupiter.api.Assertions;

public final class DatabasePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseProperties model = BinaryData.fromString("{\"charset\":\"siarbutrcvpn\",\"collation\":\"zmhjrunmp\"}")
            .toObject(DatabaseProperties.class);
        Assertions.assertEquals("siarbutrcvpn", model.charset());
        Assertions.assertEquals("zmhjrunmp", model.collation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseProperties model = new DatabaseProperties().withCharset("siarbutrcvpn").withCollation("zmhjrunmp");
        model = BinaryData.fromObject(model).toObject(DatabaseProperties.class);
        Assertions.assertEquals("siarbutrcvpn", model.charset());
        Assertions.assertEquals("zmhjrunmp", model.collation());
    }
}
