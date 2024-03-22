// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.JavaComponentConfigurationProperty;
import org.junit.jupiter.api.Assertions;

public final class JavaComponentConfigurationPropertyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JavaComponentConfigurationProperty model
            = BinaryData.fromString("{\"propertyName\":\"ltn\",\"value\":\"dhqoawj\"}")
                .toObject(JavaComponentConfigurationProperty.class);
        Assertions.assertEquals("ltn", model.propertyName());
        Assertions.assertEquals("dhqoawj", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JavaComponentConfigurationProperty model
            = new JavaComponentConfigurationProperty().withPropertyName("ltn").withValue("dhqoawj");
        model = BinaryData.fromObject(model).toObject(JavaComponentConfigurationProperty.class);
        Assertions.assertEquals("ltn", model.propertyName());
        Assertions.assertEquals("dhqoawj", model.value());
    }
}
