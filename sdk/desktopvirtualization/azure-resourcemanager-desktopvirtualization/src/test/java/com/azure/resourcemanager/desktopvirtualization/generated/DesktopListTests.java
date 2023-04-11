// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.DesktopInner;
import com.azure.resourcemanager.desktopvirtualization.models.DesktopList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DesktopListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DesktopList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"objectId\":\"gureodkwobdag\",\"description\":\"ibqdxbxwakbogqx\",\"friendlyName\":\"lkzgxhuriplbp\",\"iconHash\":\"xunkbebxmubyynt\"},\"id\":\"rbqtkoie\",\"name\":\"seotgqrllt\",\"type\":\"u\"}],\"nextLink\":\"auwzizxbmpgc\"}")
                .toObject(DesktopList.class);
        Assertions.assertEquals("ibqdxbxwakbogqx", model.value().get(0).description());
        Assertions.assertEquals("lkzgxhuriplbp", model.value().get(0).friendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DesktopList model =
            new DesktopList()
                .withValue(
                    Arrays
                        .asList(
                            new DesktopInner().withDescription("ibqdxbxwakbogqx").withFriendlyName("lkzgxhuriplbp")));
        model = BinaryData.fromObject(model).toObject(DesktopList.class);
        Assertions.assertEquals("ibqdxbxwakbogqx", model.value().get(0).description());
        Assertions.assertEquals("lkzgxhuriplbp", model.value().get(0).friendlyName());
    }
}
