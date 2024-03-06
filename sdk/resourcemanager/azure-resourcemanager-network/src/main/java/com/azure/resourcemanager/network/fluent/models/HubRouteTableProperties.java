// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.HubRoute;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Parameters for RouteTable.
 */
@Fluent
public final class HubRouteTableProperties {
    /*
     * List of all routes.
     */
    @JsonProperty(value = "routes")
    private List<HubRoute> routes;

    /*
     * List of labels associated with this route table.
     */
    @JsonProperty(value = "labels")
    private List<String> labels;

    /*
     * List of all connections associated with this route table.
     */
    @JsonProperty(value = "associatedConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> associatedConnections;

    /*
     * List of all connections that advertise to this route table.
     */
    @JsonProperty(value = "propagatingConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> propagatingConnections;

    /*
     * The provisioning state of the RouteTable resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of HubRouteTableProperties class.
     */
    public HubRouteTableProperties() {
    }

    /**
     * Get the routes property: List of all routes.
     * 
     * @return the routes value.
     */
    public List<HubRoute> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: List of all routes.
     * 
     * @param routes the routes value to set.
     * @return the HubRouteTableProperties object itself.
     */
    public HubRouteTableProperties withRoutes(List<HubRoute> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the labels property: List of labels associated with this route table.
     * 
     * @return the labels value.
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the labels property: List of labels associated with this route table.
     * 
     * @param labels the labels value to set.
     * @return the HubRouteTableProperties object itself.
     */
    public HubRouteTableProperties withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the associatedConnections property: List of all connections associated with this route table.
     * 
     * @return the associatedConnections value.
     */
    public List<String> associatedConnections() {
        return this.associatedConnections;
    }

    /**
     * Get the propagatingConnections property: List of all connections that advertise to this route table.
     * 
     * @return the propagatingConnections value.
     */
    public List<String> propagatingConnections() {
        return this.propagatingConnections;
    }

    /**
     * Get the provisioningState property: The provisioning state of the RouteTable resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
    }
}
