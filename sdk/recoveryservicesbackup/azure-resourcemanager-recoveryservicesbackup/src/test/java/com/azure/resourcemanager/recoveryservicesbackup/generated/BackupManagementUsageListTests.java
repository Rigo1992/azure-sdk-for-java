// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupManagementUsageInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementUsageList;
import com.azure.resourcemanager.recoveryservicesbackup.models.NameInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.UsagesUnit;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BackupManagementUsageListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupManagementUsageList model = BinaryData.fromString(
            "{\"value\":[{\"unit\":\"Percent\",\"quotaPeriod\":\"ouskcqvkocrc\",\"nextResetTime\":\"2021-02-11T18:18:15Z\",\"currentValue\":5768373522529510794,\"limit\":104740040232311726,\"name\":{\"value\":\"biksq\",\"localizedValue\":\"lssai\"}},{\"unit\":\"CountPerSecond\",\"quotaPeriod\":\"wnzlljfmppeeb\",\"nextResetTime\":\"2021-11-23T16:03:48Z\",\"currentValue\":8457329254467091392,\"limit\":1088287690642884629,\"name\":{\"value\":\"uujitcjc\",\"localizedValue\":\"zevndhkrwpdappds\"}},{\"unit\":\"Percent\",\"quotaPeriod\":\"wrwjfeu\",\"nextResetTime\":\"2021-11-14T12:39:29Z\",\"currentValue\":5558562364469410639,\"limit\":7488631932267615574,\"name\":{\"value\":\"ldhugjzzdatqxh\",\"localizedValue\":\"dgeablgphu\"}}]}")
            .toObject(BackupManagementUsageList.class);
        Assertions.assertEquals(UsagesUnit.PERCENT, model.value().get(0).unit());
        Assertions.assertEquals("ouskcqvkocrc", model.value().get(0).quotaPeriod());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-11T18:18:15Z"), model.value().get(0).nextResetTime());
        Assertions.assertEquals(5768373522529510794L, model.value().get(0).currentValue());
        Assertions.assertEquals(104740040232311726L, model.value().get(0).limit());
        Assertions.assertEquals("biksq", model.value().get(0).name().value());
        Assertions.assertEquals("lssai", model.value().get(0).name().localizedValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupManagementUsageList model = new BackupManagementUsageList().withValue(Arrays.asList(
            new BackupManagementUsageInner().withUnit(UsagesUnit.PERCENT).withQuotaPeriod("ouskcqvkocrc")
                .withNextResetTime(OffsetDateTime.parse("2021-02-11T18:18:15Z")).withCurrentValue(5768373522529510794L)
                .withLimit(104740040232311726L).withName(new NameInfo().withValue("biksq").withLocalizedValue("lssai")),
            new BackupManagementUsageInner().withUnit(UsagesUnit.COUNT_PER_SECOND).withQuotaPeriod("wnzlljfmppeeb")
                .withNextResetTime(OffsetDateTime.parse("2021-11-23T16:03:48Z")).withCurrentValue(8457329254467091392L)
                .withLimit(1088287690642884629L)
                .withName(new NameInfo().withValue("uujitcjc").withLocalizedValue("zevndhkrwpdappds")),
            new BackupManagementUsageInner().withUnit(UsagesUnit.PERCENT).withQuotaPeriod("wrwjfeu")
                .withNextResetTime(OffsetDateTime.parse("2021-11-14T12:39:29Z")).withCurrentValue(5558562364469410639L)
                .withLimit(7488631932267615574L)
                .withName(new NameInfo().withValue("ldhugjzzdatqxh").withLocalizedValue("dgeablgphu"))));
        model = BinaryData.fromObject(model).toObject(BackupManagementUsageList.class);
        Assertions.assertEquals(UsagesUnit.PERCENT, model.value().get(0).unit());
        Assertions.assertEquals("ouskcqvkocrc", model.value().get(0).quotaPeriod());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-11T18:18:15Z"), model.value().get(0).nextResetTime());
        Assertions.assertEquals(5768373522529510794L, model.value().get(0).currentValue());
        Assertions.assertEquals(104740040232311726L, model.value().get(0).limit());
        Assertions.assertEquals("biksq", model.value().get(0).name().value());
        Assertions.assertEquals("lssai", model.value().get(0).name().localizedValue());
    }
}
