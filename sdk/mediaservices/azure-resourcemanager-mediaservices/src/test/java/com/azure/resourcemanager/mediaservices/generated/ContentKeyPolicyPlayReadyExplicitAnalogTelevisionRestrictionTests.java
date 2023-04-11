// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction;
import org.junit.jupiter.api.Assertions;

public final class ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction model =
            BinaryData
                .fromString("{\"bestEffort\":false,\"configurationData\":462603095}")
                .toObject(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction.class);
        Assertions.assertEquals(false, model.bestEffort());
        Assertions.assertEquals(462603095, model.configurationData());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction model =
            new ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction()
                .withBestEffort(false)
                .withConfigurationData(462603095);
        model =
            BinaryData.fromObject(model).toObject(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction.class);
        Assertions.assertEquals(false, model.bestEffort());
        Assertions.assertEquals(462603095, model.configurationData());
    }
}
