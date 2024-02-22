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

/**
 * The DimensionGroupConfiguration model.
 */
@Fluent
public final class DimensionGroupConfiguration implements JsonSerializable<DimensionGroupConfiguration> {
    /*
     * The group property.
     */
    private DimensionGroupIdentity group;

    /*
     * condition operator
     * 
     * should be specified when combining multiple detection conditions
     */
    private AnomalyDetectionConfigurationLogicType conditionOperator;

    /*
     * The smartDetectionCondition property.
     */
    private SmartDetectionCondition smartDetectionCondition;

    /*
     * The hardThresholdCondition property.
     */
    private HardThresholdCondition hardThresholdCondition;

    /*
     * The changeThresholdCondition property.
     */
    private ChangeThresholdCondition changeThresholdCondition;

    /**
     * Creates an instance of DimensionGroupConfiguration class.
     */
    public DimensionGroupConfiguration() {
    }

    /**
     * Get the group property: The group property.
     * 
     * @return the group value.
     */
    public DimensionGroupIdentity getGroup() {
        return this.group;
    }

    /**
     * Set the group property: The group property.
     * 
     * @param group the group value to set.
     * @return the DimensionGroupConfiguration object itself.
     */
    public DimensionGroupConfiguration setGroup(DimensionGroupIdentity group) {
        this.group = group;
        return this;
    }

    /**
     * Get the conditionOperator property: condition operator
     * 
     * should be specified when combining multiple detection conditions.
     * 
     * @return the conditionOperator value.
     */
    public AnomalyDetectionConfigurationLogicType getConditionOperator() {
        return this.conditionOperator;
    }

    /**
     * Set the conditionOperator property: condition operator
     * 
     * should be specified when combining multiple detection conditions.
     * 
     * @param conditionOperator the conditionOperator value to set.
     * @return the DimensionGroupConfiguration object itself.
     */
    public DimensionGroupConfiguration setConditionOperator(AnomalyDetectionConfigurationLogicType conditionOperator) {
        this.conditionOperator = conditionOperator;
        return this;
    }

    /**
     * Get the smartDetectionCondition property: The smartDetectionCondition property.
     * 
     * @return the smartDetectionCondition value.
     */
    public SmartDetectionCondition getSmartDetectionCondition() {
        return this.smartDetectionCondition;
    }

    /**
     * Set the smartDetectionCondition property: The smartDetectionCondition property.
     * 
     * @param smartDetectionCondition the smartDetectionCondition value to set.
     * @return the DimensionGroupConfiguration object itself.
     */
    public DimensionGroupConfiguration setSmartDetectionCondition(SmartDetectionCondition smartDetectionCondition) {
        this.smartDetectionCondition = smartDetectionCondition;
        return this;
    }

    /**
     * Get the hardThresholdCondition property: The hardThresholdCondition property.
     * 
     * @return the hardThresholdCondition value.
     */
    public HardThresholdCondition getHardThresholdCondition() {
        return this.hardThresholdCondition;
    }

    /**
     * Set the hardThresholdCondition property: The hardThresholdCondition property.
     * 
     * @param hardThresholdCondition the hardThresholdCondition value to set.
     * @return the DimensionGroupConfiguration object itself.
     */
    public DimensionGroupConfiguration setHardThresholdCondition(HardThresholdCondition hardThresholdCondition) {
        this.hardThresholdCondition = hardThresholdCondition;
        return this;
    }

    /**
     * Get the changeThresholdCondition property: The changeThresholdCondition property.
     * 
     * @return the changeThresholdCondition value.
     */
    public ChangeThresholdCondition getChangeThresholdCondition() {
        return this.changeThresholdCondition;
    }

    /**
     * Set the changeThresholdCondition property: The changeThresholdCondition property.
     * 
     * @param changeThresholdCondition the changeThresholdCondition value to set.
     * @return the DimensionGroupConfiguration object itself.
     */
    public DimensionGroupConfiguration setChangeThresholdCondition(ChangeThresholdCondition changeThresholdCondition) {
        this.changeThresholdCondition = changeThresholdCondition;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("group", this.group);
        jsonWriter.writeStringField("conditionOperator",
            this.conditionOperator == null ? null : this.conditionOperator.toString());
        jsonWriter.writeJsonField("smartDetectionCondition", this.smartDetectionCondition);
        jsonWriter.writeJsonField("hardThresholdCondition", this.hardThresholdCondition);
        jsonWriter.writeJsonField("changeThresholdCondition", this.changeThresholdCondition);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DimensionGroupConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DimensionGroupConfiguration if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DimensionGroupConfiguration.
     */
    public static DimensionGroupConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DimensionGroupConfiguration deserializedDimensionGroupConfiguration = new DimensionGroupConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("group".equals(fieldName)) {
                    deserializedDimensionGroupConfiguration.group = DimensionGroupIdentity.fromJson(reader);
                } else if ("conditionOperator".equals(fieldName)) {
                    deserializedDimensionGroupConfiguration.conditionOperator
                        = AnomalyDetectionConfigurationLogicType.fromString(reader.getString());
                } else if ("smartDetectionCondition".equals(fieldName)) {
                    deserializedDimensionGroupConfiguration.smartDetectionCondition
                        = SmartDetectionCondition.fromJson(reader);
                } else if ("hardThresholdCondition".equals(fieldName)) {
                    deserializedDimensionGroupConfiguration.hardThresholdCondition
                        = HardThresholdCondition.fromJson(reader);
                } else if ("changeThresholdCondition".equals(fieldName)) {
                    deserializedDimensionGroupConfiguration.changeThresholdCondition
                        = ChangeThresholdCondition.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDimensionGroupConfiguration;
        });
    }
}
