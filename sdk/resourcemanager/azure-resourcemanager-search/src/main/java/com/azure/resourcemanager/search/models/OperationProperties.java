// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes additional properties for this operation.
 */
@Immutable
public final class OperationProperties {
    /*
     * Specifications of the service for this operation.
     */
    @JsonProperty(value = "serviceSpecification", access = JsonProperty.Access.WRITE_ONLY)
    private OperationServiceSpecification serviceSpecification;

    /**
     * Creates an instance of OperationProperties class.
     */
    public OperationProperties() {
    }

    /**
     * Get the serviceSpecification property: Specifications of the service for this operation.
     * 
     * @return the serviceSpecification value.
     */
    public OperationServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
    }
}
