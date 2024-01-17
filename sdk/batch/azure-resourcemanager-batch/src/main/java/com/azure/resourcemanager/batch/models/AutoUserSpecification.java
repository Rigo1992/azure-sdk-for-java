// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the parameters for the auto user that runs a task on the Batch service.
 */
@Fluent
public final class AutoUserSpecification {
    /*
     * The scope for the auto user
     * 
     * The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter
     * isolation between tasks is required. For example, if the task mutates the registry in a way which could impact
     * other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks
     * but should be accessible by start tasks.
     */
    @JsonProperty(value = "scope")
    private AutoUserScope scope;

    /*
     * The elevation level of the user.
     * 
     * The default value is nonAdmin.
     */
    @JsonProperty(value = "elevationLevel")
    private ElevationLevel elevationLevel;

    /**
     * Creates an instance of AutoUserSpecification class.
     */
    public AutoUserSpecification() {
    }

    /**
     * Get the scope property: The scope for the auto user
     * 
     * The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter
     * isolation between tasks is required. For example, if the task mutates the registry in a way which could impact
     * other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks
     * but should be accessible by start tasks.
     * 
     * @return the scope value.
     */
    public AutoUserScope scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope for the auto user
     * 
     * The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter
     * isolation between tasks is required. For example, if the task mutates the registry in a way which could impact
     * other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks
     * but should be accessible by start tasks.
     * 
     * @param scope the scope value to set.
     * @return the AutoUserSpecification object itself.
     */
    public AutoUserSpecification withScope(AutoUserScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the elevationLevel property: The elevation level of the user.
     * 
     * The default value is nonAdmin.
     * 
     * @return the elevationLevel value.
     */
    public ElevationLevel elevationLevel() {
        return this.elevationLevel;
    }

    /**
     * Set the elevationLevel property: The elevation level of the user.
     * 
     * The default value is nonAdmin.
     * 
     * @param elevationLevel the elevationLevel value to set.
     * @return the AutoUserSpecification object itself.
     */
    public AutoUserSpecification withElevationLevel(ElevationLevel elevationLevel) {
        this.elevationLevel = elevationLevel;
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
