// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * RouteTable route.
 */
@Fluent
public final class HubRoute {
    /*
     * The name of the Route that is unique within a RouteTable. This name can be used to access this route.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of destinations (eg: CIDR, ResourceId, Service).
     */
    @JsonProperty(value = "destinationType", required = true)
    private String destinationType;

    /*
     * List of all destinations.
     */
    @JsonProperty(value = "destinations", required = true)
    private List<String> destinations;

    /*
     * The type of next hop (eg: ResourceId).
     */
    @JsonProperty(value = "nextHopType", required = true)
    private String nextHopType;

    /*
     * NextHop resource ID.
     */
    @JsonProperty(value = "nextHop", required = true)
    private String nextHop;

    /**
     * Creates an instance of HubRoute class.
     */
    public HubRoute() {
    }

    /**
     * Get the name property: The name of the Route that is unique within a RouteTable. This name can be used to access
     * this route.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Route that is unique within a RouteTable. This name can be used to access
     * this route.
     * 
     * @param name the name value to set.
     * @return the HubRoute object itself.
     */
    public HubRoute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the destinationType property: The type of destinations (eg: CIDR, ResourceId, Service).
     * 
     * @return the destinationType value.
     */
    public String destinationType() {
        return this.destinationType;
    }

    /**
     * Set the destinationType property: The type of destinations (eg: CIDR, ResourceId, Service).
     * 
     * @param destinationType the destinationType value to set.
     * @return the HubRoute object itself.
     */
    public HubRoute withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * Get the destinations property: List of all destinations.
     * 
     * @return the destinations value.
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: List of all destinations.
     * 
     * @param destinations the destinations value to set.
     * @return the HubRoute object itself.
     */
    public HubRoute withDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Get the nextHopType property: The type of next hop (eg: ResourceId).
     * 
     * @return the nextHopType value.
     */
    public String nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the nextHopType property: The type of next hop (eg: ResourceId).
     * 
     * @param nextHopType the nextHopType value to set.
     * @return the HubRoute object itself.
     */
    public HubRoute withNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

    /**
     * Get the nextHop property: NextHop resource ID.
     * 
     * @return the nextHop value.
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Set the nextHop property: NextHop resource ID.
     * 
     * @param nextHop the nextHop value to set.
     * @return the HubRoute object itself.
     */
    public HubRoute withNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model HubRoute"));
        }
        if (destinationType() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property destinationType in model HubRoute"));
        }
        if (destinations() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property destinations in model HubRoute"));
        }
        if (nextHopType() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property nextHopType in model HubRoute"));
        }
        if (nextHop() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property nextHop in model HubRoute"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HubRoute.class);
}
