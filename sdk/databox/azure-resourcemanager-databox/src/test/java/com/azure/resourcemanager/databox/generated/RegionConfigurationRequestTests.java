// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.RegionConfigurationRequest;
import com.azure.resourcemanager.databox.models.ScheduleAvailabilityRequest;
import com.azure.resourcemanager.databox.models.SkuName;
import com.azure.resourcemanager.databox.models.TransportAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class RegionConfigurationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionConfigurationRequest model =
            BinaryData
                .fromString(
                    "{\"scheduleAvailabilityRequest\":{\"skuName\":\"ScheduleAvailabilityRequest\",\"storageLocation\":\"fvovbvmeuecivy\",\"country\":\"ce\"},\"transportAvailabilityRequest\":{\"skuName\":\"DataBoxHeavy\"}}")
                .toObject(RegionConfigurationRequest.class);
        Assertions.assertEquals("fvovbvmeuecivy", model.scheduleAvailabilityRequest().storageLocation());
        Assertions.assertEquals("ce", model.scheduleAvailabilityRequest().country());
        Assertions.assertEquals(SkuName.DATA_BOX_HEAVY, model.transportAvailabilityRequest().skuName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionConfigurationRequest model =
            new RegionConfigurationRequest()
                .withScheduleAvailabilityRequest(
                    new ScheduleAvailabilityRequest().withStorageLocation("fvovbvmeuecivy").withCountry("ce"))
                .withTransportAvailabilityRequest(
                    new TransportAvailabilityRequest().withSkuName(SkuName.DATA_BOX_HEAVY));
        model = BinaryData.fromObject(model).toObject(RegionConfigurationRequest.class);
        Assertions.assertEquals("fvovbvmeuecivy", model.scheduleAvailabilityRequest().storageLocation());
        Assertions.assertEquals("ce", model.scheduleAvailabilityRequest().country());
        Assertions.assertEquals(SkuName.DATA_BOX_HEAVY, model.transportAvailabilityRequest().skuName());
    }
}
