// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

/**
 * Parameters for removing nodes from an Azure Batch Pool.
 */
@Fluent
public final class BatchNodeRemoveContent implements JsonSerializable<BatchNodeRemoveContent> {

    /*
     * A list containing the IDs of the Compute Nodes to be removed from the specified Pool. A maximum of 100 nodes may be removed per request.
     */
    @Generated
    private final List<String> nodeList;

    /*
     * The timeout for removal of Compute Nodes to the Pool. The default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     */
    @Generated
    private Duration resizeTimeout;

    /*
     * Determines what to do with a Compute Node and its running task(s) after it has been selected for deallocation. The default value is requeue.
     */
    @Generated
    private BatchNodeDeallocationOption nodeDeallocationOption;

    /**
     * Creates an instance of BatchNodeRemoveContent class.
     *
     * @param nodeList the nodeList value to set.
     */
    @Generated
    public BatchNodeRemoveContent(List<String> nodeList) {
        this.nodeList = nodeList;
    }

    /**
     * Get the nodeList property: A list containing the IDs of the Compute Nodes to be removed from the specified Pool.
     * A maximum of 100 nodes may be removed per request.
     *
     * @return the nodeList value.
     */
    @Generated
    public List<String> getNodeList() {
        return this.nodeList;
    }

    /**
     * Get the resizeTimeout property: The timeout for removal of Compute Nodes to the Pool. The default value is 15
     * minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an
     * error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the resizeTimeout value.
     */
    @Generated
    public Duration getResizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set the resizeTimeout property: The timeout for removal of Compute Nodes to the Pool. The default value is 15
     * minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an
     * error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param resizeTimeout the resizeTimeout value to set.
     * @return the BatchNodeRemoveContent object itself.
     */
    @Generated
    public BatchNodeRemoveContent setResizeTimeout(Duration resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
        return this;
    }

    /**
     * Get the nodeDeallocationOption property: Determines what to do with a Compute Node and its running task(s) after
     * it has been selected for deallocation. The default value is requeue.
     *
     * @return the nodeDeallocationOption value.
     */
    @Generated
    public BatchNodeDeallocationOption getNodeDeallocationOption() {
        return this.nodeDeallocationOption;
    }

    /**
     * Set the nodeDeallocationOption property: Determines what to do with a Compute Node and its running task(s) after
     * it has been selected for deallocation. The default value is requeue.
     *
     * @param nodeDeallocationOption the nodeDeallocationOption value to set.
     * @return the BatchNodeRemoveContent object itself.
     */
    @Generated
    public BatchNodeRemoveContent setNodeDeallocationOption(BatchNodeDeallocationOption nodeDeallocationOption) {
        this.nodeDeallocationOption = nodeDeallocationOption;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("nodeList", this.nodeList, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("resizeTimeout", CoreUtils.durationToStringWithDays(this.resizeTimeout));
        jsonWriter.writeStringField("nodeDeallocationOption",
            this.nodeDeallocationOption == null ? null : this.nodeDeallocationOption.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchNodeRemoveContent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchNodeRemoveContent if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchNodeRemoveContent.
     */
    @Generated
    public static BatchNodeRemoveContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<String> nodeList = null;
            Duration resizeTimeout = null;
            BatchNodeDeallocationOption nodeDeallocationOption = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("nodeList".equals(fieldName)) {
                    nodeList = reader.readArray(reader1 -> reader1.getString());
                } else if ("resizeTimeout".equals(fieldName)) {
                    resizeTimeout = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("nodeDeallocationOption".equals(fieldName)) {
                    nodeDeallocationOption = BatchNodeDeallocationOption.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            BatchNodeRemoveContent deserializedBatchNodeRemoveContent = new BatchNodeRemoveContent(nodeList);
            deserializedBatchNodeRemoveContent.resizeTimeout = resizeTimeout;
            deserializedBatchNodeRemoveContent.nodeDeallocationOption = nodeDeallocationOption;
            return deserializedBatchNodeRemoveContent;
        });
    }
}
