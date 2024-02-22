// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.SnapshotInner;
import com.azure.resourcemanager.elasticsan.models.SnapshotCreationData;
import org.junit.jupiter.api.Assertions;

public final class SnapshotInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotInner model = BinaryData.fromString(
            "{\"properties\":{\"creationData\":{\"sourceId\":\"bkrvrnsvshqj\"},\"provisioningState\":\"Invalid\",\"sourceVolumeSizeGiB\":5224156778393884767,\"volumeName\":\"fovasr\"},\"id\":\"v\",\"name\":\"bhsqfsubcgjbirxb\",\"type\":\"ybsrfbjfdtwss\"}")
            .toObject(SnapshotInner.class);
        Assertions.assertEquals("bkrvrnsvshqj", model.creationData().sourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotInner model
            = new SnapshotInner().withCreationData(new SnapshotCreationData().withSourceId("bkrvrnsvshqj"));
        model = BinaryData.fromObject(model).toObject(SnapshotInner.class);
        Assertions.assertEquals("bkrvrnsvshqj", model.creationData().sourceId());
    }
}
