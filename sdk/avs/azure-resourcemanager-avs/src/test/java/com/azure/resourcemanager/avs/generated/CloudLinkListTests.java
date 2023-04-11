// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.CloudLinkList;

public final class CloudLinkListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudLinkList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"status\":\"Building\",\"linkedCloud\":\"n\"},\"id\":\"a\",\"name\":\"vxwc\",\"type\":\"elpcirelsfeaenwa\"}],\"nextLink\":\"atklddxbjhwuaa\"}")
                .toObject(CloudLinkList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudLinkList model = new CloudLinkList();
        model = BinaryData.fromObject(model).toObject(CloudLinkList.class);
    }
}
