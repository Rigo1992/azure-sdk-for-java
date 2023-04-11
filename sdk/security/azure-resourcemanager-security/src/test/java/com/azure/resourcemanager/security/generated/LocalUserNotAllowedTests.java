// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.LocalUserNotAllowed;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LocalUserNotAllowedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LocalUserNotAllowed model =
            BinaryData
                .fromString(
                    "{\"ruleType\":\"LocalUserNotAllowed\",\"allowlistValues\":[\"kycndzfqivjreuy\",\"bbmnwagltb\",\"oeeonqlnfwm\"],\"valueType\":\"String\",\"displayName\":\"qdbpbhfckdvezc\",\"description\":\"ssbzhddubbnqfbl\",\"isEnabled\":false}")
                .toObject(LocalUserNotAllowed.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals("kycndzfqivjreuy", model.allowlistValues().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LocalUserNotAllowed model =
            new LocalUserNotAllowed()
                .withIsEnabled(false)
                .withAllowlistValues(Arrays.asList("kycndzfqivjreuy", "bbmnwagltb", "oeeonqlnfwm"));
        model = BinaryData.fromObject(model).toObject(LocalUserNotAllowed.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals("kycndzfqivjreuy", model.allowlistValues().get(0));
    }
}
