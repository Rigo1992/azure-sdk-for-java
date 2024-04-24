// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.FileDetailsInner;
import com.azure.resourcemanager.support.models.FilesListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FilesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FilesListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"createdOn\":\"2021-05-13T14:02:05Z\",\"chunkSize\":799059143,\"fileSize\":1248501015,\"numberOfChunks\":712173581},\"id\":\"konzmnsik\",\"name\":\"mkqzeqqkdltfzxmh\",\"type\":\"v\"}],\"nextLink\":\"ur\"}")
            .toObject(FilesListResult.class);
        Assertions.assertEquals(799059143, model.value().get(0).chunkSize());
        Assertions.assertEquals(1248501015, model.value().get(0).fileSize());
        Assertions.assertEquals(712173581, model.value().get(0).numberOfChunks());
        Assertions.assertEquals("ur", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FilesListResult model = new FilesListResult()
            .withValue(Arrays.asList(
                new FileDetailsInner().withChunkSize(799059143).withFileSize(1248501015).withNumberOfChunks(712173581)))
            .withNextLink("ur");
        model = BinaryData.fromObject(model).toObject(FilesListResult.class);
        Assertions.assertEquals(799059143, model.value().get(0).chunkSize());
        Assertions.assertEquals(1248501015, model.value().get(0).fileSize());
        Assertions.assertEquals(712173581, model.value().get(0).numberOfChunks());
        Assertions.assertEquals("ur", model.nextLink());
    }
}
