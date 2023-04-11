// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.models.ArmProxyResource;
import com.azure.resourcemanager.cosmos.models.LocationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB location get result. */
@Fluent
public final class LocationGetResultInner extends ArmProxyResource {
    /*
     * Cosmos DB location metadata
     */
    @JsonProperty(value = "properties")
    private LocationProperties properties;

    /** Creates an instance of LocationGetResultInner class. */
    public LocationGetResultInner() {
    }

    /**
     * Get the properties property: Cosmos DB location metadata.
     *
     * @return the properties value.
     */
    public LocationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Cosmos DB location metadata.
     *
     * @param properties the properties value to set.
     * @return the LocationGetResultInner object itself.
     */
    public LocationGetResultInner withProperties(LocationProperties properties) {
        this.properties = properties;
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
