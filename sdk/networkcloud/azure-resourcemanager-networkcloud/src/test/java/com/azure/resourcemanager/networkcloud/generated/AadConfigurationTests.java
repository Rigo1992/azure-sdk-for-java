// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.AadConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AadConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AadConfiguration model =
            BinaryData
                .fromString("{\"adminGroupObjectIds\":[\"ibtnmxiebwwaloay\",\"cgwrtzjuz\"]}")
                .toObject(AadConfiguration.class);
        Assertions.assertEquals("ibtnmxiebwwaloay", model.adminGroupObjectIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AadConfiguration model =
            new AadConfiguration().withAdminGroupObjectIds(Arrays.asList("ibtnmxiebwwaloay", "cgwrtzjuz"));
        model = BinaryData.fromObject(model).toObject(AadConfiguration.class);
        Assertions.assertEquals("ibtnmxiebwwaloay", model.adminGroupObjectIds().get(0));
    }
}
