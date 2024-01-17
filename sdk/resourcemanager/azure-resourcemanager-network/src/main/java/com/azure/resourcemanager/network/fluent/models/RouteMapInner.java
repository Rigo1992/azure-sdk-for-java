// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RouteMapRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The RouteMap child resource of a Virtual hub.
 */
@Fluent
public final class RouteMapInner extends SubResource {
    /*
     * Properties of the RouteMap resource.
     */
    @JsonProperty(value = "properties")
    private RouteMapProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Creates an instance of RouteMapInner class.
     */
    public RouteMapInner() {
    }

    /**
     * Get the innerProperties property: Properties of the RouteMap resource.
     * 
     * @return the innerProperties value.
     */
    private RouteMapProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteMapInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the associatedInboundConnections property: List of connections which have this RoutMap associated for
     * inbound traffic.
     * 
     * @return the associatedInboundConnections value.
     */
    public List<String> associatedInboundConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().associatedInboundConnections();
    }

    /**
     * Set the associatedInboundConnections property: List of connections which have this RoutMap associated for
     * inbound traffic.
     * 
     * @param associatedInboundConnections the associatedInboundConnections value to set.
     * @return the RouteMapInner object itself.
     */
    public RouteMapInner withAssociatedInboundConnections(List<String> associatedInboundConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteMapProperties();
        }
        this.innerProperties().withAssociatedInboundConnections(associatedInboundConnections);
        return this;
    }

    /**
     * Get the associatedOutboundConnections property: List of connections which have this RoutMap associated for
     * outbound traffic.
     * 
     * @return the associatedOutboundConnections value.
     */
    public List<String> associatedOutboundConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().associatedOutboundConnections();
    }

    /**
     * Set the associatedOutboundConnections property: List of connections which have this RoutMap associated for
     * outbound traffic.
     * 
     * @param associatedOutboundConnections the associatedOutboundConnections value to set.
     * @return the RouteMapInner object itself.
     */
    public RouteMapInner withAssociatedOutboundConnections(List<String> associatedOutboundConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteMapProperties();
        }
        this.innerProperties().withAssociatedOutboundConnections(associatedOutboundConnections);
        return this;
    }

    /**
     * Get the rules property: List of RouteMap rules to be applied.
     * 
     * @return the rules value.
     */
    public List<RouteMapRule> rules() {
        return this.innerProperties() == null ? null : this.innerProperties().rules();
    }

    /**
     * Set the rules property: List of RouteMap rules to be applied.
     * 
     * @param rules the rules value to set.
     * @return the RouteMapInner object itself.
     */
    public RouteMapInner withRules(List<RouteMapRule> rules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteMapProperties();
        }
        this.innerProperties().withRules(rules);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the RouteMap resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
