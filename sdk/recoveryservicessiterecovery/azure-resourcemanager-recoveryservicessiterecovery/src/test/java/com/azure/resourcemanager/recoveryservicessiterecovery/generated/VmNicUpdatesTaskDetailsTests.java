// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VmNicUpdatesTaskDetails;
import org.junit.jupiter.api.Assertions;

public final class VmNicUpdatesTaskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmNicUpdatesTaskDetails model = BinaryData.fromString(
            "{\"instanceType\":\"VmNicUpdatesTaskDetails\",\"vmId\":\"zertkounz\",\"nicId\":\"ywhubymfpopik\",\"name\":\"b\"}")
            .toObject(VmNicUpdatesTaskDetails.class);
        Assertions.assertEquals("zertkounz", model.vmId());
        Assertions.assertEquals("ywhubymfpopik", model.nicId());
        Assertions.assertEquals("b", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmNicUpdatesTaskDetails model
            = new VmNicUpdatesTaskDetails().withVmId("zertkounz").withNicId("ywhubymfpopik").withName("b");
        model = BinaryData.fromObject(model).toObject(VmNicUpdatesTaskDetails.class);
        Assertions.assertEquals("zertkounz", model.vmId());
        Assertions.assertEquals("ywhubymfpopik", model.nicId());
        Assertions.assertEquals("b", model.name());
    }
}
