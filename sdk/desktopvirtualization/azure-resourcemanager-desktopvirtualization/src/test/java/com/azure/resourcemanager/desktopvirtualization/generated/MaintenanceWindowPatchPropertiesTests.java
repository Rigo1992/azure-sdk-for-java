// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.MaintenanceWindowPatchProperties;
import org.junit.jupiter.api.Assertions;

public final class MaintenanceWindowPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MaintenanceWindowPatchProperties model =
            BinaryData
                .fromString("{\"hour\":1586709440,\"dayOfWeek\":\"Tuesday\"}")
                .toObject(MaintenanceWindowPatchProperties.class);
        Assertions.assertEquals(1586709440, model.hour());
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.dayOfWeek());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MaintenanceWindowPatchProperties model =
            new MaintenanceWindowPatchProperties().withHour(1586709440).withDayOfWeek(DayOfWeek.TUESDAY);
        model = BinaryData.fromObject(model).toObject(MaintenanceWindowPatchProperties.class);
        Assertions.assertEquals(1586709440, model.hour());
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.dayOfWeek());
    }
}
