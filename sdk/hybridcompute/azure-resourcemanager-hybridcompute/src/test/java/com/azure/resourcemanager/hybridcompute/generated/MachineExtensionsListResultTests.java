// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineExtensionInner;
import com.azure.resourcemanager.hybridcompute.models.MachineExtensionProperties;
import com.azure.resourcemanager.hybridcompute.models.MachineExtensionsListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MachineExtensionsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineExtensionsListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"forceUpdateTag\":\"kzsmodm\",\"publisher\":\"ougpbkwt\",\"type\":\"tduqktapspwgcuer\",\"typeHandlerVersion\":\"mkdo\",\"autoUpgradeMinorVersion\":false,\"settings\":\"datahbmdgbbjfdd\",\"protectedSettings\":\"databmbexppbhtqqro\",\"provisioningState\":\"p\"},\"location\":\"algbquxigjyjg\",\"tags\":{\"fhrtxilnerkujysv\":\"o\",\"fqawrlyxw\":\"eju\",\"xgjvtbv\":\"kcprbnw\",\"uouq\":\"ysszdnrujqguh\"},\"id\":\"prwzwbnguitnwui\",\"name\":\"gazxuf\",\"type\":\"zuckyfi\"},{\"properties\":{\"forceUpdateTag\":\"idf\",\"publisher\":\"wdzuhtymwisd\",\"type\":\"thwxmnteiwaopvkm\",\"typeHandlerVersion\":\"c\",\"autoUpgradeMinorVersion\":false,\"settings\":\"datacufufsrpymz\",\"protectedSettings\":\"datansez\",\"provisioningState\":\"tbzsgfyccs\"},\"location\":\"mdwzjeiachboo\",\"tags\":{\"hzzvypyq\":\"nrosfqpte\",\"z\":\"i\"},\"id\":\"npvswjdkirso\",\"name\":\"dqxhcrmnohjtckwh\",\"type\":\"soifiyipjxsqw\"},{\"properties\":{\"forceUpdateTag\":\"jbznorc\",\"publisher\":\"vsnb\",\"type\":\"qabnmoc\",\"typeHandlerVersion\":\"ysh\",\"autoUpgradeMinorVersion\":false,\"settings\":\"datafblj\",\"protectedSettings\":\"datapbtoqcjmkl\",\"provisioningState\":\"vbqid\"},\"location\":\"jzyulpk\",\"tags\":{\"gqexzlocxs\":\"krlkhbzhfepg\",\"bcsglumma\":\"paierh\",\"xkqpxo\":\"tjaodxobnb\",\"po\":\"ajionpimexgstxg\"},\"id\":\"gmaajrm\",\"name\":\"djwzrlov\",\"type\":\"clwhijcoejctbz\"}],\"nextLink\":\"s\"}")
                .toObject(MachineExtensionsListResult.class);
        Assertions.assertEquals("algbquxigjyjg", model.value().get(0).location());
        Assertions.assertEquals("o", model.value().get(0).tags().get("fhrtxilnerkujysv"));
        Assertions.assertEquals("kzsmodm", model.value().get(0).properties().forceUpdateTag());
        Assertions.assertEquals("ougpbkwt", model.value().get(0).properties().publisher());
        Assertions.assertEquals("tduqktapspwgcuer", model.value().get(0).properties().type());
        Assertions.assertEquals("mkdo", model.value().get(0).properties().typeHandlerVersion());
        Assertions.assertEquals(false, model.value().get(0).properties().autoUpgradeMinorVersion());
        Assertions.assertEquals("s", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineExtensionsListResult model =
            new MachineExtensionsListResult()
                .withValue(
                    Arrays
                        .asList(
                            new MachineExtensionInner()
                                .withLocation("algbquxigjyjg")
                                .withTags(
                                    mapOf(
                                        "fhrtxilnerkujysv",
                                        "o",
                                        "fqawrlyxw",
                                        "eju",
                                        "xgjvtbv",
                                        "kcprbnw",
                                        "uouq",
                                        "ysszdnrujqguh"))
                                .withProperties(
                                    new MachineExtensionProperties()
                                        .withForceUpdateTag("kzsmodm")
                                        .withPublisher("ougpbkwt")
                                        .withType("tduqktapspwgcuer")
                                        .withTypeHandlerVersion("mkdo")
                                        .withAutoUpgradeMinorVersion(false)
                                        .withSettings("datahbmdgbbjfdd")
                                        .withProtectedSettings("databmbexppbhtqqro")),
                            new MachineExtensionInner()
                                .withLocation("mdwzjeiachboo")
                                .withTags(mapOf("hzzvypyq", "nrosfqpte", "z", "i"))
                                .withProperties(
                                    new MachineExtensionProperties()
                                        .withForceUpdateTag("idf")
                                        .withPublisher("wdzuhtymwisd")
                                        .withType("thwxmnteiwaopvkm")
                                        .withTypeHandlerVersion("c")
                                        .withAutoUpgradeMinorVersion(false)
                                        .withSettings("datacufufsrpymz")
                                        .withProtectedSettings("datansez")),
                            new MachineExtensionInner()
                                .withLocation("jzyulpk")
                                .withTags(
                                    mapOf(
                                        "gqexzlocxs",
                                        "krlkhbzhfepg",
                                        "bcsglumma",
                                        "paierh",
                                        "xkqpxo",
                                        "tjaodxobnb",
                                        "po",
                                        "ajionpimexgstxg"))
                                .withProperties(
                                    new MachineExtensionProperties()
                                        .withForceUpdateTag("jbznorc")
                                        .withPublisher("vsnb")
                                        .withType("qabnmoc")
                                        .withTypeHandlerVersion("ysh")
                                        .withAutoUpgradeMinorVersion(false)
                                        .withSettings("datafblj")
                                        .withProtectedSettings("datapbtoqcjmkl"))))
                .withNextLink("s");
        model = BinaryData.fromObject(model).toObject(MachineExtensionsListResult.class);
        Assertions.assertEquals("algbquxigjyjg", model.value().get(0).location());
        Assertions.assertEquals("o", model.value().get(0).tags().get("fhrtxilnerkujysv"));
        Assertions.assertEquals("kzsmodm", model.value().get(0).properties().forceUpdateTag());
        Assertions.assertEquals("ougpbkwt", model.value().get(0).properties().publisher());
        Assertions.assertEquals("tduqktapspwgcuer", model.value().get(0).properties().type());
        Assertions.assertEquals("mkdo", model.value().get(0).properties().typeHandlerVersion());
        Assertions.assertEquals(false, model.value().get(0).properties().autoUpgradeMinorVersion());
        Assertions.assertEquals("s", model.nextLink());
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
