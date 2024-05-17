// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The Defender for Servers GCP offering configurations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "offeringType",
    defaultImpl = DefenderForServersGcpOffering.class,
    visible = true)
@JsonTypeName("DefenderForServersGcp")
@Fluent
public final class DefenderForServersGcpOffering extends CloudOffering {
    /*
     * The type of the security offering.
     */
    @JsonTypeId
    @JsonProperty(value = "offeringType", required = true)
    private OfferingType offeringType = OfferingType.DEFENDER_FOR_SERVERS_GCP;

    /*
     * The Defender for servers connection configuration
     */
    @JsonProperty(value = "defenderForServers")
    private DefenderForServersGcpOfferingDefenderForServers defenderForServers;

    /*
     * The ARC autoprovisioning configuration
     */
    @JsonProperty(value = "arcAutoProvisioning")
    private DefenderForServersGcpOfferingArcAutoProvisioning arcAutoProvisioning;

    /*
     * The Vulnerability Assessment autoprovisioning configuration
     */
    @JsonProperty(value = "vaAutoProvisioning")
    private DefenderForServersGcpOfferingVaAutoProvisioning vaAutoProvisioning;

    /*
     * The Microsoft Defender for Endpoint autoprovisioning configuration
     */
    @JsonProperty(value = "mdeAutoProvisioning")
    private DefenderForServersGcpOfferingMdeAutoProvisioning mdeAutoProvisioning;

    /*
     * configuration for the servers offering subPlan
     */
    @JsonProperty(value = "subPlan")
    private DefenderForServersGcpOfferingSubPlan subPlan;

    /*
     * The Microsoft Defender for Server VM scanning configuration
     */
    @JsonProperty(value = "vmScanners")
    private DefenderForServersGcpOfferingVmScanners vmScanners;

    /**
     * Creates an instance of DefenderForServersGcpOffering class.
     */
    public DefenderForServersGcpOffering() {
    }

    /**
     * Get the offeringType property: The type of the security offering.
     * 
     * @return the offeringType value.
     */
    @Override
    public OfferingType offeringType() {
        return this.offeringType;
    }

    /**
     * Get the defenderForServers property: The Defender for servers connection configuration.
     * 
     * @return the defenderForServers value.
     */
    public DefenderForServersGcpOfferingDefenderForServers defenderForServers() {
        return this.defenderForServers;
    }

    /**
     * Set the defenderForServers property: The Defender for servers connection configuration.
     * 
     * @param defenderForServers the defenderForServers value to set.
     * @return the DefenderForServersGcpOffering object itself.
     */
    public DefenderForServersGcpOffering
        withDefenderForServers(DefenderForServersGcpOfferingDefenderForServers defenderForServers) {
        this.defenderForServers = defenderForServers;
        return this;
    }

    /**
     * Get the arcAutoProvisioning property: The ARC autoprovisioning configuration.
     * 
     * @return the arcAutoProvisioning value.
     */
    public DefenderForServersGcpOfferingArcAutoProvisioning arcAutoProvisioning() {
        return this.arcAutoProvisioning;
    }

    /**
     * Set the arcAutoProvisioning property: The ARC autoprovisioning configuration.
     * 
     * @param arcAutoProvisioning the arcAutoProvisioning value to set.
     * @return the DefenderForServersGcpOffering object itself.
     */
    public DefenderForServersGcpOffering
        withArcAutoProvisioning(DefenderForServersGcpOfferingArcAutoProvisioning arcAutoProvisioning) {
        this.arcAutoProvisioning = arcAutoProvisioning;
        return this;
    }

    /**
     * Get the vaAutoProvisioning property: The Vulnerability Assessment autoprovisioning configuration.
     * 
     * @return the vaAutoProvisioning value.
     */
    public DefenderForServersGcpOfferingVaAutoProvisioning vaAutoProvisioning() {
        return this.vaAutoProvisioning;
    }

    /**
     * Set the vaAutoProvisioning property: The Vulnerability Assessment autoprovisioning configuration.
     * 
     * @param vaAutoProvisioning the vaAutoProvisioning value to set.
     * @return the DefenderForServersGcpOffering object itself.
     */
    public DefenderForServersGcpOffering
        withVaAutoProvisioning(DefenderForServersGcpOfferingVaAutoProvisioning vaAutoProvisioning) {
        this.vaAutoProvisioning = vaAutoProvisioning;
        return this;
    }

    /**
     * Get the mdeAutoProvisioning property: The Microsoft Defender for Endpoint autoprovisioning configuration.
     * 
     * @return the mdeAutoProvisioning value.
     */
    public DefenderForServersGcpOfferingMdeAutoProvisioning mdeAutoProvisioning() {
        return this.mdeAutoProvisioning;
    }

    /**
     * Set the mdeAutoProvisioning property: The Microsoft Defender for Endpoint autoprovisioning configuration.
     * 
     * @param mdeAutoProvisioning the mdeAutoProvisioning value to set.
     * @return the DefenderForServersGcpOffering object itself.
     */
    public DefenderForServersGcpOffering
        withMdeAutoProvisioning(DefenderForServersGcpOfferingMdeAutoProvisioning mdeAutoProvisioning) {
        this.mdeAutoProvisioning = mdeAutoProvisioning;
        return this;
    }

    /**
     * Get the subPlan property: configuration for the servers offering subPlan.
     * 
     * @return the subPlan value.
     */
    public DefenderForServersGcpOfferingSubPlan subPlan() {
        return this.subPlan;
    }

    /**
     * Set the subPlan property: configuration for the servers offering subPlan.
     * 
     * @param subPlan the subPlan value to set.
     * @return the DefenderForServersGcpOffering object itself.
     */
    public DefenderForServersGcpOffering withSubPlan(DefenderForServersGcpOfferingSubPlan subPlan) {
        this.subPlan = subPlan;
        return this;
    }

    /**
     * Get the vmScanners property: The Microsoft Defender for Server VM scanning configuration.
     * 
     * @return the vmScanners value.
     */
    public DefenderForServersGcpOfferingVmScanners vmScanners() {
        return this.vmScanners;
    }

    /**
     * Set the vmScanners property: The Microsoft Defender for Server VM scanning configuration.
     * 
     * @param vmScanners the vmScanners value to set.
     * @return the DefenderForServersGcpOffering object itself.
     */
    public DefenderForServersGcpOffering withVmScanners(DefenderForServersGcpOfferingVmScanners vmScanners) {
        this.vmScanners = vmScanners;
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
        if (defenderForServers() != null) {
            defenderForServers().validate();
        }
        if (arcAutoProvisioning() != null) {
            arcAutoProvisioning().validate();
        }
        if (vaAutoProvisioning() != null) {
            vaAutoProvisioning().validate();
        }
        if (mdeAutoProvisioning() != null) {
            mdeAutoProvisioning().validate();
        }
        if (subPlan() != null) {
            subPlan().validate();
        }
        if (vmScanners() != null) {
            vmScanners().validate();
        }
    }
}
