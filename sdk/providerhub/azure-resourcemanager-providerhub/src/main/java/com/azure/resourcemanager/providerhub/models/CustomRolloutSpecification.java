// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.fluent.models.ResourceTypeRegistrationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CustomRolloutSpecification model. */
@Fluent
public class CustomRolloutSpecification {
    /*
     * The canary property.
     */
    @JsonProperty(value = "canary", required = true)
    private CustomRolloutSpecificationCanary canary;

    /*
     * The providerRegistration property.
     */
    @JsonProperty(value = "providerRegistration")
    private CustomRolloutSpecificationProviderRegistration providerRegistration;

    /*
     * The resourceTypeRegistrations property.
     */
    @JsonProperty(value = "resourceTypeRegistrations")
    private List<ResourceTypeRegistrationInner> resourceTypeRegistrations;

    /** Creates an instance of CustomRolloutSpecification class. */
    public CustomRolloutSpecification() {
    }

    /**
     * Get the canary property: The canary property.
     *
     * @return the canary value.
     */
    public CustomRolloutSpecificationCanary canary() {
        return this.canary;
    }

    /**
     * Set the canary property: The canary property.
     *
     * @param canary the canary value to set.
     * @return the CustomRolloutSpecification object itself.
     */
    public CustomRolloutSpecification withCanary(CustomRolloutSpecificationCanary canary) {
        this.canary = canary;
        return this;
    }

    /**
     * Get the providerRegistration property: The providerRegistration property.
     *
     * @return the providerRegistration value.
     */
    public CustomRolloutSpecificationProviderRegistration providerRegistration() {
        return this.providerRegistration;
    }

    /**
     * Set the providerRegistration property: The providerRegistration property.
     *
     * @param providerRegistration the providerRegistration value to set.
     * @return the CustomRolloutSpecification object itself.
     */
    public CustomRolloutSpecification withProviderRegistration(
        CustomRolloutSpecificationProviderRegistration providerRegistration) {
        this.providerRegistration = providerRegistration;
        return this;
    }

    /**
     * Get the resourceTypeRegistrations property: The resourceTypeRegistrations property.
     *
     * @return the resourceTypeRegistrations value.
     */
    public List<ResourceTypeRegistrationInner> resourceTypeRegistrations() {
        return this.resourceTypeRegistrations;
    }

    /**
     * Set the resourceTypeRegistrations property: The resourceTypeRegistrations property.
     *
     * @param resourceTypeRegistrations the resourceTypeRegistrations value to set.
     * @return the CustomRolloutSpecification object itself.
     */
    public CustomRolloutSpecification withResourceTypeRegistrations(
        List<ResourceTypeRegistrationInner> resourceTypeRegistrations) {
        this.resourceTypeRegistrations = resourceTypeRegistrations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (canary() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property canary in model CustomRolloutSpecification"));
        } else {
            canary().validate();
        }
        if (providerRegistration() != null) {
            providerRegistration().validate();
        }
        if (resourceTypeRegistrations() != null) {
            resourceTypeRegistrations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomRolloutSpecification.class);
}
