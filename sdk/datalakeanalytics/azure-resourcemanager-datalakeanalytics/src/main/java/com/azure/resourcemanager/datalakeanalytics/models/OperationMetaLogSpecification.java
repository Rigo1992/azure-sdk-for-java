// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OperationMetaLogSpecification model. */
@Fluent
public final class OperationMetaLogSpecification {
    /*
     * The name for OperationMetaLogSpecification.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The displayName for OperationMetaLogSpecification.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The blobDuration for OperationMetaLogSpecification.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /** Creates an instance of OperationMetaLogSpecification class. */
    public OperationMetaLogSpecification() {
    }

    /**
     * Get the name property: The name for OperationMetaLogSpecification.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name for OperationMetaLogSpecification.
     *
     * @param name the name value to set.
     * @return the OperationMetaLogSpecification object itself.
     */
    public OperationMetaLogSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The displayName for OperationMetaLogSpecification.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName for OperationMetaLogSpecification.
     *
     * @param displayName the displayName value to set.
     * @return the OperationMetaLogSpecification object itself.
     */
    public OperationMetaLogSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the blobDuration property: The blobDuration for OperationMetaLogSpecification.
     *
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration property: The blobDuration for OperationMetaLogSpecification.
     *
     * @param blobDuration the blobDuration value to set.
     * @return the OperationMetaLogSpecification object itself.
     */
    public OperationMetaLogSpecification withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
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
