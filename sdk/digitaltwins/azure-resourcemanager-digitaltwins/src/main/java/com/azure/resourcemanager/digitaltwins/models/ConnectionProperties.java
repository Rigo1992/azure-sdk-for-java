// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of a private endpoint connection. */
@Fluent
public final class ConnectionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionProperties.class);

    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ConnectionPropertiesProvisioningState provisioningState;

    /*
     * The private endpoint.
     */
    @JsonProperty(value = "privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /*
     * The list of group ids for the private endpoint connection.
     */
    @JsonProperty(value = "groupIds")
    private List<String> groupIds;

    /*
     * The connection state.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private ConnectionPropertiesPrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public ConnectionPropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpoint property: The private endpoint.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: The private endpoint.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the ConnectionProperties object itself.
     */
    public ConnectionProperties withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the groupIds property: The list of group ids for the private endpoint connection.
     *
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Set the groupIds property: The list of group ids for the private endpoint connection.
     *
     * @param groupIds the groupIds value to set.
     * @return the ConnectionProperties object itself.
     */
    public ConnectionProperties withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: The connection state.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public ConnectionPropertiesPrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: The connection state.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the ConnectionProperties object itself.
     */
    public ConnectionProperties withPrivateLinkServiceConnectionState(
        ConnectionPropertiesPrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }
}
