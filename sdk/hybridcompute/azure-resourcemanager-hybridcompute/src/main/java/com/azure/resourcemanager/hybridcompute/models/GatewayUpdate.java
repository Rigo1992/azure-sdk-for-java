// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcompute.fluent.models.GatewayUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Describes a License Update.
 */
@Fluent
public final class GatewayUpdate extends ResourceUpdate {
    /*
     * Gateway Update properties
     */
    @JsonProperty(value = "properties")
    private GatewayUpdateProperties innerProperties;

    /**
     * Creates an instance of GatewayUpdate class.
     */
    public GatewayUpdate() {
    }

    /**
     * Get the innerProperties property: Gateway Update properties.
     * 
     * @return the innerProperties value.
     */
    private GatewayUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GatewayUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the allowedFeatures property: Specifies the list of features that are enabled for this Gateway.
     * 
     * @return the allowedFeatures value.
     */
    public List<String> allowedFeatures() {
        return this.innerProperties() == null ? null : this.innerProperties().allowedFeatures();
    }

    /**
     * Set the allowedFeatures property: Specifies the list of features that are enabled for this Gateway.
     * 
     * @param allowedFeatures the allowedFeatures value to set.
     * @return the GatewayUpdate object itself.
     */
    public GatewayUpdate withAllowedFeatures(List<String> allowedFeatures) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GatewayUpdateProperties();
        }
        this.innerProperties().withAllowedFeatures(allowedFeatures);
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
