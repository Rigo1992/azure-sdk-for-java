// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.CommandProperties;

public final class CommandPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommandProperties model =
            BinaryData
                .fromString("{\"commandType\":\"CommandProperties\",\"errors\":[],\"state\":\"Failed\"}")
                .toObject(CommandProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommandProperties model = new CommandProperties();
        model = BinaryData.fromObject(model).toObject(CommandProperties.class);
    }
}
