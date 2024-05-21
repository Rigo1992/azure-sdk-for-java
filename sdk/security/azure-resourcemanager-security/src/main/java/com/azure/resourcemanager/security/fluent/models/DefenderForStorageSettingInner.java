// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.OperationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Defender for Storage resource.
 */
@Fluent
public final class DefenderForStorageSettingInner extends ProxyResource {
    /*
     * Defender for Storage resource properties.
     */
    @JsonProperty(value = "properties")
    private DefenderForStorageSettingProperties innerProperties;

    /**
     * Creates an instance of DefenderForStorageSettingInner class.
     */
    public DefenderForStorageSettingInner() {
    }

    /**
     * Get the innerProperties property: Defender for Storage resource properties.
     * 
     * @return the innerProperties value.
     */
    private DefenderForStorageSettingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the isEnabled property: Indicates whether Defender for Storage is enabled on this storage account.
     * 
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isEnabled();
    }

    /**
     * Set the isEnabled property: Indicates whether Defender for Storage is enabled on this storage account.
     * 
     * @param isEnabled the isEnabled value to set.
     * @return the DefenderForStorageSettingInner object itself.
     */
    public DefenderForStorageSettingInner withIsEnabled(Boolean isEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DefenderForStorageSettingProperties();
        }
        this.innerProperties().withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Get the overrideSubscriptionLevelSettings property: Indicates whether the settings defined for this storage
     * account should override the settings defined for the subscription.
     * 
     * @return the overrideSubscriptionLevelSettings value.
     */
    public Boolean overrideSubscriptionLevelSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().overrideSubscriptionLevelSettings();
    }

    /**
     * Set the overrideSubscriptionLevelSettings property: Indicates whether the settings defined for this storage
     * account should override the settings defined for the subscription.
     * 
     * @param overrideSubscriptionLevelSettings the overrideSubscriptionLevelSettings value to set.
     * @return the DefenderForStorageSettingInner object itself.
     */
    public DefenderForStorageSettingInner
        withOverrideSubscriptionLevelSettings(Boolean overrideSubscriptionLevelSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DefenderForStorageSettingProperties();
        }
        this.innerProperties().withOverrideSubscriptionLevelSettings(overrideSubscriptionLevelSettings);
        return this;
    }

    /**
     * Get the scanResultsEventGridTopicResourceId property: Optional. Resource id of an Event Grid Topic to send scan
     * results to.
     * 
     * @return the scanResultsEventGridTopicResourceId value.
     */
    public String scanResultsEventGridTopicResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().scanResultsEventGridTopicResourceId();
    }

    /**
     * Set the scanResultsEventGridTopicResourceId property: Optional. Resource id of an Event Grid Topic to send scan
     * results to.
     * 
     * @param scanResultsEventGridTopicResourceId the scanResultsEventGridTopicResourceId value to set.
     * @return the DefenderForStorageSettingInner object itself.
     */
    public DefenderForStorageSettingInner
        withScanResultsEventGridTopicResourceId(String scanResultsEventGridTopicResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DefenderForStorageSettingProperties();
        }
        this.innerProperties().withScanResultsEventGridTopicResourceId(scanResultsEventGridTopicResourceId);
        return this;
    }

    /**
     * Get the operationStatus property: Upon failure or partial success. Additional data describing Malware Scanning
     * enable/disable operation.
     * 
     * @return the operationStatus value.
     */
    public OperationStatus operationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().operationStatus();
    }

    /**
     * Get the isEnabledMalwareScanningIsEnabled property: Indicates whether On Upload malware scanning should be
     * enabled.
     * 
     * @return the isEnabledMalwareScanningIsEnabled value.
     */
    public Boolean isEnabledMalwareScanningIsEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isEnabledMalwareScanningIsEnabled();
    }

    /**
     * Set the isEnabledMalwareScanningIsEnabled property: Indicates whether On Upload malware scanning should be
     * enabled.
     * 
     * @param isEnabledMalwareScanningIsEnabled the isEnabledMalwareScanningIsEnabled value to set.
     * @return the DefenderForStorageSettingInner object itself.
     */
    public DefenderForStorageSettingInner
        withIsEnabledMalwareScanningIsEnabled(Boolean isEnabledMalwareScanningIsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DefenderForStorageSettingProperties();
        }
        this.innerProperties().withIsEnabledMalwareScanningIsEnabled(isEnabledMalwareScanningIsEnabled);
        return this;
    }

    /**
     * Get the capGBPerMonth property: Defines the max GB to be scanned per Month. Set to -1 if no capping is needed.
     * 
     * @return the capGBPerMonth value.
     */
    public Integer capGBPerMonth() {
        return this.innerProperties() == null ? null : this.innerProperties().capGBPerMonth();
    }

    /**
     * Set the capGBPerMonth property: Defines the max GB to be scanned per Month. Set to -1 if no capping is needed.
     * 
     * @param capGBPerMonth the capGBPerMonth value to set.
     * @return the DefenderForStorageSettingInner object itself.
     */
    public DefenderForStorageSettingInner withCapGBPerMonth(Integer capGBPerMonth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DefenderForStorageSettingProperties();
        }
        this.innerProperties().withCapGBPerMonth(capGBPerMonth);
        return this;
    }

    /**
     * Get the isEnabledSensitiveDataDiscoveryIsEnabled property: Indicates whether Sensitive Data Discovery should be
     * enabled.
     * 
     * @return the isEnabledSensitiveDataDiscoveryIsEnabled value.
     */
    public Boolean isEnabledSensitiveDataDiscoveryIsEnabled() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().isEnabledSensitiveDataDiscoveryIsEnabled();
    }

    /**
     * Set the isEnabledSensitiveDataDiscoveryIsEnabled property: Indicates whether Sensitive Data Discovery should be
     * enabled.
     * 
     * @param isEnabledSensitiveDataDiscoveryIsEnabled the isEnabledSensitiveDataDiscoveryIsEnabled value to set.
     * @return the DefenderForStorageSettingInner object itself.
     */
    public DefenderForStorageSettingInner
        withIsEnabledSensitiveDataDiscoveryIsEnabled(Boolean isEnabledSensitiveDataDiscoveryIsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DefenderForStorageSettingProperties();
        }
        this.innerProperties().withIsEnabledSensitiveDataDiscoveryIsEnabled(isEnabledSensitiveDataDiscoveryIsEnabled);
        return this;
    }

    /**
     * Get the operationStatusSensitiveDataDiscoveryOperationStatus property: Upon failure or partial success.
     * Additional data describing Sensitive Data Discovery enable/disable operation.
     * 
     * @return the operationStatusSensitiveDataDiscoveryOperationStatus value.
     */
    public OperationStatus operationStatusSensitiveDataDiscoveryOperationStatus() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().operationStatusSensitiveDataDiscoveryOperationStatus();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
