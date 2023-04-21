// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupInner;
import org.junit.jupiter.api.Assertions;

public final class BackupInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupInner model =
            BinaryData
                .fromString(
                    "{\"location\":\"apvhelxprgly\",\"properties\":{\"backupId\":\"dd\",\"creationDate\":\"2021-07-03T10:39:12Z\",\"provisioningState\":\"cuejrjxgci\",\"size\":3405568102133288247,\"label\":\"osx\",\"backupType\":\"Scheduled\",\"failureReason\":\"hzoymibmrqy\",\"volumeName\":\"ahwfluszdtmhrk\",\"useExistingSnapshot\":false},\"id\":\"yvoqa\",\"name\":\"piexpbtgiw\",\"type\":\"wo\"}")
                .toObject(BackupInner.class);
        Assertions.assertEquals("apvhelxprgly", model.location());
        Assertions.assertEquals("osx", model.label());
        Assertions.assertEquals(false, model.useExistingSnapshot());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupInner model =
            new BackupInner().withLocation("apvhelxprgly").withLabel("osx").withUseExistingSnapshot(false);
        model = BinaryData.fromObject(model).toObject(BackupInner.class);
        Assertions.assertEquals("apvhelxprgly", model.location());
        Assertions.assertEquals("osx", model.label());
        Assertions.assertEquals(false, model.useExistingSnapshot());
    }
}
