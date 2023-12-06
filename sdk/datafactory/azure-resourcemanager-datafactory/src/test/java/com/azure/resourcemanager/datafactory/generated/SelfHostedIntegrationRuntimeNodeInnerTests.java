// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import java.util.HashMap;
import java.util.Map;

public final class SelfHostedIntegrationRuntimeNodeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SelfHostedIntegrationRuntimeNodeInner model = BinaryData.fromString(
            "{\"nodeName\":\"e\",\"machineName\":\"sgzvahapjyzhpv\",\"hostServiceUri\":\"zcjrvxdjzlmwlx\",\"status\":\"Online\",\"capabilities\":{\"nnprn\":\"hzovawjvzunlut\",\"eilpjzuaejxdu\":\"i\",\"pwo\":\"tskzbbtdzumveek\",\"fpbsjyofdxl\":\"uh\"},\"versionStatus\":\"sd\",\"version\":\"ouwaboekqvkeln\",\"registerTime\":\"2021-02-02T03:25:54Z\",\"lastConnectTime\":\"2020-12-28T23:28:21Z\",\"expiryTime\":\"2021-07-06T07:16:14Z\",\"lastStartTime\":\"2021-03-30T06:11:19Z\",\"lastStopTime\":\"2021-08-23T09:42:03Z\",\"lastUpdateResult\":\"Fail\",\"lastStartUpdateTime\":\"2021-01-31T17:20:46Z\",\"lastEndUpdateTime\":\"2021-07-31T18:32:18Z\",\"isActiveDispatcher\":true,\"concurrentJobsLimit\":1744629944,\"maxConcurrentJobs\":923639125,\"\":{\"iidzyexzne\":\"dataawjoyaqcslyjp\"}}")
            .toObject(SelfHostedIntegrationRuntimeNodeInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SelfHostedIntegrationRuntimeNodeInner model = new SelfHostedIntegrationRuntimeNodeInner()
            .withAdditionalProperties(mapOf("nodeName", "e", "lastStartUpdateTime", "2021-01-31T17:20:46Z",
                "lastConnectTime", "2020-12-28T23:28:21Z", "capabilities",
                JacksonAdapter.createDefaultSerializerAdapter().deserialize(
                    "{\"nnprn\":\"hzovawjvzunlut\",\"eilpjzuaejxdu\":\"i\",\"pwo\":\"tskzbbtdzumveek\",\"fpbsjyofdxl\":\"uh\"}",
                    Object.class, SerializerEncoding.JSON),
                "hostServiceUri", "zcjrvxdjzlmwlx", "registerTime", "2021-02-02T03:25:54Z", "maxConcurrentJobs",
                923639125, "lastStopTime", "2021-08-23T09:42:03Z", "version", "ouwaboekqvkeln", "machineName",
                "sgzvahapjyzhpv", "versionStatus", "sd", "concurrentJobsLimit", 1744629944, "lastEndUpdateTime",
                "2021-07-31T18:32:18Z", "expiryTime", "2021-07-06T07:16:14Z", "lastStartTime", "2021-03-30T06:11:19Z",
                "lastUpdateResult", "Fail", "isActiveDispatcher", true, "status", "Online"));
        model = BinaryData.fromObject(model).toObject(SelfHostedIntegrationRuntimeNodeInner.class);
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
