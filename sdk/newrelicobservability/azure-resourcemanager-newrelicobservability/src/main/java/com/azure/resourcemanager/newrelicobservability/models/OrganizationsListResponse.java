// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.newrelicobservability.fluent.models.OrganizationResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response of get all organizations Operation. */
@Fluent
public final class OrganizationsListResponse {
    /*
     * The OrganizationResource items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<OrganizationResourceInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of OrganizationsListResponse class. */
    public OrganizationsListResponse() {
    }

    /**
     * Get the value property: The OrganizationResource items on this page.
     *
     * @return the value value.
     */
    public List<OrganizationResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The OrganizationResource items on this page.
     *
     * @param value the value value to set.
     * @return the OrganizationsListResponse object itself.
     */
    public OrganizationsListResponse withValue(List<OrganizationResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     *
     * @param nextLink the nextLink value to set.
     * @return the OrganizationsListResponse object itself.
     */
    public OrganizationsListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model OrganizationsListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OrganizationsListResponse.class);
}
