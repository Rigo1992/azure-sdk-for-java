// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner;
import com.azure.resourcemanager.devtestlabs.models.DayDetails;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.HourDetails;
import com.azure.resourcemanager.devtestlabs.models.NotificationSettings;
import com.azure.resourcemanager.devtestlabs.models.WeekDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ServiceFabricSchedules CreateOrUpdate. */
public final class ServiceFabricSchedulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/ServiceFabricSchedules_CreateOrUpdate.json
     */
    /**
     * Sample code: ServiceFabricSchedules_CreateOrUpdate.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void serviceFabricSchedulesCreateOrUpdate(
        com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .serviceFabricSchedules()
            .createOrUpdateWithResponse(
                "resourceGroupName",
                "{labName}",
                "@me",
                "{serviceFrabicName}",
                "{scheduleName}",
                new ScheduleInner()
                    .withLocation("{location}")
                    .withTags(mapOf("tagName1", "tagValue1"))
                    .withStatus(EnableStatus.fromString("{Enabled|Disabled}"))
                    .withTaskType(
                        "{Unknown|LabVmsShutdownTask|LabVmsStartupTask|LabVmReclamationTask|ComputeVmShutdownTask}")
                    .withWeeklyRecurrence(
                        new WeekDetails()
                            .withWeekdays(
                                Arrays
                                    .asList(
                                        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"))
                            .withTime("19:00"))
                    .withDailyRecurrence(new DayDetails().withTime("19:00"))
                    .withHourlyRecurrence(new HourDetails().withMinute(0))
                    .withTimeZoneId("Pacific Standard Time")
                    .withNotificationSettings(
                        new NotificationSettings()
                            .withStatus(EnableStatus.fromString("{Enabled|Disabled}"))
                            .withTimeInMinutes(15)
                            .withWebhookUrl("{webhoolUrl}")
                            .withEmailRecipient("{email}")
                            .withNotificationLocale("EN"))
                    .withTargetResourceId(
                        "/subscriptions/{subscriptionId}/resourceGroups/resourceGroupName/providers/Microsoft.DevTestLab/labs/{labName}/users/{uniqueIdentifier}/servicefabrics/{serviceFrabicName}"),
                com.azure.core.util.Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
