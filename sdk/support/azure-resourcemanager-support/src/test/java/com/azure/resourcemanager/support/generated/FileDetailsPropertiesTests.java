// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.FileDetailsProperties;
import org.junit.jupiter.api.Assertions;

public final class FileDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileDetailsProperties model = BinaryData.fromString(
            "{\"createdOn\":\"2021-05-25T05:03:14Z\",\"chunkSize\":671328296,\"fileSize\":1223269261,\"numberOfChunks\":2011830272}")
            .toObject(FileDetailsProperties.class);
        Assertions.assertEquals(671328296, model.chunkSize());
        Assertions.assertEquals(1223269261, model.fileSize());
        Assertions.assertEquals(2011830272, model.numberOfChunks());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileDetailsProperties model = new FileDetailsProperties().withChunkSize(671328296).withFileSize(1223269261)
            .withNumberOfChunks(2011830272);
        model = BinaryData.fromObject(model).toObject(FileDetailsProperties.class);
        Assertions.assertEquals(671328296, model.chunkSize());
        Assertions.assertEquals(1223269261, model.fileSize());
        Assertions.assertEquals(2011830272, model.numberOfChunks());
    }
}
