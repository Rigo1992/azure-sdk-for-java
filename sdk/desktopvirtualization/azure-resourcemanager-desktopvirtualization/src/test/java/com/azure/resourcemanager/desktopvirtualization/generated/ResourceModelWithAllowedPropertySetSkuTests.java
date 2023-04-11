// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetSku;
import com.azure.resourcemanager.desktopvirtualization.models.SkuTier;
import org.junit.jupiter.api.Assertions;

public final class ResourceModelWithAllowedPropertySetSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceModelWithAllowedPropertySetSku model =
            BinaryData
                .fromString(
                    "{\"name\":\"dhsgcba\",\"tier\":\"Standard\",\"size\":\"jkot\",\"family\":\"qgoulznd\",\"capacity\":708367520}")
                .toObject(ResourceModelWithAllowedPropertySetSku.class);
        Assertions.assertEquals("dhsgcba", model.name());
        Assertions.assertEquals(SkuTier.STANDARD, model.tier());
        Assertions.assertEquals("jkot", model.size());
        Assertions.assertEquals("qgoulznd", model.family());
        Assertions.assertEquals(708367520, model.capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceModelWithAllowedPropertySetSku model =
            new ResourceModelWithAllowedPropertySetSku()
                .withName("dhsgcba")
                .withTier(SkuTier.STANDARD)
                .withSize("jkot")
                .withFamily("qgoulznd")
                .withCapacity(708367520);
        model = BinaryData.fromObject(model).toObject(ResourceModelWithAllowedPropertySetSku.class);
        Assertions.assertEquals("dhsgcba", model.name());
        Assertions.assertEquals(SkuTier.STANDARD, model.tier());
        Assertions.assertEquals("jkot", model.size());
        Assertions.assertEquals("qgoulznd", model.family());
        Assertions.assertEquals(708367520, model.capacity());
    }
}
