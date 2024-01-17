// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerRegistrationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the List Partner Registrations operation.
 */
@Fluent
public final class PartnerRegistrationsListResult {
    /*
     * A collection of partner registrations.
     */
    @JsonProperty(value = "value")
    private List<PartnerRegistrationInner> value;

    /*
     * A link for the next page of partner registrations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of PartnerRegistrationsListResult class.
     */
    public PartnerRegistrationsListResult() {
    }

    /**
     * Get the value property: A collection of partner registrations.
     * 
     * @return the value value.
     */
    public List<PartnerRegistrationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of partner registrations.
     * 
     * @param value the value value to set.
     * @return the PartnerRegistrationsListResult object itself.
     */
    public PartnerRegistrationsListResult withValue(List<PartnerRegistrationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of partner registrations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of partner registrations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PartnerRegistrationsListResult object itself.
     */
    public PartnerRegistrationsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
