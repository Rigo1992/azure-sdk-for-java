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
import com.azure.resourcemanager.datafactory.models.ExecutionActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExecutionActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExecutionActivity model = BinaryData.fromString(
            "{\"type\":\"Execution\",\"linkedServiceName\":{\"referenceName\":\"ixhor\",\"parameters\":{\"dqttiqwixsdx\":\"datadxjkdsqeay\",\"tvbqhyszflzjzdci\":\"dataflwfvahbwhrguq\",\"shbkdptcm\":\"dataxlggrtpayfklb\"}},\"policy\":{\"timeout\":\"datanvkhjtrashnf\",\"retry\":\"dataiykloeqxccpqbo\",\"retryIntervalInSeconds\":1543618130,\"secureInput\":true,\"secureOutput\":true,\"\":{\"uu\":\"dataaf\",\"rnlgnwwjikg\":\"dataoqqseoinxkot\",\"kz\":\"datawdcz\"}},\"name\":\"bpj\",\"description\":\"h\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"qznlddngq\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Completed\",\"Succeeded\"],\"\":{\"qh\":\"dataemagsyljwwp\",\"jopbgtzrgyrldoa\":\"datahlajmikqvnrj\",\"k\":\"dataldglz\"}},{\"activity\":\"ftjrederkvbdvl\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\"],\"\":{\"rvffjpwszlfyft\":\"datajjryztghd\",\"daxvirpuwacfqn\":\"dataaetcplxidiuxzzh\"}}],\"userProperties\":[{\"name\":\"b\",\"value\":\"datapgibyzrpqehr\"},{\"name\":\"ldvxcjjhjnpa\",\"value\":\"dataa\"},{\"name\":\"fyxegklywdlxmy\",\"value\":\"dataqmamasc\"},{\"name\":\"qtqzwntnlyrpb\",\"value\":\"datadwiaxsucforg\"}],\"\":{\"nroizz\":\"dataip\",\"zuxpldzkvbe\":\"dataknybfsoayatqk\"}}")
            .toObject(ExecutionActivity.class);
        Assertions.assertEquals("bpj", model.name());
        Assertions.assertEquals("h", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("qznlddngq", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("b", model.userProperties().get(0).name());
        Assertions.assertEquals("ixhor", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1543618130, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExecutionActivity model = new ExecutionActivity().withName("bpj").withDescription("h")
            .withState(ActivityState.INACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("qznlddngq")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.COMPLETED,
                        DependencyCondition.COMPLETED, DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("ftjrederkvbdvl")
                    .withDependencyConditions(
                        Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("b").withValue("datapgibyzrpqehr"),
                new UserProperty().withName("ldvxcjjhjnpa").withValue("dataa"),
                new UserProperty().withName("fyxegklywdlxmy").withValue("dataqmamasc"),
                new UserProperty().withName("qtqzwntnlyrpb").withValue("datadwiaxsucforg")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ixhor")
                .withParameters(mapOf("dqttiqwixsdx", "datadxjkdsqeay", "tvbqhyszflzjzdci", "dataflwfvahbwhrguq",
                    "shbkdptcm", "dataxlggrtpayfklb")))
            .withPolicy(new ActivityPolicy().withTimeout("datanvkhjtrashnf").withRetry("dataiykloeqxccpqbo")
                .withRetryIntervalInSeconds(1543618130).withSecureInput(true).withSecureOutput(true)
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(ExecutionActivity.class);
        Assertions.assertEquals("bpj", model.name());
        Assertions.assertEquals("h", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("qznlddngq", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("b", model.userProperties().get(0).name());
        Assertions.assertEquals("ixhor", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1543618130, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
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
