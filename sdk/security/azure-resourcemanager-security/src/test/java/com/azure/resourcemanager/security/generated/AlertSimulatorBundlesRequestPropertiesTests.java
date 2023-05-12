// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AlertSimulatorBundlesRequestProperties;
import com.azure.resourcemanager.security.models.BundleType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AlertSimulatorBundlesRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AlertSimulatorBundlesRequestProperties model =
            BinaryData
                .fromString(
                    "{\"kind\":\"Bundles\",\"bundles\":[\"DNS\"],\"\":{\"dtfohfaog\":\"datakywymxgaabj\",\"ykcrraue\":\"datavkiwrsiwdyjqu\",\"ddacbcbgydlqidy\":\"datakcsueho\"}}")
                .toObject(AlertSimulatorBundlesRequestProperties.class);
        Assertions.assertEquals(BundleType.DNS, model.bundles().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AlertSimulatorBundlesRequestProperties model =
            new AlertSimulatorBundlesRequestProperties().withBundles(Arrays.asList(BundleType.DNS));
        model = BinaryData.fromObject(model).toObject(AlertSimulatorBundlesRequestProperties.class);
        Assertions.assertEquals(BundleType.DNS, model.bundles().get(0));
    }
}
