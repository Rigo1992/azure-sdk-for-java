// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.peering.models.PeeringPropertiesDirect;
import com.azure.resourcemanager.peering.models.PeeringPropertiesExchange;
import com.azure.resourcemanager.peering.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that define connectivity to the Microsoft Cloud Edge. */
@Fluent
public final class PeeringProperties {
    /*
     * The properties that define a direct peering.
     */
    @JsonProperty(value = "direct")
    private PeeringPropertiesDirect direct;

    /*
     * The properties that define an exchange peering.
     */
    @JsonProperty(value = "exchange")
    private PeeringPropertiesExchange exchange;

    /*
     * The location of the peering.
     */
    @JsonProperty(value = "peeringLocation")
    private String peeringLocation;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of PeeringProperties class. */
    public PeeringProperties() {
    }

    /**
     * Get the direct property: The properties that define a direct peering.
     *
     * @return the direct value.
     */
    public PeeringPropertiesDirect direct() {
        return this.direct;
    }

    /**
     * Set the direct property: The properties that define a direct peering.
     *
     * @param direct the direct value to set.
     * @return the PeeringProperties object itself.
     */
    public PeeringProperties withDirect(PeeringPropertiesDirect direct) {
        this.direct = direct;
        return this;
    }

    /**
     * Get the exchange property: The properties that define an exchange peering.
     *
     * @return the exchange value.
     */
    public PeeringPropertiesExchange exchange() {
        return this.exchange;
    }

    /**
     * Set the exchange property: The properties that define an exchange peering.
     *
     * @param exchange the exchange value to set.
     * @return the PeeringProperties object itself.
     */
    public PeeringProperties withExchange(PeeringPropertiesExchange exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Get the peeringLocation property: The location of the peering.
     *
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation property: The location of the peering.
     *
     * @param peeringLocation the peeringLocation value to set.
     * @return the PeeringProperties object itself.
     */
    public PeeringProperties withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
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
        if (direct() != null) {
            direct().validate();
        }
        if (exchange() != null) {
            exchange().validate();
        }
    }
}
