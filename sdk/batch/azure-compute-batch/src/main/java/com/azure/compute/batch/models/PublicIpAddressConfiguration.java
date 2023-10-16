// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The public IP Address configuration of the networking configuration of a Pool. */
@Fluent
public final class PublicIpAddressConfiguration {

    /*
     * The provisioning type for Public IP Addresses for the Pool. The default value is BatchManaged.
     */
    @Generated
    @JsonProperty(value = "provision")
    private IpAddressProvisioningType ipAddressProvisioningType;

    /*
     * The list of public IPs which the Batch service will use when provisioning Compute Nodes. The number of IPs
     * specified here limits the maximum size of the Pool - 100 dedicated nodes or 100 Spot/Low-priority nodes can be
     * allocated for each public IP. For example, a pool needing 250 dedicated VMs would need at least 3 public IPs
     * specified. Each element of this collection is of the form:
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     */
    @Generated
    @JsonProperty(value = "ipAddressIds")
    private List<String> ipAddressIds;

    /** Creates an instance of PublicIpAddressConfiguration class. */
    @Generated
    public PublicIpAddressConfiguration() {}

    /**
     * Get the ipAddressProvisioningType property: The provisioning type for Public IP Addresses for the Pool. The
     * default value is BatchManaged.
     *
     * @return the ipAddressProvisioningType value.
     */
    @Generated
    public IpAddressProvisioningType getIpAddressProvisioningType() {
        return this.ipAddressProvisioningType;
    }

    /**
     * Set the ipAddressProvisioningType property: The provisioning type for Public IP Addresses for the Pool. The
     * default value is BatchManaged.
     *
     * @param ipAddressProvisioningType the ipAddressProvisioningType value to set.
     * @return the PublicIpAddressConfiguration object itself.
     */
    @Generated
    public PublicIpAddressConfiguration setIpAddressProvisioningType(
            IpAddressProvisioningType ipAddressProvisioningType) {
        this.ipAddressProvisioningType = ipAddressProvisioningType;
        return this;
    }

    /**
     * Get the ipAddressIds property: The list of public IPs which the Batch service will use when provisioning Compute
     * Nodes. The number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100
     * Spot/Low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would
     * need at least 3 public IPs specified. Each element of this collection is of the form:
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     *
     * @return the ipAddressIds value.
     */
    @Generated
    public List<String> getIpAddressIds() {
        return this.ipAddressIds;
    }

    /**
     * Set the ipAddressIds property: The list of public IPs which the Batch service will use when provisioning Compute
     * Nodes. The number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100
     * Spot/Low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would
     * need at least 3 public IPs specified. Each element of this collection is of the form:
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     *
     * @param ipAddressIds the ipAddressIds value to set.
     * @return the PublicIpAddressConfiguration object itself.
     */
    @Generated
    public PublicIpAddressConfiguration setIpAddressIds(List<String> ipAddressIds) {
        this.ipAddressIds = ipAddressIds;
        return this;
    }
}
