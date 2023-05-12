// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AllowlistCustomAlertRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AllowlistCustomAlertRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllowlistCustomAlertRule model =
            BinaryData
                .fromString(
                    "{\"ruleType\":\"AllowlistCustomAlertRule\",\"allowlistValues\":[\"vkwlzuvccfwnf\",\"bacfionlebxetq\",\"tzxdpnqbqqwx\",\"jfeallnwsub\"],\"valueType\":\"IpCidr\",\"displayName\":\"ampmngnz\",\"description\":\"xaqwoochcbonqv\",\"isEnabled\":false}")
                .toObject(AllowlistCustomAlertRule.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals("vkwlzuvccfwnf", model.allowlistValues().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllowlistCustomAlertRule model =
            new AllowlistCustomAlertRule()
                .withIsEnabled(false)
                .withAllowlistValues(Arrays.asList("vkwlzuvccfwnf", "bacfionlebxetq", "tzxdpnqbqqwx", "jfeallnwsub"));
        model = BinaryData.fromObject(model).toObject(AllowlistCustomAlertRule.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals("vkwlzuvccfwnf", model.allowlistValues().get(0));
    }
}
