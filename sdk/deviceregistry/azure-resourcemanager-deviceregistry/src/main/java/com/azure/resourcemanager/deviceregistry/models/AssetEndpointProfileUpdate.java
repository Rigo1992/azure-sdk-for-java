// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The type used for update operations of the AssetEndpointProfile.
 */
@Fluent
public final class AssetEndpointProfileUpdate {
    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private AssetEndpointProfileUpdateProperties properties;

    /**
     * Creates an instance of AssetEndpointProfileUpdate class.
     */
    public AssetEndpointProfileUpdate() {
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the AssetEndpointProfileUpdate object itself.
     */
    public AssetEndpointProfileUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     * 
     * @return the properties value.
     */
    public AssetEndpointProfileUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     * 
     * @param properties the properties value to set.
     * @return the AssetEndpointProfileUpdate object itself.
     */
    public AssetEndpointProfileUpdate withProperties(AssetEndpointProfileUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
