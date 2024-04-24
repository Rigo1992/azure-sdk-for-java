// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/**
 * Azure Data Factory nested object which serves as a compute resource for activities.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = IntegrationRuntime.class, visible = true)
@JsonTypeName("IntegrationRuntime")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Managed", value = ManagedIntegrationRuntime.class),
    @JsonSubTypes.Type(name = "SelfHosted", value = SelfHostedIntegrationRuntime.class) })
@Fluent
public class IntegrationRuntime {
    /*
     * Type of integration runtime.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private IntegrationRuntimeType type;

    /*
     * Integration runtime description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Azure Data Factory nested object which serves as a compute resource for activities.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of IntegrationRuntime class.
     */
    public IntegrationRuntime() {
        this.type = IntegrationRuntimeType.fromString("IntegrationRuntime");
    }

    /**
     * Get the type property: Type of integration runtime.
     * 
     * @return the type value.
     */
    public IntegrationRuntimeType type() {
        return this.type;
    }

    /**
     * Get the description property: Integration runtime description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Integration runtime description.
     * 
     * @param description the description value to set.
     * @return the IntegrationRuntime object itself.
     */
    public IntegrationRuntime withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the additionalProperties property: Azure Data Factory nested object which serves as a compute resource for
     * activities.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Azure Data Factory nested object which serves as a compute resource for
     * activities.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntime object itself.
     */
    public IntegrationRuntime withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
