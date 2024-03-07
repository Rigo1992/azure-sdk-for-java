// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.search.models.DataPlaneAuthOptions;
import com.azure.resourcemanager.search.models.EncryptionWithCmk;
import com.azure.resourcemanager.search.models.HostingMode;
import com.azure.resourcemanager.search.models.NetworkRuleSet;
import com.azure.resourcemanager.search.models.ProvisioningState;
import com.azure.resourcemanager.search.models.PublicNetworkAccess;
import com.azure.resourcemanager.search.models.SearchDisabledDataExfiltrationOption;
import com.azure.resourcemanager.search.models.SearchSemanticSearch;
import com.azure.resourcemanager.search.models.SearchServiceStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the search service.
 */
@Fluent
public final class SearchServiceProperties {
    /*
     * The number of replicas in the search service. If specified, it must be a value between 1 and 12 inclusive for
     * standard SKUs or between 1 and 3 inclusive for basic SKU.
     */
    @JsonProperty(value = "replicaCount")
    private Integer replicaCount;

    /*
     * The number of partitions in the search service; if specified, it can be 1, 2, 3, 4, 6, or 12. Values greater
     * than 1 are only valid for standard SKUs. For 'standard3' services with hostingMode set to 'highDensity', the
     * allowed values are between 1 and 3.
     */
    @JsonProperty(value = "partitionCount")
    private Integer partitionCount;

    /*
     * Applicable only for the standard3 SKU. You can set this property to enable up to 3 high density partitions that
     * allow up to 1000 indexes, which is much higher than the maximum indexes allowed for any other SKU. For the
     * standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this value must be 'default'.
     */
    @JsonProperty(value = "hostingMode")
    private HostingMode hostingMode;

    /*
     * This value can be set to 'enabled' to avoid breaking changes on existing customer resources and templates. If
     * set to 'disabled', traffic over public interface is not allowed, and private endpoint connections would be the
     * exclusive access method.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The status of the search service. Possible values include: 'running': The search service is running and no
     * provisioning operations are underway. 'provisioning': The search service is being provisioned or scaled up or
     * down. 'deleting': The search service is being deleted. 'degraded': The search service is degraded. This can
     * occur when the underlying search units are not healthy. The search service is most likely operational, but
     * performance might be slow and some requests might be dropped. 'disabled': The search service is disabled. In
     * this state, the service will reject all API requests. 'error': The search service is in an error state.
     * 'stopped': The search service is in a subscription that's disabled. If your service is in the degraded,
     * disabled, or error states, it means the Azure AI Search team is actively investigating the underlying issue.
     * Dedicated services in these states are still chargeable based on the number of search units provisioned.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private SearchServiceStatus status;

    /*
     * The details of the search service status.
     */
    @JsonProperty(value = "statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /*
     * The state of the last provisioning operation performed on the search service. Provisioning is an intermediate
     * state that occurs while service capacity is being established. After capacity is set up, provisioningState
     * changes to either 'succeeded' or 'failed'. Client applications can poll provisioning status (the recommended
     * polling interval is from 30 seconds to one minute) by using the Get Search Service operation to see when an
     * operation is completed. If you are using the free service, this value tends to come back as 'succeeded' directly
     * in the call to Create search service. This is because the free service uses capacity that is already set up.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Network specific rules that determine how the Azure AI Search service may be reached.
     */
    @JsonProperty(value = "networkRuleSet")
    private NetworkRuleSet networkRuleSet;

    /*
     * A list of data exfiltration scenarios that are explicitly disallowed for the search service. Currently, the only
     * supported value is 'All' to disable all possible data export scenarios with more fine grained controls planned
     * for the future.
     */
    @JsonProperty(value = "disabledDataExfiltrationOptions")
    private List<SearchDisabledDataExfiltrationOption> disabledDataExfiltrationOptions;

    /*
     * Specifies any policy regarding encryption of resources (such as indexes) using customer manager keys within a
     * search service.
     */
    @JsonProperty(value = "encryptionWithCmk")
    private EncryptionWithCmk encryptionWithCmk;

    /*
     * When set to true, calls to the search service will not be permitted to utilize API keys for authentication. This
     * cannot be set to true if 'dataPlaneAuthOptions' are defined.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * Defines the options for how the data plane API of a search service authenticates requests. This cannot be set if
     * 'disableLocalAuth' is set to true.
     */
    @JsonProperty(value = "authOptions")
    private DataPlaneAuthOptions authOptions;

    /*
     * Sets options that control the availability of semantic search. This configuration is only possible for certain
     * Azure AI Search SKUs in certain locations.
     */
    @JsonProperty(value = "semanticSearch")
    private SearchSemanticSearch semanticSearch;

    /*
     * The list of private endpoint connections to the Azure AI Search service.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The list of shared private link resources managed by the Azure AI Search service.
     */
    @JsonProperty(value = "sharedPrivateLinkResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources;

    /*
     * A system generated property representing the service's etag that can be for optimistic concurrency control
     * during updates.
     */
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of SearchServiceProperties class.
     */
    public SearchServiceProperties() {
    }

    /**
     * Get the replicaCount property: The number of replicas in the search service. If specified, it must be a value
     * between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
     * 
     * @return the replicaCount value.
     */
    public Integer replicaCount() {
        return this.replicaCount;
    }

    /**
     * Set the replicaCount property: The number of replicas in the search service. If specified, it must be a value
     * between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
     * 
     * @param replicaCount the replicaCount value to set.
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * Get the partitionCount property: The number of partitions in the search service; if specified, it can be 1, 2,
     * 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with
     * hostingMode set to 'highDensity', the allowed values are between 1 and 3.
     * 
     * @return the partitionCount value.
     */
    public Integer partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the partitionCount property: The number of partitions in the search service; if specified, it can be 1, 2,
     * 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with
     * hostingMode set to 'highDensity', the allowed values are between 1 and 3.
     * 
     * @param partitionCount the partitionCount value to set.
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get the hostingMode property: Applicable only for the standard3 SKU. You can set this property to enable up to 3
     * high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for
     * any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this
     * value must be 'default'.
     * 
     * @return the hostingMode value.
     */
    public HostingMode hostingMode() {
        return this.hostingMode;
    }

    /**
     * Set the hostingMode property: Applicable only for the standard3 SKU. You can set this property to enable up to 3
     * high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for
     * any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this
     * value must be 'default'.
     * 
     * @param hostingMode the hostingMode value to set.
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withHostingMode(HostingMode hostingMode) {
        this.hostingMode = hostingMode;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This value can be set to 'enabled' to avoid breaking changes on existing
     * customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and
     * private endpoint connections would be the exclusive access method.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This value can be set to 'enabled' to avoid breaking changes on existing
     * customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and
     * private endpoint connections would be the exclusive access method.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the status property: The status of the search service. Possible values include: 'running': The search
     * service is running and no provisioning operations are underway. 'provisioning': The search service is being
     * provisioned or scaled up or down. 'deleting': The search service is being deleted. 'degraded': The search
     * service is degraded. This can occur when the underlying search units are not healthy. The search service is most
     * likely operational, but performance might be slow and some requests might be dropped. 'disabled': The search
     * service is disabled. In this state, the service will reject all API requests. 'error': The search service is in
     * an error state. 'stopped': The search service is in a subscription that's disabled. If your service is in the
     * degraded, disabled, or error states, it means the Azure AI Search team is actively investigating the underlying
     * issue. Dedicated services in these states are still chargeable based on the number of search units provisioned.
     * 
     * @return the status value.
     */
    public SearchServiceStatus status() {
        return this.status;
    }

    /**
     * Get the statusDetails property: The details of the search service status.
     * 
     * @return the statusDetails value.
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the provisioningState property: The state of the last provisioning operation performed on the search
     * service. Provisioning is an intermediate state that occurs while service capacity is being established. After
     * capacity is set up, provisioningState changes to either 'succeeded' or 'failed'. Client applications can poll
     * provisioning status (the recommended polling interval is from 30 seconds to one minute) by using the Get Search
     * Service operation to see when an operation is completed. If you are using the free service, this value tends to
     * come back as 'succeeded' directly in the call to Create search service. This is because the free service uses
     * capacity that is already set up.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the networkRuleSet property: Network specific rules that determine how the Azure AI Search service may be
     * reached.
     * 
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet property: Network specific rules that determine how the Azure AI Search service may be
     * reached.
     * 
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the disabledDataExfiltrationOptions property: A list of data exfiltration scenarios that are explicitly
     * disallowed for the search service. Currently, the only supported value is 'All' to disable all possible data
     * export scenarios with more fine grained controls planned for the future.
     * 
     * @return the disabledDataExfiltrationOptions value.
     */
    public List<SearchDisabledDataExfiltrationOption> disabledDataExfiltrationOptions() {
        return this.disabledDataExfiltrationOptions;
    }

    /**
     * Set the disabledDataExfiltrationOptions property: A list of data exfiltration scenarios that are explicitly
     * disallowed for the search service. Currently, the only supported value is 'All' to disable all possible data
     * export scenarios with more fine grained controls planned for the future.
     * 
     * @param disabledDataExfiltrationOptions the disabledDataExfiltrationOptions value to set.
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withDisabledDataExfiltrationOptions(
        List<SearchDisabledDataExfiltrationOption> disabledDataExfiltrationOptions) {
        this.disabledDataExfiltrationOptions = disabledDataExfiltrationOptions;
        return this;
    }

    /**
     * Get the encryptionWithCmk property: Specifies any policy regarding encryption of resources (such as indexes)
     * using customer manager keys within a search service.
     * 
     * @return the encryptionWithCmk value.
     */
    public EncryptionWithCmk encryptionWithCmk() {
        return this.encryptionWithCmk;
    }

    /**
     * Set the encryptionWithCmk property: Specifies any policy regarding encryption of resources (such as indexes)
     * using customer manager keys within a search service.
     * 
     * @param encryptionWithCmk the encryptionWithCmk value to set.
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withEncryptionWithCmk(EncryptionWithCmk encryptionWithCmk) {
        this.encryptionWithCmk = encryptionWithCmk;
        return this;
    }

    /**
     * Get the disableLocalAuth property: When set to true, calls to the search service will not be permitted to
     * utilize API keys for authentication. This cannot be set to true if 'dataPlaneAuthOptions' are defined.
     * 
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: When set to true, calls to the search service will not be permitted to
     * utilize API keys for authentication. This cannot be set to true if 'dataPlaneAuthOptions' are defined.
     * 
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the authOptions property: Defines the options for how the data plane API of a search service authenticates
     * requests. This cannot be set if 'disableLocalAuth' is set to true.
     * 
     * @return the authOptions value.
     */
    public DataPlaneAuthOptions authOptions() {
        return this.authOptions;
    }

    /**
     * Set the authOptions property: Defines the options for how the data plane API of a search service authenticates
     * requests. This cannot be set if 'disableLocalAuth' is set to true.
     * 
     * @param authOptions the authOptions value to set.
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withAuthOptions(DataPlaneAuthOptions authOptions) {
        this.authOptions = authOptions;
        return this;
    }

    /**
     * Get the semanticSearch property: Sets options that control the availability of semantic search. This
     * configuration is only possible for certain Azure AI Search SKUs in certain locations.
     * 
     * @return the semanticSearch value.
     */
    public SearchSemanticSearch semanticSearch() {
        return this.semanticSearch;
    }

    /**
     * Set the semanticSearch property: Sets options that control the availability of semantic search. This
     * configuration is only possible for certain Azure AI Search SKUs in certain locations.
     * 
     * @param semanticSearch the semanticSearch value to set.
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withSemanticSearch(SearchSemanticSearch semanticSearch) {
        this.semanticSearch = semanticSearch;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: The list of private endpoint connections to the Azure AI Search
     * service.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the sharedPrivateLinkResources property: The list of shared private link resources managed by the Azure AI
     * Search service.
     * 
     * @return the sharedPrivateLinkResources value.
     */
    public List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }

    /**
     * Get the etag property: A system generated property representing the service's etag that can be for optimistic
     * concurrency control during updates.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkRuleSet() != null) {
            networkRuleSet().validate();
        }
        if (encryptionWithCmk() != null) {
            encryptionWithCmk().validate();
        }
        if (authOptions() != null) {
            authOptions().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (sharedPrivateLinkResources() != null) {
            sharedPrivateLinkResources().forEach(e -> e.validate());
        }
    }
}
