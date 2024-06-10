// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumePatchParams;
import org.junit.jupiter.api.Assertions;

public final class SubvolumePatchParamsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumePatchParams model = BinaryData.fromString("{\"size\":3671939650811911074,\"path\":\"rc\"}")
            .toObject(SubvolumePatchParams.class);
        Assertions.assertEquals(3671939650811911074L, model.size());
        Assertions.assertEquals("rc", model.path());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumePatchParams model = new SubvolumePatchParams().withSize(3671939650811911074L).withPath("rc");
        model = BinaryData.fromObject(model).toObject(SubvolumePatchParams.class);
        Assertions.assertEquals(3671939650811911074L, model.size());
        Assertions.assertEquals("rc", model.path());
    }
}
