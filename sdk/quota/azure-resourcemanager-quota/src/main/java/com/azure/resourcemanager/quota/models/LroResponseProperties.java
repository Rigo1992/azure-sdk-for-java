// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LroResponseProperties model.
 */
@Immutable
public final class LroResponseProperties {
    /*
     * Request status.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private RequestState provisioningState;

    /**
     * Creates an instance of LroResponseProperties class.
     */
    public LroResponseProperties() {
    }

    /**
     * Get the provisioningState property: Request status.
     * 
     * @return the provisioningState value.
     */
    public RequestState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
