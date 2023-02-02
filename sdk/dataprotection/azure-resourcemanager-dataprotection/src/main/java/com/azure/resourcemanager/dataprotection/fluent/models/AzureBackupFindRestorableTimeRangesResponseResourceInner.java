// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesResponse;
import com.azure.resourcemanager.dataprotection.models.DppResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** List Restore Ranges Response. */
@Fluent
public final class AzureBackupFindRestorableTimeRangesResponseResourceInner extends DppResource {
    /*
     * AzureBackupFindRestorableTimeRangesResponseResource properties
     */
    @JsonProperty(value = "properties")
    private AzureBackupFindRestorableTimeRangesResponse properties;

    /** Creates an instance of AzureBackupFindRestorableTimeRangesResponseResourceInner class. */
    public AzureBackupFindRestorableTimeRangesResponseResourceInner() {
    }

    /**
     * Get the properties property: AzureBackupFindRestorableTimeRangesResponseResource properties.
     *
     * @return the properties value.
     */
    public AzureBackupFindRestorableTimeRangesResponse properties() {
        return this.properties;
    }

    /**
     * Set the properties property: AzureBackupFindRestorableTimeRangesResponseResource properties.
     *
     * @param properties the properties value to set.
     * @return the AzureBackupFindRestorableTimeRangesResponseResourceInner object itself.
     */
    public AzureBackupFindRestorableTimeRangesResponseResourceInner withProperties(
        AzureBackupFindRestorableTimeRangesResponse properties) {
        this.properties = properties;
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
