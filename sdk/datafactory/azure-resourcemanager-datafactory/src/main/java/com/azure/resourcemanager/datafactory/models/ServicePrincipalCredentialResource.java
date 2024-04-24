// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.CredentialResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Credential resource type.
 */
@Fluent
public final class ServicePrincipalCredentialResource extends CredentialResourceInner {
    /*
     * Service Principal Credential properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ServicePrincipalCredential properties;

    /**
     * Creates an instance of ServicePrincipalCredentialResource class.
     */
    public ServicePrincipalCredentialResource() {
    }

    /**
     * Get the properties property: Service Principal Credential properties.
     * 
     * @return the properties value.
     */
    public ServicePrincipalCredential properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Service Principal Credential properties.
     * 
     * @param properties the properties value to set.
     * @return the ServicePrincipalCredentialResource object itself.
     */
    public ServicePrincipalCredentialResource withProperties(ServicePrincipalCredential properties) {
        this.properties = properties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePrincipalCredentialResource withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property properties in model ServicePrincipalCredentialResource"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServicePrincipalCredentialResource.class);
}
