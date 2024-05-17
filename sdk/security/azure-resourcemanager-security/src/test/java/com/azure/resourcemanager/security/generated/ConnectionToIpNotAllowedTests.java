// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ConnectionToIpNotAllowed;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConnectionToIpNotAllowedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectionToIpNotAllowed model = BinaryData.fromString(
            "{\"ruleType\":\"ConnectionToIpNotAllowed\",\"allowlistValues\":[\"wl\"],\"valueType\":\"String\",\"displayName\":\"jk\",\"description\":\"xxr\",\"isEnabled\":true}")
            .toObject(ConnectionToIpNotAllowed.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("wl", model.allowlistValues().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectionToIpNotAllowed model
            = new ConnectionToIpNotAllowed().withIsEnabled(true).withAllowlistValues(Arrays.asList("wl"));
        model = BinaryData.fromObject(model).toObject(ConnectionToIpNotAllowed.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("wl", model.allowlistValues().get(0));
    }
}
