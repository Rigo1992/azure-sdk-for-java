// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkResource;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkResourceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResource model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"groupId\":\"n\",\"requiredMembers\":[\"lzpswiydm\",\"wyhzdx\",\"sadbz\"],\"requiredZoneNames\":[\"dfznudaodv\",\"zbn\",\"blylpstdbh\",\"xsrz\"],\"displayName\":\"ucerscdntnevfi\"},\"id\":\"jmygtdsslswtmwer\",\"name\":\"ofz\",\"type\":\"yqsemwa\"}")
                .toObject(PrivateLinkResource.class);
        Assertions.assertEquals("dfznudaodv", model.properties().requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResource model =
            new PrivateLinkResource()
                .withProperties(
                    new PrivateLinkResourceProperties()
                        .withRequiredZoneNames(Arrays.asList("dfznudaodv", "zbn", "blylpstdbh", "xsrz")));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResource.class);
        Assertions.assertEquals("dfznudaodv", model.properties().requiredZoneNames().get(0));
    }
}
