// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DenylistCustomAlertRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DenylistCustomAlertRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DenylistCustomAlertRule model = BinaryData.fromString(
            "{\"ruleType\":\"DenylistCustomAlertRule\",\"denylistValues\":[\"bgkc\",\"khpzvuqdflv\",\"niypfpubcpzg\"],\"valueType\":\"String\",\"displayName\":\"vhjknidi\",\"description\":\"qjxgpnrhgovfgp\",\"isEnabled\":true}")
            .toObject(DenylistCustomAlertRule.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("bgkc", model.denylistValues().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DenylistCustomAlertRule model = new DenylistCustomAlertRule().withIsEnabled(true)
            .withDenylistValues(Arrays.asList("bgkc", "khpzvuqdflv", "niypfpubcpzg"));
        model = BinaryData.fromObject(model).toObject(DenylistCustomAlertRule.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("bgkc", model.denylistValues().get(0));
    }
}
