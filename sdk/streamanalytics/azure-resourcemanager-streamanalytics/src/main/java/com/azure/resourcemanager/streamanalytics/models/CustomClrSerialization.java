// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.fluent.models.CustomClrSerializationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes how data from an input is serialized or how data is serialized when written to an output in custom format.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CustomClr")
@Fluent
public final class CustomClrSerialization extends Serialization {
    /*
     * The properties that are associated with the CustomClr serialization type. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties")
    private CustomClrSerializationProperties innerProperties;

    /**
     * Creates an instance of CustomClrSerialization class.
     */
    public CustomClrSerialization() {
    }

    /**
     * Get the innerProperties property: The properties that are associated with the CustomClr serialization type.
     * Required on PUT (CreateOrReplace) requests.
     * 
     * @return the innerProperties value.
     */
    private CustomClrSerializationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the serializationDllPath property: The serialization library path.
     * 
     * @return the serializationDllPath value.
     */
    public String serializationDllPath() {
        return this.innerProperties() == null ? null : this.innerProperties().serializationDllPath();
    }

    /**
     * Set the serializationDllPath property: The serialization library path.
     * 
     * @param serializationDllPath the serializationDllPath value to set.
     * @return the CustomClrSerialization object itself.
     */
    public CustomClrSerialization withSerializationDllPath(String serializationDllPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomClrSerializationProperties();
        }
        this.innerProperties().withSerializationDllPath(serializationDllPath);
        return this;
    }

    /**
     * Get the serializationClassName property: The serialization class name.
     * 
     * @return the serializationClassName value.
     */
    public String serializationClassName() {
        return this.innerProperties() == null ? null : this.innerProperties().serializationClassName();
    }

    /**
     * Set the serializationClassName property: The serialization class name.
     * 
     * @param serializationClassName the serializationClassName value to set.
     * @return the CustomClrSerialization object itself.
     */
    public CustomClrSerialization withSerializationClassName(String serializationClassName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomClrSerializationProperties();
        }
        this.innerProperties().withSerializationClassName(serializationClassName);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
