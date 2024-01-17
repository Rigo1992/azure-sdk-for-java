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
import java.util.List;
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterWorkerRegistered event.
 */
@Fluent
public final class AcsRouterWorkerRegisteredEventData implements JsonSerializable<AcsRouterWorkerRegisteredEventData> {
    /*
     * Router Worker Registered Worker Id
     */
    private String workerId;

    /*
     * Router Worker Registered Queue Info
     */
    private List<AcsRouterQueueDetails> queueAssignments;

    /*
     * Router Worker Registered Channel Configuration
     */
    private List<AcsRouterChannelConfiguration> channelConfigurations;

    /*
     * Router Worker Register Total Capacity
     */
    private Integer totalCapacity;

    /*
     * Router Worker Registered Labels
     */
    private Map<String, String> labels;

    /*
     * Router Worker Registered Tags
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of AcsRouterWorkerRegisteredEventData class.
     */
    public AcsRouterWorkerRegisteredEventData() {
    }

    /**
     * Get the workerId property: Router Worker Registered Worker Id.
     * 
     * @return the workerId value.
     */
    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * Set the workerId property: Router Worker Registered Worker Id.
     * 
     * @param workerId the workerId value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }

    /**
     * Get the queueAssignments property: Router Worker Registered Queue Info.
     * 
     * @return the queueAssignments value.
     */
    public List<AcsRouterQueueDetails> getQueueAssignments() {
        return this.queueAssignments;
    }

    /**
     * Set the queueAssignments property: Router Worker Registered Queue Info.
     * 
     * @param queueAssignments the queueAssignments value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setQueueAssignments(List<AcsRouterQueueDetails> queueAssignments) {
        this.queueAssignments = queueAssignments;
        return this;
    }

    /**
     * Get the channelConfigurations property: Router Worker Registered Channel Configuration.
     * 
     * @return the channelConfigurations value.
     */
    public List<AcsRouterChannelConfiguration> getChannelConfigurations() {
        return this.channelConfigurations;
    }

    /**
     * Set the channelConfigurations property: Router Worker Registered Channel Configuration.
     * 
     * @param channelConfigurations the channelConfigurations value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData
        setChannelConfigurations(List<AcsRouterChannelConfiguration> channelConfigurations) {
        this.channelConfigurations = channelConfigurations;
        return this;
    }

    /**
     * Get the totalCapacity property: Router Worker Register Total Capacity.
     * 
     * @return the totalCapacity value.
     */
    public Integer getTotalCapacity() {
        return this.totalCapacity;
    }

    /**
     * Set the totalCapacity property: Router Worker Register Total Capacity.
     * 
     * @param totalCapacity the totalCapacity value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }

    /**
     * Get the labels property: Router Worker Registered Labels.
     * 
     * @return the labels value.
     */
    public Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: Router Worker Registered Labels.
     * 
     * @param labels the labels value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the tags property: Router Worker Registered Tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Router Worker Registered Tags.
     * 
     * @param tags the tags value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("workerId", this.workerId);
        jsonWriter.writeArrayField("queueAssignments", this.queueAssignments,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("channelConfigurations", this.channelConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("totalCapacity", this.totalCapacity);
        jsonWriter.writeMapField("labels", this.labels, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsRouterWorkerRegisteredEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsRouterWorkerRegisteredEventData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcsRouterWorkerRegisteredEventData.
     */
    public static AcsRouterWorkerRegisteredEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsRouterWorkerRegisteredEventData deserializedAcsRouterWorkerRegisteredEventData
                = new AcsRouterWorkerRegisteredEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("workerId".equals(fieldName)) {
                    deserializedAcsRouterWorkerRegisteredEventData.workerId = reader.getString();
                } else if ("queueAssignments".equals(fieldName)) {
                    List<AcsRouterQueueDetails> queueAssignments
                        = reader.readArray(reader1 -> AcsRouterQueueDetails.fromJson(reader1));
                    deserializedAcsRouterWorkerRegisteredEventData.queueAssignments = queueAssignments;
                } else if ("channelConfigurations".equals(fieldName)) {
                    List<AcsRouterChannelConfiguration> channelConfigurations
                        = reader.readArray(reader1 -> AcsRouterChannelConfiguration.fromJson(reader1));
                    deserializedAcsRouterWorkerRegisteredEventData.channelConfigurations = channelConfigurations;
                } else if ("totalCapacity".equals(fieldName)) {
                    deserializedAcsRouterWorkerRegisteredEventData.totalCapacity
                        = reader.getNullable(JsonReader::getInt);
                } else if ("labels".equals(fieldName)) {
                    Map<String, String> labels = reader.readMap(reader1 -> reader1.getString());
                    deserializedAcsRouterWorkerRegisteredEventData.labels = labels;
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAcsRouterWorkerRegisteredEventData.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAcsRouterWorkerRegisteredEventData;
        });
    }
}
