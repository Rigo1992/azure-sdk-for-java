// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Job output processing event data. Schema of the data property of an EventGridEvent for a
 * Microsoft.Media.JobOutputProcessing event.
 */
@Fluent
public final class MediaJobOutputProcessingEventData extends MediaJobOutputStateChangeEventData {
    /**
     * Creates an instance of MediaJobOutputProcessingEventData class.
     */
    public MediaJobOutputProcessingEventData() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaJobOutputProcessingEventData setOutput(MediaJobOutput output) {
        super.setOutput(output);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaJobOutputProcessingEventData setJobCorrelationData(Map<String, String> jobCorrelationData) {
        super.setJobCorrelationData(jobCorrelationData);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("output", getOutput());
        jsonWriter.writeMapField("jobCorrelationData", getJobCorrelationData(),
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MediaJobOutputProcessingEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MediaJobOutputProcessingEventData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MediaJobOutputProcessingEventData.
     */
    public static MediaJobOutputProcessingEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MediaJobOutputProcessingEventData deserializedMediaJobOutputProcessingEventData
                = new MediaJobOutputProcessingEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("previousState".equals(fieldName)) {
                    deserializedMediaJobOutputProcessingEventData
                        .setPreviousState(MediaJobState.fromString(reader.getString()));
                } else if ("output".equals(fieldName)) {
                    deserializedMediaJobOutputProcessingEventData.setOutput(MediaJobOutput.fromJson(reader));
                } else if ("jobCorrelationData".equals(fieldName)) {
                    Map<String, String> jobCorrelationData = reader.readMap(reader1 -> reader1.getString());
                    deserializedMediaJobOutputProcessingEventData.setJobCorrelationData(jobCorrelationData);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMediaJobOutputProcessingEventData;
        });
    }
}
