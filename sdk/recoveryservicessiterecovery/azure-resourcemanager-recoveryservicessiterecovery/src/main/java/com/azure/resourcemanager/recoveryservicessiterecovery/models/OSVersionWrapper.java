// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Wrapper model for OSVersion to include version and service pack info. */
@Fluent
public final class OSVersionWrapper {
    /*
     * The version.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The service pack.
     */
    @JsonProperty(value = "servicePack")
    private String servicePack;

    /** Creates an instance of OSVersionWrapper class. */
    public OSVersionWrapper() {
    }

    /**
     * Get the version property: The version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version.
     *
     * @param version the version value to set.
     * @return the OSVersionWrapper object itself.
     */
    public OSVersionWrapper withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the servicePack property: The service pack.
     *
     * @return the servicePack value.
     */
    public String servicePack() {
        return this.servicePack;
    }

    /**
     * Set the servicePack property: The service pack.
     *
     * @param servicePack the servicePack value to set.
     * @return the OSVersionWrapper object itself.
     */
    public OSVersionWrapper withServicePack(String servicePack) {
        this.servicePack = servicePack;
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
