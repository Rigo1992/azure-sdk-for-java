// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Capabilities properties in response.
 */
@Fluent
public final class CapabilitiesResponseProperties {
    /*
     * The dnsZones property.
     */
    @JsonProperty(value = "dnsZones")
    private List<DnsZoneResponse> dnsZones;

    /**
     * Creates an instance of CapabilitiesResponseProperties class.
     */
    public CapabilitiesResponseProperties() {
    }

    /**
     * Get the dnsZones property: The dnsZones property.
     * 
     * @return the dnsZones value.
     */
    public List<DnsZoneResponse> dnsZones() {
        return this.dnsZones;
    }

    /**
     * Set the dnsZones property: The dnsZones property.
     * 
     * @param dnsZones the dnsZones value to set.
     * @return the CapabilitiesResponseProperties object itself.
     */
    public CapabilitiesResponseProperties withDnsZones(List<DnsZoneResponse> dnsZones) {
        this.dnsZones = dnsZones;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsZones() != null) {
            dnsZones().forEach(e -> e.validate());
        }
    }
}
