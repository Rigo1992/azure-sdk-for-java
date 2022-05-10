// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The runtime resource configuration of this build service. */
@Immutable
public final class BuildServicePropertiesResourceRequests {
    /*
     * vCPU allocated to the entire build service node pool.
     */
    @JsonProperty(value = "cpu", access = JsonProperty.Access.WRITE_ONLY)
    private String cpu;

    /*
     * Memory allocated to the entire build service node pool.
     */
    @JsonProperty(value = "memory", access = JsonProperty.Access.WRITE_ONLY)
    private String memory;

    /**
     * Get the cpu property: vCPU allocated to the entire build service node pool.
     *
     * @return the cpu value.
     */
    public String cpu() {
        return this.cpu;
    }

    /**
     * Get the memory property: Memory allocated to the entire build service node pool.
     *
     * @return the memory value.
     */
    public String memory() {
        return this.memory;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
