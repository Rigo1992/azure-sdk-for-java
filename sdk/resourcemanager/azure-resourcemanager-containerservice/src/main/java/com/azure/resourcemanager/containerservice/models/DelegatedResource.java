// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * Delegated resource properties - internal use only.
 */
@Fluent
public final class DelegatedResource {
    /*
     * The ARM resource id of the delegated resource - internal use only.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The tenant id of the delegated resource - internal use only.
     */
    @JsonProperty(value = "tenantId")
    private UUID tenantId;

    /*
     * The delegation id of the referral delegation (optional) - internal use only.
     */
    @JsonProperty(value = "referralResource")
    private String referralResource;

    /*
     * The source resource location - internal use only.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Creates an instance of DelegatedResource class.
     */
    public DelegatedResource() {
    }

    /**
     * Get the resourceId property: The ARM resource id of the delegated resource - internal use only.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ARM resource id of the delegated resource - internal use only.
     * 
     * @param resourceId the resourceId value to set.
     * @return the DelegatedResource object itself.
     */
    public DelegatedResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the tenantId property: The tenant id of the delegated resource - internal use only.
     * 
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant id of the delegated resource - internal use only.
     * 
     * @param tenantId the tenantId value to set.
     * @return the DelegatedResource object itself.
     */
    public DelegatedResource withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the referralResource property: The delegation id of the referral delegation (optional) - internal use only.
     * 
     * @return the referralResource value.
     */
    public String referralResource() {
        return this.referralResource;
    }

    /**
     * Set the referralResource property: The delegation id of the referral delegation (optional) - internal use only.
     * 
     * @param referralResource the referralResource value to set.
     * @return the DelegatedResource object itself.
     */
    public DelegatedResource withReferralResource(String referralResource) {
        this.referralResource = referralResource;
        return this;
    }

    /**
     * Get the location property: The source resource location - internal use only.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The source resource location - internal use only.
     * 
     * @param location the location value to set.
     * @return the DelegatedResource object itself.
     */
    public DelegatedResource withLocation(String location) {
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
