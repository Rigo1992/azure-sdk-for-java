// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ASC location of the subscription is in the "name" field. */
@Fluent
public final class AscLocationInner extends ProxyResource {
    /*
     * An empty set of properties
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /** Creates an instance of AscLocationInner class. */
    public AscLocationInner() {
    }

    /**
     * Get the properties property: An empty set of properties.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: An empty set of properties.
     *
     * @param properties the properties value to set.
     * @return the AscLocationInner object itself.
     */
    public AscLocationInner withProperties(Object properties) {
        this.properties = properties;
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
