// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties specific to applied scope type. Not required if not applicable. Required and need to provide tenantId and
 * managementGroupId if AppliedScopeType is ManagementGroup.
 */
@Fluent
public final class AppliedScopeProperties {
    /*
     * Tenant ID where the savings plan should apply benefit.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * Fully-qualified identifier of the management group where the benefit must be applied.
     */
    @JsonProperty(value = "managementGroupId")
    private String managementGroupId;

    /*
     * Fully-qualified identifier of the subscription.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * Fully-qualified identifier of the resource group.
     */
    @JsonProperty(value = "resourceGroupId")
    private String resourceGroupId;

    /*
     * Display name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /** Creates an instance of AppliedScopeProperties class. */
    public AppliedScopeProperties() {
    }

    /**
     * Get the tenantId property: Tenant ID where the savings plan should apply benefit.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant ID where the savings plan should apply benefit.
     *
     * @param tenantId the tenantId value to set.
     * @return the AppliedScopeProperties object itself.
     */
    public AppliedScopeProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the managementGroupId property: Fully-qualified identifier of the management group where the benefit must be
     * applied.
     *
     * @return the managementGroupId value.
     */
    public String managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * Set the managementGroupId property: Fully-qualified identifier of the management group where the benefit must be
     * applied.
     *
     * @param managementGroupId the managementGroupId value to set.
     * @return the AppliedScopeProperties object itself.
     */
    public AppliedScopeProperties withManagementGroupId(String managementGroupId) {
        this.managementGroupId = managementGroupId;
        return this;
    }

    /**
     * Get the subscriptionId property: Fully-qualified identifier of the subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Fully-qualified identifier of the subscription.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the AppliedScopeProperties object itself.
     */
    public AppliedScopeProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupId property: Fully-qualified identifier of the resource group.
     *
     * @return the resourceGroupId value.
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * Set the resourceGroupId property: Fully-qualified identifier of the resource group.
     *
     * @param resourceGroupId the resourceGroupId value to set.
     * @return the AppliedScopeProperties object itself.
     */
    public AppliedScopeProperties withResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    /**
     * Get the displayName property: Display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name.
     *
     * @param displayName the displayName value to set.
     * @return the AppliedScopeProperties object itself.
     */
    public AppliedScopeProperties withDisplayName(String displayName) {
        this.displayName = displayName;
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
