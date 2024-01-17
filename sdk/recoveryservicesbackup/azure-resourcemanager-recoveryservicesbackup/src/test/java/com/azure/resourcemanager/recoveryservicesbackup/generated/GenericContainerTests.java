// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ContainerIdentityInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.GenericContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.GenericContainerExtendedInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GenericContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GenericContainer model =
            BinaryData
                .fromString(
                    "{\"containerType\":\"GenericContainer\",\"fabricName\":\"qipir\",\"extendedInformation\":{\"rawCertData\":\"rqofulopmjnlexwh\",\"containerIdentityInfo\":{\"uniqueName\":\"pibkephuu\",\"aadTenantId\":\"rctat\",\"servicePrincipalClientId\":\"intqpbrlcyr\",\"audience\":\"czkgofxyfsrucvcr\"},\"serviceEndpoints\":{\"eaqnrmvvfkoxm\":\"jttbstv\",\"zlpdwwex\":\"ghktuidvrm\",\"wvqsgny\":\"mzvlazipbh\",\"patlbijp\":\"uuzivensrpmeyyvp\"}},\"friendlyName\":\"sksrfhfvolmknbn\",\"backupManagementType\":\"AzureIaasVM\",\"registrationStatus\":\"ommpvfqaw\",\"healthStatus\":\"gbrt\",\"protectableObjectType\":\"iac\"}")
                .toObject(GenericContainer.class);
        Assertions.assertEquals("sksrfhfvolmknbn", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_IAAS_VM, model.backupManagementType());
        Assertions.assertEquals("ommpvfqaw", model.registrationStatus());
        Assertions.assertEquals("gbrt", model.healthStatus());
        Assertions.assertEquals("iac", model.protectableObjectType());
        Assertions.assertEquals("qipir", model.fabricName());
        Assertions.assertEquals("rqofulopmjnlexwh", model.extendedInformation().rawCertData());
        Assertions.assertEquals("pibkephuu", model.extendedInformation().containerIdentityInfo().uniqueName());
        Assertions.assertEquals("rctat", model.extendedInformation().containerIdentityInfo().aadTenantId());
        Assertions
            .assertEquals(
                "intqpbrlcyr", model.extendedInformation().containerIdentityInfo().servicePrincipalClientId());
        Assertions.assertEquals("czkgofxyfsrucvcr", model.extendedInformation().containerIdentityInfo().audience());
        Assertions.assertEquals("jttbstv", model.extendedInformation().serviceEndpoints().get("eaqnrmvvfkoxm"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GenericContainer model =
            new GenericContainer()
                .withFriendlyName("sksrfhfvolmknbn")
                .withBackupManagementType(BackupManagementType.AZURE_IAAS_VM)
                .withRegistrationStatus("ommpvfqaw")
                .withHealthStatus("gbrt")
                .withProtectableObjectType("iac")
                .withFabricName("qipir")
                .withExtendedInformation(
                    new GenericContainerExtendedInfo()
                        .withRawCertData("rqofulopmjnlexwh")
                        .withContainerIdentityInfo(
                            new ContainerIdentityInfo()
                                .withUniqueName("pibkephuu")
                                .withAadTenantId("rctat")
                                .withServicePrincipalClientId("intqpbrlcyr")
                                .withAudience("czkgofxyfsrucvcr"))
                        .withServiceEndpoints(
                            mapOf(
                                "eaqnrmvvfkoxm",
                                "jttbstv",
                                "zlpdwwex",
                                "ghktuidvrm",
                                "wvqsgny",
                                "mzvlazipbh",
                                "patlbijp",
                                "uuzivensrpmeyyvp")));
        model = BinaryData.fromObject(model).toObject(GenericContainer.class);
        Assertions.assertEquals("sksrfhfvolmknbn", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_IAAS_VM, model.backupManagementType());
        Assertions.assertEquals("ommpvfqaw", model.registrationStatus());
        Assertions.assertEquals("gbrt", model.healthStatus());
        Assertions.assertEquals("iac", model.protectableObjectType());
        Assertions.assertEquals("qipir", model.fabricName());
        Assertions.assertEquals("rqofulopmjnlexwh", model.extendedInformation().rawCertData());
        Assertions.assertEquals("pibkephuu", model.extendedInformation().containerIdentityInfo().uniqueName());
        Assertions.assertEquals("rctat", model.extendedInformation().containerIdentityInfo().aadTenantId());
        Assertions
            .assertEquals(
                "intqpbrlcyr", model.extendedInformation().containerIdentityInfo().servicePrincipalClientId());
        Assertions.assertEquals("czkgofxyfsrucvcr", model.extendedInformation().containerIdentityInfo().audience());
        Assertions.assertEquals("jttbstv", model.extendedInformation().serviceEndpoints().get("eaqnrmvvfkoxm"));
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
