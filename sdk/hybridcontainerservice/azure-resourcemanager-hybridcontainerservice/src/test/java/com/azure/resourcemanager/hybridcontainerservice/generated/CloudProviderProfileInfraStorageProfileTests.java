// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfileInfraStorageProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CloudProviderProfileInfraStorageProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudProviderProfileInfraStorageProfile model =
            BinaryData
                .fromString("{\"storageSpaceIds\":[\"qvuhrhcffcyddglm\",\"t\"]}")
                .toObject(CloudProviderProfileInfraStorageProfile.class);
        Assertions.assertEquals("qvuhrhcffcyddglm", model.storageSpaceIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudProviderProfileInfraStorageProfile model =
            new CloudProviderProfileInfraStorageProfile().withStorageSpaceIds(Arrays.asList("qvuhrhcffcyddglm", "t"));
        model = BinaryData.fromObject(model).toObject(CloudProviderProfileInfraStorageProfile.class);
        Assertions.assertEquals("qvuhrhcffcyddglm", model.storageSpaceIds().get(0));
    }
}
