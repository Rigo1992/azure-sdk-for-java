// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupRecoveryPointResourceInner;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRecoveryPoint;

public final class AzureBackupRecoveryPointResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupRecoveryPointResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"objectType\":\"AzureBackupRecoveryPoint\"},\"id\":\"myskpbhenbtkcxy\",\"name\":\"ny\",\"type\":\"nrs\"}")
                .toObject(AzureBackupRecoveryPointResourceInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupRecoveryPointResourceInner model =
            new AzureBackupRecoveryPointResourceInner().withProperties(new AzureBackupRecoveryPoint());
        model = BinaryData.fromObject(model).toObject(AzureBackupRecoveryPointResourceInner.class);
    }
}
