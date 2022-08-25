// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayLoadDistributionTargetPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Load Distribution Target of an application gateway. */
@Fluent
public final class ApplicationGatewayLoadDistributionTarget extends SubResource {
    /*
     * Properties of the application gateway load distribution target.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayLoadDistributionTargetPropertiesFormat innerProperties;

    /*
     * Name of the load distribution policy that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the application gateway load distribution target.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayLoadDistributionTargetPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the load distribution policy that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the load distribution policy that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayLoadDistributionTarget object itself.
     */
    public ApplicationGatewayLoadDistributionTarget withName(String name) {
        this.name = name;
        return this;
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
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayLoadDistributionTarget withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the weightPerServer property: Weight per server. Range between 1 and 100.
     *
     * @return the weightPerServer value.
     */
    public Integer weightPerServer() {
        return this.innerProperties() == null ? null : this.innerProperties().weightPerServer();
    }

    /**
     * Set the weightPerServer property: Weight per server. Range between 1 and 100.
     *
     * @param weightPerServer the weightPerServer value to set.
     * @return the ApplicationGatewayLoadDistributionTarget object itself.
     */
    public ApplicationGatewayLoadDistributionTarget withWeightPerServer(Integer weightPerServer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayLoadDistributionTargetPropertiesFormat();
        }
        this.innerProperties().withWeightPerServer(weightPerServer);
        return this;
    }

    /**
     * Get the backendAddressPool property: Backend address pool resource of the application gateway.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.innerProperties() == null ? null : this.innerProperties().backendAddressPool();
    }

    /**
     * Set the backendAddressPool property: Backend address pool resource of the application gateway.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayLoadDistributionTarget object itself.
     */
    public ApplicationGatewayLoadDistributionTarget withBackendAddressPool(SubResource backendAddressPool) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayLoadDistributionTargetPropertiesFormat();
        }
        this.innerProperties().withBackendAddressPool(backendAddressPool);
        return this;
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
