// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.VolumeGroupInner;
import com.azure.resourcemanager.netapp.models.VolumeGroupList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VolumeGroupListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeGroupList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"location\":\"stvlzywemhzrnc\",\"id\":\"tclusiypbsfgy\",\"name\":\"uslfead\",\"type\":\"gq\",\"properties\":{\"provisioningState\":\"hejhzisx\"}},{\"location\":\"elolppvksrpqvuj\",\"id\":\"aehtwd\",\"name\":\"ftswibyrcdlbhsh\",\"type\":\"p\",\"properties\":{\"provisioningState\":\"stwit\"}},{\"location\":\"evxccedcp\",\"id\":\"dyodnwzxltj\",\"name\":\"nhltiugcxn\",\"type\":\"vwxqibyqunyo\",\"properties\":{\"provisioningState\":\"lmdjrkvfgbvfvpdb\"}}]}")
                .toObject(VolumeGroupList.class);
        Assertions.assertEquals("stvlzywemhzrnc", model.value().get(0).location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeGroupList model =
            new VolumeGroupList()
                .withValue(
                    Arrays
                        .asList(
                            new VolumeGroupInner().withLocation("stvlzywemhzrnc"),
                            new VolumeGroupInner().withLocation("elolppvksrpqvuj"),
                            new VolumeGroupInner().withLocation("evxccedcp")));
        model = BinaryData.fromObject(model).toObject(VolumeGroupList.class);
        Assertions.assertEquals("stvlzywemhzrnc", model.value().get(0).location());
    }
}
