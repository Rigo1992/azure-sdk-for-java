// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.CopyOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreFileSpecs;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequestType;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetAfsRestoreInfo;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureFileShareRestoreRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileShareRestoreRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureFileShareRestoreRequest\",\"recoveryType\":\"AlternateLocation\",\"sourceResourceId\":\"hyaomtbghhavgr\",\"copyOptions\":\"FailOnConflict\",\"restoreRequestType\":\"Invalid\",\"restoreFileSpecs\":[{\"path\":\"hpjbib\",\"fileSpecType\":\"mfxumvfcluyovw\",\"targetFolderPath\":\"bkfezzxscyhwzdgi\"},{\"path\":\"jbzbomvzzbtdcq\",\"fileSpecType\":\"niyujv\",\"targetFolderPath\":\"l\"},{\"path\":\"shfssnrbgyef\",\"fileSpecType\":\"msgaoj\",\"targetFolderPath\":\"wncot\"},{\"path\":\"fhir\",\"fileSpecType\":\"ymoxoftpipiwyczu\",\"targetFolderPath\":\"a\"}],\"targetDetails\":{\"name\":\"jlihhyus\",\"targetResourceId\":\"kasdvlm\"}}")
                .toObject(AzureFileShareRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.ALTERNATE_LOCATION, model.recoveryType());
        Assertions.assertEquals("hyaomtbghhavgr", model.sourceResourceId());
        Assertions.assertEquals(CopyOptions.FAIL_ON_CONFLICT, model.copyOptions());
        Assertions.assertEquals(RestoreRequestType.INVALID, model.restoreRequestType());
        Assertions.assertEquals("hpjbib", model.restoreFileSpecs().get(0).path());
        Assertions.assertEquals("mfxumvfcluyovw", model.restoreFileSpecs().get(0).fileSpecType());
        Assertions.assertEquals("bkfezzxscyhwzdgi", model.restoreFileSpecs().get(0).targetFolderPath());
        Assertions.assertEquals("jlihhyus", model.targetDetails().name());
        Assertions.assertEquals("kasdvlm", model.targetDetails().targetResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileShareRestoreRequest model =
            new AzureFileShareRestoreRequest()
                .withRecoveryType(RecoveryType.ALTERNATE_LOCATION)
                .withSourceResourceId("hyaomtbghhavgr")
                .withCopyOptions(CopyOptions.FAIL_ON_CONFLICT)
                .withRestoreRequestType(RestoreRequestType.INVALID)
                .withRestoreFileSpecs(
                    Arrays
                        .asList(
                            new RestoreFileSpecs()
                                .withPath("hpjbib")
                                .withFileSpecType("mfxumvfcluyovw")
                                .withTargetFolderPath("bkfezzxscyhwzdgi"),
                            new RestoreFileSpecs()
                                .withPath("jbzbomvzzbtdcq")
                                .withFileSpecType("niyujv")
                                .withTargetFolderPath("l"),
                            new RestoreFileSpecs()
                                .withPath("shfssnrbgyef")
                                .withFileSpecType("msgaoj")
                                .withTargetFolderPath("wncot"),
                            new RestoreFileSpecs()
                                .withPath("fhir")
                                .withFileSpecType("ymoxoftpipiwyczu")
                                .withTargetFolderPath("a")))
                .withTargetDetails(new TargetAfsRestoreInfo().withName("jlihhyus").withTargetResourceId("kasdvlm"));
        model = BinaryData.fromObject(model).toObject(AzureFileShareRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.ALTERNATE_LOCATION, model.recoveryType());
        Assertions.assertEquals("hyaomtbghhavgr", model.sourceResourceId());
        Assertions.assertEquals(CopyOptions.FAIL_ON_CONFLICT, model.copyOptions());
        Assertions.assertEquals(RestoreRequestType.INVALID, model.restoreRequestType());
        Assertions.assertEquals("hpjbib", model.restoreFileSpecs().get(0).path());
        Assertions.assertEquals("mfxumvfcluyovw", model.restoreFileSpecs().get(0).fileSpecType());
        Assertions.assertEquals("bkfezzxscyhwzdgi", model.restoreFileSpecs().get(0).targetFolderPath());
        Assertions.assertEquals("jlihhyus", model.targetDetails().name());
        Assertions.assertEquals("kasdvlm", model.targetDetails().targetResourceId());
    }
}
