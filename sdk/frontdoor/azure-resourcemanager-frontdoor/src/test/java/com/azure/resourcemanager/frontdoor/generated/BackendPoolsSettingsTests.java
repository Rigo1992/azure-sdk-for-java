// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.BackendPoolsSettings;
import com.azure.resourcemanager.frontdoor.models.EnforceCertificateNameCheckEnabledState;
import org.junit.jupiter.api.Assertions;

public final class BackendPoolsSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackendPoolsSettings model =
            BinaryData
                .fromString("{\"enforceCertificateNameCheck\":\"Enabled\",\"sendRecvTimeoutSeconds\":1101350352}")
                .toObject(BackendPoolsSettings.class);
        Assertions.assertEquals(EnforceCertificateNameCheckEnabledState.ENABLED, model.enforceCertificateNameCheck());
        Assertions.assertEquals(1101350352, model.sendRecvTimeoutSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackendPoolsSettings model =
            new BackendPoolsSettings()
                .withEnforceCertificateNameCheck(EnforceCertificateNameCheckEnabledState.ENABLED)
                .withSendRecvTimeoutSeconds(1101350352);
        model = BinaryData.fromObject(model).toObject(BackendPoolsSettings.class);
        Assertions.assertEquals(EnforceCertificateNameCheckEnabledState.ENABLED, model.enforceCertificateNameCheck());
        Assertions.assertEquals(1101350352, model.sendRecvTimeoutSeconds());
    }
}
