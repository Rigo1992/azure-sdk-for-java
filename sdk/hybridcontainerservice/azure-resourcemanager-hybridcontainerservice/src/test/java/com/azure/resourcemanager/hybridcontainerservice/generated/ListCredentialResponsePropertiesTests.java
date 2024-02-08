// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.ListCredentialResponseProperties;

public final class ListCredentialResponsePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListCredentialResponseProperties model = BinaryData.fromString("{\"kubeconfigs\":[{\"name\":\"mvvd\"}]}")
            .toObject(ListCredentialResponseProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListCredentialResponseProperties model = new ListCredentialResponseProperties();
        model = BinaryData.fromObject(model).toObject(ListCredentialResponseProperties.class);
    }
}
