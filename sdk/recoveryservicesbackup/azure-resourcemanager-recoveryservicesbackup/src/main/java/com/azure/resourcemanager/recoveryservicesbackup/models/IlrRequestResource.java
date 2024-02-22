// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Parameters to Provision ILR API.
 */
@Fluent
public final class IlrRequestResource extends Resource {
    /*
     * ILRRequestResource properties
     */
    @JsonProperty(value = "properties")
    private IlrRequest properties;

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Creates an instance of IlrRequestResource class.
     */
    public IlrRequestResource() {
    }

    /**
     * Get the properties property: ILRRequestResource properties.
     * 
     * @return the properties value.
     */
    public IlrRequest properties() {
        return this.properties;
    }

    /**
     * Set the properties property: ILRRequestResource properties.
     * 
     * @param properties the properties value to set.
     * @return the IlrRequestResource object itself.
     */
    public IlrRequestResource withProperties(IlrRequest properties) {
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
     * @return the IlrRequestResource object itself.
     */
    public IlrRequestResource withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IlrRequestResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IlrRequestResource withTags(Map<String, String> tags) {
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
