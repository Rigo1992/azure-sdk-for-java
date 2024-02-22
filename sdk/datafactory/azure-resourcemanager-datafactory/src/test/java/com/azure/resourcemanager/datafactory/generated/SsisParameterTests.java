// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisParameter;
import org.junit.jupiter.api.Assertions;

public final class SsisParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisParameter model = BinaryData.fromString(
            "{\"id\":3047901925060502269,\"name\":\"dhtct\",\"description\":\"regykjmpad\",\"dataType\":\"joh\",\"required\":false,\"sensitive\":false,\"designDefaultValue\":\"xitydljgrpqua\",\"defaultValue\":\"gjqqbactffxdb\",\"sensitiveDefaultValue\":\"ihumw\",\"valueType\":\"apctgljopizqqihv\",\"valueSet\":true,\"variable\":\"qiqddjynpgomz\"}")
            .toObject(SsisParameter.class);
        Assertions.assertEquals(3047901925060502269L, model.id());
        Assertions.assertEquals("dhtct", model.name());
        Assertions.assertEquals("regykjmpad", model.description());
        Assertions.assertEquals("joh", model.dataType());
        Assertions.assertEquals(false, model.required());
        Assertions.assertEquals(false, model.sensitive());
        Assertions.assertEquals("xitydljgrpqua", model.designDefaultValue());
        Assertions.assertEquals("gjqqbactffxdb", model.defaultValue());
        Assertions.assertEquals("ihumw", model.sensitiveDefaultValue());
        Assertions.assertEquals("apctgljopizqqihv", model.valueType());
        Assertions.assertEquals(true, model.valueSet());
        Assertions.assertEquals("qiqddjynpgomz", model.variable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisParameter model
            = new SsisParameter().withId(3047901925060502269L).withName("dhtct").withDescription("regykjmpad")
                .withDataType("joh").withRequired(false).withSensitive(false).withDesignDefaultValue("xitydljgrpqua")
                .withDefaultValue("gjqqbactffxdb").withSensitiveDefaultValue("ihumw").withValueType("apctgljopizqqihv")
                .withValueSet(true).withVariable("qiqddjynpgomz");
        model = BinaryData.fromObject(model).toObject(SsisParameter.class);
        Assertions.assertEquals(3047901925060502269L, model.id());
        Assertions.assertEquals("dhtct", model.name());
        Assertions.assertEquals("regykjmpad", model.description());
        Assertions.assertEquals("joh", model.dataType());
        Assertions.assertEquals(false, model.required());
        Assertions.assertEquals(false, model.sensitive());
        Assertions.assertEquals("xitydljgrpqua", model.designDefaultValue());
        Assertions.assertEquals("gjqqbactffxdb", model.defaultValue());
        Assertions.assertEquals("ihumw", model.sensitiveDefaultValue());
        Assertions.assertEquals("apctgljopizqqihv", model.valueType());
        Assertions.assertEquals(true, model.valueSet());
        Assertions.assertEquals("qiqddjynpgomz", model.variable());
    }
}
