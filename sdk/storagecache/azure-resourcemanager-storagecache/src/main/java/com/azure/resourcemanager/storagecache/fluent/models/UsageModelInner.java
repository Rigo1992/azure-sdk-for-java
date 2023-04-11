// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storagecache.models.UsageModelDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A usage model. */
@Fluent
public final class UsageModelInner {
    /*
     * Localized information describing this usage model.
     */
    @JsonProperty(value = "display")
    private UsageModelDisplay display;

    /*
     * Non-localized keyword name for this usage model.
     */
    @JsonProperty(value = "modelName")
    private String modelName;

    /*
     * The type of Storage Target to which this model is applicable (only nfs3 as of this version).
     */
    @JsonProperty(value = "targetType")
    private String targetType;

    /** Creates an instance of UsageModelInner class. */
    public UsageModelInner() {
    }

    /**
     * Get the display property: Localized information describing this usage model.
     *
     * @return the display value.
     */
    public UsageModelDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Localized information describing this usage model.
     *
     * @param display the display value to set.
     * @return the UsageModelInner object itself.
     */
    public UsageModelInner withDisplay(UsageModelDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the modelName property: Non-localized keyword name for this usage model.
     *
     * @return the modelName value.
     */
    public String modelName() {
        return this.modelName;
    }

    /**
     * Set the modelName property: Non-localized keyword name for this usage model.
     *
     * @param modelName the modelName value to set.
     * @return the UsageModelInner object itself.
     */
    public UsageModelInner withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * Get the targetType property: The type of Storage Target to which this model is applicable (only nfs3 as of this
     * version).
     *
     * @return the targetType value.
     */
    public String targetType() {
        return this.targetType;
    }

    /**
     * Set the targetType property: The type of Storage Target to which this model is applicable (only nfs3 as of this
     * version).
     *
     * @param targetType the targetType value to set.
     * @return the UsageModelInner object itself.
     */
    public UsageModelInner withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
