// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntime;
import com.azure.resourcemanager.datafactory.models.SelfHostedIntegrationRuntimeStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class SelfHostedIntegrationRuntimeStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SelfHostedIntegrationRuntimeStatus model = BinaryData.fromString(
            "{\"type\":\"SelfHosted\",\"typeProperties\":{\"createTime\":\"2021-09-03T21:24:36Z\",\"taskQueueId\":\"vopvfgu\",\"internalChannelEncryption\":\"SslEncrypted\",\"version\":\"mwdqw\",\"nodes\":[{\"nodeName\":\"wzeleqpnkq\",\"machineName\":\"rumhaeqboig\",\"hostServiceUri\":\"xatwxiyarf\",\"status\":\"Offline\",\"capabilities\":{\"ruexhgdh\":\"tidzvvndpr\",\"pfopekyzdzvhyoid\":\"kplaseyltqx\",\"vzpqrxsifixo\":\"veqyje\",\"pwpuayxtvpiul\":\"vnylfutg\"},\"versionStatus\":\"b\",\"version\":\"mjrsmkjalor\",\"registerTime\":\"2021-10-31T11:34:50Z\",\"lastConnectTime\":\"2021-07-23T11:41:20Z\",\"expiryTime\":\"2021-11-24T03:52:34Z\",\"lastStartTime\":\"2021-11-03T15:28:53Z\",\"lastStopTime\":\"2021-04-25T12:51:57Z\",\"lastUpdateResult\":\"Fail\",\"lastStartUpdateTime\":\"2021-10-12T04:43:20Z\",\"lastEndUpdateTime\":\"2021-09-26T14:51:21Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":674191876,\"maxConcurrentJobs\":553557202,\"\":{\"g\":\"datakkucwmj\"}},{\"nodeName\":\"twmskuqg\",\"machineName\":\"orqtr\",\"hostServiceUri\":\"eikqvaagnzbkqq\",\"status\":\"Initializing\",\"capabilities\":{\"omzvgjynuwcqu\":\"uc\"},\"versionStatus\":\"anqdmmrodpgtblm\",\"version\":\"lcbwvs\",\"registerTime\":\"2021-10-23T18:25:33Z\",\"lastConnectTime\":\"2021-09-09T10:01Z\",\"expiryTime\":\"2021-09-23T07:22:31Z\",\"lastStartTime\":\"2021-07-30T11:30:39Z\",\"lastStopTime\":\"2021-10-24T02:18:38Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-06-10T03:00:04Z\",\"lastEndUpdateTime\":\"2021-10-09T07:22:10Z\",\"isActiveDispatcher\":true,\"concurrentJobsLimit\":372484908,\"maxConcurrentJobs\":1239610602,\"\":{\"burbxovgjipbnngh\":\"datazcnxjvipehxl\",\"brsaeuzsojblyygf\":\"datajxwjnwgoxenhpyix\",\"teuyqtzo\":\"dataicuydrswq\",\"oqoafdvxrlrsrfrx\":\"dataaotrbnvoepht\"}},{\"nodeName\":\"mdjpspipkpcvhqa\",\"machineName\":\"casncgqui\",\"hostServiceUri\":\"qvatst\",\"status\":\"Offline\",\"capabilities\":{\"r\":\"cktjscjkexybx\",\"mbf\":\"jgptxvzhyun\"},\"versionStatus\":\"selblwmfudpntpsw\",\"version\":\"fktytrivfleqv\",\"registerTime\":\"2021-07-12T03:07:59Z\",\"lastConnectTime\":\"2021-07-09T08:56:23Z\",\"expiryTime\":\"2021-05-08T20:41:53Z\",\"lastStartTime\":\"2021-01-16T11:21:54Z\",\"lastStopTime\":\"2021-08-06T15:03:51Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-09-06T14:18:49Z\",\"lastEndUpdateTime\":\"2021-04-02T19:34:10Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":777618824,\"maxConcurrentJobs\":130802880,\"\":{\"bdhmxbyzfjgr\":\"datailhvtroxlybddx\"}},{\"nodeName\":\"brbmcrtvxjwpvqre\",\"machineName\":\"ui\",\"hostServiceUri\":\"lqwbrfiovpdl\",\"status\":\"Limited\",\"capabilities\":{\"sd\":\"iwerlbcetrvird\",\"yzegchtabhac\":\"wpvnloop\"},\"versionStatus\":\"fqzcklvvwvpfqt\",\"version\":\"zhmlnfvyhdhf\",\"registerTime\":\"2021-08-12T19:39:03Z\",\"lastConnectTime\":\"2021-02-09T04:53:23Z\",\"expiryTime\":\"2021-03-20T04:17:59Z\",\"lastStartTime\":\"2021-07-22T21:24:26Z\",\"lastStopTime\":\"2021-12-03T23:38:17Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-06-22T05:42:16Z\",\"lastEndUpdateTime\":\"2021-02-11T16:56:09Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":1715409221,\"maxConcurrentJobs\":815203127,\"\":{\"yqtmdhb\":\"dataayehfzzi\",\"bejhxopehel\":\"datatkgmwxzlphzujkqa\"}}],\"scheduledUpdateDate\":\"2021-04-21T19:03:52Z\",\"updateDelayOffset\":\"hdapxdiibjjwue\",\"localTimeZoneOffset\":\"hqyhxhuhhnr\",\"capabilities\":{\"v\":\"zfkhfnzjffajh\"},\"serviceUrls\":[\"gciedlqvpdtrls\",\"srwlfgbuu\"],\"autoUpdate\":\"Off\",\"versionStatus\":\"tps\",\"links\":[{\"name\":\"fupnypluiv\",\"subscriptionId\":\"sel\",\"dataFactoryName\":\"zrpespeb\",\"dataFactoryLocation\":\"gzx\",\"createTime\":\"2021-11-26T17:46:18Z\"},{\"name\":\"fvflyqauu\",\"subscriptionId\":\"skimntxdvlqmnwhd\",\"dataFactoryName\":\"yvpduma\",\"dataFactoryLocation\":\"p\",\"createTime\":\"2021-04-01T14:53:53Z\"}],\"pushedVersion\":\"ettnmiufpbfqml\",\"latestVersion\":\"yqyekuw\",\"autoUpdateETA\":\"2021-11-04T23:26:01Z\",\"selfContainedInteractiveAuthoringEnabled\":true},\"dataFactoryName\":\"mydogrtfwzecgbxr\",\"state\":\"Stopping\",\"\":{\"wqbvanvgpxn\":\"datajdxii\",\"ruywrxnk\":\"dataaiitn\",\"xeovbgrqwfuxn\":\"datamaebdrxjsmrsea\",\"yl\":\"dataue\"}}")
            .toObject(SelfHostedIntegrationRuntimeStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SelfHostedIntegrationRuntimeStatus model = new SelfHostedIntegrationRuntimeStatus().withNodes(Arrays.asList(
            new SelfHostedIntegrationRuntimeNodeInner().withAdditionalProperties(mapOf("nodeName", "wzeleqpnkq",
                "lastStartUpdateTime", "2021-10-12T04:43:20Z", "lastConnectTime", "2021-07-23T11:41:20Z",
                "capabilities",
                JacksonAdapter.createDefaultSerializerAdapter()
                    .deserialize(
                        "{\"ruexhgdh\":\"tidzvvndpr\",\"pfopekyzdzvhyoid\":\"kplaseyltqx\",\"vzpqrxsifixo\":\"veqyje\",\"pwpuayxtvpiul\":\"vnylfutg\"}",
                        Object.class, SerializerEncoding.JSON),
                "hostServiceUri", "xatwxiyarf", "registerTime", "2021-10-31T11:34:50Z", "maxConcurrentJobs", 553557202,
                "lastStopTime", "2021-04-25T12:51:57Z", "version", "mjrsmkjalor", "machineName", "rumhaeqboig",
                "versionStatus", "b", "concurrentJobsLimit", 674191876, "lastEndUpdateTime", "2021-09-26T14:51:21Z",
                "expiryTime", "2021-11-24T03:52:34Z", "lastStartTime", "2021-11-03T15:28:53Z", "lastUpdateResult",
                "Fail", "isActiveDispatcher", false, "status", "Offline")),
            new SelfHostedIntegrationRuntimeNodeInner().withAdditionalProperties(mapOf("nodeName", "twmskuqg",
                "lastStartUpdateTime", "2021-06-10T03:00:04Z", "lastConnectTime", "2021-09-09T10:01Z", "capabilities",
                JacksonAdapter.createDefaultSerializerAdapter()
                    .deserialize("{\"omzvgjynuwcqu\":\"uc\"}", Object.class, SerializerEncoding.JSON),
                "hostServiceUri", "eikqvaagnzbkqq", "registerTime", "2021-10-23T18:25:33Z", "maxConcurrentJobs",
                1239610602, "lastStopTime", "2021-10-24T02:18:38Z", "version", "lcbwvs", "machineName", "orqtr",
                "versionStatus", "anqdmmrodpgtblm", "concurrentJobsLimit", 372484908, "lastEndUpdateTime",
                "2021-10-09T07:22:10Z", "expiryTime", "2021-09-23T07:22:31Z", "lastStartTime", "2021-07-30T11:30:39Z",
                "lastUpdateResult", "Succeed", "isActiveDispatcher", true, "status", "Initializing")),
            new SelfHostedIntegrationRuntimeNodeInner()
                .withAdditionalProperties(mapOf("nodeName", "mdjpspipkpcvhqa", "lastStartUpdateTime",
                    "2021-09-06T14:18:49Z", "lastConnectTime", "2021-07-09T08:56:23Z", "capabilities",
                    JacksonAdapter.createDefaultSerializerAdapter()
                        .deserialize("{\"r\":\"cktjscjkexybx\",\"mbf\":\"jgptxvzhyun\"}", Object.class,
                            SerializerEncoding.JSON),
                    "hostServiceUri", "qvatst", "registerTime", "2021-07-12T03:07:59Z", "maxConcurrentJobs", 130802880,
                    "lastStopTime", "2021-08-06T15:03:51Z", "version", "fktytrivfleqv", "machineName", "casncgqui",
                    "versionStatus", "selblwmfudpntpsw", "concurrentJobsLimit", 777618824, "lastEndUpdateTime",
                    "2021-04-02T19:34:10Z", "expiryTime", "2021-05-08T20:41:53Z", "lastStartTime",
                    "2021-01-16T11:21:54Z", "lastUpdateResult", "Succeed", "isActiveDispatcher", false, "status",
                    "Offline")),
            new SelfHostedIntegrationRuntimeNodeInner()
                .withAdditionalProperties(mapOf("nodeName", "brbmcrtvxjwpvqre", "lastStartUpdateTime",
                    "2021-06-22T05:42:16Z", "lastConnectTime", "2021-02-09T04:53:23Z", "capabilities",
                    JacksonAdapter.createDefaultSerializerAdapter()
                        .deserialize("{\"sd\":\"iwerlbcetrvird\",\"yzegchtabhac\":\"wpvnloop\"}", Object.class,
                            SerializerEncoding.JSON),
                    "hostServiceUri", "lqwbrfiovpdl", "registerTime", "2021-08-12T19:39:03Z", "maxConcurrentJobs",
                    815203127, "lastStopTime", "2021-12-03T23:38:17Z", "version", "zhmlnfvyhdhf", "machineName", "ui",
                    "versionStatus", "fqzcklvvwvpfqt", "concurrentJobsLimit", 1715409221, "lastEndUpdateTime",
                    "2021-02-11T16:56:09Z", "expiryTime", "2021-03-20T04:17:59Z", "lastStartTime",
                    "2021-07-22T21:24:26Z", "lastUpdateResult", "Succeed", "isActiveDispatcher", false, "status",
                    "Limited"))))
            .withLinks(Arrays.asList(new LinkedIntegrationRuntime(), new LinkedIntegrationRuntime()));
        model = BinaryData.fromObject(model).toObject(SelfHostedIntegrationRuntimeStatus.class);
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
