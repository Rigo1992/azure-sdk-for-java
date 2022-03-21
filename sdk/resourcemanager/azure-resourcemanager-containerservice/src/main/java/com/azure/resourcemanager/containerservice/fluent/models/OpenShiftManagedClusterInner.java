// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.containerservice.models.NetworkProfile;
import com.azure.resourcemanager.containerservice.models.OpenShiftManagedClusterAgentPoolProfile;
import com.azure.resourcemanager.containerservice.models.OpenShiftManagedClusterAuthProfile;
import com.azure.resourcemanager.containerservice.models.OpenShiftManagedClusterMasterPoolProfile;
import com.azure.resourcemanager.containerservice.models.OpenShiftRouterProfile;
import com.azure.resourcemanager.containerservice.models.PurchasePlan;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** OpenShift Managed cluster. */
@Fluent
public final class OpenShiftManagedClusterInner extends Resource {
    /*
     * Define the resource plan as required by ARM for billing purposes
     */
    @JsonProperty(value = "plan")
    private PurchasePlan plan;

    /*
     * Properties of a OpenShift managed cluster.
     */
    @JsonProperty(value = "properties")
    private OpenShiftManagedClusterProperties innerProperties;

    /**
     * Get the plan property: Define the resource plan as required by ARM for billing purposes.
     *
     * @return the plan value.
     */
    public PurchasePlan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Define the resource plan as required by ARM for billing purposes.
     *
     * @param plan the plan value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withPlan(PurchasePlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of a OpenShift managed cluster.
     *
     * @return the innerProperties value.
     */
    private OpenShiftManagedClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public OpenShiftManagedClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OpenShiftManagedClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the openShiftVersion property: Version of OpenShift specified when creating the cluster.
     *
     * @return the openShiftVersion value.
     */
    public String openShiftVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().openShiftVersion();
    }

    /**
     * Set the openShiftVersion property: Version of OpenShift specified when creating the cluster.
     *
     * @param openShiftVersion the openShiftVersion value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withOpenShiftVersion(String openShiftVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftManagedClusterProperties();
        }
        this.innerProperties().withOpenShiftVersion(openShiftVersion);
        return this;
    }

    /**
     * Get the clusterVersion property: Version of OpenShift specified when creating the cluster.
     *
     * @return the clusterVersion value.
     */
    public String clusterVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterVersion();
    }

    /**
     * Get the publicHostname property: Service generated FQDN for OpenShift API server.
     *
     * @return the publicHostname value.
     */
    public String publicHostname() {
        return this.innerProperties() == null ? null : this.innerProperties().publicHostname();
    }

    /**
     * Get the fqdn property: Service generated FQDN for OpenShift API server loadbalancer internal hostname.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdn();
    }

    /**
     * Get the networkProfile property: Configuration for OpenShift networking.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().networkProfile();
    }

    /**
     * Set the networkProfile property: Configuration for OpenShift networking.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withNetworkProfile(NetworkProfile networkProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftManagedClusterProperties();
        }
        this.innerProperties().withNetworkProfile(networkProfile);
        return this;
    }

    /**
     * Get the routerProfiles property: Configuration for OpenShift router(s).
     *
     * @return the routerProfiles value.
     */
    public List<OpenShiftRouterProfile> routerProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().routerProfiles();
    }

    /**
     * Set the routerProfiles property: Configuration for OpenShift router(s).
     *
     * @param routerProfiles the routerProfiles value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withRouterProfiles(List<OpenShiftRouterProfile> routerProfiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftManagedClusterProperties();
        }
        this.innerProperties().withRouterProfiles(routerProfiles);
        return this;
    }

    /**
     * Get the masterPoolProfile property: Configuration for OpenShift master VMs.
     *
     * @return the masterPoolProfile value.
     */
    public OpenShiftManagedClusterMasterPoolProfile masterPoolProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().masterPoolProfile();
    }

    /**
     * Set the masterPoolProfile property: Configuration for OpenShift master VMs.
     *
     * @param masterPoolProfile the masterPoolProfile value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withMasterPoolProfile(
        OpenShiftManagedClusterMasterPoolProfile masterPoolProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftManagedClusterProperties();
        }
        this.innerProperties().withMasterPoolProfile(masterPoolProfile);
        return this;
    }

    /**
     * Get the agentPoolProfiles property: Configuration of OpenShift cluster VMs.
     *
     * @return the agentPoolProfiles value.
     */
    public List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().agentPoolProfiles();
    }

    /**
     * Set the agentPoolProfiles property: Configuration of OpenShift cluster VMs.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withAgentPoolProfiles(
        List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftManagedClusterProperties();
        }
        this.innerProperties().withAgentPoolProfiles(agentPoolProfiles);
        return this;
    }

    /**
     * Get the authProfile property: Configures OpenShift authentication.
     *
     * @return the authProfile value.
     */
    public OpenShiftManagedClusterAuthProfile authProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().authProfile();
    }

    /**
     * Set the authProfile property: Configures OpenShift authentication.
     *
     * @param authProfile the authProfile value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withAuthProfile(OpenShiftManagedClusterAuthProfile authProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftManagedClusterProperties();
        }
        this.innerProperties().withAuthProfile(authProfile);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plan() != null) {
            plan().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
