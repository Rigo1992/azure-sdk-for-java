// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * MAB workload-specific error information.
 */
@Immutable
public final class MabErrorInfo {
    /*
     * Localized error string.
     */
    @JsonProperty(value = "errorString", access = JsonProperty.Access.WRITE_ONLY)
    private String errorString;

    /*
     * List of localized recommendations.
     */
    @JsonProperty(value = "recommendations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> recommendations;

    /**
     * Creates an instance of MabErrorInfo class.
     */
    public MabErrorInfo() {
    }

    /**
     * Get the errorString property: Localized error string.
     * 
     * @return the errorString value.
     */
    public String errorString() {
        return this.errorString;
    }

    /**
     * Get the recommendations property: List of localized recommendations.
     * 
     * @return the recommendations value.
     */
    public List<String> recommendations() {
        return this.recommendations;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
