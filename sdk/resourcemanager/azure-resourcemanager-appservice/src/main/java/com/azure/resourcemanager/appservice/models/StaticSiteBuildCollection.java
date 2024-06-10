// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.fluent.models.StaticSiteBuildArmResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Collection of static site builds.
 */
@Fluent
public final class StaticSiteBuildCollection {
    /*
     * Collection of resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<StaticSiteBuildArmResourceInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of StaticSiteBuildCollection class.
     */
    public StaticSiteBuildCollection() {
    }

    /**
     * Get the value property: Collection of resources.
     *
     * @return the value value.
     */
    public List<StaticSiteBuildArmResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     *
     * @param value the value value to set.
     * @return the StaticSiteBuildCollection object itself.
     */
    public StaticSiteBuildCollection withValue(List<StaticSiteBuildArmResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property value in model StaticSiteBuildCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StaticSiteBuildCollection.class);
}
