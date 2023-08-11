// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource Id extended model. */
@Fluent
public final class ResourceReferenceExtended extends ResourceReference {
    /*
     * Error response
     *
     * Common error response for all Azure Resource Manager APIs to return error details for failed operations. (This
     * also follows the OData error response format.).
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /** Creates an instance of ResourceReferenceExtended class. */
    public ResourceReferenceExtended() {
    }

    /**
     * Get the error property: Error response
     *
     * <p>Common error response for all Azure Resource Manager APIs to return error details for failed operations. (This
     * also follows the OData error response format.).
     *
     * @return the error value.
     */
    public ErrorResponse error() {
        return this.error;
    }

    /**
     * Set the error property: Error response
     *
     * <p>Common error response for all Azure Resource Manager APIs to return error details for failed operations. (This
     * also follows the OData error response format.).
     *
     * @param error the error value to set.
     * @return the ResourceReferenceExtended object itself.
     */
    public ResourceReferenceExtended withError(ErrorResponse error) {
        this.error = error;
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
        if (error() != null) {
            error().validate();
        }
    }
}
