// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.IoTSecurityAggregatedRecommendationInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IoTSecurityAggregatedRecommendationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecurityAggregatedRecommendationInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"recommendationName\":\"hhkxbp\",\"recommendationDisplayName\":\"ymjhxxjyngudivkr\",\"description\":\"wbxqzvszjfau\",\"recommendationTypeId\":\"fdxxivetvtcqaqtd\",\"detectedBy\":\"mcbxvwvxysl\",\"remediationSteps\":\"hsfxoblytkb\",\"reportedSeverity\":\"Informational\",\"healthyDevices\":7965235858819395640,\"unhealthyDeviceCount\":2233870853702293034,\"logAnalyticsQuery\":\"rvrnsvshqjohxc\"},\"tags\":{\"uvwbhsqfs\":\"fovasr\",\"bsrfbj\":\"bcgjbirxbp\",\"otftpvjzbexilz\":\"dtws\",\"qtaruoujmkcjhwq\":\"nfqqnvwp\"},\"id\":\"tjrybnwjewgdr\",\"name\":\"ervnaenqpehi\",\"type\":\"doy\"}")
                .toObject(IoTSecurityAggregatedRecommendationInner.class);
        Assertions.assertEquals("fovasr", model.tags().get("uvwbhsqfs"));
        Assertions.assertEquals("hhkxbp", model.recommendationName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecurityAggregatedRecommendationInner model =
            new IoTSecurityAggregatedRecommendationInner()
                .withTags(
                    mapOf(
                        "uvwbhsqfs",
                        "fovasr",
                        "bsrfbj",
                        "bcgjbirxbp",
                        "otftpvjzbexilz",
                        "dtws",
                        "qtaruoujmkcjhwq",
                        "nfqqnvwp"))
                .withRecommendationName("hhkxbp");
        model = BinaryData.fromObject(model).toObject(IoTSecurityAggregatedRecommendationInner.class);
        Assertions.assertEquals("fovasr", model.tags().get("uvwbhsqfs"));
        Assertions.assertEquals("hhkxbp", model.recommendationName());
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
