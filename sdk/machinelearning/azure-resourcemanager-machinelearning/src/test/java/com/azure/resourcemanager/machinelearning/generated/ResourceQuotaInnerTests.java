// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.ResourceQuotaInner;
import org.junit.jupiter.api.Test;

public final class ResourceQuotaInnerTests {
    @Test
    public void testDeserialize() {
        ResourceQuotaInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"bkh\",\"amlWorkspaceLocation\":\"deyeamdphagalpbu\",\"type\":\"gipwhonowkg\",\"name\":{\"value\":\"ankixzbinjeput\",\"localizedValue\":\"rywn\"},\"limit\":4868014576917618697,\"unit\":\"Count\"}")
                .toObject(ResourceQuotaInner.class);
    }

    @Test
    public void testSerialize() {
        ResourceQuotaInner model = new ResourceQuotaInner();
        model = BinaryData.fromObject(model).toObject(ResourceQuotaInner.class);
    }
}
