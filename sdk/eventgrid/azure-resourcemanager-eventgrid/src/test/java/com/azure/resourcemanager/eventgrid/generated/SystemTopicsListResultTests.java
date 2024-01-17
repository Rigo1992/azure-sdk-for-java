// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.SystemTopicInner;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.SystemTopicsListResult;
import com.azure.resourcemanager.eventgrid.models.UserIdentityProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SystemTopicsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SystemTopicsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"source\":\"vjeaqnrmvvfkoxml\",\"topicType\":\"ktuidvrm\",\"metricResourceId\":\"lpdwwexymzvlazi\"},\"identity\":{\"type\":\"SystemAssigned\",\"principalId\":\"qsg\",\"tenantId\":\"yuuzivens\",\"userAssignedIdentities\":{\"rfhfvo\":{\"principalId\":\"yyvpkpatlb\",\"clientId\":\"pzgsk\"},\"hajlfn\":{\"principalId\":\"knbnxwcdommpvfq\",\"clientId\":\"zfgbrttuiaclkie\"},\"vnwsw\":{\"principalId\":\"iqfyuttdi\",\"clientId\":\"b\"}}},\"location\":\"txkyctwwgzwxjlm\",\"tags\":{\"gzyvnee\":\"og\",\"ffhzbkrkjjjavfq\":\"aifghtmoqqt\",\"wdogiyetesyp\":\"vhnqo\"},\"id\":\"idbz\",\"name\":\"jhqt\",\"type\":\"b\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"source\":\"kbwetnj\",\"topicType\":\"p\",\"metricResourceId\":\"rkzyaupia\"},\"identity\":{\"type\":\"SystemAssigned, UserAssigned\",\"principalId\":\"bwqroohtuovm\",\"tenantId\":\"nur\",\"userAssignedIdentities\":{\"jxl\":{\"principalId\":\"ghihpvecms\",\"clientId\":\"lbl\"},\"eukdqkkyih\":{\"principalId\":\"sjuscvsfxigctmg\",\"clientId\":\"upbezqccydrt\"},\"waoaguhi\":{\"principalId\":\"geqmgqzgwldoych\",\"clientId\":\"lcecfeh\"},\"kwqejpmvsseh\":{\"principalId\":\"llizs\",\"clientId\":\"csjvhrwef\"}}},\"location\":\"epwamcxtcz\",\"tags\":{\"ydjfb\":\"euknijduyyes\",\"v\":\"c\"},\"id\":\"hulrtywikdmhla\",\"name\":\"uflgbhgauacdixm\",\"type\":\"ufr\"}],\"nextLink\":\"yjq\"}")
            .toObject(SystemTopicsListResult.class);
        Assertions.assertEquals("txkyctwwgzwxjlm", model.value().get(0).location());
        Assertions.assertEquals("og", model.value().get(0).tags().get("gzyvnee"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("qsg", model.value().get(0).identity().principalId());
        Assertions.assertEquals("yuuzivens", model.value().get(0).identity().tenantId());
        Assertions.assertEquals("yyvpkpatlb",
            model.value().get(0).identity().userAssignedIdentities().get("rfhfvo").principalId());
        Assertions.assertEquals("pzgsk",
            model.value().get(0).identity().userAssignedIdentities().get("rfhfvo").clientId());
        Assertions.assertEquals("vjeaqnrmvvfkoxml", model.value().get(0).source());
        Assertions.assertEquals("ktuidvrm", model.value().get(0).topicType());
        Assertions.assertEquals("yjq", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SystemTopicsListResult model
            = new SystemTopicsListResult().withValue(Arrays.asList(
                new SystemTopicInner().withLocation("txkyctwwgzwxjlm")
                    .withTags(mapOf("gzyvnee", "og", "ffhzbkrkjjjavfq", "aifghtmoqqt", "wdogiyetesyp", "vhnqo"))
                    .withIdentity(new IdentityInfo().withType(IdentityType.SYSTEM_ASSIGNED).withPrincipalId("qsg")
                        .withTenantId("yuuzivens")
                        .withUserAssignedIdentities(mapOf("rfhfvo",
                            new UserIdentityProperties().withPrincipalId("yyvpkpatlb").withClientId("pzgsk"), "hajlfn",
                            new UserIdentityProperties().withPrincipalId("knbnxwcdommpvfq")
                                .withClientId("zfgbrttuiaclkie"),
                            "vnwsw", new UserIdentityProperties().withPrincipalId("iqfyuttdi").withClientId("b"))))
                    .withSource("vjeaqnrmvvfkoxml").withTopicType("ktuidvrm"),
                new SystemTopicInner().withLocation("epwamcxtcz").withTags(mapOf("ydjfb", "euknijduyyes", "v", "c"))
                    .withIdentity(new IdentityInfo().withType(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                        .withPrincipalId("bwqroohtuovm").withTenantId("nur").withUserAssignedIdentities(
                            mapOf("jxl", new UserIdentityProperties().withPrincipalId("ghihpvecms").withClientId("lbl"),
                                "eukdqkkyih",
                                new UserIdentityProperties().withPrincipalId("sjuscvsfxigctmg")
                                    .withClientId("upbezqccydrt"),
                                "waoaguhi",
                                new UserIdentityProperties().withPrincipalId("geqmgqzgwldoych").withClientId("lcecfeh"),
                                "kwqejpmvsseh",
                                new UserIdentityProperties().withPrincipalId("llizs").withClientId("csjvhrwef"))))
                    .withSource("kbwetnj").withTopicType("p")))
                .withNextLink("yjq");
        model = BinaryData.fromObject(model).toObject(SystemTopicsListResult.class);
        Assertions.assertEquals("txkyctwwgzwxjlm", model.value().get(0).location());
        Assertions.assertEquals("og", model.value().get(0).tags().get("gzyvnee"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("qsg", model.value().get(0).identity().principalId());
        Assertions.assertEquals("yuuzivens", model.value().get(0).identity().tenantId());
        Assertions.assertEquals("yyvpkpatlb",
            model.value().get(0).identity().userAssignedIdentities().get("rfhfvo").principalId());
        Assertions.assertEquals("pzgsk",
            model.value().get(0).identity().userAssignedIdentities().get("rfhfvo").clientId());
        Assertions.assertEquals("vjeaqnrmvvfkoxml", model.value().get(0).source());
        Assertions.assertEquals("ktuidvrm", model.value().get(0).topicType());
        Assertions.assertEquals("yjq", model.nextLink());
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
