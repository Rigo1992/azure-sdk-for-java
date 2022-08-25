// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The blob service properties for blob restore policy. */
@Fluent
public final class RestorePolicyProperties {
    /*
     * Blob restore is enabled if set to true.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * how long this blob can be restored. It should be great than zero and less than DeleteRetentionPolicy.days.
     */
    @JsonProperty(value = "days")
    private Integer days;

    /*
     * Deprecated in favor of minRestoreTime property.
     */
    @JsonProperty(value = "lastEnabledTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastEnabledTime;

    /*
     * Returns the minimum date and time that the restore can be started.
     */
    @JsonProperty(value = "minRestoreTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime minRestoreTime;

    /**
     * Get the enabled property: Blob restore is enabled if set to true.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Blob restore is enabled if set to true.
     *
     * @param enabled the enabled value to set.
     * @return the RestorePolicyProperties object itself.
     */
    public RestorePolicyProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the days property: how long this blob can be restored. It should be great than zero and less than
     * DeleteRetentionPolicy.days.
     *
     * @return the days value.
     */
    public Integer days() {
        return this.days;
    }

    /**
     * Set the days property: how long this blob can be restored. It should be great than zero and less than
     * DeleteRetentionPolicy.days.
     *
     * @param days the days value to set.
     * @return the RestorePolicyProperties object itself.
     */
    public RestorePolicyProperties withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * Get the lastEnabledTime property: Deprecated in favor of minRestoreTime property.
     *
     * @return the lastEnabledTime value.
     */
    public OffsetDateTime lastEnabledTime() {
        return this.lastEnabledTime;
    }

    /**
     * Get the minRestoreTime property: Returns the minimum date and time that the restore can be started.
     *
     * @return the minRestoreTime value.
     */
    public OffsetDateTime minRestoreTime() {
        return this.minRestoreTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
