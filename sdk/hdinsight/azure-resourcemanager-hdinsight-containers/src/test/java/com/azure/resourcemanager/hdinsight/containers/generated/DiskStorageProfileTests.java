// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.DataDiskType;
import com.azure.resourcemanager.hdinsight.containers.models.DiskStorageProfile;
import org.junit.jupiter.api.Assertions;

public final class DiskStorageProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskStorageProfile model
            = BinaryData.fromString("{\"dataDiskSize\":1565866782,\"dataDiskType\":\"Standard_HDD_LRS\"}")
                .toObject(DiskStorageProfile.class);
        Assertions.assertEquals(1565866782, model.dataDiskSize());
        Assertions.assertEquals(DataDiskType.STANDARD_HDD_LRS, model.dataDiskType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskStorageProfile model
            = new DiskStorageProfile().withDataDiskSize(1565866782).withDataDiskType(DataDiskType.STANDARD_HDD_LRS);
        model = BinaryData.fromObject(model).toObject(DiskStorageProfile.class);
        Assertions.assertEquals(1565866782, model.dataDiskSize());
        Assertions.assertEquals(DataDiskType.STANDARD_HDD_LRS, model.dataDiskType());
    }
}
