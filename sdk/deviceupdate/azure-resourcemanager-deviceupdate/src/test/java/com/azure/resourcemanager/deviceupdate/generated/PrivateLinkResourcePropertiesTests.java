// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkResourceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceProperties model = BinaryData.fromString(
            "{\"groupId\":\"u\",\"requiredMembers\":[\"hfuiuaodsfc\",\"kvxod\",\"uozmyzydagfua\",\"bezy\"],\"requiredZoneNames\":[\"kktwhrdxw\",\"ywqsmbsurexim\",\"ryocfsfksymdd\"]}")
            .toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("kktwhrdxw", model.requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceProperties model = new PrivateLinkResourceProperties()
            .withRequiredZoneNames(Arrays.asList("kktwhrdxw", "ywqsmbsurexim", "ryocfsfksymdd"));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("kktwhrdxw", model.requiredZoneNames().get(0));
    }
}
