// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The network security perimeter properties present in a configuration rule.
 */
@Fluent
public final class NspConfigNetworkSecurityPerimeterRule {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The perimeterGuid property.
     */
    @JsonProperty(value = "perimeterGuid")
    private String perimeterGuid;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Creates an instance of NspConfigNetworkSecurityPerimeterRule class.
     */
    public NspConfigNetworkSecurityPerimeterRule() {
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     * 
     * @param id the id value to set.
     * @return the NspConfigNetworkSecurityPerimeterRule object itself.
     */
    public NspConfigNetworkSecurityPerimeterRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the perimeterGuid property: The perimeterGuid property.
     * 
     * @return the perimeterGuid value.
     */
    public String perimeterGuid() {
        return this.perimeterGuid;
    }

    /**
     * Set the perimeterGuid property: The perimeterGuid property.
     * 
     * @param perimeterGuid the perimeterGuid value to set.
     * @return the NspConfigNetworkSecurityPerimeterRule object itself.
     */
    public NspConfigNetworkSecurityPerimeterRule withPerimeterGuid(String perimeterGuid) {
        this.perimeterGuid = perimeterGuid;
        return this;
    }

    /**
     * Get the location property: The location property.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     * 
     * @param location the location value to set.
     * @return the NspConfigNetworkSecurityPerimeterRule object itself.
     */
    public NspConfigNetworkSecurityPerimeterRule withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
