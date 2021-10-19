// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.models.ConnectionState;
import com.azure.resourcemanager.eventgrid.models.PrivateEndpoint;
import com.azure.resourcemanager.eventgrid.models.ResourceProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the private endpoint connection resource. */
@Fluent
public final class PrivateEndpointConnectionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionProperties.class);

    /*
     * The Private Endpoint resource for this Connection.
     */
    @JsonProperty(value = "privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /*
     * GroupIds from the private link service resource.
     */
    @JsonProperty(value = "groupIds")
    private List<String> groupIds;

    /*
     * Details about the state of the connection.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private ConnectionState privateLinkServiceConnectionState;

    /*
     * Provisioning state of the Private Endpoint Connection.
     */
    @JsonProperty(value = "provisioningState")
    private ResourceProvisioningState provisioningState;

    /**
     * Get the privateEndpoint property: The Private Endpoint resource for this Connection.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: The Private Endpoint resource for this Connection.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the groupIds property: GroupIds from the private link service resource.
     *
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Set the groupIds property: GroupIds from the private link service resource.
     *
     * @param groupIds the groupIds value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Details about the state of the connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public ConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Details about the state of the connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateLinkServiceConnectionState(
        ConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Private Endpoint Connection.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the Private Endpoint Connection.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withProvisioningState(ResourceProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
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
