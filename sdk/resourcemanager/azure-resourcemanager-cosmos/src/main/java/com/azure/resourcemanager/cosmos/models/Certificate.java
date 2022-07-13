// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Certificate model. */
@Fluent
public final class Certificate {
    /*
     * PEM formatted public key.
     */
    @JsonProperty(value = "pem")
    private String pem;

    /**
     * Get the pem property: PEM formatted public key.
     *
     * @return the pem value.
     */
    public String pem() {
        return this.pem;
    }

    /**
     * Set the pem property: PEM formatted public key.
     *
     * @param pem the pem value to set.
     * @return the Certificate object itself.
     */
    public Certificate withPem(String pem) {
        this.pem = pem;
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
