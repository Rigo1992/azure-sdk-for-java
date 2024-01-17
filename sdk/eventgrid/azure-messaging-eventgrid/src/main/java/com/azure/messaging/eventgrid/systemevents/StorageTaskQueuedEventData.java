// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Schema of the Data property of an EventGridEvent for an Microsoft.Storage.StorageTaskQueued event.
 */
@Fluent
public final class StorageTaskQueuedEventData implements JsonSerializable<StorageTaskQueuedEventData> {
    /*
     * The time at which a storage task was queued.
     */
    private OffsetDateTime queuedDateTime;

    /*
     * The execution id for a storage task.
     */
    private String taskExecutionId;

    /**
     * Creates an instance of StorageTaskQueuedEventData class.
     */
    public StorageTaskQueuedEventData() {
    }

    /**
     * Get the queuedDateTime property: The time at which a storage task was queued.
     * 
     * @return the queuedDateTime value.
     */
    public OffsetDateTime getQueuedDateTime() {
        return this.queuedDateTime;
    }

    /**
     * Set the queuedDateTime property: The time at which a storage task was queued.
     * 
     * @param queuedDateTime the queuedDateTime value to set.
     * @return the StorageTaskQueuedEventData object itself.
     */
    public StorageTaskQueuedEventData setQueuedDateTime(OffsetDateTime queuedDateTime) {
        this.queuedDateTime = queuedDateTime;
        return this;
    }

    /**
     * Get the taskExecutionId property: The execution id for a storage task.
     * 
     * @return the taskExecutionId value.
     */
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    /**
     * Set the taskExecutionId property: The execution id for a storage task.
     * 
     * @param taskExecutionId the taskExecutionId value to set.
     * @return the StorageTaskQueuedEventData object itself.
     */
    public StorageTaskQueuedEventData setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("queuedDateTime",
            this.queuedDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.queuedDateTime));
        jsonWriter.writeStringField("taskExecutionId", this.taskExecutionId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageTaskQueuedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageTaskQueuedEventData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageTaskQueuedEventData.
     */
    public static StorageTaskQueuedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageTaskQueuedEventData deserializedStorageTaskQueuedEventData = new StorageTaskQueuedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("queuedDateTime".equals(fieldName)) {
                    deserializedStorageTaskQueuedEventData.queuedDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("taskExecutionId".equals(fieldName)) {
                    deserializedStorageTaskQueuedEventData.taskExecutionId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageTaskQueuedEventData;
        });
    }
}
