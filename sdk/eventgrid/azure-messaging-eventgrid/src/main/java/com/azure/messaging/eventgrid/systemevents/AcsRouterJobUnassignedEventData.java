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
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterJobUnassigned event.
 */
@Fluent
public final class AcsRouterJobUnassignedEventData extends AcsRouterJobEventData {
    /*
     * Router Job Unassigned Assignment Id
     */
    private String assignmentId;

    /*
     * Router Job Unassigned Worker Id
     */
    private String workerId;

    /**
     * Creates an instance of AcsRouterJobUnassignedEventData class.
     */
    public AcsRouterJobUnassignedEventData() {
    }

    /**
     * Get the assignmentId property: Router Job Unassigned Assignment Id.
     * 
     * @return the assignmentId value.
     */
    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * Set the assignmentId property: Router Job Unassigned Assignment Id.
     * 
     * @param assignmentId the assignmentId value to set.
     * @return the AcsRouterJobUnassignedEventData object itself.
     */
    public AcsRouterJobUnassignedEventData setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
        return this;
    }

    /**
     * Get the workerId property: Router Job Unassigned Worker Id.
     * 
     * @return the workerId value.
     */
    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * Set the workerId property: Router Job Unassigned Worker Id.
     * 
     * @param workerId the workerId value to set.
     * @return the AcsRouterJobUnassignedEventData object itself.
     */
    public AcsRouterJobUnassignedEventData setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsRouterJobUnassignedEventData setQueueId(String queueId) {
        super.setQueueId(queueId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsRouterJobUnassignedEventData setLabels(Map<String, String> labels) {
        super.setLabels(labels);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsRouterJobUnassignedEventData setTags(Map<String, String> tags) {
        super.setTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsRouterJobUnassignedEventData setJobId(String jobId) {
        super.setJobId(jobId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsRouterJobUnassignedEventData setChannelReference(String channelReference) {
        super.setChannelReference(channelReference);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsRouterJobUnassignedEventData setChannelId(String channelId) {
        super.setChannelId(channelId);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jobId", getJobId());
        jsonWriter.writeStringField("channelReference", getChannelReference());
        jsonWriter.writeStringField("channelId", getChannelId());
        jsonWriter.writeStringField("queueId", getQueueId());
        jsonWriter.writeMapField("labels", getLabels(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("tags", getTags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("assignmentId", this.assignmentId);
        jsonWriter.writeStringField("workerId", this.workerId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsRouterJobUnassignedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsRouterJobUnassignedEventData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcsRouterJobUnassignedEventData.
     */
    public static AcsRouterJobUnassignedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsRouterJobUnassignedEventData deserializedAcsRouterJobUnassignedEventData
                = new AcsRouterJobUnassignedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jobId".equals(fieldName)) {
                    deserializedAcsRouterJobUnassignedEventData.setJobId(reader.getString());
                } else if ("channelReference".equals(fieldName)) {
                    deserializedAcsRouterJobUnassignedEventData.setChannelReference(reader.getString());
                } else if ("channelId".equals(fieldName)) {
                    deserializedAcsRouterJobUnassignedEventData.setChannelId(reader.getString());
                } else if ("queueId".equals(fieldName)) {
                    deserializedAcsRouterJobUnassignedEventData.setQueueId(reader.getString());
                } else if ("labels".equals(fieldName)) {
                    Map<String, String> labels = reader.readMap(reader1 -> reader1.getString());
                    deserializedAcsRouterJobUnassignedEventData.setLabels(labels);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAcsRouterJobUnassignedEventData.setTags(tags);
                } else if ("assignmentId".equals(fieldName)) {
                    deserializedAcsRouterJobUnassignedEventData.assignmentId = reader.getString();
                } else if ("workerId".equals(fieldName)) {
                    deserializedAcsRouterJobUnassignedEventData.workerId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAcsRouterJobUnassignedEventData;
        });
    }
}
