// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ContainerIdentityInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.GenericContainerExtendedInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GenericContainerExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GenericContainerExtendedInfo model = BinaryData.fromString(
            "{\"rawCertData\":\"wqejpmvsse\",\"containerIdentityInfo\":{\"uniqueName\":\"pwamcxtczhupeuk\",\"aadTenantId\":\"jduyyespydjfb\",\"servicePrincipalClientId\":\"yv\",\"audience\":\"ulrtywikdmh\"},\"serviceEndpoints\":{\"ufr\":\"uflgbhgauacdixm\",\"ozo\":\"ryjqgdkf\"}}")
            .toObject(GenericContainerExtendedInfo.class);
        Assertions.assertEquals("wqejpmvsse", model.rawCertData());
        Assertions.assertEquals("pwamcxtczhupeuk", model.containerIdentityInfo().uniqueName());
        Assertions.assertEquals("jduyyespydjfb", model.containerIdentityInfo().aadTenantId());
        Assertions.assertEquals("yv", model.containerIdentityInfo().servicePrincipalClientId());
        Assertions.assertEquals("ulrtywikdmh", model.containerIdentityInfo().audience());
        Assertions.assertEquals("uflgbhgauacdixm", model.serviceEndpoints().get("ufr"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GenericContainerExtendedInfo model = new GenericContainerExtendedInfo().withRawCertData("wqejpmvsse")
            .withContainerIdentityInfo(new ContainerIdentityInfo().withUniqueName("pwamcxtczhupeuk")
                .withAadTenantId("jduyyespydjfb").withServicePrincipalClientId("yv").withAudience("ulrtywikdmh"))
            .withServiceEndpoints(mapOf("ufr", "uflgbhgauacdixm", "ozo", "ryjqgdkf"));
        model = BinaryData.fromObject(model).toObject(GenericContainerExtendedInfo.class);
        Assertions.assertEquals("wqejpmvsse", model.rawCertData());
        Assertions.assertEquals("pwamcxtczhupeuk", model.containerIdentityInfo().uniqueName());
        Assertions.assertEquals("jduyyespydjfb", model.containerIdentityInfo().aadTenantId());
        Assertions.assertEquals("yv", model.containerIdentityInfo().servicePrincipalClientId());
        Assertions.assertEquals("ulrtywikdmh", model.containerIdentityInfo().audience());
        Assertions.assertEquals("uflgbhgauacdixm", model.serviceEndpoints().get("ufr"));
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
