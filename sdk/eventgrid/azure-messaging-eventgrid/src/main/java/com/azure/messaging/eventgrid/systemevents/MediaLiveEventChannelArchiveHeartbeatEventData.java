// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * Channel Archive heartbeat event data. Schema of the data property of an EventGridEvent for a
 * Microsoft.Media.LiveEventChannelArchiveHeartbeat event.
 */
@Immutable
public final class MediaLiveEventChannelArchiveHeartbeatEventData
    implements JsonSerializable<MediaLiveEventChannelArchiveHeartbeatEventData> {
    /*
     * Gets the channel latency in ms.
     */
    private String channelLatencyMs;

    /*
     * Gets the latency result code.
     */
    private String latencyResultCode;
    static final ClientLogger LOGGER = new ClientLogger(MediaLiveEventChannelArchiveHeartbeatEventData.class);

    /**
     * Creates an instance of MediaLiveEventChannelArchiveHeartbeatEventData class.
     */
    public MediaLiveEventChannelArchiveHeartbeatEventData() {
    }

    /**
     * Gets the duration of channel latency.
     * 
     * @return the duration of channel latency.
     */
    public Duration getChannelLatency() {
        if ("n/a".equals(this.channelLatencyMs)) {
            return null;
        }
        Long channelLatencyMsLong;
        try {
            channelLatencyMsLong = Long.parseLong(this.channelLatencyMs);
        } catch (NumberFormatException ex) {
            LOGGER.logExceptionAsError(ex);
            return null;
        }
        return Duration.ofMillis(channelLatencyMsLong);
    }

    /**
     * Get the latencyResultCode property: Gets the latency result code.
     * 
     * @return the latencyResultCode value.
     */
    public String getLatencyResultCode() {
        return this.latencyResultCode;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MediaLiveEventChannelArchiveHeartbeatEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MediaLiveEventChannelArchiveHeartbeatEventData if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MediaLiveEventChannelArchiveHeartbeatEventData.
     */
    public static MediaLiveEventChannelArchiveHeartbeatEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MediaLiveEventChannelArchiveHeartbeatEventData deserializedMediaLiveEventChannelArchiveHeartbeatEventData
                = new MediaLiveEventChannelArchiveHeartbeatEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("channelLatencyMs".equals(fieldName)) {
                    deserializedMediaLiveEventChannelArchiveHeartbeatEventData.channelLatencyMs = reader.getString();
                } else if ("latencyResultCode".equals(fieldName)) {
                    deserializedMediaLiveEventChannelArchiveHeartbeatEventData.latencyResultCode = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMediaLiveEventChannelArchiveHeartbeatEventData;
        });
    }
}
