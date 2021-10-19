// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.purview.fluent.models.PrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paged list of private endpoint connections. */
@Fluent
public final class PrivateEndpointConnectionList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionList.class);

    /*
     * Total item count.
     */
    @JsonProperty(value = "count")
    private Long count;

    /*
     * The Url of next result page.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Collection of items of type results.
     */
    @JsonProperty(value = "value", required = true)
    private List<PrivateEndpointConnectionInner> value;

    /**
     * Get the count property: Total item count.
     *
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count property: Total item count.
     *
     * @param count the count value to set.
     * @return the PrivateEndpointConnectionList object itself.
     */
    public PrivateEndpointConnectionList withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get the nextLink property: The Url of next result page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The Url of next result page.
     *
     * @param nextLink the nextLink value to set.
     * @return the PrivateEndpointConnectionList object itself.
     */
    public PrivateEndpointConnectionList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Collection of items of type results.
     *
     * @return the value value.
     */
    public List<PrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of items of type results.
     *
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionList object itself.
     */
    public PrivateEndpointConnectionList withValue(List<PrivateEndpointConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model PrivateEndpointConnectionList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
