// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentitySettings;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentitySettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentitySettings model =
            BinaryData.fromString("{\"resource\":\"exilzznfqqnvwpmq\"}").toObject(ManagedIdentitySettings.class);
        Assertions.assertEquals("exilzznfqqnvwpmq", model.resource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentitySettings model = new ManagedIdentitySettings().withResource("exilzznfqqnvwpmq");
        model = BinaryData.fromObject(model).toObject(ManagedIdentitySettings.class);
        Assertions.assertEquals("exilzznfqqnvwpmq", model.resource());
    }
}
