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
        FilesListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"createdOn\":\"2021-01-17T05:45:18Z\",\"chunkSize\":52.82969,\"fileSize\":4.6342373,\"numberOfChunks\":0.47234893},\"id\":\"lvwiwubmwmbesl\",\"name\":\"nkww\",\"type\":\"pp\"}],\"nextLink\":\"lcxog\"}")
                .toObject(FilesListResult.class);
        Assertions.assertEquals(52.82969F, model.value().get(0).chunkSize());
        Assertions.assertEquals(4.6342373F, model.value().get(0).fileSize());
        Assertions.assertEquals(0.47234893F, model.value().get(0).numberOfChunks());
        Assertions.assertEquals("lcxog", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FilesListResult model =
            new FilesListResult()
                .withValue(
                    Arrays
                        .asList(
                            new FileDetailsInner()
                                .withChunkSize(52.82969F)
                                .withFileSize(4.6342373F)
                                .withNumberOfChunks(0.47234893F)))
                .withNextLink("lcxog");
        model = BinaryData.fromObject(model).toObject(FilesListResult.class);
        Assertions.assertEquals(52.82969F, model.value().get(0).chunkSize());
        Assertions.assertEquals(4.6342373F, model.value().get(0).fileSize());
        Assertions.assertEquals(0.47234893F, model.value().get(0).numberOfChunks());
        Assertions.assertEquals("lcxog", model.nextLink());
    }
}
