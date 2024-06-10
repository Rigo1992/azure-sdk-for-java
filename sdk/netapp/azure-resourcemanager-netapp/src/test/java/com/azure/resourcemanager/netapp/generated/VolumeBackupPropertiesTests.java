// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.VolumeBackupProperties;
import org.junit.jupiter.api.Assertions;

public final class VolumeBackupPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeBackupProperties model
            = BinaryData.fromString("{\"backupPolicyId\":\"rn\",\"policyEnforced\":true,\"backupVaultId\":\"q\"}")
                .toObject(VolumeBackupProperties.class);
        Assertions.assertEquals("rn", model.backupPolicyId());
        Assertions.assertEquals(true, model.policyEnforced());
        Assertions.assertEquals("q", model.backupVaultId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeBackupProperties model
            = new VolumeBackupProperties().withBackupPolicyId("rn").withPolicyEnforced(true).withBackupVaultId("q");
        model = BinaryData.fromObject(model).toObject(VolumeBackupProperties.class);
        Assertions.assertEquals("rn", model.backupPolicyId());
        Assertions.assertEquals(true, model.policyEnforced());
        Assertions.assertEquals("q", model.backupVaultId());
    }
}
