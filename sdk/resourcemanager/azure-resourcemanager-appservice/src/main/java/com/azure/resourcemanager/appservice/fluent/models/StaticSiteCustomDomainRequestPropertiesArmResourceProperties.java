// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StaticSiteCustomDomainRequestPropertiesARMResource resource specific properties. */
@Fluent
public final class StaticSiteCustomDomainRequestPropertiesArmResourceProperties {
    /*
     * Validation method for adding a custom domain
     */
    @JsonProperty(value = "validationMethod")
    private String validationMethod;

    /** Creates an instance of StaticSiteCustomDomainRequestPropertiesArmResourceProperties class. */
    public StaticSiteCustomDomainRequestPropertiesArmResourceProperties() {
    }

    /**
     * Get the validationMethod property: Validation method for adding a custom domain.
     *
     * @return the validationMethod value.
     */
    public String validationMethod() {
        return this.validationMethod;
    }

    /**
     * Set the validationMethod property: Validation method for adding a custom domain.
     *
     * @param validationMethod the validationMethod value to set.
     * @return the StaticSiteCustomDomainRequestPropertiesArmResourceProperties object itself.
     */
    public StaticSiteCustomDomainRequestPropertiesArmResourceProperties withValidationMethod(String validationMethod) {
        this.validationMethod = validationMethod;
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
