// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.models.HealthStatus;
import com.azure.resourcemanager.devcenter.models.HealthStatusDetail;
import com.azure.resourcemanager.devcenter.models.LicenseType;
import com.azure.resourcemanager.devcenter.models.LocalAdminStatus;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import com.azure.resourcemanager.devcenter.models.SingleSignOnStatus;
import com.azure.resourcemanager.devcenter.models.StopOnDisconnectConfiguration;
import com.azure.resourcemanager.devcenter.models.VirtualNetworkType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * A pool of Virtual Machines.
 */
@Fluent
public final class PoolInner extends Resource {
    /*
     * Pool properties
     */
    @JsonProperty(value = "properties")
    private PoolProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of PoolInner class.
     */
    public PoolInner() {
    }

    /**
     * Get the innerProperties property: Pool properties.
     * 
     * @return the innerProperties value.
     */
    private PoolProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the healthStatus property: Overall health status of the Pool. Indicates whether or not the Pool is available
     * to create Dev Boxes.
     * 
     * @return the healthStatus value.
     */
    public HealthStatus healthStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().healthStatus();
    }

    /**
     * Get the healthStatusDetails property: Details on the Pool health status to help diagnose issues. This is only
     * populated when the pool status indicates the pool is in a non-healthy state.
     * 
     * @return the healthStatusDetails value.
     */
    public List<HealthStatusDetail> healthStatusDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().healthStatusDetails();
    }

    /**
     * Get the devBoxCount property: Indicates the number of provisioned Dev Boxes in this pool.
     * 
     * @return the devBoxCount value.
     */
    public Integer devBoxCount() {
        return this.innerProperties() == null ? null : this.innerProperties().devBoxCount();
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
     * 
     * @return the devBoxDefinitionName value.
     */
    public String devBoxDefinitionName() {
        return this.innerProperties() == null ? null : this.innerProperties().devBoxDefinitionName();
    }

    /**
     * Set the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
     * 
     * @param devBoxDefinitionName the devBoxDefinitionName value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withDevBoxDefinitionName(String devBoxDefinitionName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withDevBoxDefinitionName(devBoxDefinitionName);
        return this;
    }

    /**
     * Get the networkConnectionName property: Name of a Network Connection in parent Project of this Pool.
     * 
     * @return the networkConnectionName value.
     */
    public String networkConnectionName() {
        return this.innerProperties() == null ? null : this.innerProperties().networkConnectionName();
    }

    /**
     * Set the networkConnectionName property: Name of a Network Connection in parent Project of this Pool.
     * 
     * @param networkConnectionName the networkConnectionName value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withNetworkConnectionName(String networkConnectionName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withNetworkConnectionName(networkConnectionName);
        return this;
    }

    /**
     * Get the licenseType property: Specifies the license type indicating the caller has already acquired licenses for
     * the Dev Boxes that will be created.
     * 
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseType();
    }

    /**
     * Set the licenseType property: Specifies the license type indicating the caller has already acquired licenses for
     * the Dev Boxes that will be created.
     * 
     * @param licenseType the licenseType value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withLicenseType(LicenseType licenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withLicenseType(licenseType);
        return this;
    }

    /**
     * Get the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added as local
     * administrators on the Dev Box.
     * 
     * @return the localAdministrator value.
     */
    public LocalAdminStatus localAdministrator() {
        return this.innerProperties() == null ? null : this.innerProperties().localAdministrator();
    }

    /**
     * Set the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added as local
     * administrators on the Dev Box.
     * 
     * @param localAdministrator the localAdministrator value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withLocalAdministrator(LocalAdminStatus localAdministrator) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withLocalAdministrator(localAdministrator);
        return this;
    }

    /**
     * Get the stopOnDisconnect property: Stop on disconnect configuration settings for Dev Boxes created in this pool.
     * 
     * @return the stopOnDisconnect value.
     */
    public StopOnDisconnectConfiguration stopOnDisconnect() {
        return this.innerProperties() == null ? null : this.innerProperties().stopOnDisconnect();
    }

    /**
     * Set the stopOnDisconnect property: Stop on disconnect configuration settings for Dev Boxes created in this pool.
     * 
     * @param stopOnDisconnect the stopOnDisconnect value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withStopOnDisconnect(StopOnDisconnectConfiguration stopOnDisconnect) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withStopOnDisconnect(stopOnDisconnect);
        return this;
    }

    /**
     * Get the singleSignOnStatus property: Indicates whether Dev Boxes in this pool are created with single sign on
     * enabled. The also requires that single sign on be enabled on the tenant.
     * 
     * @return the singleSignOnStatus value.
     */
    public SingleSignOnStatus singleSignOnStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().singleSignOnStatus();
    }

    /**
     * Set the singleSignOnStatus property: Indicates whether Dev Boxes in this pool are created with single sign on
     * enabled. The also requires that single sign on be enabled on the tenant.
     * 
     * @param singleSignOnStatus the singleSignOnStatus value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withSingleSignOnStatus(SingleSignOnStatus singleSignOnStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withSingleSignOnStatus(singleSignOnStatus);
        return this;
    }

    /**
     * Get the displayName property: The display name of the pool.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the pool.
     * 
     * @param displayName the displayName value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the virtualNetworkType property: Indicates whether the pool uses a Virtual Network managed by Microsoft or a
     * customer provided network.
     * 
     * @return the virtualNetworkType value.
     */
    public VirtualNetworkType virtualNetworkType() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkType();
    }

    /**
     * Set the virtualNetworkType property: Indicates whether the pool uses a Virtual Network managed by Microsoft or a
     * customer provided network.
     * 
     * @param virtualNetworkType the virtualNetworkType value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withVirtualNetworkType(VirtualNetworkType virtualNetworkType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withVirtualNetworkType(virtualNetworkType);
        return this;
    }

    /**
     * Get the managedVirtualNetworkRegions property: The regions of the managed virtual network (required when
     * managedNetworkType is Managed).
     * 
     * @return the managedVirtualNetworkRegions value.
     */
    public List<String> managedVirtualNetworkRegions() {
        return this.innerProperties() == null ? null : this.innerProperties().managedVirtualNetworkRegions();
    }

    /**
     * Set the managedVirtualNetworkRegions property: The regions of the managed virtual network (required when
     * managedNetworkType is Managed).
     * 
     * @param managedVirtualNetworkRegions the managedVirtualNetworkRegions value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withManagedVirtualNetworkRegions(List<String> managedVirtualNetworkRegions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withManagedVirtualNetworkRegions(managedVirtualNetworkRegions);
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
