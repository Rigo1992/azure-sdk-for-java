// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mariadb.models.Operation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of resource provider operations. */
@Fluent
public final class OperationListResultInner {
    /*
     * The list of resource provider operations.
     */
    @JsonProperty(value = "value")
    private List<Operation> value;

    /** Creates an instance of OperationListResultInner class. */
    public OperationListResultInner() {
    }

    /**
     * Get the value property: The list of resource provider operations.
     *
     * @return the value value.
     */
    public List<Operation> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of resource provider operations.
     *
     * @param value the value value to set.
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withValue(List<Operation> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
