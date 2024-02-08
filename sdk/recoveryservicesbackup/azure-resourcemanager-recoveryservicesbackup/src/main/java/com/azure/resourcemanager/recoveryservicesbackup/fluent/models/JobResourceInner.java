// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.recoveryservicesbackup.models.Job;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Defines workload agnostic properties for a job.
 */
@Fluent
public final class JobResourceInner extends Resource {
    /*
     * JobResource properties
     */
    @JsonProperty(value = "properties")
    private Job properties;

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Creates an instance of JobResourceInner class.
     */
    public JobResourceInner() {
    }

    /**
     * Get the properties property: JobResource properties.
     * 
     * @return the properties value.
     */
    public Job properties() {
        return this.properties;
    }

    /**
     * Set the properties property: JobResource properties.
     * 
     * @param properties the properties value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withProperties(Job properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag property: Optional ETag.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Optional ETag.
     * 
     * @param etag the etag value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
