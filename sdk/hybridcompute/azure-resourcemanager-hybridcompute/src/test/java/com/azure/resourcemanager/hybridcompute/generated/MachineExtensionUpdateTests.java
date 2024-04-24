// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.MachineExtensionUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MachineExtensionUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineExtensionUpdate model = BinaryData.fromString(
            "{\"properties\":{\"forceUpdateTag\":\"misgwbnb\",\"publisher\":\"ldawkzbaliourqha\",\"type\":\"uhashsfwx\",\"typeHandlerVersion\":\"owzxcu\",\"enableAutomaticUpgrade\":true,\"autoUpgradeMinorVersion\":true,\"settings\":{\"pucwwfvovbvme\":\"datadjeb\"},\"protectedSettings\":{\"iotwmcdytdxwit\":\"dataivyhzceuojgjrwju\",\"hniskxfbkpyc\":\"datanrjawgqwg\",\"l\":\"dataklwndnhjdauwhv\"}},\"tags\":{\"zqlveualupjmkhf\":\"tdhxujznbmpowuwp\",\"wsrtjriplrbpbe\":\"obbc\",\"qhjk\":\"tghfgblcgwxzvl\"}}")
            .toObject(MachineExtensionUpdate.class);
        Assertions.assertEquals("tdhxujznbmpowuwp", model.tags().get("zqlveualupjmkhf"));
        Assertions.assertEquals("misgwbnb", model.forceUpdateTag());
        Assertions.assertEquals("ldawkzbaliourqha", model.publisher());
        Assertions.assertEquals("uhashsfwx", model.type());
        Assertions.assertEquals("owzxcu", model.typeHandlerVersion());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
        Assertions.assertEquals(true, model.autoUpgradeMinorVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineExtensionUpdate model = new MachineExtensionUpdate()
            .withTags(mapOf("zqlveualupjmkhf", "tdhxujznbmpowuwp", "wsrtjriplrbpbe", "obbc", "qhjk", "tghfgblcgwxzvl"))
            .withForceUpdateTag("misgwbnb")
            .withPublisher("ldawkzbaliourqha")
            .withType("uhashsfwx")
            .withTypeHandlerVersion("owzxcu")
            .withEnableAutomaticUpgrade(true)
            .withAutoUpgradeMinorVersion(true)
            .withSettings(mapOf("pucwwfvovbvme", "datadjeb"))
            .withProtectedSettings(mapOf("iotwmcdytdxwit", "dataivyhzceuojgjrwju", "hniskxfbkpyc", "datanrjawgqwg", "l",
                "dataklwndnhjdauwhv"));
        model = BinaryData.fromObject(model).toObject(MachineExtensionUpdate.class);
        Assertions.assertEquals("tdhxujznbmpowuwp", model.tags().get("zqlveualupjmkhf"));
        Assertions.assertEquals("misgwbnb", model.forceUpdateTag());
        Assertions.assertEquals("ldawkzbaliourqha", model.publisher());
        Assertions.assertEquals("uhashsfwx", model.type());
        Assertions.assertEquals("owzxcu", model.typeHandlerVersion());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
        Assertions.assertEquals(true, model.autoUpgradeMinorVersion());
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
