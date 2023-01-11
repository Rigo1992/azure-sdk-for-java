// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.GalleryInner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GalleryInnerTests {
    @Test
    public void testDeserialize() {
        GalleryInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Creating\",\"galleryResourceId\":\"kajionpim\"},\"id\":\"gstxgcp\",\"name\":\"dg\",\"type\":\"aajrm\"}")
                .toObject(GalleryInner.class);
        Assertions.assertEquals("kajionpim", model.galleryResourceId());
    }

    @Test
    public void testSerialize() {
        GalleryInner model = new GalleryInner().withGalleryResourceId("kajionpim");
        model = BinaryData.fromObject(model).toObject(GalleryInner.class);
        Assertions.assertEquals("kajionpim", model.galleryResourceId());
    }
}
