// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.AmlOperationInner;
import com.azure.resourcemanager.machinelearning.models.AmlOperationDisplay;
import com.azure.resourcemanager.machinelearning.models.AmlOperationListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AmlOperationListResultTests {
    @Test
    public void testDeserialize() {
        AmlOperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"quvgjxpybczme\",\"display\":{\"provider\":\"zopbsphrupidgs\",\"resource\":\"bejhphoycmsxa\",\"operation\":\"hdxbmtqio\",\"description\":\"zehtbmu\"},\"isDataAction\":false},{\"name\":\"noi\",\"display\":{\"provider\":\"lrxybqsoq\",\"resource\":\"gkdmb\",\"operation\":\"zlobcufpd\",\"description\":\"rbt\"},\"isDataAction\":true},{\"name\":\"nq\",\"display\":{\"provider\":\"qgn\",\"resource\":\"ooojywifsqe\",\"operation\":\"agdfmglzlh\",\"description\":\"rifkwm\"},\"isDataAction\":true}]}")
                .toObject(AmlOperationListResult.class);
        Assertions.assertEquals("quvgjxpybczme", model.value().get(0).name());
        Assertions.assertEquals("zopbsphrupidgs", model.value().get(0).display().provider());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().resource());
        Assertions.assertEquals("hdxbmtqio", model.value().get(0).display().operation());
        Assertions.assertEquals("zehtbmu", model.value().get(0).display().description());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
    }

    @Test
    public void testSerialize() {
        AmlOperationListResult model =
            new AmlOperationListResult()
                .withValue(
                    Arrays
                        .asList(
                            new AmlOperationInner()
                                .withName("quvgjxpybczme")
                                .withDisplay(
                                    new AmlOperationDisplay()
                                        .withProvider("zopbsphrupidgs")
                                        .withResource("bejhphoycmsxa")
                                        .withOperation("hdxbmtqio")
                                        .withDescription("zehtbmu"))
                                .withIsDataAction(false),
                            new AmlOperationInner()
                                .withName("noi")
                                .withDisplay(
                                    new AmlOperationDisplay()
                                        .withProvider("lrxybqsoq")
                                        .withResource("gkdmb")
                                        .withOperation("zlobcufpd")
                                        .withDescription("rbt"))
                                .withIsDataAction(true),
                            new AmlOperationInner()
                                .withName("nq")
                                .withDisplay(
                                    new AmlOperationDisplay()
                                        .withProvider("qgn")
                                        .withResource("ooojywifsqe")
                                        .withOperation("agdfmglzlh")
                                        .withDescription("rifkwm"))
                                .withIsDataAction(true)));
        model = BinaryData.fromObject(model).toObject(AmlOperationListResult.class);
        Assertions.assertEquals("quvgjxpybczme", model.value().get(0).name());
        Assertions.assertEquals("zopbsphrupidgs", model.value().get(0).display().provider());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().resource());
        Assertions.assertEquals("hdxbmtqio", model.value().get(0).display().operation());
        Assertions.assertEquals("zehtbmu", model.value().get(0).display().description());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
    }
}
