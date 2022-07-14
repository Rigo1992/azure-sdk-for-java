// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/** Represents a schedule for indexer execution. */
@Fluent
public final class IndexingSchedule implements JsonSerializable<IndexingSchedule> {
    /*
     * The interval of time between indexer executions.
     */
    private final Duration interval;

    /*
     * The time when an indexer should start running.
     */
    private OffsetDateTime startTime;

    /**
     * Creates an instance of IndexingSchedule class.
     *
     * @param interval the interval value to set.
     */
    public IndexingSchedule(Duration interval) {
        this.interval = interval;
    }

    /**
     * Get the interval property: The interval of time between indexer executions.
     *
     * @return the interval value.
     */
    public Duration getInterval() {
        return this.interval;
    }

    /**
     * Get the startTime property: The time when an indexer should start running.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The time when an indexer should start running.
     *
     * @param startTime the startTime value to set.
     * @return the IndexingSchedule object itself.
     */
    public IndexingSchedule setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("interval", this.interval == null ? null : this.interval.toString(), false);
        jsonWriter.writeStringField("startTime", this.startTime == null ? null : this.startTime.toString(), false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of IndexingSchedule from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of IndexingSchedule if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static IndexingSchedule fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    boolean intervalFound = false;
                    Duration interval = null;
                    OffsetDateTime startTime = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("interval".equals(fieldName)) {
                            interval = reader.getNullableValue(r -> Duration.parse(reader.getStringValue()));
                            intervalFound = true;
                        } else if ("startTime".equals(fieldName)) {
                            startTime = reader.getNullableValue(r -> OffsetDateTime.parse(reader.getStringValue()));
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!intervalFound) {
                        missingProperties.add("interval");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    IndexingSchedule deserializedValue = new IndexingSchedule(interval);
                    deserializedValue.startTime = startTime;

                    return deserializedValue;
                });
    }
}
