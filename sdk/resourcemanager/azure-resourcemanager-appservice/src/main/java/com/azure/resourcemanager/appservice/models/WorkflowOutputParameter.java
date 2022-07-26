// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The workflow output parameter. */
@Fluent
public final class WorkflowOutputParameter extends WorkflowParameter {
    /*
     * Gets the error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private Object error;

    /**
     * Get the error property: Gets the error.
     *
     * @return the error value.
     */
    public Object error() {
        return this.error;
    }

    /** {@inheritDoc} */
    @Override
    public WorkflowOutputParameter withType(ParameterType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkflowOutputParameter withValue(Object value) {
        super.withValue(value);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkflowOutputParameter withMetadata(Object metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkflowOutputParameter withDescription(String description) {
        super.withDescription(description);
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
    }
}
