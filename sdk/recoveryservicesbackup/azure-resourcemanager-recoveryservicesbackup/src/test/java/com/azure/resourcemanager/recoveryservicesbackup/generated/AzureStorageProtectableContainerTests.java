// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureStorageProtectableContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import org.junit.jupiter.api.Assertions;

public final class AzureStorageProtectableContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureStorageProtectableContainer model = BinaryData.fromString(
            "{\"protectableContainerType\":\"StorageContainer\",\"friendlyName\":\"gguxhemlwyw\",\"backupManagementType\":\"AzureIaasVM\",\"healthStatus\":\"zgfbukklelssx\",\"containerId\":\"ycsxzu\"}")
            .toObject(AzureStorageProtectableContainer.class);
        Assertions.assertEquals("gguxhemlwyw", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_IAAS_VM, model.backupManagementType());
        Assertions.assertEquals("zgfbukklelssx", model.healthStatus());
        Assertions.assertEquals("ycsxzu", model.containerId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureStorageProtectableContainer model = new AzureStorageProtectableContainer().withFriendlyName("gguxhemlwyw")
            .withBackupManagementType(BackupManagementType.AZURE_IAAS_VM).withHealthStatus("zgfbukklelssx")
            .withContainerId("ycsxzu");
        model = BinaryData.fromObject(model).toObject(AzureStorageProtectableContainer.class);
        Assertions.assertEquals("gguxhemlwyw", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_IAAS_VM, model.backupManagementType());
        Assertions.assertEquals("zgfbukklelssx", model.healthStatus());
        Assertions.assertEquals("ycsxzu", model.containerId());
    }
}
