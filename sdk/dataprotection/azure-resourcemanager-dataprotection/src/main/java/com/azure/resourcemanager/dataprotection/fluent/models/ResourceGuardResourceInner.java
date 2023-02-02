// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dataprotection.models.DppIdentityDetails;
import com.azure.resourcemanager.dataprotection.models.DppTrackedResource;
import com.azure.resourcemanager.dataprotection.models.ResourceGuard;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ResourceGuardResource model. */
@Fluent
public final class ResourceGuardResourceInner extends DppTrackedResource {
    /*
     * ResourceGuardResource properties
     */
    @JsonProperty(value = "properties")
    private ResourceGuard properties;

    /** Creates an instance of ResourceGuardResourceInner class. */
    public ResourceGuardResourceInner() {
    }

    /**
     * Get the properties property: ResourceGuardResource properties.
     *
     * @return the properties value.
     */
    public ResourceGuard properties() {
        return this.properties;
    }

    /**
     * Set the properties property: ResourceGuardResource properties.
     *
     * @param properties the properties value to set.
     * @return the ResourceGuardResourceInner object itself.
     */
    public ResourceGuardResourceInner withProperties(ResourceGuard properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceGuardResourceInner withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceGuardResourceInner withIdentity(DppIdentityDetails identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceGuardResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceGuardResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
