// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.models.ServiceImpactingEvent;
import com.azure.resourcemanager.resourcehealth.models.ServiceImpactingEventIncidentProperties;
import com.azure.resourcemanager.resourcehealth.models.ServiceImpactingEventStatus;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ServiceImpactingEventTests {
    @Test
    public void testDeserialize() {
        ServiceImpactingEvent model =
            BinaryData
                .fromString(
                    "{\"eventStartTime\":\"2021-05-23T15:38:51Z\",\"eventStatusLastModifiedTime\":\"2021-02-08T12:52:46Z\",\"correlationId\":\"tnwu\",\"status\":{\"value\":\"a\"},\"incidentProperties\":{\"title\":\"fizuckyf\",\"service\":\"rfidfvzwdz\",\"region\":\"tymw\",\"incidentType\":\"dkfthwxmnt\"}}")
                .toObject(ServiceImpactingEvent.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-23T15:38:51Z"), model.eventStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-08T12:52:46Z"), model.eventStatusLastModifiedTime());
        Assertions.assertEquals("tnwu", model.correlationId());
        Assertions.assertEquals("a", model.status().value());
        Assertions.assertEquals("fizuckyf", model.incidentProperties().title());
        Assertions.assertEquals("rfidfvzwdz", model.incidentProperties().service());
        Assertions.assertEquals("tymw", model.incidentProperties().region());
        Assertions.assertEquals("dkfthwxmnt", model.incidentProperties().incidentType());
    }

    @Test
    public void testSerialize() {
        ServiceImpactingEvent model =
            new ServiceImpactingEvent()
                .withEventStartTime(OffsetDateTime.parse("2021-05-23T15:38:51Z"))
                .withEventStatusLastModifiedTime(OffsetDateTime.parse("2021-02-08T12:52:46Z"))
                .withCorrelationId("tnwu")
                .withStatus(new ServiceImpactingEventStatus().withValue("a"))
                .withIncidentProperties(
                    new ServiceImpactingEventIncidentProperties()
                        .withTitle("fizuckyf")
                        .withService("rfidfvzwdz")
                        .withRegion("tymw")
                        .withIncidentType("dkfthwxmnt"));
        model = BinaryData.fromObject(model).toObject(ServiceImpactingEvent.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-23T15:38:51Z"), model.eventStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-08T12:52:46Z"), model.eventStatusLastModifiedTime());
        Assertions.assertEquals("tnwu", model.correlationId());
        Assertions.assertEquals("a", model.status().value());
        Assertions.assertEquals("fizuckyf", model.incidentProperties().title());
        Assertions.assertEquals("rfidfvzwdz", model.incidentProperties().service());
        Assertions.assertEquals("tymw", model.incidentProperties().region());
        Assertions.assertEquals("dkfthwxmnt", model.incidentProperties().incidentType());
    }
}
