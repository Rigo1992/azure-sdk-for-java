// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.StartMenuItemInner;
import org.junit.jupiter.api.Assertions;

public final class StartMenuItemInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StartMenuItemInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"appAlias\":\"jrjxgciqibrhosx\",\"filePath\":\"qrhzoymibmrqyib\",\"commandLineArguments\":\"wfluszdt\",\"iconPath\":\"rkwofyyvoqa\",\"iconIndex\":848769798},\"id\":\"expbtg\",\"name\":\"wbwo\",\"type\":\"nwashrtd\"}")
                .toObject(StartMenuItemInner.class);
        Assertions.assertEquals("jrjxgciqibrhosx", model.appAlias());
        Assertions.assertEquals("qrhzoymibmrqyib", model.filePath());
        Assertions.assertEquals("wfluszdt", model.commandLineArguments());
        Assertions.assertEquals("rkwofyyvoqa", model.iconPath());
        Assertions.assertEquals(848769798, model.iconIndex());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StartMenuItemInner model =
            new StartMenuItemInner()
                .withAppAlias("jrjxgciqibrhosx")
                .withFilePath("qrhzoymibmrqyib")
                .withCommandLineArguments("wfluszdt")
                .withIconPath("rkwofyyvoqa")
                .withIconIndex(848769798);
        model = BinaryData.fromObject(model).toObject(StartMenuItemInner.class);
        Assertions.assertEquals("jrjxgciqibrhosx", model.appAlias());
        Assertions.assertEquals("qrhzoymibmrqyib", model.filePath());
        Assertions.assertEquals("wfluszdt", model.commandLineArguments());
        Assertions.assertEquals("rkwofyyvoqa", model.iconPath());
        Assertions.assertEquals(848769798, model.iconIndex());
    }
}
