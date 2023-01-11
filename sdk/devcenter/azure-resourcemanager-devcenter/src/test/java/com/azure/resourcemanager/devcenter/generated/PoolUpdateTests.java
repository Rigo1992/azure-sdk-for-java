// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.LicenseType;
import com.azure.resourcemanager.devcenter.models.LocalAdminStatus;
import com.azure.resourcemanager.devcenter.models.PoolUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PoolUpdateTests {
    @Test
    public void testDeserialize() {
        PoolUpdate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"devBoxDefinitionName\":\"rtfudxepxg\",\"networkConnectionName\":\"agvrvmnpkuk\",\"licenseType\":\"Windows_Client\",\"localAdministrator\":\"Disabled\"},\"tags\":{\"njhf\":\"xgwim\",\"szkkfoqre\":\"xw\",\"wneaiv\":\"fkzikfj\"},\"location\":\"czelpcirel\"}")
                .toObject(PoolUpdate.class);
        Assertions.assertEquals("xgwim", model.tags().get("njhf"));
        Assertions.assertEquals("czelpcirel", model.location());
        Assertions.assertEquals("rtfudxepxg", model.devBoxDefinitionName());
        Assertions.assertEquals("agvrvmnpkuk", model.networkConnectionName());
        Assertions.assertEquals(LicenseType.WINDOWS_CLIENT, model.licenseType());
        Assertions.assertEquals(LocalAdminStatus.DISABLED, model.localAdministrator());
    }

    @Test
    public void testSerialize() {
        PoolUpdate model =
            new PoolUpdate()
                .withTags(mapOf("njhf", "xgwim", "szkkfoqre", "xw", "wneaiv", "fkzikfj"))
                .withLocation("czelpcirel")
                .withDevBoxDefinitionName("rtfudxepxg")
                .withNetworkConnectionName("agvrvmnpkuk")
                .withLicenseType(LicenseType.WINDOWS_CLIENT)
                .withLocalAdministrator(LocalAdminStatus.DISABLED);
        model = BinaryData.fromObject(model).toObject(PoolUpdate.class);
        Assertions.assertEquals("xgwim", model.tags().get("njhf"));
        Assertions.assertEquals("czelpcirel", model.location());
        Assertions.assertEquals("rtfudxepxg", model.devBoxDefinitionName());
        Assertions.assertEquals("agvrvmnpkuk", model.networkConnectionName());
        Assertions.assertEquals(LicenseType.WINDOWS_CLIENT, model.licenseType());
        Assertions.assertEquals(LocalAdminStatus.DISABLED, model.localAdministrator());
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
