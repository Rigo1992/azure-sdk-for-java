// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.DoubleEncryption;
import com.azure.resourcemanager.databox.models.EncryptionPreferences;
import com.azure.resourcemanager.databox.models.Preferences;
import com.azure.resourcemanager.databox.models.PreferencesValidationRequest;
import com.azure.resourcemanager.databox.models.SkuName;
import com.azure.resourcemanager.databox.models.TransportPreferences;
import com.azure.resourcemanager.databox.models.TransportShipmentTypes;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PreferencesValidationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PreferencesValidationRequest model =
            BinaryData
                .fromString(
                    "{\"validationType\":\"ValidatePreferences\",\"preference\":{\"preferredDataCenterRegion\":[\"kvmkqzeqq\",\"dltfz\",\"mhhv\"],\"transportPreferences\":{\"preferredShipmentType\":\"CustomerManaged\"},\"encryptionPreferences\":{\"doubleEncryption\":\"Enabled\"}},\"deviceType\":\"DataBoxDisk\"}")
                .toObject(PreferencesValidationRequest.class);
        Assertions.assertEquals("kvmkqzeqq", model.preference().preferredDataCenterRegion().get(0));
        Assertions
            .assertEquals(
                TransportShipmentTypes.CUSTOMER_MANAGED,
                model.preference().transportPreferences().preferredShipmentType());
        Assertions
            .assertEquals(DoubleEncryption.ENABLED, model.preference().encryptionPreferences().doubleEncryption());
        Assertions.assertEquals(SkuName.DATA_BOX_DISK, model.deviceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PreferencesValidationRequest model =
            new PreferencesValidationRequest()
                .withPreference(
                    new Preferences()
                        .withPreferredDataCenterRegion(Arrays.asList("kvmkqzeqq", "dltfz", "mhhv"))
                        .withTransportPreferences(
                            new TransportPreferences()
                                .withPreferredShipmentType(TransportShipmentTypes.CUSTOMER_MANAGED))
                        .withEncryptionPreferences(
                            new EncryptionPreferences().withDoubleEncryption(DoubleEncryption.ENABLED)))
                .withDeviceType(SkuName.DATA_BOX_DISK);
        model = BinaryData.fromObject(model).toObject(PreferencesValidationRequest.class);
        Assertions.assertEquals("kvmkqzeqq", model.preference().preferredDataCenterRegion().get(0));
        Assertions
            .assertEquals(
                TransportShipmentTypes.CUSTOMER_MANAGED,
                model.preference().transportPreferences().preferredShipmentType());
        Assertions
            .assertEquals(DoubleEncryption.ENABLED, model.preference().encryptionPreferences().doubleEncryption());
        Assertions.assertEquals(SkuName.DATA_BOX_DISK, model.deviceType());
    }
}
