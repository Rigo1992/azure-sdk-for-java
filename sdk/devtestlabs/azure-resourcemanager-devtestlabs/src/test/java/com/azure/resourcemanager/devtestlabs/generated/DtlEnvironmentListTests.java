// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.DtlEnvironmentInner;
import com.azure.resourcemanager.devtestlabs.models.DtlEnvironmentList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DtlEnvironmentListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DtlEnvironmentList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"armTemplateDisplayName\":\"khihihlhzds\",\"resourceGroupId\":\"zbsrgnowcj\",\"createdByUser\":\"gmvecactxmw\",\"provisioningState\":\"e\",\"uniqueIdentifier\":\"wcluqovekqvgq\"},\"location\":\"uwifzmpjwyiv\",\"tags\":{\"cvhrfsp\":\"f\",\"kvyklxubyjaffmm\":\"uagrttikteusqc\",\"qcuubgqibrta\":\"bl\"},\"id\":\"metttwgd\",\"name\":\"lqxihhrmooiz\",\"type\":\"seypxiutcxapz\"},{\"properties\":{\"armTemplateDisplayName\":\"petogebjox\",\"resourceGroupId\":\"hvnh\",\"createdByUser\":\"brqnkkzjcjb\",\"provisioningState\":\"gaehvvibrxjjst\",\"uniqueIdentifier\":\"beitpkx\"},\"location\":\"tmo\",\"tags\":{\"qxzhem\":\"lftidgfcwqmpim\"},\"id\":\"yhohujswtwkozzwc\",\"name\":\"lkb\",\"type\":\"wpfaj\"},{\"properties\":{\"armTemplateDisplayName\":\"ltlwtjjguktalhs\",\"resourceGroupId\":\"kcdmxzrpoaimln\",\"createdByUser\":\"aaomylweazu\",\"provisioningState\":\"sethwwn\",\"uniqueIdentifier\":\"hlf\"},\"location\":\"swpchwahfbousn\",\"tags\":{\"ykxhdjh\":\"gfewetwlyxgnc\",\"h\":\"immbcx\",\"qizxfpxtgqscjavf\":\"cporxvxcjz\"},\"id\":\"juhdqazkmtgguwpi\",\"name\":\"r\",\"type\":\"jcivmmg\"}],\"nextLink\":\"cf\"}")
                .toObject(DtlEnvironmentList.class);
        Assertions.assertEquals("uwifzmpjwyiv", model.value().get(0).location());
        Assertions.assertEquals("f", model.value().get(0).tags().get("cvhrfsp"));
        Assertions.assertEquals("khihihlhzds", model.value().get(0).armTemplateDisplayName());
        Assertions.assertEquals("cf", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DtlEnvironmentList model =
            new DtlEnvironmentList()
                .withValue(
                    Arrays
                        .asList(
                            new DtlEnvironmentInner()
                                .withLocation("uwifzmpjwyiv")
                                .withTags(
                                    mapOf("cvhrfsp", "f", "kvyklxubyjaffmm", "uagrttikteusqc", "qcuubgqibrta", "bl"))
                                .withArmTemplateDisplayName("khihihlhzds"),
                            new DtlEnvironmentInner()
                                .withLocation("tmo")
                                .withTags(mapOf("qxzhem", "lftidgfcwqmpim"))
                                .withArmTemplateDisplayName("petogebjox"),
                            new DtlEnvironmentInner()
                                .withLocation("swpchwahfbousn")
                                .withTags(
                                    mapOf("ykxhdjh", "gfewetwlyxgnc", "h", "immbcx", "qizxfpxtgqscjavf", "cporxvxcjz"))
                                .withArmTemplateDisplayName("ltlwtjjguktalhs")))
                .withNextLink("cf");
        model = BinaryData.fromObject(model).toObject(DtlEnvironmentList.class);
        Assertions.assertEquals("uwifzmpjwyiv", model.value().get(0).location());
        Assertions.assertEquals("f", model.value().get(0).tags().get("cvhrfsp"));
        Assertions.assertEquals("khihihlhzds", model.value().get(0).armTemplateDisplayName());
        Assertions.assertEquals("cf", model.nextLink());
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
