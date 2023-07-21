// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.fluent.models.StartStopManagedInstanceScheduleInner;
import com.azure.resourcemanager.sql.models.DayOfWeek;
import com.azure.resourcemanager.sql.models.ScheduleItem;
import com.azure.resourcemanager.sql.models.StartStopScheduleName;
import java.util.Arrays;

/** Samples for StartStopManagedInstanceSchedules CreateOrUpdate. */
public final class StartStopManagedInstanceSchedulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/StartStopManagedInstanceScheduleCreateOrUpdateMin.json
     */
    /**
     * Sample code: Creates or updates the managed instance's Start/Stop schedule with no optional parameters specified.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createsOrUpdatesTheManagedInstanceSStartStopScheduleWithNoOptionalParametersSpecified(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getStartStopManagedInstanceSchedules()
            .createOrUpdateWithResponse(
                "schedulerg",
                "schedulemi",
                StartStopScheduleName.DEFAULT,
                new StartStopManagedInstanceScheduleInner()
                    .withScheduleList(
                        Arrays
                            .asList(
                                new ScheduleItem()
                                    .withStartDay(DayOfWeek.THURSDAY)
                                    .withStartTime("18:00")
                                    .withStopDay(DayOfWeek.THURSDAY)
                                    .withStopTime("17:00"),
                                new ScheduleItem()
                                    .withStartDay(DayOfWeek.THURSDAY)
                                    .withStartTime("15:00")
                                    .withStopDay(DayOfWeek.THURSDAY)
                                    .withStopTime("14:00"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/StartStopManagedInstanceScheduleCreateOrUpdateMax.json
     */
    /**
     * Sample code: Creates or updates the managed instance's Start/Stop schedule with all optional parameters
     * specified.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createsOrUpdatesTheManagedInstanceSStartStopScheduleWithAllOptionalParametersSpecified(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getStartStopManagedInstanceSchedules()
            .createOrUpdateWithResponse(
                "schedulerg",
                "schedulemi",
                StartStopScheduleName.DEFAULT,
                new StartStopManagedInstanceScheduleInner()
                    .withDescription("This is a schedule for our Dev/Test environment.")
                    .withTimeZoneId("Central European Standard Time")
                    .withScheduleList(
                        Arrays
                            .asList(
                                new ScheduleItem()
                                    .withStartDay(DayOfWeek.THURSDAY)
                                    .withStartTime("18:00")
                                    .withStopDay(DayOfWeek.THURSDAY)
                                    .withStopTime("17:00"),
                                new ScheduleItem()
                                    .withStartDay(DayOfWeek.THURSDAY)
                                    .withStartTime("15:00")
                                    .withStopDay(DayOfWeek.THURSDAY)
                                    .withStopTime("14:00"))),
                com.azure.core.util.Context.NONE);
    }
}
