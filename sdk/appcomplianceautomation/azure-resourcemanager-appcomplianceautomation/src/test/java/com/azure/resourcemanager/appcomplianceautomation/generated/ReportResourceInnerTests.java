// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.ReportResourceInner;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportProperties;
import com.azure.resourcemanager.appcomplianceautomation.models.ResourceMetadata;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReportResourceInnerTests {
    @Test
    public void testDeserialize() {
        ReportResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"id\":\"czwlokjyem\",\"status\":\"Disabled\",\"tenantId\":\"ipjoxzjnchgejs\",\"reportName\":\"dmailzydehojw\",\"offerGuid\":\"huxinpmqnj\",\"timeZone\":\"qwixjspro\",\"triggerTime\":\"2021-09-07T15:56:43Z\",\"nextTriggerTime\":\"2021-01-29T23:00:34Z\",\"lastTriggerTime\":\"2021-04-27T04:38:08Z\",\"subscriptions\":[\"jvwmfda\"],\"resources\":[{\"resourceId\":\"cmdv\",\"resourceType\":\"hulsuuvmkjozkrwf\",\"resourceKind\":\"iodjp\",\"resourceName\":\"w\",\"tags\":{}},{\"resourceId\":\"dpvwryoqpsoaccta\",\"resourceType\":\"kljla\",\"resourceKind\":\"cr\",\"resourceName\":\"fdfdosygexpa\",\"tags\":{}},{\"resourceId\":\"akhmsbzjhcrz\",\"resourceType\":\"dphlxaolt\",\"resourceKind\":\"trg\",\"resourceName\":\"bpf\",\"tags\":{}},{\"resourceId\":\"s\",\"resourceType\":\"zgvfcjrwz\",\"resourceKind\":\"xjtfelluwfzit\",\"resourceName\":\"peqfpjkjl\",\"tags\":{}}],\"complianceStatus\":{},\"provisioningState\":\"Creating\"},\"id\":\"pfxxy\",\"name\":\"ininmay\",\"type\":\"uybbkpodep\"}")
                .toObject(ReportResourceInner.class);
        Assertions.assertEquals("huxinpmqnj", model.properties().offerGuid());
        Assertions.assertEquals("qwixjspro", model.properties().timeZone());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-07T15:56:43Z"), model.properties().triggerTime());
        Assertions.assertEquals("cmdv", model.properties().resources().get(0).resourceId());
        Assertions.assertEquals("hulsuuvmkjozkrwf", model.properties().resources().get(0).resourceType());
        Assertions.assertEquals("iodjp", model.properties().resources().get(0).resourceKind());
        Assertions.assertEquals("w", model.properties().resources().get(0).resourceName());
    }

    @Test
    public void testSerialize() {
        ReportResourceInner model =
            new ReportResourceInner()
                .withProperties(
                    new ReportProperties()
                        .withOfferGuid("huxinpmqnj")
                        .withTimeZone("qwixjspro")
                        .withTriggerTime(OffsetDateTime.parse("2021-09-07T15:56:43Z"))
                        .withResources(
                            Arrays
                                .asList(
                                    new ResourceMetadata()
                                        .withResourceId("cmdv")
                                        .withResourceType("hulsuuvmkjozkrwf")
                                        .withResourceKind("iodjp")
                                        .withResourceName("w")
                                        .withTags(mapOf()),
                                    new ResourceMetadata()
                                        .withResourceId("dpvwryoqpsoaccta")
                                        .withResourceType("kljla")
                                        .withResourceKind("cr")
                                        .withResourceName("fdfdosygexpa")
                                        .withTags(mapOf()),
                                    new ResourceMetadata()
                                        .withResourceId("akhmsbzjhcrz")
                                        .withResourceType("dphlxaolt")
                                        .withResourceKind("trg")
                                        .withResourceName("bpf")
                                        .withTags(mapOf()),
                                    new ResourceMetadata()
                                        .withResourceId("s")
                                        .withResourceType("zgvfcjrwz")
                                        .withResourceKind("xjtfelluwfzit")
                                        .withResourceName("peqfpjkjl")
                                        .withTags(mapOf()))));
        model = BinaryData.fromObject(model).toObject(ReportResourceInner.class);
        Assertions.assertEquals("huxinpmqnj", model.properties().offerGuid());
        Assertions.assertEquals("qwixjspro", model.properties().timeZone());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-07T15:56:43Z"), model.properties().triggerTime());
        Assertions.assertEquals("cmdv", model.properties().resources().get(0).resourceId());
        Assertions.assertEquals("hulsuuvmkjozkrwf", model.properties().resources().get(0).resourceType());
        Assertions.assertEquals("iodjp", model.properties().resources().get(0).resourceKind());
        Assertions.assertEquals("w", model.properties().resources().get(0).resourceName());
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
