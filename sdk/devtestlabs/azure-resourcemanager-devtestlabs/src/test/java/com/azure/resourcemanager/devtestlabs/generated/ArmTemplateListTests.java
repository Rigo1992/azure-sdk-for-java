// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArmTemplateInner;
import com.azure.resourcemanager.devtestlabs.models.ArmTemplateList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ArmTemplateListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArmTemplateList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"displayName\":\"oggigrxwburv\",\"description\":\"xjnspy\",\"publisher\":\"tko\",\"icon\":\"kouknvudwtiu\",\"contents\":\"dataldngkpoci\",\"createdDate\":\"2021-03-10T18:39:36Z\",\"parametersValueFilesInfo\":[],\"enabled\":false},\"location\":\"egukgjnpiucg\",\"tags\":{\"j\":\"vqzntypmrbpizcdr\",\"yhxdeoejzicwi\":\"dpydn\",\"bkh\":\"sjttgzfbish\"},\"id\":\"jdeyeamdpha\",\"name\":\"alpbuxwgipwhon\",\"type\":\"wkgshwa\"},{\"properties\":{\"displayName\":\"ixzbinjeputtmryw\",\"description\":\"zoqftiyqzrnkcqvy\",\"publisher\":\"whzlsicohoq\",\"icon\":\"wvl\",\"contents\":\"dataavwhheunm\",\"createdDate\":\"2020-12-26T14:51:32Z\",\"parametersValueFilesInfo\":[],\"enabled\":false},\"location\":\"zko\",\"tags\":{\"lyaxuc\":\"uko\",\"ewrmjmwvvjektc\":\"nuqszfkbey\",\"frzpwvlqdqgb\":\"senhwlrs\",\"fcivfsnkym\":\"qylihkaetckt\"},\"id\":\"ctq\",\"name\":\"jf\",\"type\":\"ebrjcxe\"},{\"properties\":{\"displayName\":\"uwutttxfvjrbi\",\"description\":\"hxepcyvahfnlj\",\"publisher\":\"qxj\",\"icon\":\"ujqgidok\",\"contents\":\"dataljyoxgvcltb\",\"createdDate\":\"2021-05-02T13:16:46Z\",\"parametersValueFilesInfo\":[],\"enabled\":true},\"location\":\"kjeszz\",\"tags\":{\"mpvecxgodebfqk\":\"jhtxfvgxbfsmxne\",\"flz\":\"rbmpukgri\"},\"id\":\"fbxzpuzycisp\",\"name\":\"qzahmgkbrp\",\"type\":\"y\"}],\"nextLink\":\"ibnuqqkpik\"}")
                .toObject(ArmTemplateList.class);
        Assertions.assertEquals("egukgjnpiucg", model.value().get(0).location());
        Assertions.assertEquals("vqzntypmrbpizcdr", model.value().get(0).tags().get("j"));
        Assertions.assertEquals("ibnuqqkpik", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArmTemplateList model =
            new ArmTemplateList()
                .withValue(
                    Arrays
                        .asList(
                            new ArmTemplateInner()
                                .withLocation("egukgjnpiucg")
                                .withTags(
                                    mapOf("j", "vqzntypmrbpizcdr", "yhxdeoejzicwi", "dpydn", "bkh", "sjttgzfbish")),
                            new ArmTemplateInner()
                                .withLocation("zko")
                                .withTags(
                                    mapOf(
                                        "lyaxuc",
                                        "uko",
                                        "ewrmjmwvvjektc",
                                        "nuqszfkbey",
                                        "frzpwvlqdqgb",
                                        "senhwlrs",
                                        "fcivfsnkym",
                                        "qylihkaetckt")),
                            new ArmTemplateInner()
                                .withLocation("kjeszz")
                                .withTags(mapOf("mpvecxgodebfqk", "jhtxfvgxbfsmxne", "flz", "rbmpukgri"))))
                .withNextLink("ibnuqqkpik");
        model = BinaryData.fromObject(model).toObject(ArmTemplateList.class);
        Assertions.assertEquals("egukgjnpiucg", model.value().get(0).location());
        Assertions.assertEquals("vqzntypmrbpizcdr", model.value().get(0).tags().get("j"));
        Assertions.assertEquals("ibnuqqkpik", model.nextLink());
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
