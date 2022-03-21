// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ClientCertMode;
import com.azure.resourcemanager.appservice.models.CloningInfo;
import com.azure.resourcemanager.appservice.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.models.HostnameSslState;
import com.azure.resourcemanager.appservice.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.RedundancyMode;
import com.azure.resourcemanager.appservice.models.SiteAvailabilityState;
import com.azure.resourcemanager.appservice.models.SlotSwapStatus;
import com.azure.resourcemanager.appservice.models.UsageState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** ARM resource for a site. */
@Fluent
public final class SitePatchResourceInner extends ProxyOnlyResource {
    /*
     * SitePatchResource resource specific properties
     */
    @JsonProperty(value = "properties")
    private SitePatchResourcePropertiesInner innerProperties;

    /*
     * Managed service identity.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /**
     * Get the innerProperties property: SitePatchResource resource specific properties.
     *
     * @return the innerProperties value.
     */
    private SitePatchResourcePropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: Managed service identity.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity.
     *
     * @param identity the identity value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SitePatchResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the state property: Current state of the app.
     *
     * @return the state value.
     */
    public String state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the hostNames property: Hostnames associated with the app.
     *
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.innerProperties() == null ? null : this.innerProperties().hostNames();
    }

    /**
     * Get the repositorySiteName property: Name of the repository site.
     *
     * @return the repositorySiteName value.
     */
    public String repositorySiteName() {
        return this.innerProperties() == null ? null : this.innerProperties().repositorySiteName();
    }

    /**
     * Get the usageState property: State indicating whether the app has exceeded its quota usage. Read-only.
     *
     * @return the usageState value.
     */
    public UsageState usageState() {
        return this.innerProperties() == null ? null : this.innerProperties().usageState();
    }

    /**
     * Get the enabled property: &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     *
     * @param enabled the enabled value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the enabledHostNames property: Enabled hostnames for the app.Hostnames need to be assigned (see HostNames)
     * AND enabled. Otherwise, the app is not served on those hostnames.
     *
     * @return the enabledHostNames value.
     */
    public List<String> enabledHostNames() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledHostNames();
    }

    /**
     * Get the availabilityState property: Management information availability state for the app.
     *
     * @return the availabilityState value.
     */
    public SiteAvailabilityState availabilityState() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityState();
    }

    /**
     * Get the hostnameSslStates property: Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     *
     * @return the hostnameSslStates value.
     */
    public List<HostnameSslState> hostnameSslStates() {
        return this.innerProperties() == null ? null : this.innerProperties().hostnameSslStates();
    }

    /**
     * Set the hostnameSslStates property: Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     *
     * @param hostnameSslStates the hostnameSslStates value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withHostnameSslStates(List<HostnameSslState> hostnameSslStates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withHostnameSslStates(hostnameSslStates);
        return this;
    }

    /**
     * Get the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
         + "/{appServicePlanName}".
     *
     * @return the serverFarmId value.
     */
    public String serverFarmId() {
        return this.innerProperties() == null ? null : this.innerProperties().serverFarmId();
    }

    /**
     * Set the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
         + "/{appServicePlanName}".
     *
     * @param serverFarmId the serverFarmId value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withServerFarmId(String serverFarmId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withServerFarmId(serverFarmId);
        return this;
    }

    /**
     * Get the reserved property: &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the reserved value.
     */
    public Boolean reserved() {
        return this.innerProperties() == null ? null : this.innerProperties().reserved();
    }

    /**
     * Set the reserved property: &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param reserved the reserved value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withReserved(Boolean reserved) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withReserved(reserved);
        return this;
    }

    /**
     * Get the isXenon property: Obsolete: Hyper-V sandbox.
     *
     * @return the isXenon value.
     */
    public Boolean isXenon() {
        return this.innerProperties() == null ? null : this.innerProperties().isXenon();
    }

    /**
     * Set the isXenon property: Obsolete: Hyper-V sandbox.
     *
     * @param isXenon the isXenon value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withIsXenon(Boolean isXenon) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withIsXenon(isXenon);
        return this;
    }

    /**
     * Get the hyperV property: Hyper-V sandbox.
     *
     * @return the hyperV value.
     */
    public Boolean hyperV() {
        return this.innerProperties() == null ? null : this.innerProperties().hyperV();
    }

    /**
     * Set the hyperV property: Hyper-V sandbox.
     *
     * @param hyperV the hyperV value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withHyperV(Boolean hyperV) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withHyperV(hyperV);
        return this;
    }

    /**
     * Get the lastModifiedTimeUtc property: Last time the app was modified, in UTC. Read-only.
     *
     * @return the lastModifiedTimeUtc value.
     */
    public OffsetDateTime lastModifiedTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTimeUtc();
    }

    /**
     * Get the siteConfig property: Configuration of the app.
     *
     * @return the siteConfig value.
     */
    public SiteConfigInner siteConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().siteConfig();
    }

    /**
     * Set the siteConfig property: Configuration of the app.
     *
     * @param siteConfig the siteConfig value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withSiteConfig(SiteConfigInner siteConfig) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withSiteConfig(siteConfig);
        return this;
    }

    /**
     * Get the trafficManagerHostNames property: Azure Traffic Manager hostnames associated with the app. Read-only.
     *
     * @return the trafficManagerHostNames value.
     */
    public List<String> trafficManagerHostNames() {
        return this.innerProperties() == null ? null : this.innerProperties().trafficManagerHostNames();
    }

    /**
     * Get the scmSiteAlsoStopped property: &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is
     * stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the scmSiteAlsoStopped value.
     */
    public Boolean scmSiteAlsoStopped() {
        return this.innerProperties() == null ? null : this.innerProperties().scmSiteAlsoStopped();
    }

    /**
     * Set the scmSiteAlsoStopped property: &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is
     * stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     *
     * @param scmSiteAlsoStopped the scmSiteAlsoStopped value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withScmSiteAlsoStopped(scmSiteAlsoStopped);
        return this;
    }

    /**
     * Get the targetSwapSlot property: Specifies which deployment slot this app will swap into. Read-only.
     *
     * @return the targetSwapSlot value.
     */
    public String targetSwapSlot() {
        return this.innerProperties() == null ? null : this.innerProperties().targetSwapSlot();
    }

    /**
     * Get the hostingEnvironmentProfile property: App Service Environment to use for the app.
     *
     * @return the hostingEnvironmentProfile value.
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().hostingEnvironmentProfile();
    }

    /**
     * Set the hostingEnvironmentProfile property: App Service Environment to use for the app.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withHostingEnvironmentProfile(hostingEnvironmentProfile);
        return this;
    }

    /**
     * Get the clientAffinityEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client affinity;
     * &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same
     * session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the clientAffinityEnabled value.
     */
    public Boolean clientAffinityEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().clientAffinityEnabled();
    }

    /**
     * Set the clientAffinityEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client affinity;
     * &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same
     * session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     *
     * @param clientAffinityEnabled the clientAffinityEnabled value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withClientAffinityEnabled(Boolean clientAffinityEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withClientAffinityEnabled(clientAffinityEnabled);
        return this;
    }

    /**
     * Get the clientCertEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication
     * (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the clientCertEnabled value.
     */
    public Boolean clientCertEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().clientCertEnabled();
    }

    /**
     * Set the clientCertEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication
     * (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param clientCertEnabled the clientCertEnabled value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withClientCertEnabled(Boolean clientCertEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withClientCertEnabled(clientCertEnabled);
        return this;
    }

    /**
     * Get the clientCertMode property: This composes with ClientCertEnabled setting. - ClientCertEnabled: false means
     * ClientCert is ignored. - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required. -
     * ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     *
     * @return the clientCertMode value.
     */
    public ClientCertMode clientCertMode() {
        return this.innerProperties() == null ? null : this.innerProperties().clientCertMode();
    }

    /**
     * Set the clientCertMode property: This composes with ClientCertEnabled setting. - ClientCertEnabled: false means
     * ClientCert is ignored. - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required. -
     * ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     *
     * @param clientCertMode the clientCertMode value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withClientCertMode(ClientCertMode clientCertMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withClientCertMode(clientCertMode);
        return this;
    }

    /**
     * Get the clientCertExclusionPaths property: client certificate authentication comma-separated exclusion paths.
     *
     * @return the clientCertExclusionPaths value.
     */
    public String clientCertExclusionPaths() {
        return this.innerProperties() == null ? null : this.innerProperties().clientCertExclusionPaths();
    }

    /**
     * Set the clientCertExclusionPaths property: client certificate authentication comma-separated exclusion paths.
     *
     * @param clientCertExclusionPaths the clientCertExclusionPaths value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withClientCertExclusionPaths(String clientCertExclusionPaths) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withClientCertExclusionPaths(clientCertExclusionPaths);
        return this;
    }

    /**
     * Get the hostNamesDisabled property: &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API
     * management process.
     *
     * @return the hostNamesDisabled value.
     */
    public Boolean hostNamesDisabled() {
        return this.innerProperties() == null ? null : this.innerProperties().hostNamesDisabled();
    }

    /**
     * Set the hostNamesDisabled property: &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API
     * management process.
     *
     * @param hostNamesDisabled the hostNamesDisabled value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withHostNamesDisabled(Boolean hostNamesDisabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withHostNamesDisabled(hostNamesDisabled);
        return this;
    }

    /**
     * Get the customDomainVerificationId property: Unique identifier that verifies the custom domains assigned to the
     * app. Customer will add this id to a txt record for verification.
     *
     * @return the customDomainVerificationId value.
     */
    public String customDomainVerificationId() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomainVerificationId();
    }

    /**
     * Set the customDomainVerificationId property: Unique identifier that verifies the custom domains assigned to the
     * app. Customer will add this id to a txt record for verification.
     *
     * @param customDomainVerificationId the customDomainVerificationId value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withCustomDomainVerificationId(String customDomainVerificationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withCustomDomainVerificationId(customDomainVerificationId);
        return this;
    }

    /**
     * Get the outboundIpAddresses property: List of IP addresses that the app uses for outbound connections (e.g.
     * database access). Includes VIPs from tenants that site can be hosted with current settings. Read-only.
     *
     * @return the outboundIpAddresses value.
     */
    public String outboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().outboundIpAddresses();
    }

    /**
     * Get the possibleOutboundIpAddresses property: List of IP addresses that the app uses for outbound connections
     * (e.g. database access). Includes VIPs from all tenants except dataComponent. Read-only.
     *
     * @return the possibleOutboundIpAddresses value.
     */
    public String possibleOutboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().possibleOutboundIpAddresses();
    }

    /**
     * Get the containerSize property: Size of the function container.
     *
     * @return the containerSize value.
     */
    public Integer containerSize() {
        return this.innerProperties() == null ? null : this.innerProperties().containerSize();
    }

    /**
     * Set the containerSize property: Size of the function container.
     *
     * @param containerSize the containerSize value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withContainerSize(Integer containerSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withContainerSize(containerSize);
        return this;
    }

    /**
     * Get the dailyMemoryTimeQuota property: Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     *
     * @return the dailyMemoryTimeQuota value.
     */
    public Integer dailyMemoryTimeQuota() {
        return this.innerProperties() == null ? null : this.innerProperties().dailyMemoryTimeQuota();
    }

    /**
     * Set the dailyMemoryTimeQuota property: Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     *
     * @param dailyMemoryTimeQuota the dailyMemoryTimeQuota value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withDailyMemoryTimeQuota(dailyMemoryTimeQuota);
        return this;
    }

    /**
     * Get the suspendedTill property: App suspended till in case memory-time quota is exceeded.
     *
     * @return the suspendedTill value.
     */
    public OffsetDateTime suspendedTill() {
        return this.innerProperties() == null ? null : this.innerProperties().suspendedTill();
    }

    /**
     * Get the maxNumberOfWorkers property: Maximum number of workers. This only applies to Functions container.
     *
     * @return the maxNumberOfWorkers value.
     */
    public Integer maxNumberOfWorkers() {
        return this.innerProperties() == null ? null : this.innerProperties().maxNumberOfWorkers();
    }

    /**
     * Get the cloningInfo property: If specified during app creation, the app is cloned from a source app.
     *
     * @return the cloningInfo value.
     */
    public CloningInfo cloningInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().cloningInfo();
    }

    /**
     * Set the cloningInfo property: If specified during app creation, the app is cloned from a source app.
     *
     * @param cloningInfo the cloningInfo value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withCloningInfo(CloningInfo cloningInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withCloningInfo(cloningInfo);
        return this;
    }

    /**
     * Get the resourceGroup property: Name of the resource group the app belongs to. Read-only.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGroup();
    }

    /**
     * Get the isDefaultContainer property: &lt;code&gt;true&lt;/code&gt; if the app is a default container; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isDefaultContainer value.
     */
    public Boolean isDefaultContainer() {
        return this.innerProperties() == null ? null : this.innerProperties().isDefaultContainer();
    }

    /**
     * Get the defaultHostname property: Default hostname of the app. Read-only.
     *
     * @return the defaultHostname value.
     */
    public String defaultHostname() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultHostname();
    }

    /**
     * Get the slotSwapStatus property: Status of the last deployment slot swap operation.
     *
     * @return the slotSwapStatus value.
     */
    public SlotSwapStatus slotSwapStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().slotSwapStatus();
    }

    /**
     * Get the httpsOnly property: HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests.
     *
     * @return the httpsOnly value.
     */
    public Boolean httpsOnly() {
        return this.innerProperties() == null ? null : this.innerProperties().httpsOnly();
    }

    /**
     * Set the httpsOnly property: HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests.
     *
     * @param httpsOnly the httpsOnly value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withHttpsOnly(Boolean httpsOnly) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withHttpsOnly(httpsOnly);
        return this;
    }

    /**
     * Get the redundancyMode property: Site redundancy mode.
     *
     * @return the redundancyMode value.
     */
    public RedundancyMode redundancyMode() {
        return this.innerProperties() == null ? null : this.innerProperties().redundancyMode();
    }

    /**
     * Set the redundancyMode property: Site redundancy mode.
     *
     * @param redundancyMode the redundancyMode value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withRedundancyMode(RedundancyMode redundancyMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withRedundancyMode(redundancyMode);
        return this;
    }

    /**
     * Get the inProgressOperationId property: Specifies an operation id if this site has a pending operation.
     *
     * @return the inProgressOperationId value.
     */
    public UUID inProgressOperationId() {
        return this.innerProperties() == null ? null : this.innerProperties().inProgressOperationId();
    }

    /**
     * Get the storageAccountRequired property: Checks if Customer provided storage account is required.
     *
     * @return the storageAccountRequired value.
     */
    public Boolean storageAccountRequired() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountRequired();
    }

    /**
     * Set the storageAccountRequired property: Checks if Customer provided storage account is required.
     *
     * @param storageAccountRequired the storageAccountRequired value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withStorageAccountRequired(Boolean storageAccountRequired) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withStorageAccountRequired(storageAccountRequired);
        return this;
    }

    /**
     * Get the keyVaultReferenceIdentity property: Identity to use for Key Vault Reference authentication.
     *
     * @return the keyVaultReferenceIdentity value.
     */
    public String keyVaultReferenceIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultReferenceIdentity();
    }

    /**
     * Set the keyVaultReferenceIdentity property: Identity to use for Key Vault Reference authentication.
     *
     * @param keyVaultReferenceIdentity the keyVaultReferenceIdentity value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withKeyVaultReferenceIdentity(String keyVaultReferenceIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withKeyVaultReferenceIdentity(keyVaultReferenceIdentity);
        return this;
    }

    /**
     * Get the virtualNetworkSubnetId property: Azure Resource Manager ID of the Virtual network and subnet to be joined
     * by Regional VNET Integration. This must be of the form
     * /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     *
     * @return the virtualNetworkSubnetId value.
     */
    public String virtualNetworkSubnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkSubnetId();
    }

    /**
     * Set the virtualNetworkSubnetId property: Azure Resource Manager ID of the Virtual network and subnet to be joined
     * by Regional VNET Integration. This must be of the form
     * /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     *
     * @param virtualNetworkSubnetId the virtualNetworkSubnetId value to set.
     * @return the SitePatchResourceInner object itself.
     */
    public SitePatchResourceInner withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePatchResourcePropertiesInner();
        }
        this.innerProperties().withVirtualNetworkSubnetId(virtualNetworkSubnetId);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
