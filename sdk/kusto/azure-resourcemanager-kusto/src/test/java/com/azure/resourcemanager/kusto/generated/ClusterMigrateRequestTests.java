// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.ClusterMigrateRequest;
import org.junit.jupiter.api.Assertions;

public final class ClusterMigrateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterMigrateRequest model =
            BinaryData.fromString("{\"clusterResourceId\":\"cpr\"}").toObject(ClusterMigrateRequest.class);
        Assertions.assertEquals("cpr", model.clusterResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterMigrateRequest model = new ClusterMigrateRequest().withClusterResourceId("cpr");
        model = BinaryData.fromObject(model).toObject(ClusterMigrateRequest.class);
        Assertions.assertEquals("cpr", model.clusterResourceId());
    }
}
