// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.fluent.models.FrontendEndpointInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties needed to update a Front Door. */
@Fluent
public class FrontDoorUpdateParameters {
    /*
     * A friendly name for the frontDoor
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * Routing rules associated with this Front Door.
     */
    @JsonProperty(value = "routingRules")
    private List<RoutingRule> routingRules;

    /*
     * Load balancing settings associated with this Front Door instance.
     */
    @JsonProperty(value = "loadBalancingSettings")
    private List<LoadBalancingSettingsModel> loadBalancingSettings;

    /*
     * Health probe settings associated with this Front Door instance.
     */
    @JsonProperty(value = "healthProbeSettings")
    private List<HealthProbeSettingsModel> healthProbeSettings;

    /*
     * Backend pools available to routing rules.
     */
    @JsonProperty(value = "backendPools")
    private List<BackendPool> backendPools;

    /*
     * Frontend endpoints available to routing rules.
     */
    @JsonProperty(value = "frontendEndpoints")
    private List<FrontendEndpointInner> frontendEndpoints;

    /*
     * Settings for all backendPools
     */
    @JsonProperty(value = "backendPoolsSettings")
    private BackendPoolsSettings backendPoolsSettings;

    /*
     * Operational status of the Front Door load balancer. Permitted values are 'Enabled' or 'Disabled'
     */
    @JsonProperty(value = "enabledState")
    private FrontDoorEnabledState enabledState;

    /** Creates an instance of FrontDoorUpdateParameters class. */
    public FrontDoorUpdateParameters() {
    }

    /**
     * Get the friendlyName property: A friendly name for the frontDoor.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: A friendly name for the frontDoor.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the FrontDoorUpdateParameters object itself.
     */
    public FrontDoorUpdateParameters withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the routingRules property: Routing rules associated with this Front Door.
     *
     * @return the routingRules value.
     */
    public List<RoutingRule> routingRules() {
        return this.routingRules;
    }

    /**
     * Set the routingRules property: Routing rules associated with this Front Door.
     *
     * @param routingRules the routingRules value to set.
     * @return the FrontDoorUpdateParameters object itself.
     */
    public FrontDoorUpdateParameters withRoutingRules(List<RoutingRule> routingRules) {
        this.routingRules = routingRules;
        return this;
    }

    /**
     * Get the loadBalancingSettings property: Load balancing settings associated with this Front Door instance.
     *
     * @return the loadBalancingSettings value.
     */
    public List<LoadBalancingSettingsModel> loadBalancingSettings() {
        return this.loadBalancingSettings;
    }

    /**
     * Set the loadBalancingSettings property: Load balancing settings associated with this Front Door instance.
     *
     * @param loadBalancingSettings the loadBalancingSettings value to set.
     * @return the FrontDoorUpdateParameters object itself.
     */
    public FrontDoorUpdateParameters withLoadBalancingSettings(List<LoadBalancingSettingsModel> loadBalancingSettings) {
        this.loadBalancingSettings = loadBalancingSettings;
        return this;
    }

    /**
     * Get the healthProbeSettings property: Health probe settings associated with this Front Door instance.
     *
     * @return the healthProbeSettings value.
     */
    public List<HealthProbeSettingsModel> healthProbeSettings() {
        return this.healthProbeSettings;
    }

    /**
     * Set the healthProbeSettings property: Health probe settings associated with this Front Door instance.
     *
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the FrontDoorUpdateParameters object itself.
     */
    public FrontDoorUpdateParameters withHealthProbeSettings(List<HealthProbeSettingsModel> healthProbeSettings) {
        this.healthProbeSettings = healthProbeSettings;
        return this;
    }

    /**
     * Get the backendPools property: Backend pools available to routing rules.
     *
     * @return the backendPools value.
     */
    public List<BackendPool> backendPools() {
        return this.backendPools;
    }

    /**
     * Set the backendPools property: Backend pools available to routing rules.
     *
     * @param backendPools the backendPools value to set.
     * @return the FrontDoorUpdateParameters object itself.
     */
    public FrontDoorUpdateParameters withBackendPools(List<BackendPool> backendPools) {
        this.backendPools = backendPools;
        return this;
    }

    /**
     * Get the frontendEndpoints property: Frontend endpoints available to routing rules.
     *
     * @return the frontendEndpoints value.
     */
    public List<FrontendEndpointInner> frontendEndpoints() {
        return this.frontendEndpoints;
    }

    /**
     * Set the frontendEndpoints property: Frontend endpoints available to routing rules.
     *
     * @param frontendEndpoints the frontendEndpoints value to set.
     * @return the FrontDoorUpdateParameters object itself.
     */
    public FrontDoorUpdateParameters withFrontendEndpoints(List<FrontendEndpointInner> frontendEndpoints) {
        this.frontendEndpoints = frontendEndpoints;
        return this;
    }

    /**
     * Get the backendPoolsSettings property: Settings for all backendPools.
     *
     * @return the backendPoolsSettings value.
     */
    public BackendPoolsSettings backendPoolsSettings() {
        return this.backendPoolsSettings;
    }

    /**
     * Set the backendPoolsSettings property: Settings for all backendPools.
     *
     * @param backendPoolsSettings the backendPoolsSettings value to set.
     * @return the FrontDoorUpdateParameters object itself.
     */
    public FrontDoorUpdateParameters withBackendPoolsSettings(BackendPoolsSettings backendPoolsSettings) {
        this.backendPoolsSettings = backendPoolsSettings;
        return this;
    }

    /**
     * Get the enabledState property: Operational status of the Front Door load balancer. Permitted values are 'Enabled'
     * or 'Disabled'.
     *
     * @return the enabledState value.
     */
    public FrontDoorEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Operational status of the Front Door load balancer. Permitted values are 'Enabled'
     * or 'Disabled'.
     *
     * @param enabledState the enabledState value to set.
     * @return the FrontDoorUpdateParameters object itself.
     */
    public FrontDoorUpdateParameters withEnabledState(FrontDoorEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routingRules() != null) {
            routingRules().forEach(e -> e.validate());
        }
        if (loadBalancingSettings() != null) {
            loadBalancingSettings().forEach(e -> e.validate());
        }
        if (healthProbeSettings() != null) {
            healthProbeSettings().forEach(e -> e.validate());
        }
        if (backendPools() != null) {
            backendPools().forEach(e -> e.validate());
        }
        if (frontendEndpoints() != null) {
            frontendEndpoints().forEach(e -> e.validate());
        }
        if (backendPoolsSettings() != null) {
            backendPoolsSettings().validate();
        }
    }
}
