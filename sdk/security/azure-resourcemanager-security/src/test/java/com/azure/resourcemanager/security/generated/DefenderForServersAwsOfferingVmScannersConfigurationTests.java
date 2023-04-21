// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingVmScannersConfiguration;
import com.azure.resourcemanager.security.models.ScanningMode;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DefenderForServersAwsOfferingVmScannersConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForServersAwsOfferingVmScannersConfiguration model =
            BinaryData
                .fromString(
                    "{\"cloudRoleArn\":\"vjcteoedlrslsk\",\"scanningMode\":\"Default\",\"exclusionTags\":{\"xzfsnggytexvzilm\":\"jnzdpvocojhpcna\",\"kwwwnckn\":\"iv\",\"weucyrth\":\"zdajlskzptjxu\",\"hokamvfej\":\"qlehmcgcjeinu\"}}")
                .toObject(DefenderForServersAwsOfferingVmScannersConfiguration.class);
        Assertions.assertEquals("vjcteoedlrslsk", model.cloudRoleArn());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.scanningMode());
        Assertions.assertEquals("jnzdpvocojhpcna", model.exclusionTags().get("xzfsnggytexvzilm"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForServersAwsOfferingVmScannersConfiguration model =
            new DefenderForServersAwsOfferingVmScannersConfiguration()
                .withCloudRoleArn("vjcteoedlrslsk")
                .withScanningMode(ScanningMode.DEFAULT)
                .withExclusionTags(
                    mapOf(
                        "xzfsnggytexvzilm",
                        "jnzdpvocojhpcna",
                        "kwwwnckn",
                        "iv",
                        "weucyrth",
                        "zdajlskzptjxu",
                        "hokamvfej",
                        "qlehmcgcjeinu"));
        model = BinaryData.fromObject(model).toObject(DefenderForServersAwsOfferingVmScannersConfiguration.class);
        Assertions.assertEquals("vjcteoedlrslsk", model.cloudRoleArn());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.scanningMode());
        Assertions.assertEquals("jnzdpvocojhpcna", model.exclusionTags().get("xzfsnggytexvzilm"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
