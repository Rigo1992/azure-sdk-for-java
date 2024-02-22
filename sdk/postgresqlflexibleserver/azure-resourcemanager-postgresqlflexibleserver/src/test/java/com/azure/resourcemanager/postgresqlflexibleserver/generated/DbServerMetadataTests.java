// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DbServerMetadata;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerSku;
import com.azure.resourcemanager.postgresqlflexibleserver.models.SkuTier;
import org.junit.jupiter.api.Assertions;

public final class DbServerMetadataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DbServerMetadata model = BinaryData.fromString(
            "{\"location\":\"uuximerq\",\"version\":\"bw\",\"storageMb\":880028215,\"sku\":{\"name\":\"ykutwpf\",\"tier\":\"MemoryOptimized\"}}")
            .toObject(DbServerMetadata.class);
        Assertions.assertEquals("bw", model.version());
        Assertions.assertEquals(880028215, model.storageMb());
        Assertions.assertEquals("ykutwpf", model.sku().name());
        Assertions.assertEquals(SkuTier.MEMORY_OPTIMIZED, model.sku().tier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DbServerMetadata model = new DbServerMetadata().withVersion("bw").withStorageMb(880028215)
            .withSku(new ServerSku().withName("ykutwpf").withTier(SkuTier.MEMORY_OPTIMIZED));
        model = BinaryData.fromObject(model).toObject(DbServerMetadata.class);
        Assertions.assertEquals("bw", model.version());
        Assertions.assertEquals(880028215, model.storageMb());
        Assertions.assertEquals("ykutwpf", model.sku().name());
        Assertions.assertEquals(SkuTier.MEMORY_OPTIMIZED, model.sku().tier());
    }
}
