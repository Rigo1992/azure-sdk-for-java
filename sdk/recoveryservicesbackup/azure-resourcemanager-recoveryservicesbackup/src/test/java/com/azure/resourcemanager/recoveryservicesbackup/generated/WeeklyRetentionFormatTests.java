// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeekOfMonth;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionFormat;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WeeklyRetentionFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WeeklyRetentionFormat model = BinaryData.fromString(
            "{\"daysOfTheWeek\":[\"Thursday\",\"Thursday\",\"Saturday\"],\"weeksOfTheMonth\":[\"Second\",\"Second\",\"Third\"]}")
            .toObject(WeeklyRetentionFormat.class);
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.SECOND, model.weeksOfTheMonth().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WeeklyRetentionFormat model = new WeeklyRetentionFormat()
            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.THURSDAY, DayOfWeek.THURSDAY, DayOfWeek.SATURDAY))
            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.SECOND, WeekOfMonth.SECOND, WeekOfMonth.THIRD));
        model = BinaryData.fromObject(model).toObject(WeeklyRetentionFormat.class);
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.SECOND, model.weeksOfTheMonth().get(0));
    }
}
