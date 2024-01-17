// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupEngineBaseResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineBase;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineBaseResourceList;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupEngineBaseResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupEngineBaseResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"backupEngineType\":\"BackupEngineBase\",\"friendlyName\":\"vetvt\",\"backupManagementType\":\"AzureSql\",\"registrationStatus\":\"tdo\",\"backupEngineState\":\"cbxvwvxyslqbh\",\"healthStatus\":\"xoblytkbl\",\"canReRegister\":true,\"backupEngineId\":\"wwfbkrvrnsvshq\",\"dpmVersion\":\"hxcr\",\"azureBackupAgentVersion\":\"fovasr\",\"isAzureBackupAgentUpgradeAvailable\":false,\"isDpmUpgradeAvailable\":true,\"extendedInfo\":{\"databaseName\":\"qfsubcgjbirx\",\"protectedItemsCount\":1282258802,\"protectedServersCount\":592118206,\"diskCount\":2111014163,\"usedDiskSpace\":84.658041031999,\"availableDiskSpace\":19.500555152586518,\"refreshedAt\":\"2021-10-31T01:03:52Z\",\"azureProtectedInstances\":22179172}},\"eTag\":\"tpvjzbexilzznfqq\",\"location\":\"vwpm\",\"tags\":{\"jhwqytjrybnw\":\"ruoujmk\",\"enq\":\"ewgdrjervn\",\"ndoygmifthnzdnd\":\"eh\",\"nayqi\":\"l\"},\"id\":\"ynduha\",\"name\":\"hqlkthumaqo\",\"type\":\"bgycduiertgccym\"},{\"properties\":{\"backupEngineType\":\"BackupEngineBase\",\"friendlyName\":\"l\",\"backupManagementType\":\"Invalid\",\"registrationStatus\":\"qlfmmdnbb\",\"backupEngineState\":\"zpswiydmc\",\"healthStatus\":\"hzdxssadbzm\",\"canReRegister\":true,\"backupEngineId\":\"znud\",\"dpmVersion\":\"dvxzbncblylpst\",\"azureBackupAgentVersion\":\"hh\",\"isAzureBackupAgentUpgradeAvailable\":true,\"isDpmUpgradeAvailable\":false,\"extendedInfo\":{\"databaseName\":\"cers\",\"protectedItemsCount\":1191369251,\"protectedServersCount\":930284042,\"diskCount\":1008975068,\"usedDiskSpace\":74.96310057788091,\"availableDiskSpace\":56.13333824147031,\"refreshedAt\":\"2021-01-31T08:05:10Z\",\"azureProtectedInstances\":1265924746}},\"eTag\":\"lswtmweriofzpyqs\",\"location\":\"mwabnetshhszhedp\",\"tags\":{\"wtppjflcxogaoko\":\"iwubmwmbesldnk\",\"nsikvmkqzeqqkdl\":\"z\"},\"id\":\"fzxmhhvhgureodkw\",\"name\":\"bdagxt\",\"type\":\"bqdxbx\"}],\"nextLink\":\"kbogqxndlkzgx\"}")
                .toObject(BackupEngineBaseResourceList.class);
        Assertions.assertEquals("kbogqxndlkzgx", model.nextLink());
        Assertions.assertEquals("vwpm", model.value().get(0).location());
        Assertions.assertEquals("ruoujmk", model.value().get(0).tags().get("jhwqytjrybnw"));
        Assertions.assertEquals("vetvt", model.value().get(0).properties().friendlyName());
        Assertions
            .assertEquals(BackupManagementType.AZURE_SQL, model.value().get(0).properties().backupManagementType());
        Assertions.assertEquals("tdo", model.value().get(0).properties().registrationStatus());
        Assertions.assertEquals("cbxvwvxyslqbh", model.value().get(0).properties().backupEngineState());
        Assertions.assertEquals("xoblytkbl", model.value().get(0).properties().healthStatus());
        Assertions.assertEquals(true, model.value().get(0).properties().canReRegister());
        Assertions.assertEquals("wwfbkrvrnsvshq", model.value().get(0).properties().backupEngineId());
        Assertions.assertEquals("hxcr", model.value().get(0).properties().dpmVersion());
        Assertions.assertEquals("fovasr", model.value().get(0).properties().azureBackupAgentVersion());
        Assertions.assertEquals(false, model.value().get(0).properties().isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(true, model.value().get(0).properties().isDpmUpgradeAvailable());
        Assertions.assertEquals("qfsubcgjbirx", model.value().get(0).properties().extendedInfo().databaseName());
        Assertions.assertEquals(1282258802, model.value().get(0).properties().extendedInfo().protectedItemsCount());
        Assertions.assertEquals(592118206, model.value().get(0).properties().extendedInfo().protectedServersCount());
        Assertions.assertEquals(2111014163, model.value().get(0).properties().extendedInfo().diskCount());
        Assertions.assertEquals(84.658041031999D, model.value().get(0).properties().extendedInfo().usedDiskSpace());
        Assertions
            .assertEquals(19.500555152586518D, model.value().get(0).properties().extendedInfo().availableDiskSpace());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-31T01:03:52Z"),
                model.value().get(0).properties().extendedInfo().refreshedAt());
        Assertions.assertEquals(22179172, model.value().get(0).properties().extendedInfo().azureProtectedInstances());
        Assertions.assertEquals("tpvjzbexilzznfqq", model.value().get(0).etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupEngineBaseResourceList model =
            new BackupEngineBaseResourceList()
                .withNextLink("kbogqxndlkzgx")
                .withValue(
                    Arrays
                        .asList(
                            new BackupEngineBaseResourceInner()
                                .withLocation("vwpm")
                                .withTags(
                                    mapOf(
                                        "jhwqytjrybnw",
                                        "ruoujmk",
                                        "enq",
                                        "ewgdrjervn",
                                        "ndoygmifthnzdnd",
                                        "eh",
                                        "nayqi",
                                        "l"))
                                .withProperties(
                                    new BackupEngineBase()
                                        .withFriendlyName("vetvt")
                                        .withBackupManagementType(BackupManagementType.AZURE_SQL)
                                        .withRegistrationStatus("tdo")
                                        .withBackupEngineState("cbxvwvxyslqbh")
                                        .withHealthStatus("xoblytkbl")
                                        .withCanReRegister(true)
                                        .withBackupEngineId("wwfbkrvrnsvshq")
                                        .withDpmVersion("hxcr")
                                        .withAzureBackupAgentVersion("fovasr")
                                        .withIsAzureBackupAgentUpgradeAvailable(false)
                                        .withIsDpmUpgradeAvailable(true)
                                        .withExtendedInfo(
                                            new BackupEngineExtendedInfo()
                                                .withDatabaseName("qfsubcgjbirx")
                                                .withProtectedItemsCount(1282258802)
                                                .withProtectedServersCount(592118206)
                                                .withDiskCount(2111014163)
                                                .withUsedDiskSpace(84.658041031999D)
                                                .withAvailableDiskSpace(19.500555152586518D)
                                                .withRefreshedAt(OffsetDateTime.parse("2021-10-31T01:03:52Z"))
                                                .withAzureProtectedInstances(22179172)))
                                .withEtag("tpvjzbexilzznfqq"),
                            new BackupEngineBaseResourceInner()
                                .withLocation("mwabnetshhszhedp")
                                .withTags(mapOf("wtppjflcxogaoko", "iwubmwmbesldnk", "nsikvmkqzeqqkdl", "z"))
                                .withProperties(
                                    new BackupEngineBase()
                                        .withFriendlyName("l")
                                        .withBackupManagementType(BackupManagementType.INVALID)
                                        .withRegistrationStatus("qlfmmdnbb")
                                        .withBackupEngineState("zpswiydmc")
                                        .withHealthStatus("hzdxssadbzm")
                                        .withCanReRegister(true)
                                        .withBackupEngineId("znud")
                                        .withDpmVersion("dvxzbncblylpst")
                                        .withAzureBackupAgentVersion("hh")
                                        .withIsAzureBackupAgentUpgradeAvailable(true)
                                        .withIsDpmUpgradeAvailable(false)
                                        .withExtendedInfo(
                                            new BackupEngineExtendedInfo()
                                                .withDatabaseName("cers")
                                                .withProtectedItemsCount(1191369251)
                                                .withProtectedServersCount(930284042)
                                                .withDiskCount(1008975068)
                                                .withUsedDiskSpace(74.96310057788091D)
                                                .withAvailableDiskSpace(56.13333824147031D)
                                                .withRefreshedAt(OffsetDateTime.parse("2021-01-31T08:05:10Z"))
                                                .withAzureProtectedInstances(1265924746)))
                                .withEtag("lswtmweriofzpyqs")));
        model = BinaryData.fromObject(model).toObject(BackupEngineBaseResourceList.class);
        Assertions.assertEquals("kbogqxndlkzgx", model.nextLink());
        Assertions.assertEquals("vwpm", model.value().get(0).location());
        Assertions.assertEquals("ruoujmk", model.value().get(0).tags().get("jhwqytjrybnw"));
        Assertions.assertEquals("vetvt", model.value().get(0).properties().friendlyName());
        Assertions
            .assertEquals(BackupManagementType.AZURE_SQL, model.value().get(0).properties().backupManagementType());
        Assertions.assertEquals("tdo", model.value().get(0).properties().registrationStatus());
        Assertions.assertEquals("cbxvwvxyslqbh", model.value().get(0).properties().backupEngineState());
        Assertions.assertEquals("xoblytkbl", model.value().get(0).properties().healthStatus());
        Assertions.assertEquals(true, model.value().get(0).properties().canReRegister());
        Assertions.assertEquals("wwfbkrvrnsvshq", model.value().get(0).properties().backupEngineId());
        Assertions.assertEquals("hxcr", model.value().get(0).properties().dpmVersion());
        Assertions.assertEquals("fovasr", model.value().get(0).properties().azureBackupAgentVersion());
        Assertions.assertEquals(false, model.value().get(0).properties().isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(true, model.value().get(0).properties().isDpmUpgradeAvailable());
        Assertions.assertEquals("qfsubcgjbirx", model.value().get(0).properties().extendedInfo().databaseName());
        Assertions.assertEquals(1282258802, model.value().get(0).properties().extendedInfo().protectedItemsCount());
        Assertions.assertEquals(592118206, model.value().get(0).properties().extendedInfo().protectedServersCount());
        Assertions.assertEquals(2111014163, model.value().get(0).properties().extendedInfo().diskCount());
        Assertions.assertEquals(84.658041031999D, model.value().get(0).properties().extendedInfo().usedDiskSpace());
        Assertions
            .assertEquals(19.500555152586518D, model.value().get(0).properties().extendedInfo().availableDiskSpace());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-31T01:03:52Z"),
                model.value().get(0).properties().extendedInfo().refreshedAt());
        Assertions.assertEquals(22179172, model.value().get(0).properties().extendedInfo().azureProtectedInstances());
        Assertions.assertEquals("tpvjzbexilzznfqq", model.value().get(0).etag());
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
