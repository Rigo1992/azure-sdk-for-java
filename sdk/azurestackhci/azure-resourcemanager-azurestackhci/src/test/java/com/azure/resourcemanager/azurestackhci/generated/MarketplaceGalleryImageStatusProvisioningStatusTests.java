// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.MarketplaceGalleryImageStatusProvisioningStatus;
import com.azure.resourcemanager.azurestackhci.models.Status;
import org.junit.jupiter.api.Assertions;

public final class MarketplaceGalleryImageStatusProvisioningStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplaceGalleryImageStatusProvisioningStatus model =
            BinaryData
                .fromString("{\"operationId\":\"czvyifq\",\"status\":\"InProgress\"}")
                .toObject(MarketplaceGalleryImageStatusProvisioningStatus.class);
        Assertions.assertEquals("czvyifq", model.operationId());
        Assertions.assertEquals(Status.IN_PROGRESS, model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplaceGalleryImageStatusProvisioningStatus model =
            new MarketplaceGalleryImageStatusProvisioningStatus()
                .withOperationId("czvyifq")
                .withStatus(Status.IN_PROGRESS);
        model = BinaryData.fromObject(model).toObject(MarketplaceGalleryImageStatusProvisioningStatus.class);
        Assertions.assertEquals("czvyifq", model.operationId());
        Assertions.assertEquals(Status.IN_PROGRESS, model.status());
    }
}
