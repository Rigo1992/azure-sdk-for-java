// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Paged instance of RouterWorker. */
@Fluent
public final class RouterWorkerItem {
    /*
     * An entity for jobs to be routed to
     */
    @JsonProperty(value = "worker")
    private RouterWorker worker;

    /*
     * (Optional) The Concurrency Token.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the worker property: An entity for jobs to be routed to.
     *
     * @return the worker value.
     */
    public RouterWorker getWorker() {
        return this.worker;
    }

    /**
     * Set the worker property: An entity for jobs to be routed to.
     *
     * @param worker the worker value to set.
     * @return the RouterWorkerItem object itself.
     */
    public RouterWorkerItem setWorker(RouterWorker worker) {
        this.worker = worker;
        return this;
    }

    /**
     * Get the etag property: (Optional) The Concurrency Token.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: (Optional) The Concurrency Token.
     *
     * @param etag the etag value to set.
     * @return the RouterWorkerItem object itself.
     */
    public RouterWorkerItem setEtag(String etag) {
        this.etag = etag;
        return this;
    }
}
