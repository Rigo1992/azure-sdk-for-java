// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about shared availability zone. */
@Immutable
public final class Peers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Peers.class);

    /*
     * The subscription ID.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * The availabilityZone.
     */
    @JsonProperty(value = "availabilityZone", access = JsonProperty.Access.WRITE_ONLY)
    private String availabilityZone;

    /**
     * Get the subscriptionId property: The subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the availabilityZone property: The availabilityZone.
     *
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
