// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.ValidationInputRequest;
import com.azure.resourcemanager.databox.models.ValidationRequest;
import java.util.Arrays;

public final class ValidationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidationRequest model =
            BinaryData
                .fromString(
                    "{\"validationCategory\":\"ValidationRequest\",\"individualRequestDetails\":[{\"validationType\":\"ValidationInputRequest\"},{\"validationType\":\"ValidationInputRequest\"},{\"validationType\":\"ValidationInputRequest\"}]}")
                .toObject(ValidationRequest.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidationRequest model =
            new ValidationRequest()
                .withIndividualRequestDetails(
                    Arrays
                        .asList(
                            new ValidationInputRequest(), new ValidationInputRequest(), new ValidationInputRequest()));
        model = BinaryData.fromObject(model).toObject(ValidationRequest.class);
    }
}
