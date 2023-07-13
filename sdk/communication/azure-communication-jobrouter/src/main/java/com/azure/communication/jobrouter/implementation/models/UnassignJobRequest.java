// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request payload for unassigning a job. */
@Fluent
public final class UnassignJobRequest {
    /*
     * If WaitForActivation is true, then the job is not queued for re-matching
     * with a worker.
     */
    @JsonProperty(value = "suspendMatching")
    private Boolean suspendMatching;

    /**
     * Get the suspendMatching property: If WaitForActivation is true, then the job is not queued for re-matching with a
     * worker.
     *
     * @return the suspendMatching value.
     */
    public Boolean isSuspendMatching() {
        return this.suspendMatching;
    }

    /**
     * Set the suspendMatching property: If WaitForActivation is true, then the job is not queued for re-matching with a
     * worker.
     *
     * @param suspendMatching the suspendMatching value to set.
     * @return the UnassignJobRequest object itself.
     */
    public UnassignJobRequest setSuspendMatching(Boolean suspendMatching) {
        this.suspendMatching = suspendMatching;
        return this;
    }
}
