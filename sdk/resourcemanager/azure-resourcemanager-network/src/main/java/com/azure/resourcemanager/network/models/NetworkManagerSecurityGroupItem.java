// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network manager security group item.
 */
@Fluent
public final class NetworkManagerSecurityGroupItem {
    /*
     * Network manager group Id.
     */
    @JsonProperty(value = "networkGroupId", required = true)
    private String networkGroupId;

    /**
     * Creates an instance of NetworkManagerSecurityGroupItem class.
     */
    public NetworkManagerSecurityGroupItem() {
    }

    /**
     * Get the networkGroupId property: Network manager group Id.
     * 
     * @return the networkGroupId value.
     */
    public String networkGroupId() {
        return this.networkGroupId;
    }

    /**
     * Set the networkGroupId property: Network manager group Id.
     * 
     * @param networkGroupId the networkGroupId value to set.
     * @return the NetworkManagerSecurityGroupItem object itself.
     */
    public NetworkManagerSecurityGroupItem withNetworkGroupId(String networkGroupId) {
        this.networkGroupId = networkGroupId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkGroupId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property networkGroupId in model NetworkManagerSecurityGroupItem"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkManagerSecurityGroupItem.class);
}
