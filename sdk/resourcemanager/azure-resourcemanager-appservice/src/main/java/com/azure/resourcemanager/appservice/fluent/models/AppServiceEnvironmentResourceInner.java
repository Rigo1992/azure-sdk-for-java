// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.HostingEnvironmentStatus;
import com.azure.resourcemanager.appservice.models.LoadBalancingMode;
import com.azure.resourcemanager.appservice.models.NameValuePair;
import com.azure.resourcemanager.appservice.models.ProvisioningState;
import com.azure.resourcemanager.appservice.models.VirtualNetworkProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** App Service Environment ARM resource. */
@Fluent
public final class AppServiceEnvironmentResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppServiceEnvironmentResourceInner.class);

    /*
     * Core resource properties
     */
    @JsonProperty(value = "properties")
    private AppServiceEnvironment innerProperties;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the innerProperties property: Core resource properties.
     *
     * @return the innerProperties value.
     */
    private AppServiceEnvironment innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceEnvironmentResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceEnvironmentResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the App Service Environment.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: Current status of the App Service Environment.
     *
     * @return the status value.
     */
    public HostingEnvironmentStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the virtualNetwork property: Description of the Virtual Network.
     *
     * @return the virtualNetwork value.
     */
    public VirtualNetworkProfile virtualNetwork() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetwork();
    }

    /**
     * Set the virtualNetwork property: Description of the Virtual Network.
     *
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withVirtualNetwork(VirtualNetworkProfile virtualNetwork) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceEnvironment();
        }
        this.innerProperties().withVirtualNetwork(virtualNetwork);
        return this;
    }

    /**
     * Get the internalLoadBalancingMode property: Specifies which endpoints to serve internally in the Virtual Network
     * for the App Service Environment.
     *
     * @return the internalLoadBalancingMode value.
     */
    public LoadBalancingMode internalLoadBalancingMode() {
        return this.innerProperties() == null ? null : this.innerProperties().internalLoadBalancingMode();
    }

    /**
     * Set the internalLoadBalancingMode property: Specifies which endpoints to serve internally in the Virtual Network
     * for the App Service Environment.
     *
     * @param internalLoadBalancingMode the internalLoadBalancingMode value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withInternalLoadBalancingMode(
        LoadBalancingMode internalLoadBalancingMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceEnvironment();
        }
        this.innerProperties().withInternalLoadBalancingMode(internalLoadBalancingMode);
        return this;
    }

    /**
     * Get the multiSize property: Front-end VM size, e.g. "Medium", "Large".
     *
     * @return the multiSize value.
     */
    public String multiSize() {
        return this.innerProperties() == null ? null : this.innerProperties().multiSize();
    }

    /**
     * Set the multiSize property: Front-end VM size, e.g. "Medium", "Large".
     *
     * @param multiSize the multiSize value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withMultiSize(String multiSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceEnvironment();
        }
        this.innerProperties().withMultiSize(multiSize);
        return this;
    }

    /**
     * Get the multiRoleCount property: Number of front-end instances.
     *
     * @return the multiRoleCount value.
     */
    public Integer multiRoleCount() {
        return this.innerProperties() == null ? null : this.innerProperties().multiRoleCount();
    }

    /**
     * Get the ipsslAddressCount property: Number of IP SSL addresses reserved for the App Service Environment.
     *
     * @return the ipsslAddressCount value.
     */
    public Integer ipsslAddressCount() {
        return this.innerProperties() == null ? null : this.innerProperties().ipsslAddressCount();
    }

    /**
     * Set the ipsslAddressCount property: Number of IP SSL addresses reserved for the App Service Environment.
     *
     * @param ipsslAddressCount the ipsslAddressCount value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withIpsslAddressCount(Integer ipsslAddressCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceEnvironment();
        }
        this.innerProperties().withIpsslAddressCount(ipsslAddressCount);
        return this;
    }

    /**
     * Get the dnsSuffix property: DNS suffix of the App Service Environment.
     *
     * @return the dnsSuffix value.
     */
    public String dnsSuffix() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSuffix();
    }

    /**
     * Set the dnsSuffix property: DNS suffix of the App Service Environment.
     *
     * @param dnsSuffix the dnsSuffix value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withDnsSuffix(String dnsSuffix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceEnvironment();
        }
        this.innerProperties().withDnsSuffix(dnsSuffix);
        return this;
    }

    /**
     * Get the maximumNumberOfMachines property: Maximum number of VMs in the App Service Environment.
     *
     * @return the maximumNumberOfMachines value.
     */
    public Integer maximumNumberOfMachines() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumNumberOfMachines();
    }

    /**
     * Get the frontEndScaleFactor property: Scale factor for front-ends.
     *
     * @return the frontEndScaleFactor value.
     */
    public Integer frontEndScaleFactor() {
        return this.innerProperties() == null ? null : this.innerProperties().frontEndScaleFactor();
    }

    /**
     * Set the frontEndScaleFactor property: Scale factor for front-ends.
     *
     * @param frontEndScaleFactor the frontEndScaleFactor value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withFrontEndScaleFactor(Integer frontEndScaleFactor) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceEnvironment();
        }
        this.innerProperties().withFrontEndScaleFactor(frontEndScaleFactor);
        return this;
    }

    /**
     * Get the suspended property: &lt;code&gt;true&lt;/code&gt; if the App Service Environment is suspended; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. The environment can be suspended, e.g. when the management endpoint is no longer
     * available (most likely because NSG blocked the incoming traffic).
     *
     * @return the suspended value.
     */
    public Boolean suspended() {
        return this.innerProperties() == null ? null : this.innerProperties().suspended();
    }

    /**
     * Get the clusterSettings property: Custom settings for changing the behavior of the App Service Environment.
     *
     * @return the clusterSettings value.
     */
    public List<NameValuePair> clusterSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterSettings();
    }

    /**
     * Set the clusterSettings property: Custom settings for changing the behavior of the App Service Environment.
     *
     * @param clusterSettings the clusterSettings value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withClusterSettings(List<NameValuePair> clusterSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceEnvironment();
        }
        this.innerProperties().withClusterSettings(clusterSettings);
        return this;
    }

    /**
     * Get the userWhitelistedIpRanges property: User added ip ranges to whitelist on ASE db.
     *
     * @return the userWhitelistedIpRanges value.
     */
    public List<String> userWhitelistedIpRanges() {
        return this.innerProperties() == null ? null : this.innerProperties().userWhitelistedIpRanges();
    }

    /**
     * Set the userWhitelistedIpRanges property: User added ip ranges to whitelist on ASE db.
     *
     * @param userWhitelistedIpRanges the userWhitelistedIpRanges value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withUserWhitelistedIpRanges(List<String> userWhitelistedIpRanges) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceEnvironment();
        }
        this.innerProperties().withUserWhitelistedIpRanges(userWhitelistedIpRanges);
        return this;
    }

    /**
     * Get the hasLinuxWorkers property: Flag that displays whether an ASE has linux workers or not.
     *
     * @return the hasLinuxWorkers value.
     */
    public Boolean hasLinuxWorkers() {
        return this.innerProperties() == null ? null : this.innerProperties().hasLinuxWorkers();
    }

    /**
     * Get the dedicatedHostCount property: Dedicated Host Count.
     *
     * @return the dedicatedHostCount value.
     */
    public Integer dedicatedHostCount() {
        return this.innerProperties() == null ? null : this.innerProperties().dedicatedHostCount();
    }

    /**
     * Set the dedicatedHostCount property: Dedicated Host Count.
     *
     * @param dedicatedHostCount the dedicatedHostCount value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withDedicatedHostCount(Integer dedicatedHostCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceEnvironment();
        }
        this.innerProperties().withDedicatedHostCount(dedicatedHostCount);
        return this;
    }

    /**
     * Get the zoneRedundant property: Whether or not this App Service Environment is zone-redundant.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.innerProperties() == null ? null : this.innerProperties().zoneRedundant();
    }

    /**
     * Set the zoneRedundant property: Whether or not this App Service Environment is zone-redundant.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withZoneRedundant(Boolean zoneRedundant) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceEnvironment();
        }
        this.innerProperties().withZoneRedundant(zoneRedundant);
        return this;
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
