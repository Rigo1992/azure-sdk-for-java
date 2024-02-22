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

/**
 * Schema of the Data property of an EventGridEvent for Microsoft.AVS/scriptExecutions events.
 */
@Fluent
public class AvsScriptExecutionEventData implements JsonSerializable<AvsScriptExecutionEventData> {
    /*
     * Id of the operation that caused this event.
     */
    private String operationId;

    /*
     * Cmdlet referenced in the execution that caused this event.
     */
    private String cmdletId;

    /*
     * Stdout outputs from the execution, if any.
     */
    private List<String> output;

    /**
     * Creates an instance of AvsScriptExecutionEventData class.
     */
    public AvsScriptExecutionEventData() {
    }

    /**
     * Get the operationId property: Id of the operation that caused this event.
     * 
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: Id of the operation that caused this event.
     * 
     * @param operationId the operationId value to set.
     * @return the AvsScriptExecutionEventData object itself.
     */
    public AvsScriptExecutionEventData setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the cmdletId property: Cmdlet referenced in the execution that caused this event.
     * 
     * @return the cmdletId value.
     */
    public String getCmdletId() {
        return this.cmdletId;
    }

    /**
     * Set the cmdletId property: Cmdlet referenced in the execution that caused this event.
     * 
     * @param cmdletId the cmdletId value to set.
     * @return the AvsScriptExecutionEventData object itself.
     */
    public AvsScriptExecutionEventData setCmdletId(String cmdletId) {
        this.cmdletId = cmdletId;
        return this;
    }

    /**
     * Get the output property: Stdout outputs from the execution, if any.
     * 
     * @return the output value.
     */
    public List<String> getOutput() {
        return this.output;
    }

    /**
     * Set the output property: Stdout outputs from the execution, if any.
     * 
     * @param output the output value to set.
     * @return the AvsScriptExecutionEventData object itself.
     */
    public AvsScriptExecutionEventData setOutput(List<String> output) {
        this.output = output;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operationId", this.operationId);
        jsonWriter.writeStringField("cmdletId", this.cmdletId);
        jsonWriter.writeArrayField("output", this.output, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvsScriptExecutionEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvsScriptExecutionEventData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvsScriptExecutionEventData.
     */
    public static AvsScriptExecutionEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvsScriptExecutionEventData deserializedAvsScriptExecutionEventData = new AvsScriptExecutionEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operationId".equals(fieldName)) {
                    deserializedAvsScriptExecutionEventData.operationId = reader.getString();
                } else if ("cmdletId".equals(fieldName)) {
                    deserializedAvsScriptExecutionEventData.cmdletId = reader.getString();
                } else if ("output".equals(fieldName)) {
                    List<String> output = reader.readArray(reader1 -> reader1.getString());
                    deserializedAvsScriptExecutionEventData.output = output;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvsScriptExecutionEventData;
        });
    }
}
