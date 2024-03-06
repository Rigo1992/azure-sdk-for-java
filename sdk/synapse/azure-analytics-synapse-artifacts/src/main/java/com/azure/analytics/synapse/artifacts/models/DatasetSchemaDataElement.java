// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * Columns that define the physical type schema of the dataset.
 */
@Fluent
public final class DatasetSchemaDataElement {
    /*
     * Name of the schema column. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "name")
    private Object name;

    /*
     * Type of the schema column. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "type")
    private Object type;

    /*
     * Columns that define the physical type schema of the dataset.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of DatasetSchemaDataElement class.
     */
    public DatasetSchemaDataElement() {
    }

    /**
     * Get the name property: Name of the schema column. Type: string (or Expression with resultType string).
     * 
     * @return the name value.
     */
    public Object getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the schema column. Type: string (or Expression with resultType string).
     * 
     * @param name the name value to set.
     * @return the DatasetSchemaDataElement object itself.
     */
    public DatasetSchemaDataElement setName(Object name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of the schema column. Type: string (or Expression with resultType string).
     * 
     * @return the type value.
     */
    public Object getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of the schema column. Type: string (or Expression with resultType string).
     * 
     * @param type the type value to set.
     * @return the DatasetSchemaDataElement object itself.
     */
    public DatasetSchemaDataElement setType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Get the additionalProperties property: Columns that define the physical type schema of the dataset.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Columns that define the physical type schema of the dataset.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the DatasetSchemaDataElement object itself.
     */
    public DatasetSchemaDataElement setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
