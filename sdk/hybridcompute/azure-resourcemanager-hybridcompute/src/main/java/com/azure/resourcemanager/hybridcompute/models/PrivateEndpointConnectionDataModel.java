// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Model for a Private Endpoint Connection associated with a Private Link Scope.
 */
@Fluent
public final class PrivateEndpointConnectionDataModel {
    /*
     * The ARM Resource Id of the Private Endpoint.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The Name of the Private Endpoint.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Azure resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The Private Endpoint Connection properties.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionProperties properties;

    /**
     * Creates an instance of PrivateEndpointConnectionDataModel class.
     */
    public PrivateEndpointConnectionDataModel() {
    }

    /**
     * Get the id property: The ARM Resource Id of the Private Endpoint.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The Name of the Private Endpoint.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Azure resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the properties property: The Private Endpoint Connection properties.
     * 
     * @return the properties value.
     */
    public PrivateEndpointConnectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The Private Endpoint Connection properties.
     * 
     * @param properties the properties value to set.
     * @return the PrivateEndpointConnectionDataModel object itself.
     */
    public PrivateEndpointConnectionDataModel withProperties(PrivateEndpointConnectionProperties properties) {
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
