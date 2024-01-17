// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.HubIpConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * VirtualHubIpConfigurations list.
 */
@Fluent
public final class ListVirtualHubIpConfigurationResults {
    /*
     * The list of VirtualHubIpConfigurations.
     */
    @JsonProperty(value = "value")
    private List<HubIpConfigurationInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ListVirtualHubIpConfigurationResults class.
     */
    public ListVirtualHubIpConfigurationResults() {
    }

    /**
     * Get the value property: The list of VirtualHubIpConfigurations.
     * 
     * @return the value value.
     */
    public List<HubIpConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of VirtualHubIpConfigurations.
     * 
     * @param value the value value to set.
     * @return the ListVirtualHubIpConfigurationResults object itself.
     */
    public ListVirtualHubIpConfigurationResults withValue(List<HubIpConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListVirtualHubIpConfigurationResults object itself.
     */
    public ListVirtualHubIpConfigurationResults withNextLink(String nextLink) {
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
