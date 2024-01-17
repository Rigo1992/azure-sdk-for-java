// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmErrorInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmJob;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmJobExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmJobTaskDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.JobSupportedAction;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DpmJobTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DpmJob model =
            BinaryData
                .fromString(
                    "{\"jobType\":\"DpmJob\",\"duration\":\"PT169H14M12S\",\"dpmServerName\":\"svtui\",\"containerName\":\"hajqglcfh\",\"containerType\":\"rqryxynqn\",\"workloadType\":\"dpsovwxznptgo\",\"actionsInfo\":[\"Cancellable\",\"Invalid\",\"Retriable\"],\"errorDetails\":[{\"errorString\":\"hv\",\"recommendations\":[\"kvntjlrigjkskyri\"]},{\"errorString\":\"vzidsxwaab\",\"recommendations\":[\"frygznmmax\",\"izkzobgo\"]}],\"extendedInfo\":{\"tasksList\":[{\"taskId\":\"lnelxieixynl\",\"startTime\":\"2021-03-08T20:31:45Z\",\"endTime\":\"2021-06-22T06:19:04Z\",\"duration\":\"PT180H54M28S\",\"status\":\"jphslhcaw\"}],\"propertyBag\":{\"dwfmvigorqjb\":\"i\",\"aglkafhon\":\"tzh\",\"ickpz\":\"juj\"},\"dynamicErrorMessage\":\"p\"},\"entityFriendlyName\":\"mxelnwcltyjed\",\"backupManagementType\":\"MAB\",\"operation\":\"lfmk\",\"status\":\"cazuaw\",\"startTime\":\"2021-07-30T21:11:41Z\",\"endTime\":\"2021-07-17T18:33:21Z\",\"activityId\":\"amwabzxrvxcushsp\"}")
                .toObject(DpmJob.class);
        Assertions.assertEquals("mxelnwcltyjed", model.entityFriendlyName());
        Assertions.assertEquals(BackupManagementType.MAB, model.backupManagementType());
        Assertions.assertEquals("lfmk", model.operation());
        Assertions.assertEquals("cazuaw", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-30T21:11:41Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-17T18:33:21Z"), model.endTime());
        Assertions.assertEquals("amwabzxrvxcushsp", model.activityId());
        Assertions.assertEquals(Duration.parse("PT169H14M12S"), model.duration());
        Assertions.assertEquals("svtui", model.dpmServerName());
        Assertions.assertEquals("hajqglcfh", model.containerName());
        Assertions.assertEquals("rqryxynqn", model.containerType());
        Assertions.assertEquals("dpsovwxznptgo", model.workloadType());
        Assertions.assertEquals(JobSupportedAction.CANCELLABLE, model.actionsInfo().get(0));
        Assertions.assertEquals("hv", model.errorDetails().get(0).errorString());
        Assertions.assertEquals("kvntjlrigjkskyri", model.errorDetails().get(0).recommendations().get(0));
        Assertions.assertEquals("lnelxieixynl", model.extendedInfo().tasksList().get(0).taskId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-08T20:31:45Z"), model.extendedInfo().tasksList().get(0).startTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-22T06:19:04Z"), model.extendedInfo().tasksList().get(0).endTime());
        Assertions.assertEquals(Duration.parse("PT180H54M28S"), model.extendedInfo().tasksList().get(0).duration());
        Assertions.assertEquals("jphslhcaw", model.extendedInfo().tasksList().get(0).status());
        Assertions.assertEquals("i", model.extendedInfo().propertyBag().get("dwfmvigorqjb"));
        Assertions.assertEquals("p", model.extendedInfo().dynamicErrorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DpmJob model =
            new DpmJob()
                .withEntityFriendlyName("mxelnwcltyjed")
                .withBackupManagementType(BackupManagementType.MAB)
                .withOperation("lfmk")
                .withStatus("cazuaw")
                .withStartTime(OffsetDateTime.parse("2021-07-30T21:11:41Z"))
                .withEndTime(OffsetDateTime.parse("2021-07-17T18:33:21Z"))
                .withActivityId("amwabzxrvxcushsp")
                .withDuration(Duration.parse("PT169H14M12S"))
                .withDpmServerName("svtui")
                .withContainerName("hajqglcfh")
                .withContainerType("rqryxynqn")
                .withWorkloadType("dpsovwxznptgo")
                .withActionsInfo(
                    Arrays
                        .asList(
                            JobSupportedAction.CANCELLABLE, JobSupportedAction.INVALID, JobSupportedAction.RETRIABLE))
                .withErrorDetails(
                    Arrays
                        .asList(
                            new DpmErrorInfo()
                                .withErrorString("hv")
                                .withRecommendations(Arrays.asList("kvntjlrigjkskyri")),
                            new DpmErrorInfo()
                                .withErrorString("vzidsxwaab")
                                .withRecommendations(Arrays.asList("frygznmmax", "izkzobgo"))))
                .withExtendedInfo(
                    new DpmJobExtendedInfo()
                        .withTasksList(
                            Arrays
                                .asList(
                                    new DpmJobTaskDetails()
                                        .withTaskId("lnelxieixynl")
                                        .withStartTime(OffsetDateTime.parse("2021-03-08T20:31:45Z"))
                                        .withEndTime(OffsetDateTime.parse("2021-06-22T06:19:04Z"))
                                        .withDuration(Duration.parse("PT180H54M28S"))
                                        .withStatus("jphslhcaw")))
                        .withPropertyBag(mapOf("dwfmvigorqjb", "i", "aglkafhon", "tzh", "ickpz", "juj"))
                        .withDynamicErrorMessage("p"));
        model = BinaryData.fromObject(model).toObject(DpmJob.class);
        Assertions.assertEquals("mxelnwcltyjed", model.entityFriendlyName());
        Assertions.assertEquals(BackupManagementType.MAB, model.backupManagementType());
        Assertions.assertEquals("lfmk", model.operation());
        Assertions.assertEquals("cazuaw", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-30T21:11:41Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-17T18:33:21Z"), model.endTime());
        Assertions.assertEquals("amwabzxrvxcushsp", model.activityId());
        Assertions.assertEquals(Duration.parse("PT169H14M12S"), model.duration());
        Assertions.assertEquals("svtui", model.dpmServerName());
        Assertions.assertEquals("hajqglcfh", model.containerName());
        Assertions.assertEquals("rqryxynqn", model.containerType());
        Assertions.assertEquals("dpsovwxznptgo", model.workloadType());
        Assertions.assertEquals(JobSupportedAction.CANCELLABLE, model.actionsInfo().get(0));
        Assertions.assertEquals("hv", model.errorDetails().get(0).errorString());
        Assertions.assertEquals("kvntjlrigjkskyri", model.errorDetails().get(0).recommendations().get(0));
        Assertions.assertEquals("lnelxieixynl", model.extendedInfo().tasksList().get(0).taskId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-08T20:31:45Z"), model.extendedInfo().tasksList().get(0).startTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-22T06:19:04Z"), model.extendedInfo().tasksList().get(0).endTime());
        Assertions.assertEquals(Duration.parse("PT180H54M28S"), model.extendedInfo().tasksList().get(0).duration());
        Assertions.assertEquals("jphslhcaw", model.extendedInfo().tasksList().get(0).status());
        Assertions.assertEquals("i", model.extendedInfo().propertyBag().get("dwfmvigorqjb"));
        Assertions.assertEquals("p", model.extendedInfo().dynamicErrorMessage());
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
