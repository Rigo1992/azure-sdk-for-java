// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.vmwarecloudsimple.models.PrivateCloudResourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Private cloud model. */
@Fluent
public final class PrivateCloudInner {
    /*
     * Azure Id, e.g.
     * "/subscriptions/4da99247-a172-4ed6-8ae9-ebed2d12f839/providers/Microsoft.VMwareCloudSimple/privateClouds"
         + "/cloud123"
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Location where private cloud created, e.g "westus"
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Private cloud name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Private cloud properties
     */
    @JsonProperty(value = "properties")
    private PrivateCloudProperties innerProperties;

    /*
     * Azure Resource type
     */
    @JsonProperty(value = "type")
    private PrivateCloudResourceType type;

    /** Creates an instance of PrivateCloudInner class. */
    public PrivateCloudInner() {
    }

    /**
     * Get the id property: Azure Id, e.g.
     * "/subscriptions/4da99247-a172-4ed6-8ae9-ebed2d12f839/providers/Microsoft.VMwareCloudSimple/privateClouds"
         + "/cloud123".
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Azure Id, e.g.
     * "/subscriptions/4da99247-a172-4ed6-8ae9-ebed2d12f839/providers/Microsoft.VMwareCloudSimple/privateClouds"
         + "/cloud123".
     *
     * @param id the id value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the location property: Location where private cloud created, e.g "westus".
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location where private cloud created, e.g "westus".
     *
     * @param location the location value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the name property: Private cloud name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Private cloud name.
     *
     * @param name the name value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Private cloud properties.
     *
     * @return the innerProperties value.
     */
    private PrivateCloudProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: Azure Resource type.
     *
     * @return the type value.
     */
    public PrivateCloudResourceType type() {
        return this.type;
    }

    /**
     * Set the type property: Azure Resource type.
     *
     * @param type the type value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withType(PrivateCloudResourceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the availabilityZoneId property: Availability Zone id, e.g. "az1".
     *
     * @return the availabilityZoneId value.
     */
    public String availabilityZoneId() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityZoneId();
    }

    /**
     * Set the availabilityZoneId property: Availability Zone id, e.g. "az1".
     *
     * @param availabilityZoneId the availabilityZoneId value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withAvailabilityZoneId(String availabilityZoneId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * Get the availabilityZoneName property: Availability Zone name, e.g. "Availability Zone 1".
     *
     * @return the availabilityZoneName value.
     */
    public String availabilityZoneName() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityZoneName();
    }

    /**
     * Set the availabilityZoneName property: Availability Zone name, e.g. "Availability Zone 1".
     *
     * @param availabilityZoneName the availabilityZoneName value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withAvailabilityZoneName(String availabilityZoneName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withAvailabilityZoneName(availabilityZoneName);
        return this;
    }

    /**
     * Get the clustersNumber property: Number of clusters.
     *
     * @return the clustersNumber value.
     */
    public Integer clustersNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().clustersNumber();
    }

    /**
     * Set the clustersNumber property: Number of clusters.
     *
     * @param clustersNumber the clustersNumber value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withClustersNumber(Integer clustersNumber) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withClustersNumber(clustersNumber);
        return this;
    }

    /**
     * Get the createdBy property: User's emails who created cloud.
     *
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.innerProperties() == null ? null : this.innerProperties().createdBy();
    }

    /**
     * Set the createdBy property: User's emails who created cloud.
     *
     * @param createdBy the createdBy value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withCreatedBy(String createdBy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withCreatedBy(createdBy);
        return this;
    }

    /**
     * Get the createdOn property: When private cloud was created.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Set the createdOn property: When private cloud was created.
     *
     * @param createdOn the createdOn value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withCreatedOn(OffsetDateTime createdOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withCreatedOn(createdOn);
        return this;
    }

    /**
     * Get the dnsServers property: Array of DNS servers.
     *
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsServers();
    }

    /**
     * Set the dnsServers property: Array of DNS servers.
     *
     * @param dnsServers the dnsServers value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withDnsServers(List<String> dnsServers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withDnsServers(dnsServers);
        return this;
    }

    /**
     * Get the expires property: Expiration date of PC.
     *
     * @return the expires value.
     */
    public String expires() {
        return this.innerProperties() == null ? null : this.innerProperties().expires();
    }

    /**
     * Set the expires property: Expiration date of PC.
     *
     * @param expires the expires value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withExpires(String expires) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withExpires(expires);
        return this;
    }

    /**
     * Get the nsxType property: Nsx Type, e.g. "Advanced".
     *
     * @return the nsxType value.
     */
    public String nsxType() {
        return this.innerProperties() == null ? null : this.innerProperties().nsxType();
    }

    /**
     * Set the nsxType property: Nsx Type, e.g. "Advanced".
     *
     * @param nsxType the nsxType value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withNsxType(String nsxType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withNsxType(nsxType);
        return this;
    }

    /**
     * Get the placementGroupId property: Placement Group id, e.g. "n1".
     *
     * @return the placementGroupId value.
     */
    public String placementGroupId() {
        return this.innerProperties() == null ? null : this.innerProperties().placementGroupId();
    }

    /**
     * Set the placementGroupId property: Placement Group id, e.g. "n1".
     *
     * @param placementGroupId the placementGroupId value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withPlacementGroupId(String placementGroupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withPlacementGroupId(placementGroupId);
        return this;
    }

    /**
     * Get the placementGroupName property: Placement Group name.
     *
     * @return the placementGroupName value.
     */
    public String placementGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().placementGroupName();
    }

    /**
     * Set the placementGroupName property: Placement Group name.
     *
     * @param placementGroupName the placementGroupName value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withPlacementGroupName(String placementGroupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withPlacementGroupName(placementGroupName);
        return this;
    }

    /**
     * Get the privateCloudId property: Id of a private cloud.
     *
     * @return the privateCloudId value.
     */
    public UUID privateCloudId() {
        return this.innerProperties() == null ? null : this.innerProperties().privateCloudId();
    }

    /**
     * Set the privateCloudId property: Id of a private cloud.
     *
     * @param privateCloudId the privateCloudId value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withPrivateCloudId(UUID privateCloudId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withPrivateCloudId(privateCloudId);
        return this;
    }

    /**
     * Get the resourcePools property: The list of Resource Pools.
     *
     * @return the resourcePools value.
     */
    public List<ResourcePoolInner> resourcePools() {
        return this.innerProperties() == null ? null : this.innerProperties().resourcePools();
    }

    /**
     * Set the resourcePools property: The list of Resource Pools.
     *
     * @param resourcePools the resourcePools value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withResourcePools(List<ResourcePoolInner> resourcePools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withResourcePools(resourcePools);
        return this;
    }

    /**
     * Get the state property: Private Cloud state, e.g. "operational".
     *
     * @return the state value.
     */
    public String state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Private Cloud state, e.g. "operational".
     *
     * @param state the state value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withState(String state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the totalCpuCores property: Number of cores.
     *
     * @return the totalCpuCores value.
     */
    public Integer totalCpuCores() {
        return this.innerProperties() == null ? null : this.innerProperties().totalCpuCores();
    }

    /**
     * Set the totalCpuCores property: Number of cores.
     *
     * @param totalCpuCores the totalCpuCores value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalCpuCores(Integer totalCpuCores) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withTotalCpuCores(totalCpuCores);
        return this;
    }

    /**
     * Get the totalNodes property: Number of nodes.
     *
     * @return the totalNodes value.
     */
    public Integer totalNodes() {
        return this.innerProperties() == null ? null : this.innerProperties().totalNodes();
    }

    /**
     * Set the totalNodes property: Number of nodes.
     *
     * @param totalNodes the totalNodes value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalNodes(Integer totalNodes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withTotalNodes(totalNodes);
        return this;
    }

    /**
     * Get the totalRam property: Memory size.
     *
     * @return the totalRam value.
     */
    public Integer totalRam() {
        return this.innerProperties() == null ? null : this.innerProperties().totalRam();
    }

    /**
     * Set the totalRam property: Memory size.
     *
     * @param totalRam the totalRam value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalRam(Integer totalRam) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withTotalRam(totalRam);
        return this;
    }

    /**
     * Get the totalStorage property: Disk space in TB.
     *
     * @return the totalStorage value.
     */
    public Float totalStorage() {
        return this.innerProperties() == null ? null : this.innerProperties().totalStorage();
    }

    /**
     * Set the totalStorage property: Disk space in TB.
     *
     * @param totalStorage the totalStorage value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalStorage(Float totalStorage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withTotalStorage(totalStorage);
        return this;
    }

    /**
     * Get the type property: Virtualization type e.g. "vSphere".
     *
     * @return the type value.
     */
    public String typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Virtualization type e.g. "vSphere".
     *
     * @param type the type value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTypePropertiesType(String type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the vSphereVersion property: e.g. "6.5u2".
     *
     * @return the vSphereVersion value.
     */
    public String vSphereVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().vSphereVersion();
    }

    /**
     * Set the vSphereVersion property: e.g. "6.5u2".
     *
     * @param vSphereVersion the vSphereVersion value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVSphereVersion(String vSphereVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withVSphereVersion(vSphereVersion);
        return this;
    }

    /**
     * Get the vcenterFqdn property: FQDN for vcenter access.
     *
     * @return the vcenterFqdn value.
     */
    public String vcenterFqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().vcenterFqdn();
    }

    /**
     * Set the vcenterFqdn property: FQDN for vcenter access.
     *
     * @param vcenterFqdn the vcenterFqdn value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVcenterFqdn(String vcenterFqdn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withVcenterFqdn(vcenterFqdn);
        return this;
    }

    /**
     * Get the vcenterRefid property: Vcenter ip address.
     *
     * @return the vcenterRefid value.
     */
    public String vcenterRefid() {
        return this.innerProperties() == null ? null : this.innerProperties().vcenterRefid();
    }

    /**
     * Set the vcenterRefid property: Vcenter ip address.
     *
     * @param vcenterRefid the vcenterRefid value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVcenterRefid(String vcenterRefid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withVcenterRefid(vcenterRefid);
        return this;
    }

    /**
     * Get the virtualMachineTemplates property: The list of Virtual Machine Templates.
     *
     * @return the virtualMachineTemplates value.
     */
    public List<VirtualMachineTemplateInner> virtualMachineTemplates() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachineTemplates();
    }

    /**
     * Set the virtualMachineTemplates property: The list of Virtual Machine Templates.
     *
     * @param virtualMachineTemplates the virtualMachineTemplates value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVirtualMachineTemplates(List<VirtualMachineTemplateInner> virtualMachineTemplates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withVirtualMachineTemplates(virtualMachineTemplates);
        return this;
    }

    /**
     * Get the virtualNetworks property: The list of Virtual Networks.
     *
     * @return the virtualNetworks value.
     */
    public List<VirtualNetworkInner> virtualNetworks() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworks();
    }

    /**
     * Set the virtualNetworks property: The list of Virtual Networks.
     *
     * @param virtualNetworks the virtualNetworks value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVirtualNetworks(List<VirtualNetworkInner> virtualNetworks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withVirtualNetworks(virtualNetworks);
        return this;
    }

    /**
     * Get the vrOpsEnabled property: Is vRealize Operations Manager enabled/disabled.
     *
     * @return the vrOpsEnabled value.
     */
    public Boolean vrOpsEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().vrOpsEnabled();
    }

    /**
     * Set the vrOpsEnabled property: Is vRealize Operations Manager enabled/disabled.
     *
     * @param vrOpsEnabled the vrOpsEnabled value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVrOpsEnabled(Boolean vrOpsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudProperties();
        }
        this.innerProperties().withVrOpsEnabled(vrOpsEnabled);
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
