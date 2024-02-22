// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.models.DataContainer;
import com.azure.resourcemanager.monitor.models.DataStatus;
import com.azure.resourcemanager.monitor.models.OnboardingStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Resource properties.
 */
@Fluent
public final class VMInsightsOnboardingStatusProperties {
    /*
     * Azure Resource Manager identifier of the resource whose onboarding status is being represented.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * The onboarding status for the resource. Note that, a higher level scope, e.g., resource group or subscription,
     * is considered onboarded if at least one resource under it is onboarded.
     */
    @JsonProperty(value = "onboardingStatus", required = true)
    private OnboardingStatus onboardingStatus;

    /*
     * The status of VM Insights data from the resource. When reported as `present` the data array will contain
     * information about the data containers to which data for the specified resource is being routed.
     */
    @JsonProperty(value = "dataStatus", required = true)
    private DataStatus dataStatus;

    /*
     * Containers that currently store VM Insights data for the specified resource.
     */
    @JsonProperty(value = "data")
    private List<DataContainer> data;

    /**
     * Creates an instance of VMInsightsOnboardingStatusProperties class.
     */
    public VMInsightsOnboardingStatusProperties() {
    }

    /**
     * Get the resourceId property: Azure Resource Manager identifier of the resource whose onboarding status is being
     * represented.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Azure Resource Manager identifier of the resource whose onboarding status is being
     * represented.
     * 
     * @param resourceId the resourceId value to set.
     * @return the VMInsightsOnboardingStatusProperties object itself.
     */
    public VMInsightsOnboardingStatusProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the onboardingStatus property: The onboarding status for the resource. Note that, a higher level scope,
     * e.g., resource group or subscription, is considered onboarded if at least one resource under it is onboarded.
     * 
     * @return the onboardingStatus value.
     */
    public OnboardingStatus onboardingStatus() {
        return this.onboardingStatus;
    }

    /**
     * Set the onboardingStatus property: The onboarding status for the resource. Note that, a higher level scope,
     * e.g., resource group or subscription, is considered onboarded if at least one resource under it is onboarded.
     * 
     * @param onboardingStatus the onboardingStatus value to set.
     * @return the VMInsightsOnboardingStatusProperties object itself.
     */
    public VMInsightsOnboardingStatusProperties withOnboardingStatus(OnboardingStatus onboardingStatus) {
        this.onboardingStatus = onboardingStatus;
        return this;
    }

    /**
     * Get the dataStatus property: The status of VM Insights data from the resource. When reported as `present` the
     * data array will contain information about the data containers to which data for the specified resource is being
     * routed.
     * 
     * @return the dataStatus value.
     */
    public DataStatus dataStatus() {
        return this.dataStatus;
    }

    /**
     * Set the dataStatus property: The status of VM Insights data from the resource. When reported as `present` the
     * data array will contain information about the data containers to which data for the specified resource is being
     * routed.
     * 
     * @param dataStatus the dataStatus value to set.
     * @return the VMInsightsOnboardingStatusProperties object itself.
     */
    public VMInsightsOnboardingStatusProperties withDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
        return this;
    }

    /**
     * Get the data property: Containers that currently store VM Insights data for the specified resource.
     * 
     * @return the data value.
     */
    public List<DataContainer> data() {
        return this.data;
    }

    /**
     * Set the data property: Containers that currently store VM Insights data for the specified resource.
     * 
     * @param data the data value to set.
     * @return the VMInsightsOnboardingStatusProperties object itself.
     */
    public VMInsightsOnboardingStatusProperties withData(List<DataContainer> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property resourceId in model VMInsightsOnboardingStatusProperties"));
        }
        if (onboardingStatus() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property onboardingStatus in model VMInsightsOnboardingStatusProperties"));
        }
        if (dataStatus() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property dataStatus in model VMInsightsOnboardingStatusProperties"));
        }
        if (data() != null) {
            data().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VMInsightsOnboardingStatusProperties.class);
}
