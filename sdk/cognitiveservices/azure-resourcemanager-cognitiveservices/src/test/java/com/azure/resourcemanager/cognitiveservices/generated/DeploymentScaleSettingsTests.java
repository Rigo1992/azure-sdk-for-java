// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentScaleSettings;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentScaleType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeploymentScaleSettingsTests {
    @Test
    public void testDeserialize() {
        DeploymentScaleSettings model =
            BinaryData
                .fromString("{\"scaleType\":\"Standard\",\"capacity\":893686819,\"activeCapacity\":158092972}")
                .toObject(DeploymentScaleSettings.class);
        Assertions.assertEquals(DeploymentScaleType.STANDARD, model.scaleType());
        Assertions.assertEquals(893686819, model.capacity());
    }

    @Test
    public void testSerialize() {
        DeploymentScaleSettings model =
            new DeploymentScaleSettings().withScaleType(DeploymentScaleType.STANDARD).withCapacity(893686819);
        model = BinaryData.fromObject(model).toObject(DeploymentScaleSettings.class);
        Assertions.assertEquals(DeploymentScaleType.STANDARD, model.scaleType());
        Assertions.assertEquals(893686819, model.capacity());
    }
}
