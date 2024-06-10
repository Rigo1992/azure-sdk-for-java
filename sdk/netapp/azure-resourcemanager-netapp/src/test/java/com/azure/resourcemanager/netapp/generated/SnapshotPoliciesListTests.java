// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotPolicyInner;
import com.azure.resourcemanager.netapp.models.DailySchedule;
import com.azure.resourcemanager.netapp.models.HourlySchedule;
import com.azure.resourcemanager.netapp.models.MonthlySchedule;
import com.azure.resourcemanager.netapp.models.SnapshotPoliciesList;
import com.azure.resourcemanager.netapp.models.WeeklySchedule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SnapshotPoliciesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotPoliciesList model = BinaryData.fromString(
            "{\"value\":[{\"etag\":\"mtdaa\",\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":76843266,\"minute\":712155204,\"usedBytes\":2693420757845693746},\"dailySchedule\":{\"snapshotsToKeep\":114567922,\"hour\":11348761,\"minute\":2141817167,\"usedBytes\":4267712994723917741},\"weeklySchedule\":{\"snapshotsToKeep\":999653937,\"day\":\"gyqagvrvmnpkuk\",\"hour\":101100234,\"minute\":972343553,\"usedBytes\":2732082136167741922},\"monthlySchedule\":{\"snapshotsToKeep\":261614569,\"daysOfMonth\":\"fnjhfjxwmszkkfo\",\"hour\":272856491,\"minute\":1631223460,\"usedBytes\":2234038582671997054},\"enabled\":true,\"provisioningState\":\"aw\"},\"location\":\"a\",\"tags\":{\"elsfeaen\":\"wczelpci\",\"dxbjhwuaanozj\":\"abfatkl\",\"l\":\"sphyoulpjrvxa\"},\"id\":\"vimjwos\",\"name\":\"tx\",\"type\":\"tcs\"},{\"etag\":\"cktqumiekkezzi\",\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":533136991,\"minute\":1852856811,\"usedBytes\":870123737032837195},\"dailySchedule\":{\"snapshotsToKeep\":757390701,\"hour\":558583308,\"minute\":248292806,\"usedBytes\":7503859559209455505},\"weeklySchedule\":{\"snapshotsToKeep\":2021053825,\"day\":\"db\",\"hour\":1233334035,\"minute\":1541394178,\"usedBytes\":2451673053694449606},\"monthlySchedule\":{\"snapshotsToKeep\":1459715111,\"daysOfMonth\":\"jmoadsuv\",\"hour\":171529990,\"minute\":1301778060,\"usedBytes\":6230833948035893197},\"enabled\":false,\"provisioningState\":\"bjhhyx\"},\"location\":\"wlycoduhpkxkg\",\"tags\":{\"n\":\"re\",\"ubeddg\":\"jxqugjhky\"},\"id\":\"sofwqmzqalkrmnji\",\"name\":\"pxacqqudfn\",\"type\":\"yxbaaabjyvayf\"},{\"etag\":\"m\",\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":543650546,\"minute\":1520746749,\"usedBytes\":3305179615922528552},\"dailySchedule\":{\"snapshotsToKeep\":239466068,\"hour\":218306871,\"minute\":850324011,\"usedBytes\":6600025114283053959},\"weeklySchedule\":{\"snapshotsToKeep\":2059840008,\"day\":\"wzsyyceuzs\",\"hour\":1342883301,\"minute\":414197490,\"usedBytes\":3706325358985550286},\"monthlySchedule\":{\"snapshotsToKeep\":1769429451,\"daysOfMonth\":\"thzvaytdwkqbrqu\",\"hour\":749295202,\"minute\":31333478,\"usedBytes\":6004961335529412054},\"enabled\":false,\"provisioningState\":\"vpdtiirqtdqoa\"},\"location\":\"r\",\"tags\":{\"amxjezwlw\":\"gsquyfxrxxlept\",\"ojknio\":\"wxuqlcvydypatdoo\"},\"id\":\"kooebwnu\",\"name\":\"hemms\",\"type\":\"vdkcrodtj\"}]}")
            .toObject(SnapshotPoliciesList.class);
        Assertions.assertEquals("a", model.value().get(0).location());
        Assertions.assertEquals("wczelpci", model.value().get(0).tags().get("elsfeaen"));
        Assertions.assertEquals(76843266, model.value().get(0).hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(712155204, model.value().get(0).hourlySchedule().minute());
        Assertions.assertEquals(2693420757845693746L, model.value().get(0).hourlySchedule().usedBytes());
        Assertions.assertEquals(114567922, model.value().get(0).dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(11348761, model.value().get(0).dailySchedule().hour());
        Assertions.assertEquals(2141817167, model.value().get(0).dailySchedule().minute());
        Assertions.assertEquals(4267712994723917741L, model.value().get(0).dailySchedule().usedBytes());
        Assertions.assertEquals(999653937, model.value().get(0).weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("gyqagvrvmnpkuk", model.value().get(0).weeklySchedule().day());
        Assertions.assertEquals(101100234, model.value().get(0).weeklySchedule().hour());
        Assertions.assertEquals(972343553, model.value().get(0).weeklySchedule().minute());
        Assertions.assertEquals(2732082136167741922L, model.value().get(0).weeklySchedule().usedBytes());
        Assertions.assertEquals(261614569, model.value().get(0).monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("fnjhfjxwmszkkfo", model.value().get(0).monthlySchedule().daysOfMonth());
        Assertions.assertEquals(272856491, model.value().get(0).monthlySchedule().hour());
        Assertions.assertEquals(1631223460, model.value().get(0).monthlySchedule().minute());
        Assertions.assertEquals(2234038582671997054L, model.value().get(0).monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.value().get(0).enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotPoliciesList model = new SnapshotPoliciesList().withValue(Arrays.asList(
            new SnapshotPolicyInner().withLocation("a")
                .withTags(mapOf("elsfeaen", "wczelpci", "dxbjhwuaanozj", "abfatkl", "l", "sphyoulpjrvxa"))
                .withHourlySchedule(new HourlySchedule().withSnapshotsToKeep(76843266)
                    .withMinute(712155204)
                    .withUsedBytes(2693420757845693746L))
                .withDailySchedule(new DailySchedule().withSnapshotsToKeep(114567922)
                    .withHour(11348761)
                    .withMinute(2141817167)
                    .withUsedBytes(4267712994723917741L))
                .withWeeklySchedule(new WeeklySchedule().withSnapshotsToKeep(999653937)
                    .withDay("gyqagvrvmnpkuk")
                    .withHour(101100234)
                    .withMinute(972343553)
                    .withUsedBytes(2732082136167741922L))
                .withMonthlySchedule(new MonthlySchedule().withSnapshotsToKeep(261614569)
                    .withDaysOfMonth("fnjhfjxwmszkkfo")
                    .withHour(272856491)
                    .withMinute(1631223460)
                    .withUsedBytes(2234038582671997054L))
                .withEnabled(true),
            new SnapshotPolicyInner().withLocation("wlycoduhpkxkg")
                .withTags(mapOf("n", "re", "ubeddg", "jxqugjhky"))
                .withHourlySchedule(new HourlySchedule().withSnapshotsToKeep(533136991)
                    .withMinute(1852856811)
                    .withUsedBytes(870123737032837195L))
                .withDailySchedule(new DailySchedule().withSnapshotsToKeep(757390701)
                    .withHour(558583308)
                    .withMinute(248292806)
                    .withUsedBytes(7503859559209455505L))
                .withWeeklySchedule(new WeeklySchedule().withSnapshotsToKeep(2021053825)
                    .withDay("db")
                    .withHour(1233334035)
                    .withMinute(1541394178)
                    .withUsedBytes(2451673053694449606L))
                .withMonthlySchedule(new MonthlySchedule().withSnapshotsToKeep(1459715111)
                    .withDaysOfMonth("jmoadsuv")
                    .withHour(171529990)
                    .withMinute(1301778060)
                    .withUsedBytes(6230833948035893197L))
                .withEnabled(false),
            new SnapshotPolicyInner().withLocation("r")
                .withTags(mapOf("amxjezwlw", "gsquyfxrxxlept", "ojknio", "wxuqlcvydypatdoo"))
                .withHourlySchedule(new HourlySchedule().withSnapshotsToKeep(543650546)
                    .withMinute(1520746749)
                    .withUsedBytes(3305179615922528552L))
                .withDailySchedule(new DailySchedule().withSnapshotsToKeep(239466068)
                    .withHour(218306871)
                    .withMinute(850324011)
                    .withUsedBytes(6600025114283053959L))
                .withWeeklySchedule(new WeeklySchedule().withSnapshotsToKeep(2059840008)
                    .withDay("wzsyyceuzs")
                    .withHour(1342883301)
                    .withMinute(414197490)
                    .withUsedBytes(3706325358985550286L))
                .withMonthlySchedule(new MonthlySchedule().withSnapshotsToKeep(1769429451)
                    .withDaysOfMonth("thzvaytdwkqbrqu")
                    .withHour(749295202)
                    .withMinute(31333478)
                    .withUsedBytes(6004961335529412054L))
                .withEnabled(false)));
        model = BinaryData.fromObject(model).toObject(SnapshotPoliciesList.class);
        Assertions.assertEquals("a", model.value().get(0).location());
        Assertions.assertEquals("wczelpci", model.value().get(0).tags().get("elsfeaen"));
        Assertions.assertEquals(76843266, model.value().get(0).hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(712155204, model.value().get(0).hourlySchedule().minute());
        Assertions.assertEquals(2693420757845693746L, model.value().get(0).hourlySchedule().usedBytes());
        Assertions.assertEquals(114567922, model.value().get(0).dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(11348761, model.value().get(0).dailySchedule().hour());
        Assertions.assertEquals(2141817167, model.value().get(0).dailySchedule().minute());
        Assertions.assertEquals(4267712994723917741L, model.value().get(0).dailySchedule().usedBytes());
        Assertions.assertEquals(999653937, model.value().get(0).weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("gyqagvrvmnpkuk", model.value().get(0).weeklySchedule().day());
        Assertions.assertEquals(101100234, model.value().get(0).weeklySchedule().hour());
        Assertions.assertEquals(972343553, model.value().get(0).weeklySchedule().minute());
        Assertions.assertEquals(2732082136167741922L, model.value().get(0).weeklySchedule().usedBytes());
        Assertions.assertEquals(261614569, model.value().get(0).monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("fnjhfjxwmszkkfo", model.value().get(0).monthlySchedule().daysOfMonth());
        Assertions.assertEquals(272856491, model.value().get(0).monthlySchedule().hour());
        Assertions.assertEquals(1631223460, model.value().get(0).monthlySchedule().minute());
        Assertions.assertEquals(2234038582671997054L, model.value().get(0).monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.value().get(0).enabled());
    }

    // Use "Map.of" if available
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
