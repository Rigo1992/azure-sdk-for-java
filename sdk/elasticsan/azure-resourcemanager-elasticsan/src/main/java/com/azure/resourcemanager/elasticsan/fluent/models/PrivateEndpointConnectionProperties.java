// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpoint;
import com.azure.resourcemanager.elasticsan.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.elasticsan.models.ProvisioningStates;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for PrivateEndpoint connection properties.
 */
@Fluent
public final class PrivateEndpointConnectionProperties {
    /*
     * Provisioning State of Private Endpoint connection resource
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStates provisioningState;

    /*
     * Private Endpoint resource
     */
    @JsonProperty(value = "privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /*
     * Private Link Service Connection State.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState", required = true)
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /*
     * List of resources private endpoint is mapped
     */
    @JsonProperty(value = "groupIds")
    private List<String> groupIds;

    /**
     * Creates an instance of PrivateEndpointConnectionProperties class.
     */
    public PrivateEndpointConnectionProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning State of Private Endpoint connection resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningStates provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpoint property: Private Endpoint resource.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: Private Endpoint resource.
     * 
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Private Link Service Connection State.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Private Link Service Connection State.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the groupIds property: List of resources private endpoint is mapped.
     * 
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Set the groupIds property: List of resources private endpoint is mapped.
     * 
     * @param groupIds the groupIds value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
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
        if (privateLinkServiceConnectionState() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property privateLinkServiceConnectionState in model PrivateEndpointConnectionProperties"));
        } else {
            privateLinkServiceConnectionState().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionProperties.class);
}
