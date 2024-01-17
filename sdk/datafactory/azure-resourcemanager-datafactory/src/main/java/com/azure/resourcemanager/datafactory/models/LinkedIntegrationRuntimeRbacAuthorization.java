// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The role based access control (RBAC) authorization type integration runtime.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authorizationType")
@JsonTypeName("RBAC")
@Fluent
public final class LinkedIntegrationRuntimeRbacAuthorization extends LinkedIntegrationRuntimeType {
    /*
     * The resource identifier of the integration runtime to be shared.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "credential")
    private CredentialReference credential;

    /**
     * Creates an instance of LinkedIntegrationRuntimeRbacAuthorization class.
     */
    public LinkedIntegrationRuntimeRbacAuthorization() {
    }

    /**
     * Get the resourceId property: The resource identifier of the integration runtime to be shared.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource identifier of the integration runtime to be shared.
     * 
     * @param resourceId the resourceId value to set.
     * @return the LinkedIntegrationRuntimeRbacAuthorization object itself.
     */
    public LinkedIntegrationRuntimeRbacAuthorization withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the LinkedIntegrationRuntimeRbacAuthorization object itself.
     */
    public LinkedIntegrationRuntimeRbacAuthorization withCredential(CredentialReference credential) {
        this.credential = credential;
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
        if (resourceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property resourceId in model LinkedIntegrationRuntimeRbacAuthorization"));
        }
        if (credential() != null) {
            credential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LinkedIntegrationRuntimeRbacAuthorization.class);
}
