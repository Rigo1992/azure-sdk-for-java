// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeStatusTypeProperties;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class SelfHostedIntegrationRuntimeStatusTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SelfHostedIntegrationRuntimeStatusTypeProperties model = BinaryData.fromString(
            "{\"createTime\":\"2021-02-18T03:28:17Z\",\"taskQueueId\":\"tl\",\"internalChannelEncryption\":\"SslEncrypted\",\"version\":\"xzuhel\",\"nodes\":[{\"nodeName\":\"qv\",\"machineName\":\"vrsgqbm\",\"hostServiceUri\":\"xeo\",\"status\":\"Limited\",\"capabilities\":{\"sfoyacgihnal\":\"tvxx\",\"zikatywedb\":\"cuedybkbgdwbmi\",\"bzpauzbbhxncsz\":\"i\"},\"versionStatus\":\"pave\",\"version\":\"gmigsoebdltni\",\"registerTime\":\"2021-05-17T14:06:40Z\",\"lastConnectTime\":\"2021-07-25T08:05:26Z\",\"expiryTime\":\"2021-10-30T03:00:43Z\",\"lastStartTime\":\"2021-10-06T13:40:49Z\",\"lastStopTime\":\"2021-03-20T13:33:24Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-05-05T18:11:34Z\",\"lastEndUpdateTime\":\"2021-06-11T17:54:59Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":626544671,\"maxConcurrentJobs\":1724224932,\"\":{\"wlzi\":\"datafeudbobmoljirch\",\"gvraxhntoiw\":\"datavccquajpoipdjxyo\",\"lk\":\"dataszk\",\"imioixviobuwbnge\":\"datasjwrretsluqfgksd\"}}],\"scheduledUpdateDate\":\"2021-07-29T02:27:42Z\",\"updateDelayOffset\":\"qng\",\"localTimeZoneOffset\":\"m\",\"capabilities\":{\"xqzaffz\":\"ggnqxn\"},\"serviceUrls\":[\"okstkvomdqxno\",\"zqipapifc\"],\"autoUpdate\":\"On\",\"versionStatus\":\"jghunqnt\",\"links\":[{\"name\":\"cbzvvxd\",\"subscriptionId\":\"hxmwwvxcaicbi\",\"dataFactoryName\":\"ogsfovkmam\",\"dataFactoryLocation\":\"fg\",\"createTime\":\"2021-10-30T02:28:19Z\"}],\"pushedVersion\":\"kcy\",\"latestVersion\":\"a\",\"autoUpdateETA\":\"2021-09-03T01:49:37Z\",\"selfContainedInteractiveAuthoringEnabled\":false}")
            .toObject(SelfHostedIntegrationRuntimeStatusTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SelfHostedIntegrationRuntimeStatusTypeProperties model = new SelfHostedIntegrationRuntimeStatusTypeProperties()
            .withNodes(Arrays.asList(new SelfHostedIntegrationRuntimeNodeInner()
                .withAdditionalProperties(mapOf("nodeName", "qv", "lastStartUpdateTime", "2021-05-05T18:11:34Z",
                    "lastConnectTime", "2021-07-25T08:05:26Z", "capabilities",
                    JacksonAdapter.createDefaultSerializerAdapter().deserialize(
                        "{\"sfoyacgihnal\":\"tvxx\",\"zikatywedb\":\"cuedybkbgdwbmi\",\"bzpauzbbhxncsz\":\"i\"}",
                        Object.class, SerializerEncoding.JSON),
                    "hostServiceUri", "xeo", "registerTime", "2021-05-17T14:06:40Z", "maxConcurrentJobs", 1724224932,
                    "lastStopTime", "2021-03-20T13:33:24Z", "version", "gmigsoebdltni", "machineName", "vrsgqbm",
                    "versionStatus", "pave", "concurrentJobsLimit", 626544671, "lastEndUpdateTime",
                    "2021-06-11T17:54:59Z", "expiryTime", "2021-10-30T03:00:43Z", "lastStartTime",
                    "2021-10-06T13:40:49Z", "lastUpdateResult", "Succeed", "isActiveDispatcher", false, "status",
                    "Limited"))))
            .withLinks(Arrays.asList(new LinkedIntegrationRuntime()));
        model = BinaryData.fromObject(model).toObject(SelfHostedIntegrationRuntimeStatusTypeProperties.class);
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
