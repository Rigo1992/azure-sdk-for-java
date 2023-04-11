// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.AzureADOnlyAuthenticationInner;
import org.junit.jupiter.api.Assertions;

public final class AzureADOnlyAuthenticationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureADOnlyAuthenticationInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"azureADOnlyAuthentication\":true,\"state\":\"InConsistent\",\"creationDate\":\"2021-07-30T08:26:42Z\"},\"id\":\"gjxpybczmehmt\",\"name\":\"opb\",\"type\":\"phrupidgsybbejhp\"}")
                .toObject(AzureADOnlyAuthenticationInner.class);
        Assertions.assertEquals(true, model.azureADOnlyAuthentication());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureADOnlyAuthenticationInner model = new AzureADOnlyAuthenticationInner().withAzureADOnlyAuthentication(true);
        model = BinaryData.fromObject(model).toObject(AzureADOnlyAuthenticationInner.class);
        Assertions.assertEquals(true, model.azureADOnlyAuthentication());
    }
}
