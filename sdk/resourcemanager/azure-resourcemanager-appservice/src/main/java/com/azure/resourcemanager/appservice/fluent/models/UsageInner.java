// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ComputeModeOptions;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Usage of the quota resource.
 */
@Fluent
public final class UsageInner extends ProxyOnlyResource {
    /*
     * Usage resource specific properties
     */
    @JsonProperty(value = "properties")
    private UsageProperties innerProperties;

    /**
     * Creates an instance of UsageInner class.
     */
    public UsageInner() {
    }

    /**
     * Get the innerProperties property: Usage resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private UsageProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsageInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the displayName property: Friendly name shown in the UI.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the resourceName property: Name of the quota resource.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceName();
    }

    /**
     * Get the unit property: Units of measurement for the quota resource.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.innerProperties() == null ? null : this.innerProperties().unit();
    }

    /**
     * Get the currentValue property: The current value of the resource counter.
     * 
     * @return the currentValue value.
     */
    public Long currentValue() {
        return this.innerProperties() == null ? null : this.innerProperties().currentValue();
    }

    /**
     * Get the limit property: The resource limit.
     * 
     * @return the limit value.
     */
    public Long limit() {
        return this.innerProperties() == null ? null : this.innerProperties().limit();
    }

    /**
     * Get the nextResetTime property: Next reset time for the resource counter.
     * 
     * @return the nextResetTime value.
     */
    public OffsetDateTime nextResetTime() {
        return this.innerProperties() == null ? null : this.innerProperties().nextResetTime();
    }

    /**
     * Get the computeMode property: Compute mode used for this usage.
     * 
     * @return the computeMode value.
     */
    public ComputeModeOptions computeMode() {
        return this.innerProperties() == null ? null : this.innerProperties().computeMode();
    }

    /**
     * Get the siteMode property: Site mode used for this usage.
     * 
     * @return the siteMode value.
     */
    public String siteMode() {
        return this.innerProperties() == null ? null : this.innerProperties().siteMode();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
