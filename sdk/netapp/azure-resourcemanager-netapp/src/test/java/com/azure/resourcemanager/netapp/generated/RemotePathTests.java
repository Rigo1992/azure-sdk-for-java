// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.RemotePath;
import org.junit.jupiter.api.Assertions;

public final class RemotePathTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RemotePath model = BinaryData
            .fromString("{\"externalHostName\":\"wubmwmbesldn\",\"serverName\":\"wwtppj\",\"volumeName\":\"lcxog\"}")
            .toObject(RemotePath.class);
        Assertions.assertEquals("wubmwmbesldn", model.externalHostname());
        Assertions.assertEquals("wwtppj", model.serverName());
        Assertions.assertEquals("lcxog", model.volumeName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RemotePath model
            = new RemotePath().withExternalHostname("wubmwmbesldn").withServerName("wwtppj").withVolumeName("lcxog");
        model = BinaryData.fromObject(model).toObject(RemotePath.class);
        Assertions.assertEquals("wubmwmbesldn", model.externalHostname());
        Assertions.assertEquals("wwtppj", model.serverName());
        Assertions.assertEquals("lcxog", model.volumeName());
    }
}
