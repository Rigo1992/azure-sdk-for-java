// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The provider consent. */
@Fluent
public final class ProviderConsentDefinition {
    /*
     * A value indicating whether authorization is consented or not.
     */
    @JsonProperty(value = "consentToAuthorization")
    private Boolean consentToAuthorization;

    /** Creates an instance of ProviderConsentDefinition class. */
    public ProviderConsentDefinition() {
    }

    /**
     * Get the consentToAuthorization property: A value indicating whether authorization is consented or not.
     *
     * @return the consentToAuthorization value.
     */
    public Boolean consentToAuthorization() {
        return this.consentToAuthorization;
    }

    /**
     * Set the consentToAuthorization property: A value indicating whether authorization is consented or not.
     *
     * @param consentToAuthorization the consentToAuthorization value to set.
     * @return the ProviderConsentDefinition object itself.
     */
    public ProviderConsentDefinition withConsentToAuthorization(Boolean consentToAuthorization) {
        this.consentToAuthorization = consentToAuthorization;
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
