// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type used for update operations of the GlobalRulestackResource.
 */
@Fluent
public final class GlobalRulestackResourceUpdate {
    /*
     * Global Location
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The managed service identities assigned to this resource.
     */
    @JsonProperty(value = "identity")
    private AzureResourceManagerManagedIdentityProperties identity;

    /*
     * The updatable properties of the GlobalRulestackResource.
     */
    @JsonProperty(value = "properties")
    private GlobalRulestackResourceUpdateProperties properties;

    /**
     * Creates an instance of GlobalRulestackResourceUpdate class.
     */
    public GlobalRulestackResourceUpdate() {
    }

    /**
     * Get the location property: Global Location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Global Location.
     * 
     * @param location the location value to set.
     * @return the GlobalRulestackResourceUpdate object itself.
     */
    public GlobalRulestackResourceUpdate withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the identity property: The managed service identities assigned to this resource.
     * 
     * @return the identity value.
     */
    public AzureResourceManagerManagedIdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed service identities assigned to this resource.
     * 
     * @param identity the identity value to set.
     * @return the GlobalRulestackResourceUpdate object itself.
     */
    public GlobalRulestackResourceUpdate withIdentity(AzureResourceManagerManagedIdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the properties property: The updatable properties of the GlobalRulestackResource.
     * 
     * @return the properties value.
     */
    public GlobalRulestackResourceUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The updatable properties of the GlobalRulestackResource.
     * 
     * @param properties the properties value to set.
     * @return the GlobalRulestackResourceUpdate object itself.
     */
    public GlobalRulestackResourceUpdate withProperties(GlobalRulestackResourceUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
