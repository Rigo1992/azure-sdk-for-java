// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.eventhub.converter;

import com.azure.messaging.eventhubs.EventData;
import com.azure.spring.integration.core.EventHubHeaders;
import com.azure.spring.integration.core.converter.AzureMessageConverter;
import com.azure.spring.integration.test.support.UnaryAzureMessageConverterTest;
import org.junit.jupiter.api.Test;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.messaging.support.NativeMessageHeaderAccessor.NATIVE_HEADERS;

public class EventHubMessageConverterTest extends UnaryAzureMessageConverterTest<EventData> {

    private static final String EVENT_DATA = "event-hub-test-string";

    private static final String PARTITION_KEY = "abc";
    private static final Instant ENQUEUED_TIME = Instant.now().minus(1, ChronoUnit.DAYS);
    private static final Long OFFSET = 1234567890L;
    private static final Long SEQUENCE_NUMBER = 123456L;

    @Override
    public AzureMessageConverter<EventData, EventData> getConverter() {
        return new EventHubMessageConverter();
    }

    @Override
    protected Class<EventData> getTargetClass() {
        return EventData.class;
    }

    @Override
    protected void assertMessageHeadersEqual(EventData azureMessage, Message<?> message) {
        assertEquals(azureMessage.getProperties().get(headerProperties), message.getHeaders().get(headerProperties));
    }

    @Test
    public void testNonUtf8DecodingPayload() {
        String utf16Payload = new String(payload.getBytes(), StandardCharsets.UTF_16);
        Message<String> message = MessageBuilder.withPayload(utf16Payload).build();
        EventData azureMessage = getConverter().fromMessage(message, getTargetClass());
        assertEquals(utf16Payload, azureMessage.getBodyAsString());
        assertNotEquals(payload, azureMessage.getBodyAsString());
    }

    @Test
    public void testConvertCustomHeadersToEventData() {
        Map<String, Object> headerMap = new HashMap<>();
        headerMap.put("fake-header", "fake-value");
        MessageHeaders headers = new MessageHeaders(headerMap);

        EventData eventData = new EventData(EVENT_DATA);

        EventHubMessageConverter converter = new EventHubMessageConverter();
        converter.setCustomHeaders(headers, eventData);

        assertEquals(eventData.getProperties().get("fake-header"), "fake-value");
        assertEquals(eventData.getBodyAsString(), EVENT_DATA);
    }

    @Test
    public void testCustomHeadersFromEventData() {
        EventData eventData = new EventData(EVENT_DATA);
        eventData.getProperties().put("fake-header", "fake-value");

        EventHubMessageConverter converter = new EventHubMessageConverter();
        Map<String, Object> headerHeadersMap = converter.buildCustomHeaders(eventData);
        assertEquals(headerHeadersMap.get("fake-header"), "fake-value");
        assertEquals(eventData.getBodyAsString(), EVENT_DATA);
    }

    @Test
    public void testNativeHeadersFromEventData() {
        EventData eventData = new EventData(EVENT_DATA);
        String nativeHeadersString = "{\"spanId\":[\"spanId-1\", \"spanId-2\"],\"spanTraceId\":[\"spanTraceId-1\", \"spanTraceId-2\"]}";
        eventData.getProperties().put(NATIVE_HEADERS, nativeHeadersString);

        EventHubMessageConverter converter = new EventHubMessageConverter();
        Map<String, Object> headerHeadersMap = converter.buildCustomHeaders(eventData);
        assertEquals(headerHeadersMap.get(NATIVE_HEADERS).getClass(), String.class);
    }

    @Test
    public void testSystemPropertiesScreenedOut() {
        Map<String, Object> headerMap = new HashMap<>();
        headerMap.put(EventHubHeaders.PARTITION_KEY, PARTITION_KEY);
        headerMap.put(EventHubHeaders.ENQUEUED_TIME, ENQUEUED_TIME);
        headerMap.put(EventHubHeaders.OFFSET, OFFSET);
        headerMap.put(EventHubHeaders.SEQUENCE_NUMBER, SEQUENCE_NUMBER);
        MessageHeaders headers = new MessageHeaders(headerMap);

        EventData eventData = new EventData(EVENT_DATA);

        EventHubMessageConverter converter = new EventHubMessageConverter();
        converter.setCustomHeaders(headers, eventData);

        assertFalse(eventData.getProperties().containsKey(EventHubHeaders.PARTITION_KEY));
        assertFalse(eventData.getProperties().containsKey(EventHubHeaders.ENQUEUED_TIME));
        assertFalse(eventData.getProperties().containsKey(EventHubHeaders.OFFSET));
        assertFalse(eventData.getProperties().containsKey(EventHubHeaders.SEQUENCE_NUMBER));
    }

    @Test
    public void testSystemPropertiesConvertedFromEventData() {
        EventData eventData = new EventData(EVENT_DATA);

        EventHubMessageConverter converter = new EventHubMessageConverter();
        Map<String, Object> headerHeadersMap = converter.buildCustomHeaders(eventData);

        assertTrue(headerHeadersMap.containsKey(EventHubHeaders.ENQUEUED_TIME));
        assertTrue(headerHeadersMap.containsKey(EventHubHeaders.OFFSET));
        assertTrue(headerHeadersMap.containsKey(EventHubHeaders.SEQUENCE_NUMBER));
        assertTrue(headerHeadersMap.containsKey(EventHubHeaders.PARTITION_KEY));
    }
}
