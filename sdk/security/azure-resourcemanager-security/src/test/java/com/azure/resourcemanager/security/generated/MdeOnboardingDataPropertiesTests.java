// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.MdeOnboardingDataProperties;

public final class MdeOnboardingDataPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MdeOnboardingDataProperties model = BinaryData.fromString("{}").toObject(MdeOnboardingDataProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MdeOnboardingDataProperties model = new MdeOnboardingDataProperties();
        model = BinaryData.fromObject(model).toObject(MdeOnboardingDataProperties.class);
    }
}
