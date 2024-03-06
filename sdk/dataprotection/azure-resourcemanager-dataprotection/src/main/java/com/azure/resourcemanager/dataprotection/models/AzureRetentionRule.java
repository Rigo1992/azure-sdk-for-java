// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * AzureRetentionRule
 * 
 * Azure retention rule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureRetentionRule")
@Fluent
public final class AzureRetentionRule extends BasePolicyRule {
    /*
     * The isDefault property.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /*
     * The lifecycles property.
     */
    @JsonProperty(value = "lifecycles", required = true)
    private List<SourceLifeCycle> lifecycles;

    /**
     * Creates an instance of AzureRetentionRule class.
     */
    public AzureRetentionRule() {
    }

    /**
     * Get the isDefault property: The isDefault property.
     * 
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: The isDefault property.
     * 
     * @param isDefault the isDefault value to set.
     * @return the AzureRetentionRule object itself.
     */
    public AzureRetentionRule withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the lifecycles property: The lifecycles property.
     * 
     * @return the lifecycles value.
     */
    public List<SourceLifeCycle> lifecycles() {
        return this.lifecycles;
    }

    /**
     * Set the lifecycles property: The lifecycles property.
     * 
     * @param lifecycles the lifecycles value to set.
     * @return the AzureRetentionRule object itself.
     */
    public AzureRetentionRule withLifecycles(List<SourceLifeCycle> lifecycles) {
        this.lifecycles = lifecycles;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureRetentionRule withName(String name) {
        super.withName(name);
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
        if (lifecycles() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property lifecycles in model AzureRetentionRule"));
        } else {
            lifecycles().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureRetentionRule.class);
}
