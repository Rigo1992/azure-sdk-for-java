// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.notificationhubs.models.NamespaceStatus;
import com.azure.resourcemanager.notificationhubs.models.NamespaceType;
import com.azure.resourcemanager.notificationhubs.models.NetworkAcls;
import com.azure.resourcemanager.notificationhubs.models.OperationProvisioningState;
import com.azure.resourcemanager.notificationhubs.models.PublicNetworkAccess;
import com.azure.resourcemanager.notificationhubs.models.ReplicationRegion;
import com.azure.resourcemanager.notificationhubs.models.ZoneRedundancyPreference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Represents namespace properties.
 */
@Fluent
public final class NamespaceProperties {
    /*
     * Name of the Notification Hubs namespace. This is immutable property, set automatically
     * by the service when the namespace is created.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Defines values for OperationProvisioningState.
     */
    @JsonProperty(value = "provisioningState")
    private OperationProvisioningState provisioningState;

    /*
     * Namespace status.
     */
    @JsonProperty(value = "status")
    private NamespaceStatus status;

    /*
     * Gets or sets whether or not the namespace is currently enabled.
     */
    @JsonProperty(value = "enabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean enabled;

    /*
     * Gets or sets whether or not the namespace is set as Critical.
     */
    @JsonProperty(value = "critical", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean critical;

    /*
     * Namespace subscription id.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * Region. The value is always set to the same value as Namespace.Location, so we are deprecating
     * this property.
     */
    @JsonProperty(value = "region", access = JsonProperty.Access.WRITE_ONLY)
    private String region;

    /*
     * Azure Insights Metrics id.
     */
    @JsonProperty(value = "metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /*
     * Time when the namespace was created.
     */
    @JsonProperty(value = "createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * Time when the namespace was updated.
     */
    @JsonProperty(value = "updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Defines values for NamespaceType.
     */
    @JsonProperty(value = "namespaceType")
    private NamespaceType namespaceType;

    /*
     * Allowed replication region
     */
    @JsonProperty(value = "replicationRegion")
    private ReplicationRegion replicationRegion;

    /*
     * Namespace SKU name.
     */
    @JsonProperty(value = "zoneRedundancy")
    private ZoneRedundancyPreference zoneRedundancy;

    /*
     * A collection of network authorization rules.
     */
    @JsonProperty(value = "networkAcls")
    private NetworkAcls networkAcls;

    /*
     * Collection of Notification Hub or Notification Hub Namespace PNS credentials.
     */
    @JsonProperty(value = "pnsCredentials")
    private PnsCredentials pnsCredentials;

    /*
     * Gets or sets endpoint you can use to perform NotificationHub
     * operations.
     */
    @JsonProperty(value = "serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /*
     * Private Endpoint Connections for namespace
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionResourceInner> privateEndpointConnections;

    /*
     * Gets or sets scaleUnit where the namespace gets created
     */
    @JsonProperty(value = "scaleUnit")
    private String scaleUnit;

    /*
     * Deprecated.
     */
    @JsonProperty(value = "dataCenter")
    private String dataCenter;

    /*
     * Type of public network access.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Creates an instance of NamespaceProperties class.
     */
    public NamespaceProperties() {
    }

    /**
     * Get the name property: Name of the Notification Hubs namespace. This is immutable property, set automatically
     * by the service when the namespace is created.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the provisioningState property: Defines values for OperationProvisioningState.
     * 
     * @return the provisioningState value.
     */
    public OperationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Defines values for OperationProvisioningState.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withProvisioningState(OperationProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the status property: Namespace status.
     * 
     * @return the status value.
     */
    public NamespaceStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Namespace status.
     * 
     * @param status the status value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withStatus(NamespaceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the enabled property: Gets or sets whether or not the namespace is currently enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Get the critical property: Gets or sets whether or not the namespace is set as Critical.
     * 
     * @return the critical value.
     */
    public Boolean critical() {
        return this.critical;
    }

    /**
     * Get the subscriptionId property: Namespace subscription id.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the region property: Region. The value is always set to the same value as Namespace.Location, so we are
     * deprecating
     * this property.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Get the metricId property: Azure Insights Metrics id.
     * 
     * @return the metricId value.
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get the createdAt property: Time when the namespace was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: Time when the namespace was updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the namespaceType property: Defines values for NamespaceType.
     * 
     * @return the namespaceType value.
     */
    public NamespaceType namespaceType() {
        return this.namespaceType;
    }

    /**
     * Set the namespaceType property: Defines values for NamespaceType.
     * 
     * @param namespaceType the namespaceType value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withNamespaceType(NamespaceType namespaceType) {
        this.namespaceType = namespaceType;
        return this;
    }

    /**
     * Get the replicationRegion property: Allowed replication region.
     * 
     * @return the replicationRegion value.
     */
    public ReplicationRegion replicationRegion() {
        return this.replicationRegion;
    }

    /**
     * Set the replicationRegion property: Allowed replication region.
     * 
     * @param replicationRegion the replicationRegion value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withReplicationRegion(ReplicationRegion replicationRegion) {
        this.replicationRegion = replicationRegion;
        return this;
    }

    /**
     * Get the zoneRedundancy property: Namespace SKU name.
     * 
     * @return the zoneRedundancy value.
     */
    public ZoneRedundancyPreference zoneRedundancy() {
        return this.zoneRedundancy;
    }

    /**
     * Set the zoneRedundancy property: Namespace SKU name.
     * 
     * @param zoneRedundancy the zoneRedundancy value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withZoneRedundancy(ZoneRedundancyPreference zoneRedundancy) {
        this.zoneRedundancy = zoneRedundancy;
        return this;
    }

    /**
     * Get the networkAcls property: A collection of network authorization rules.
     * 
     * @return the networkAcls value.
     */
    public NetworkAcls networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set the networkAcls property: A collection of network authorization rules.
     * 
     * @param networkAcls the networkAcls value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withNetworkAcls(NetworkAcls networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Get the pnsCredentials property: Collection of Notification Hub or Notification Hub Namespace PNS credentials.
     * 
     * @return the pnsCredentials value.
     */
    public PnsCredentials pnsCredentials() {
        return this.pnsCredentials;
    }

    /**
     * Set the pnsCredentials property: Collection of Notification Hub or Notification Hub Namespace PNS credentials.
     * 
     * @param pnsCredentials the pnsCredentials value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withPnsCredentials(PnsCredentials pnsCredentials) {
        this.pnsCredentials = pnsCredentials;
        return this;
    }

    /**
     * Get the serviceBusEndpoint property: Gets or sets endpoint you can use to perform NotificationHub
     * operations.
     * 
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get the privateEndpointConnections property: Private Endpoint Connections for namespace.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionResourceInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the scaleUnit property: Gets or sets scaleUnit where the namespace gets created.
     * 
     * @return the scaleUnit value.
     */
    public String scaleUnit() {
        return this.scaleUnit;
    }

    /**
     * Set the scaleUnit property: Gets or sets scaleUnit where the namespace gets created.
     * 
     * @param scaleUnit the scaleUnit value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withScaleUnit(String scaleUnit) {
        this.scaleUnit = scaleUnit;
        return this;
    }

    /**
     * Get the dataCenter property: Deprecated.
     * 
     * @return the dataCenter value.
     */
    public String dataCenter() {
        return this.dataCenter;
    }

    /**
     * Set the dataCenter property: Deprecated.
     * 
     * @param dataCenter the dataCenter value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Type of public network access.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Type of public network access.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkAcls() != null) {
            networkAcls().validate();
        }
        if (pnsCredentials() != null) {
            pnsCredentials().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
