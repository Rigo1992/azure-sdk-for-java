// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Paged instance of JobQueue. */
@Fluent
public final class JobQueueItemInternal {
    /*
     * A queue that can contain jobs to be routed.
     */
    @JsonProperty(value = "jobQueue")
    private JobQueueInternal jobQueue;

    /*
     * (Optional) The Concurrency Token.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /** Creates an instance of JobQueueItemInternal class. */
    public JobQueueItemInternal() {}

    /**
     * Get the jobQueue property: A queue that can contain jobs to be routed.
     *
     * @return the jobQueue value.
     */
    public JobQueueInternal getJobQueue() {
        return this.jobQueue;
    }

    /**
     * Set the jobQueue property: A queue that can contain jobs to be routed.
     *
     * @param jobQueue the jobQueue value to set.
     * @return the JobQueueItemInternal object itself.
     */
    public JobQueueItemInternal setJobQueue(JobQueueInternal jobQueue) {
        this.jobQueue = jobQueue;
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
     * @return the JobQueueItemInternal object itself.
     */
    public JobQueueItemInternal setEtag(String etag) {
        this.etag = etag;
        return this;
    }
}
