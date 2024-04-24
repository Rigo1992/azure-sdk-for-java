// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The definition of a single skip request.
 */
@Fluent
public final class SkipTarget {
    /*
     * The skip target type.
     */
    @JsonProperty(value = "type", required = true)
    private TargetType type;

    /*
     * The skip target's name.
     * To skip a member/group/stage, use the member/group/stage's name;
     * Tp skip an after stage wait, use the parent stage's name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of SkipTarget class.
     */
    public SkipTarget() {
    }

    /**
     * Get the type property: The skip target type.
     * 
     * @return the type value.
     */
    public TargetType type() {
        return this.type;
    }

    /**
     * Set the type property: The skip target type.
     * 
     * @param type the type value to set.
     * @return the SkipTarget object itself.
     */
    public SkipTarget withType(TargetType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The skip target's name.
     * To skip a member/group/stage, use the member/group/stage's name;
     * Tp skip an after stage wait, use the parent stage's name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The skip target's name.
     * To skip a member/group/stage, use the member/group/stage's name;
     * Tp skip an after stage wait, use the parent stage's name.
     * 
     * @param name the name value to set.
     * @return the SkipTarget object itself.
     */
    public SkipTarget withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property type in model SkipTarget"));
        }
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model SkipTarget"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SkipTarget.class);
}
