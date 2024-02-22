// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * An error response from the pod identity provisioning.
 */
@Fluent
public final class ManagedClusterPodIdentityProvisioningErrorBody {
    /*
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * A message describing the error, intended to be suitable for display in a user interface.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The target of the particular error. For example, the name of the property in error.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * A list of additional details about the error.
     */
    @JsonProperty(value = "details")
    private List<ManagedClusterPodIdentityProvisioningErrorBody> details;

    /**
     * Creates an instance of ManagedClusterPodIdentityProvisioningErrorBody class.
     */
    public ManagedClusterPodIdentityProvisioningErrorBody() {
    }

    /**
     * Get the code property: An identifier for the error. Codes are invariant and are intended to be consumed
     * programmatically.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: An identifier for the error. Codes are invariant and are intended to be consumed
     * programmatically.
     * 
     * @param code the code value to set.
     * @return the ManagedClusterPodIdentityProvisioningErrorBody object itself.
     */
    public ManagedClusterPodIdentityProvisioningErrorBody withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: A message describing the error, intended to be suitable for display in a user
     * interface.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: A message describing the error, intended to be suitable for display in a user
     * interface.
     * 
     * @param message the message value to set.
     * @return the ManagedClusterPodIdentityProvisioningErrorBody object itself.
     */
    public ManagedClusterPodIdentityProvisioningErrorBody withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: The target of the particular error. For example, the name of the property in error.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target of the particular error. For example, the name of the property in error.
     * 
     * @param target the target value to set.
     * @return the ManagedClusterPodIdentityProvisioningErrorBody object itself.
     */
    public ManagedClusterPodIdentityProvisioningErrorBody withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the details property: A list of additional details about the error.
     * 
     * @return the details value.
     */
    public List<ManagedClusterPodIdentityProvisioningErrorBody> details() {
        return this.details;
    }

    /**
     * Set the details property: A list of additional details about the error.
     * 
     * @param details the details value to set.
     * @return the ManagedClusterPodIdentityProvisioningErrorBody object itself.
     */
    public ManagedClusterPodIdentityProvisioningErrorBody
        withDetails(List<ManagedClusterPodIdentityProvisioningErrorBody> details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }
}
