// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ImageFormat;
import org.junit.jupiter.api.Assertions;

public final class ImageFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageFormat model =
            BinaryData
                .fromString("{\"@odata.type\":\"#Microsoft.Media.ImageFormat\",\"filenamePattern\":\"fxtsgum\"}")
                .toObject(ImageFormat.class);
        Assertions.assertEquals("fxtsgum", model.filenamePattern());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageFormat model = new ImageFormat().withFilenamePattern("fxtsgum");
        model = BinaryData.fromObject(model).toObject(ImageFormat.class);
        Assertions.assertEquals("fxtsgum", model.filenamePattern());
    }
}
