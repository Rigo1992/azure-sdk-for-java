// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FirewallResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.LogSettingsInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of FirewallResource. */
public interface FirewallResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: The managed service identities assigned to this resource.
     *
     * @return the identity value.
     */
    AzureResourceManagerManagedIdentityProperties identity();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the panEtag property: panEtag info.
     *
     * @return the panEtag value.
     */
    String panEtag();

    /**
     * Gets the networkProfile property: Network settings.
     *
     * @return the networkProfile value.
     */
    NetworkProfile networkProfile();

    /**
     * Gets the isPanoramaManaged property: Panorama Managed: Default is False. Default will be CloudSec managed.
     *
     * @return the isPanoramaManaged value.
     */
    BooleanEnum isPanoramaManaged();

    /**
     * Gets the panoramaConfig property: Panorama Configuration.
     *
     * @return the panoramaConfig value.
     */
    PanoramaConfig panoramaConfig();

    /**
     * Gets the associatedRulestack property: Associated Rulestack.
     *
     * @return the associatedRulestack value.
     */
    RulestackDetails associatedRulestack();

    /**
     * Gets the dnsSettings property: DNS settings for Firewall.
     *
     * @return the dnsSettings value.
     */
    DnsSettings dnsSettings();

    /**
     * Gets the frontEndSettings property: Frontend settings for Firewall.
     *
     * @return the frontEndSettings value.
     */
    List<FrontendSetting> frontEndSettings();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the planData property: Billing plan information.
     *
     * @return the planData value.
     */
    PlanData planData();

    /**
     * Gets the marketplaceDetails property: Marketplace details.
     *
     * @return the marketplaceDetails value.
     */
    MarketplaceDetails marketplaceDetails();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FirewallResourceInner object.
     *
     * @return the inner object.
     */
    FirewallResourceInner innerModel();

    /** The entirety of the FirewallResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithNetworkProfile,
            DefinitionStages.WithDnsSettings,
            DefinitionStages.WithPlanData,
            DefinitionStages.WithMarketplaceDetails,
            DefinitionStages.WithCreate {
    }
    /** The FirewallResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the FirewallResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the FirewallResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the FirewallResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithNetworkProfile withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the FirewallResource definition allowing to specify networkProfile. */
        interface WithNetworkProfile {
            /**
             * Specifies the networkProfile property: Network settings.
             *
             * @param networkProfile Network settings.
             * @return the next definition stage.
             */
            WithDnsSettings withNetworkProfile(NetworkProfile networkProfile);
        }
        /** The stage of the FirewallResource definition allowing to specify dnsSettings. */
        interface WithDnsSettings {
            /**
             * Specifies the dnsSettings property: DNS settings for Firewall.
             *
             * @param dnsSettings DNS settings for Firewall.
             * @return the next definition stage.
             */
            WithPlanData withDnsSettings(DnsSettings dnsSettings);
        }
        /** The stage of the FirewallResource definition allowing to specify planData. */
        interface WithPlanData {
            /**
             * Specifies the planData property: Billing plan information..
             *
             * @param planData Billing plan information.
             * @return the next definition stage.
             */
            WithMarketplaceDetails withPlanData(PlanData planData);
        }
        /** The stage of the FirewallResource definition allowing to specify marketplaceDetails. */
        interface WithMarketplaceDetails {
            /**
             * Specifies the marketplaceDetails property: Marketplace details.
             *
             * @param marketplaceDetails Marketplace details.
             * @return the next definition stage.
             */
            WithCreate withMarketplaceDetails(MarketplaceDetails marketplaceDetails);
        }
        /**
         * The stage of the FirewallResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithPanEtag,
                DefinitionStages.WithIsPanoramaManaged,
                DefinitionStages.WithPanoramaConfig,
                DefinitionStages.WithAssociatedRulestack,
                DefinitionStages.WithFrontEndSettings {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            FirewallResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FirewallResource create(Context context);
        }
        /** The stage of the FirewallResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the FirewallResource definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed service identities assigned to this resource..
             *
             * @param identity The managed service identities assigned to this resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(AzureResourceManagerManagedIdentityProperties identity);
        }
        /** The stage of the FirewallResource definition allowing to specify panEtag. */
        interface WithPanEtag {
            /**
             * Specifies the panEtag property: panEtag info.
             *
             * @param panEtag panEtag info.
             * @return the next definition stage.
             */
            WithCreate withPanEtag(String panEtag);
        }
        /** The stage of the FirewallResource definition allowing to specify isPanoramaManaged. */
        interface WithIsPanoramaManaged {
            /**
             * Specifies the isPanoramaManaged property: Panorama Managed: Default is False. Default will be CloudSec
             * managed.
             *
             * @param isPanoramaManaged Panorama Managed: Default is False. Default will be CloudSec managed.
             * @return the next definition stage.
             */
            WithCreate withIsPanoramaManaged(BooleanEnum isPanoramaManaged);
        }
        /** The stage of the FirewallResource definition allowing to specify panoramaConfig. */
        interface WithPanoramaConfig {
            /**
             * Specifies the panoramaConfig property: Panorama Configuration.
             *
             * @param panoramaConfig Panorama Configuration.
             * @return the next definition stage.
             */
            WithCreate withPanoramaConfig(PanoramaConfig panoramaConfig);
        }
        /** The stage of the FirewallResource definition allowing to specify associatedRulestack. */
        interface WithAssociatedRulestack {
            /**
             * Specifies the associatedRulestack property: Associated Rulestack.
             *
             * @param associatedRulestack Associated Rulestack.
             * @return the next definition stage.
             */
            WithCreate withAssociatedRulestack(RulestackDetails associatedRulestack);
        }
        /** The stage of the FirewallResource definition allowing to specify frontEndSettings. */
        interface WithFrontEndSettings {
            /**
             * Specifies the frontEndSettings property: Frontend settings for Firewall.
             *
             * @param frontEndSettings Frontend settings for Firewall.
             * @return the next definition stage.
             */
            WithCreate withFrontEndSettings(List<FrontendSetting> frontEndSettings);
        }
    }
    /**
     * Begins update for the FirewallResource resource.
     *
     * @return the stage of resource update.
     */
    FirewallResource.Update update();

    /** The template for FirewallResource update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        FirewallResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FirewallResource apply(Context context);
    }
    /** The FirewallResource update stages. */
    interface UpdateStages {
        /** The stage of the FirewallResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the FirewallResource update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed service identities assigned to this resource..
             *
             * @param identity The managed service identities assigned to this resource.
             * @return the next definition stage.
             */
            Update withIdentity(AzureResourceManagerManagedIdentityProperties identity);
        }
        /** The stage of the FirewallResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The updatable properties of the FirewallResource..
             *
             * @param properties The updatable properties of the FirewallResource.
             * @return the next definition stage.
             */
            Update withProperties(FirewallResourceUpdateProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    FirewallResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FirewallResource refresh(Context context);

    /**
     * Get Global Rulestack associated with the Firewall.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return global Rulestack associated with the Firewall along with {@link Response}.
     */
    Response<GlobalRulestackInfo> getGlobalRulestackWithResponse(Context context);

    /**
     * Get Global Rulestack associated with the Firewall.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return global Rulestack associated with the Firewall.
     */
    GlobalRulestackInfo getGlobalRulestack();

    /**
     * Log Profile for Firewall.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log Settings for Firewall along with {@link Response}.
     */
    Response<LogSettings> getLogProfileWithResponse(Context context);

    /**
     * Log Profile for Firewall.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log Settings for Firewall.
     */
    LogSettings getLogProfile();

    /**
     * support info for firewall.
     *
     * @param email email address on behalf of which this API called.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return support information for the resource along with {@link Response}.
     */
    Response<SupportInfo> getSupportInfoWithResponse(String email, Context context);

    /**
     * support info for firewall.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return support information for the resource.
     */
    SupportInfo getSupportInfo();

    /**
     * Log Profile for Firewall.
     *
     * @param logSettings Log Settings for Firewall.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> saveLogProfileWithResponse(LogSettingsInner logSettings, Context context);

    /**
     * Log Profile for Firewall.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void saveLogProfile();
}
