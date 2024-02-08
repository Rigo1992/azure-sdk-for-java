// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.HDInsightStreamingActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HDInsightStreamingActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HDInsightStreamingActivity model = BinaryData.fromString(
            "{\"type\":\"HDInsightStreaming\",\"typeProperties\":{\"storageLinkedServices\":[{\"referenceName\":\"ljgaykaqwnk\",\"parameters\":{\"uqglgvmuews\":\"dataecjz\",\"e\":\"datahqgjvchl\",\"wizjraksah\":\"datafbtczzjfzjo\"}},{\"referenceName\":\"qpukltfknroxmi\",\"parameters\":{\"vukcf\":\"datazczpfvq\"}}],\"arguments\":[\"datazknhcvxf\",\"datazhgrn\",\"datawysdmovbvnjyqq\"],\"getDebugInfo\":\"Failure\",\"mapper\":\"datagz\",\"reducer\":\"dataykc\",\"input\":\"dataol\",\"output\":\"datadwrggytyvo\",\"filePaths\":[\"datajbyjgobzj\",\"dataukfwmhzarrfttx\",\"dataifrjgvhone\"],\"fileLinkedService\":{\"referenceName\":\"v\",\"parameters\":{\"jowvzyoehlj\":\"datalmkfvsol\"}},\"combiner\":\"datayguothnucqktu\",\"commandEnvironment\":[\"datagjtpriicteyd\"],\"defines\":{\"o\":\"datahmivtuphwwyi\",\"nrziwkcpxgjmyou\":\"datafxfteo\"}},\"linkedServiceName\":{\"referenceName\":\"apua\",\"parameters\":{\"gmpohuvasxjzklq\":\"datadikkmyrsvtrtx\",\"cwnefdehptlnw\":\"datagjukntknjhywgzi\",\"uwbneszxn\":\"datal\",\"iwp\":\"datageuoihtik\"}},\"policy\":{\"timeout\":\"dataav\",\"retry\":\"datadsuwct\",\"retryIntervalInSeconds\":737405762,\"secureInput\":false,\"secureOutput\":true,\"\":{\"zivhk\":\"dataljyreyhpbtwz\"}},\"name\":\"dcjym\",\"description\":\"ldbuyuxgephv\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"sdoxhyi\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\"],\"\":{\"p\":\"datauffkmtiuxynkh\",\"hpmsdgmxwfodvzp\":\"dataqlhzdbbitpgr\",\"evhnqtba\":\"datamojxbvgiee\",\"xmqudnqcbbbhin\":\"datavjodgplagwvgb\"}},{\"activity\":\"syszl\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\",\"Completed\",\"Succeeded\"],\"\":{\"yyzqdnrgnybpqw\":\"dataosh\",\"cgsdcpmclkuy\":\"datajbmkhxunqrvqt\",\"cqrssqwz\":\"dataabhy\"}},{\"activity\":\"dzuxlgmypngy\",\"dependencyConditions\":[\"Succeeded\",\"Completed\",\"Failed\",\"Succeeded\"],\"\":{\"mcg\":\"datapjvbzablmpntjlzk\"}}],\"userProperties\":[{\"name\":\"bfbg\",\"value\":\"datawjqwlvsefvkx\"}],\"\":{\"zm\":\"datagbnqmhr\",\"lqrkstjdjdasomxw\":\"dataxwgrflqbugxudsmd\"}}")
            .toObject(HDInsightStreamingActivity.class);
        Assertions.assertEquals("dcjym", model.name());
        Assertions.assertEquals("ldbuyuxgephv", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("sdoxhyi", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("bfbg", model.userProperties().get(0).name());
        Assertions.assertEquals("apua", model.linkedServiceName().referenceName());
        Assertions.assertEquals(737405762, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("ljgaykaqwnk", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("v", model.fileLinkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HDInsightStreamingActivity model
            = new HDInsightStreamingActivity().withName("dcjym").withDescription("ldbuyuxgephv")
                .withState(ActivityState.INACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("sdoxhyi")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("syszl")
                        .withDependencyConditions(
                            Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.SUCCEEDED,
                                DependencyCondition.COMPLETED, DependencyCondition.SUCCEEDED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("dzuxlgmypngy")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED,
                            DependencyCondition.COMPLETED, DependencyCondition.FAILED, DependencyCondition.SUCCEEDED))
                        .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("bfbg").withValue("datawjqwlvsefvkx")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("apua")
                    .withParameters(mapOf("gmpohuvasxjzklq", "datadikkmyrsvtrtx", "cwnefdehptlnw",
                        "datagjukntknjhywgzi", "uwbneszxn", "datal", "iwp", "datageuoihtik")))
                .withPolicy(new ActivityPolicy().withTimeout("dataav").withRetry("datadsuwct")
                    .withRetryIntervalInSeconds(737405762).withSecureInput(false).withSecureOutput(true)
                    .withAdditionalProperties(mapOf()))
                .withStorageLinkedServices(Arrays.asList(
                    new LinkedServiceReference().withReferenceName("ljgaykaqwnk").withParameters(
                        mapOf("uqglgvmuews", "dataecjz", "e", "datahqgjvchl", "wizjraksah", "datafbtczzjfzjo")),
                    new LinkedServiceReference().withReferenceName("qpukltfknroxmi")
                        .withParameters(mapOf("vukcf", "datazczpfvq"))))
                .withArguments(Arrays.asList("datazknhcvxf", "datazhgrn", "datawysdmovbvnjyqq"))
                .withGetDebugInfo(HDInsightActivityDebugInfoOption.FAILURE).withMapper("datagz").withReducer("dataykc")
                .withInput("dataol").withOutput("datadwrggytyvo")
                .withFilePaths(Arrays.asList("datajbyjgobzj", "dataukfwmhzarrfttx", "dataifrjgvhone"))
                .withFileLinkedService(new LinkedServiceReference().withReferenceName("v")
                    .withParameters(mapOf("jowvzyoehlj", "datalmkfvsol")))
                .withCombiner("datayguothnucqktu").withCommandEnvironment(Arrays.asList("datagjtpriicteyd"))
                .withDefines(mapOf("o", "datahmivtuphwwyi", "nrziwkcpxgjmyou", "datafxfteo"));
        model = BinaryData.fromObject(model).toObject(HDInsightStreamingActivity.class);
        Assertions.assertEquals("dcjym", model.name());
        Assertions.assertEquals("ldbuyuxgephv", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("sdoxhyi", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("bfbg", model.userProperties().get(0).name());
        Assertions.assertEquals("apua", model.linkedServiceName().referenceName());
        Assertions.assertEquals(737405762, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("ljgaykaqwnk", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("v", model.fileLinkedService().referenceName());
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
