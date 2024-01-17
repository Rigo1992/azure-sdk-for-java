// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/**
 * The SmartDetectionCondition model.
 */
@Fluent
public final class SmartDetectionCondition implements JsonSerializable<SmartDetectionCondition> {
    /*
     * sensitivity, value range : (0, 100]
     */
    private double sensitivity;

    /*
     * detection direction
     */
    private AnomalyDetectorDirection anomalyDetectorDirection;

    /*
     * The suppressCondition property.
     */
    private SuppressCondition suppressCondition;

    /**
     * Creates an instance of SmartDetectionCondition class.
     */
    public SmartDetectionCondition() {
    }

    /**
     * Get the sensitivity property: sensitivity, value range : (0, 100].
     * 
     * @return the sensitivity value.
     */
    public double getSensitivity() {
        return this.sensitivity;
    }

    /**
     * Set the sensitivity property: sensitivity, value range : (0, 100].
     * 
     * @param sensitivity the sensitivity value to set.
     * @return the SmartDetectionCondition object itself.
     */
    public SmartDetectionCondition setSensitivity(double sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }

    /**
     * Get the anomalyDetectorDirection property: detection direction.
     * 
     * @return the anomalyDetectorDirection value.
     */
    public AnomalyDetectorDirection getAnomalyDetectorDirection() {
        return this.anomalyDetectorDirection;
    }

    /**
     * Set the anomalyDetectorDirection property: detection direction.
     * 
     * @param anomalyDetectorDirection the anomalyDetectorDirection value to set.
     * @return the SmartDetectionCondition object itself.
     */
    public SmartDetectionCondition setAnomalyDetectorDirection(AnomalyDetectorDirection anomalyDetectorDirection) {
        this.anomalyDetectorDirection = anomalyDetectorDirection;
        return this;
    }

    /**
     * Get the suppressCondition property: The suppressCondition property.
     * 
     * @return the suppressCondition value.
     */
    public SuppressCondition getSuppressCondition() {
        return this.suppressCondition;
    }

    /**
     * Set the suppressCondition property: The suppressCondition property.
     * 
     * @param suppressCondition the suppressCondition value to set.
     * @return the SmartDetectionCondition object itself.
     */
    public SmartDetectionCondition setSuppressCondition(SuppressCondition suppressCondition) {
        this.suppressCondition = suppressCondition;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeDoubleField("sensitivity", this.sensitivity);
        jsonWriter.writeStringField("anomalyDetectorDirection", Objects.toString(this.anomalyDetectorDirection, null));
        jsonWriter.writeJsonField("suppressCondition", this.suppressCondition);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SmartDetectionCondition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SmartDetectionCondition if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SmartDetectionCondition.
     */
    public static SmartDetectionCondition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SmartDetectionCondition deserializedSmartDetectionCondition = new SmartDetectionCondition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sensitivity".equals(fieldName)) {
                    deserializedSmartDetectionCondition.sensitivity = reader.getDouble();
                } else if ("anomalyDetectorDirection".equals(fieldName)) {
                    deserializedSmartDetectionCondition.anomalyDetectorDirection
                        = AnomalyDetectorDirection.fromString(reader.getString());
                } else if ("suppressCondition".equals(fieldName)) {
                    deserializedSmartDetectionCondition.suppressCondition = SuppressCondition.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSmartDetectionCondition;
        });
    }
}
