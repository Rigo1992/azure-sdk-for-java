// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.quota.models.QuotaProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Quota limit.
 */
@Fluent
public final class CurrentQuotaLimitBaseInner extends ProxyResource {
    /*
     * Quota properties for the specified resource, based on the API called, Quotas or Usages.
     */
    @JsonProperty(value = "properties")
    private QuotaProperties properties;

    /**
     * Creates an instance of CurrentQuotaLimitBaseInner class.
     */
    public CurrentQuotaLimitBaseInner() {
    }

    /**
     * Get the properties property: Quota properties for the specified resource, based on the API called, Quotas or
     * Usages.
     * 
     * @return the properties value.
     */
    public QuotaProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Quota properties for the specified resource, based on the API called, Quotas or
     * Usages.
     * 
     * @param properties the properties value to set.
     * @return the CurrentQuotaLimitBaseInner object itself.
     */
    public CurrentQuotaLimitBaseInner withProperties(QuotaProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
