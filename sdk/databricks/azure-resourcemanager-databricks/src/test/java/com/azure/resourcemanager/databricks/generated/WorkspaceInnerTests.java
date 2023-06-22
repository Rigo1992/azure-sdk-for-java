// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.databricks.models.CreatedBy;
import com.azure.resourcemanager.databricks.models.ManagedIdentityConfiguration;
import com.azure.resourcemanager.databricks.models.PublicNetworkAccess;
import com.azure.resourcemanager.databricks.models.RequiredNsgRules;
import com.azure.resourcemanager.databricks.models.Sku;
import com.azure.resourcemanager.databricks.models.WorkspaceCustomParameters;
import com.azure.resourcemanager.databricks.models.WorkspacePropertiesEncryption;
import com.azure.resourcemanager.databricks.models.WorkspaceProviderAuthorization;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"managedResourceGroupId\":\"mmhquvgjxpyb\",\"parameters\":{},\"provisioningState\":\"Updating\",\"uiDefinitionUri\":\"ybbejhph\",\"authorizations\":[{\"principalId\":\"9b3f7b40-1587-45c8-95f1-87f90fbf4888\",\"roleDefinitionId\":\"8b764ca8-eb36-4499-b8cf-6404187604b2\"},{\"principalId\":\"d8b5fede-7d64-4b99-96dd-405ebefb865f\",\"roleDefinitionId\":\"767ca662-4293-4640-9920-9ab706598d92\"},{\"principalId\":\"d315d44d-a220-4bcb-ac96-0090356610ba\",\"roleDefinitionId\":\"7101072a-cc2b-4608-a09a-6bcacff97d61\"}],\"createdBy\":{\"oid\":\"29bac2a1-cdd4-4fd8-af48-44d6338b49de\",\"puid\":\"ao\",\"applicationId\":\"47346ec5-6c4d-4263-a1d1-614e619dd5fe\"},\"updatedBy\":{\"oid\":\"da5892da-f90d-4fee-afd9-471d7aed8d58\",\"puid\":\"mtqio\",\"applicationId\":\"bb659603-7dc5-4c2f-a2f4-63029154fecc\"},\"createdDateTime\":\"2021-02-12T12:17:55Z\",\"workspaceId\":\"tbmufpo\",\"workspaceUrl\":\"oizh\",\"storageAccountIdentity\":{\"principalId\":\"a93e1e4c-3129-4671-8bb1-dc41106a5f7c\",\"tenantId\":\"bbe9a138-5300-4496-b381-807a8f6fe35f\",\"type\":\"bqsoqijg\"},\"managedDiskIdentity\":{\"principalId\":\"6948af9c-79a5-4047-be23-10a152ea7dea\",\"tenantId\":\"9d258237-c39f-4bd6-935c-373a215fe30e\",\"type\":\"azlobcufpdznrbt\"},\"diskEncryptionSetId\":\"qjnqglhqgnufoooj\",\"encryption\":{},\"privateEndpointConnections\":[{\"id\":\"sqe\",\"name\":\"aagdfmg\",\"type\":\"zlhjxrifkwmrvkt\"},{\"id\":\"izntocipao\",\"name\":\"ajpsquc\",\"type\":\"poyfdkfogkn\"},{\"id\":\"gjofjd\",\"name\":\"eqsrdeupewnwreit\",\"type\":\"zyf\"},{\"id\":\"usarhmofc\",\"name\":\"hs\",\"type\":\"yurkdtmlxhekuksj\"}],\"publicNetworkAccess\":\"Disabled\",\"requiredNsgRules\":\"AllRules\"},\"sku\":{\"name\":\"mparcryuanzw\",\"tier\":\"zdxtayrlhmwhf\"},\"location\":\"rqobmtuk\",\"tags\":{\"xtij\":\"yrtih\",\"zk\":\"pzvgnwzsymglzufc\",\"fhfcb\":\"hdbihan\",\"a\":\"y\"},\"id\":\"ithxqhabifpi\",\"name\":\"xwczbyscnp\",\"type\":\"x\"}")
                .toObject(WorkspaceInner.class);
        Assertions.assertEquals("rqobmtuk", model.location());
        Assertions.assertEquals("yrtih", model.tags().get("xtij"));
        Assertions.assertEquals("mparcryuanzw", model.sku().name());
        Assertions.assertEquals("zdxtayrlhmwhf", model.sku().tier());
        Assertions.assertEquals("mmhquvgjxpyb", model.managedResourceGroupId());
        Assertions.assertEquals("ybbejhph", model.uiDefinitionUri());
        Assertions
            .assertEquals(
                UUID.fromString("9b3f7b40-1587-45c8-95f1-87f90fbf4888"), model.authorizations().get(0).principalId());
        Assertions
            .assertEquals(
                UUID.fromString("8b764ca8-eb36-4499-b8cf-6404187604b2"),
                model.authorizations().get(0).roleDefinitionId());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals(RequiredNsgRules.ALL_RULES, model.requiredNsgRules());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceInner model =
            new WorkspaceInner()
                .withLocation("rqobmtuk")
                .withTags(mapOf("xtij", "yrtih", "zk", "pzvgnwzsymglzufc", "fhfcb", "hdbihan", "a", "y"))
                .withSku(new Sku().withName("mparcryuanzw").withTier("zdxtayrlhmwhf"))
                .withManagedResourceGroupId("mmhquvgjxpyb")
                .withParameters(new WorkspaceCustomParameters())
                .withUiDefinitionUri("ybbejhph")
                .withAuthorizations(
                    Arrays
                        .asList(
                            new WorkspaceProviderAuthorization()
                                .withPrincipalId(UUID.fromString("9b3f7b40-1587-45c8-95f1-87f90fbf4888"))
                                .withRoleDefinitionId(UUID.fromString("8b764ca8-eb36-4499-b8cf-6404187604b2")),
                            new WorkspaceProviderAuthorization()
                                .withPrincipalId(UUID.fromString("d8b5fede-7d64-4b99-96dd-405ebefb865f"))
                                .withRoleDefinitionId(UUID.fromString("767ca662-4293-4640-9920-9ab706598d92")),
                            new WorkspaceProviderAuthorization()
                                .withPrincipalId(UUID.fromString("d315d44d-a220-4bcb-ac96-0090356610ba"))
                                .withRoleDefinitionId(UUID.fromString("7101072a-cc2b-4608-a09a-6bcacff97d61"))))
                .withCreatedBy(new CreatedBy())
                .withUpdatedBy(new CreatedBy())
                .withStorageAccountIdentity(new ManagedIdentityConfiguration())
                .withManagedDiskIdentity(new ManagedIdentityConfiguration())
                .withEncryption(new WorkspacePropertiesEncryption())
                .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                .withRequiredNsgRules(RequiredNsgRules.ALL_RULES);
        model = BinaryData.fromObject(model).toObject(WorkspaceInner.class);
        Assertions.assertEquals("rqobmtuk", model.location());
        Assertions.assertEquals("yrtih", model.tags().get("xtij"));
        Assertions.assertEquals("mparcryuanzw", model.sku().name());
        Assertions.assertEquals("zdxtayrlhmwhf", model.sku().tier());
        Assertions.assertEquals("mmhquvgjxpyb", model.managedResourceGroupId());
        Assertions.assertEquals("ybbejhph", model.uiDefinitionUri());
        Assertions
            .assertEquals(
                UUID.fromString("9b3f7b40-1587-45c8-95f1-87f90fbf4888"), model.authorizations().get(0).principalId());
        Assertions
            .assertEquals(
                UUID.fromString("8b764ca8-eb36-4499-b8cf-6404187604b2"),
                model.authorizations().get(0).roleDefinitionId());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals(RequiredNsgRules.ALL_RULES, model.requiredNsgRules());
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
