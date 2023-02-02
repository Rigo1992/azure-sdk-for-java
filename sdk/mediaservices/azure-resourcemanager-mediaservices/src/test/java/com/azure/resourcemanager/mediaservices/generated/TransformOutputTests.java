// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.OnErrorType;
import com.azure.resourcemanager.mediaservices.models.Preset;
import com.azure.resourcemanager.mediaservices.models.Priority;
import com.azure.resourcemanager.mediaservices.models.TransformOutput;
import org.junit.jupiter.api.Assertions;

public final class TransformOutputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TransformOutput model =
            BinaryData
                .fromString(
                    "{\"onError\":\"ContinueJob\",\"relativePriority\":\"High\",\"preset\":{\"@odata.type\":\"Preset\"}}")
                .toObject(TransformOutput.class);
        Assertions.assertEquals(OnErrorType.CONTINUE_JOB, model.onError());
        Assertions.assertEquals(Priority.HIGH, model.relativePriority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TransformOutput model =
            new TransformOutput()
                .withOnError(OnErrorType.CONTINUE_JOB)
                .withRelativePriority(Priority.HIGH)
                .withPreset(new Preset());
        model = BinaryData.fromObject(model).toObject(TransformOutput.class);
        Assertions.assertEquals(OnErrorType.CONTINUE_JOB, model.onError());
        Assertions.assertEquals(Priority.HIGH, model.relativePriority());
    }
}
