// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineExtensionInner;
import com.azure.resourcemanager.hybridcompute.models.MachineExtensionInstanceView;
import com.azure.resourcemanager.hybridcompute.models.MachineExtensionProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MachineExtensionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineExtensionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"forceUpdateTag\":\"jwyahuxinpmqnja\",\"publisher\":\"ixjsprozvcputeg\",\"type\":\"wmfdatscmdvpjhul\",\"typeHandlerVersion\":\"uvm\",\"autoUpgradeMinorVersion\":true,\"settings\":\"datak\",\"protectedSettings\":\"dataf\",\"provisioningState\":\"iodjp\",\"instanceView\":{\"name\":\"ej\",\"type\":\"vwryoqpso\",\"typeHandlerVersion\":\"ctazakljlahbcryf\"}},\"location\":\"dosyg\",\"tags\":{\"vdphlxaolthqtr\":\"aojakhmsbzjhcrz\",\"gvfcj\":\"qjbpfzfsin\",\"xjtfelluwfzit\":\"wzo\",\"qfpjk\":\"np\"},\"id\":\"lxofpdvhpfxxypin\",\"name\":\"nmayhuybb\",\"type\":\"podepoo\"}")
                .toObject(MachineExtensionInner.class);
        Assertions.assertEquals("dosyg", model.location());
        Assertions.assertEquals("aojakhmsbzjhcrz", model.tags().get("vdphlxaolthqtr"));
        Assertions.assertEquals("jwyahuxinpmqnja", model.properties().forceUpdateTag());
        Assertions.assertEquals("ixjsprozvcputeg", model.properties().publisher());
        Assertions.assertEquals("wmfdatscmdvpjhul", model.properties().type());
        Assertions.assertEquals("uvm", model.properties().typeHandlerVersion());
        Assertions.assertEquals(true, model.properties().autoUpgradeMinorVersion());
        Assertions.assertEquals("ej", model.properties().instanceView().name());
        Assertions.assertEquals("vwryoqpso", model.properties().instanceView().type());
        Assertions.assertEquals("ctazakljlahbcryf", model.properties().instanceView().typeHandlerVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineExtensionInner model =
            new MachineExtensionInner()
                .withLocation("dosyg")
                .withTags(
                    mapOf(
                        "vdphlxaolthqtr",
                        "aojakhmsbzjhcrz",
                        "gvfcj",
                        "qjbpfzfsin",
                        "xjtfelluwfzit",
                        "wzo",
                        "qfpjk",
                        "np"))
                .withProperties(
                    new MachineExtensionProperties()
                        .withForceUpdateTag("jwyahuxinpmqnja")
                        .withPublisher("ixjsprozvcputeg")
                        .withType("wmfdatscmdvpjhul")
                        .withTypeHandlerVersion("uvm")
                        .withAutoUpgradeMinorVersion(true)
                        .withSettings("datak")
                        .withProtectedSettings("dataf")
                        .withInstanceView(
                            new MachineExtensionInstanceView()
                                .withName("ej")
                                .withType("vwryoqpso")
                                .withTypeHandlerVersion("ctazakljlahbcryf")));
        model = BinaryData.fromObject(model).toObject(MachineExtensionInner.class);
        Assertions.assertEquals("dosyg", model.location());
        Assertions.assertEquals("aojakhmsbzjhcrz", model.tags().get("vdphlxaolthqtr"));
        Assertions.assertEquals("jwyahuxinpmqnja", model.properties().forceUpdateTag());
        Assertions.assertEquals("ixjsprozvcputeg", model.properties().publisher());
        Assertions.assertEquals("wmfdatscmdvpjhul", model.properties().type());
        Assertions.assertEquals("uvm", model.properties().typeHandlerVersion());
        Assertions.assertEquals(true, model.properties().autoUpgradeMinorVersion());
        Assertions.assertEquals("ej", model.properties().instanceView().name());
        Assertions.assertEquals("vwryoqpso", model.properties().instanceView().type());
        Assertions.assertEquals("ctazakljlahbcryf", model.properties().instanceView().typeHandlerVersion());
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
