// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourceconnector.models.AppliancePropertiesInfrastructureConfig;
import com.azure.resourcemanager.resourceconnector.models.Provider;
import org.junit.jupiter.api.Assertions;

public final class AppliancePropertiesInfrastructureConfigTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AppliancePropertiesInfrastructureConfig model =
            BinaryData
                .fromString("{\"provider\":\"OpenStack\"}")
                .toObject(AppliancePropertiesInfrastructureConfig.class);
        Assertions.assertEquals(Provider.OPEN_STACK, model.provider());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AppliancePropertiesInfrastructureConfig model =
            new AppliancePropertiesInfrastructureConfig().withProvider(Provider.OPEN_STACK);
        model = BinaryData.fromObject(model).toObject(AppliancePropertiesInfrastructureConfig.class);
        Assertions.assertEquals(Provider.OPEN_STACK, model.provider());
    }
}
