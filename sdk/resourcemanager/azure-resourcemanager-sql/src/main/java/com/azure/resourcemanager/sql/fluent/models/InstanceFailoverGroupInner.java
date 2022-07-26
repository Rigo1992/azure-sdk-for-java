// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.InstanceFailoverGroupReadOnlyEndpoint;
import com.azure.resourcemanager.sql.models.InstanceFailoverGroupReadWriteEndpoint;
import com.azure.resourcemanager.sql.models.InstanceFailoverGroupReplicationRole;
import com.azure.resourcemanager.sql.models.ManagedInstancePairInfo;
import com.azure.resourcemanager.sql.models.PartnerRegionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An instance failover group. */
@Fluent
public final class InstanceFailoverGroupInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private InstanceFailoverGroupProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private InstanceFailoverGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     *
     * @return the readWriteEndpoint value.
     */
    public InstanceFailoverGroupReadWriteEndpoint readWriteEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().readWriteEndpoint();
    }

    /**
     * Set the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     *
     * @param readWriteEndpoint the readWriteEndpoint value to set.
     * @return the InstanceFailoverGroupInner object itself.
     */
    public InstanceFailoverGroupInner withReadWriteEndpoint(InstanceFailoverGroupReadWriteEndpoint readWriteEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InstanceFailoverGroupProperties();
        }
        this.innerProperties().withReadWriteEndpoint(readWriteEndpoint);
        return this;
    }

    /**
     * Get the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     *
     * @return the readOnlyEndpoint value.
     */
    public InstanceFailoverGroupReadOnlyEndpoint readOnlyEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().readOnlyEndpoint();
    }

    /**
     * Set the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     *
     * @param readOnlyEndpoint the readOnlyEndpoint value to set.
     * @return the InstanceFailoverGroupInner object itself.
     */
    public InstanceFailoverGroupInner withReadOnlyEndpoint(InstanceFailoverGroupReadOnlyEndpoint readOnlyEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InstanceFailoverGroupProperties();
        }
        this.innerProperties().withReadOnlyEndpoint(readOnlyEndpoint);
        return this;
    }

    /**
     * Get the replicationRole property: Local replication role of the failover group instance.
     *
     * @return the replicationRole value.
     */
    public InstanceFailoverGroupReplicationRole replicationRole() {
        return this.innerProperties() == null ? null : this.innerProperties().replicationRole();
    }

    /**
     * Get the replicationState property: Replication state of the failover group instance.
     *
     * @return the replicationState value.
     */
    public String replicationState() {
        return this.innerProperties() == null ? null : this.innerProperties().replicationState();
    }

    /**
     * Get the partnerRegions property: Partner region information for the failover group.
     *
     * @return the partnerRegions value.
     */
    public List<PartnerRegionInfo> partnerRegions() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerRegions();
    }

    /**
     * Set the partnerRegions property: Partner region information for the failover group.
     *
     * @param partnerRegions the partnerRegions value to set.
     * @return the InstanceFailoverGroupInner object itself.
     */
    public InstanceFailoverGroupInner withPartnerRegions(List<PartnerRegionInfo> partnerRegions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InstanceFailoverGroupProperties();
        }
        this.innerProperties().withPartnerRegions(partnerRegions);
        return this;
    }

    /**
     * Get the managedInstancePairs property: List of managed instance pairs in the failover group.
     *
     * @return the managedInstancePairs value.
     */
    public List<ManagedInstancePairInfo> managedInstancePairs() {
        return this.innerProperties() == null ? null : this.innerProperties().managedInstancePairs();
    }

    /**
     * Set the managedInstancePairs property: List of managed instance pairs in the failover group.
     *
     * @param managedInstancePairs the managedInstancePairs value to set.
     * @return the InstanceFailoverGroupInner object itself.
     */
    public InstanceFailoverGroupInner withManagedInstancePairs(List<ManagedInstancePairInfo> managedInstancePairs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InstanceFailoverGroupProperties();
        }
        this.innerProperties().withManagedInstancePairs(managedInstancePairs);
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
