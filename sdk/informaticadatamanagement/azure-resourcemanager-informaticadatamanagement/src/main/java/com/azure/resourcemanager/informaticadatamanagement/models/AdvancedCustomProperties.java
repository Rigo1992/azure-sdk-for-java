// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Informatica Serverless advanced custom properties.
 */
@Fluent
public final class AdvancedCustomProperties {
    /*
     * advanced custom properties key
     */
    @JsonProperty(value = "key")
    private String key;

    /*
     * advanced custom properties value
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of AdvancedCustomProperties class.
     */
    public AdvancedCustomProperties() {
    }

    /**
     * Get the key property: advanced custom properties key.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: advanced custom properties key.
     * 
     * @param key the key value to set.
     * @return the AdvancedCustomProperties object itself.
     */
    public AdvancedCustomProperties withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: advanced custom properties value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: advanced custom properties value.
     * 
     * @param value the value value to set.
     * @return the AdvancedCustomProperties object itself.
     */
    public AdvancedCustomProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
