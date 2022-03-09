// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dnsresolver.fluent.models.VirtualNetworkLinkInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response to an enumeration operation on virtual network links. */
@Fluent
public final class VirtualNetworkLinkListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkLinkListResult.class);

    /*
     * Enumeration of the virtual network links.
     */
    @JsonProperty(value = "value")
    private List<VirtualNetworkLinkInner> value;

    /*
     * The continuation token for the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Enumeration of the virtual network links.
     *
     * @return the value value.
     */
    public List<VirtualNetworkLinkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Enumeration of the virtual network links.
     *
     * @param value the value value to set.
     * @return the VirtualNetworkLinkListResult object itself.
     */
    public VirtualNetworkLinkListResult withValue(List<VirtualNetworkLinkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The continuation token for the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
