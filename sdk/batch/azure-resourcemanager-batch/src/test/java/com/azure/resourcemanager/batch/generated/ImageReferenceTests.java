// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.ImageReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageReferenceTests {
    @Test
    public void testDeserialize() {
        ImageReference model =
            BinaryData
                .fromString(
                    "{\"publisher\":\"qfsubcgjbirx\",\"offer\":\"ybsrfbjfdtwss\",\"sku\":\"ftpvjzbexil\",\"version\":\"nfqqnvwp\",\"id\":\"taruoujmkcj\"}")
                .toObject(ImageReference.class);
        Assertions.assertEquals("qfsubcgjbirx", model.publisher());
        Assertions.assertEquals("ybsrfbjfdtwss", model.offer());
        Assertions.assertEquals("ftpvjzbexil", model.sku());
        Assertions.assertEquals("nfqqnvwp", model.version());
        Assertions.assertEquals("taruoujmkcj", model.id());
    }

    @Test
    public void testSerialize() {
        ImageReference model =
            new ImageReference()
                .withPublisher("qfsubcgjbirx")
                .withOffer("ybsrfbjfdtwss")
                .withSku("ftpvjzbexil")
                .withVersion("nfqqnvwp")
                .withId("taruoujmkcj");
        model = BinaryData.fromObject(model).toObject(ImageReference.class);
        Assertions.assertEquals("qfsubcgjbirx", model.publisher());
        Assertions.assertEquals("ybsrfbjfdtwss", model.offer());
        Assertions.assertEquals("ftpvjzbexil", model.sku());
        Assertions.assertEquals("nfqqnvwp", model.version());
        Assertions.assertEquals("taruoujmkcj", model.id());
    }
}
