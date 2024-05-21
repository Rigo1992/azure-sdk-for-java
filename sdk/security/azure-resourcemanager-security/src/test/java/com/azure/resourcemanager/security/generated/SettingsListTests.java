// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SettingInner;
import com.azure.resourcemanager.security.models.SettingsList;
import java.util.Arrays;

public final class SettingsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SettingsList model = BinaryData.fromString(
            "{\"value\":[{\"kind\":\"Setting\",\"id\":\"atqtdiswxspvckoj\",\"name\":\"zbbgspftesubzpvp\",\"type\":\"dylytcovq\"}],\"nextLink\":\"usrf\"}")
            .toObject(SettingsList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SettingsList model = new SettingsList().withValue(Arrays.asList(new SettingInner()));
        model = BinaryData.fromObject(model).toObject(SettingsList.class);
    }
}
