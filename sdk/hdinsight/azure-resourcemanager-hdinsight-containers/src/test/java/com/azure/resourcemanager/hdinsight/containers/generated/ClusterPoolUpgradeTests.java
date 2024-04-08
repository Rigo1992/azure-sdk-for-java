// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolUpgrade;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolUpgradeProperties;

public final class ClusterPoolUpgradeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolUpgrade model
            = BinaryData.fromString("{\"properties\":{\"upgradeType\":\"ClusterPoolUpgradeProperties\"}}")
                .toObject(ClusterPoolUpgrade.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolUpgrade model = new ClusterPoolUpgrade().withProperties(new ClusterPoolUpgradeProperties());
        model = BinaryData.fromObject(model).toObject(ClusterPoolUpgrade.class);
    }
}
