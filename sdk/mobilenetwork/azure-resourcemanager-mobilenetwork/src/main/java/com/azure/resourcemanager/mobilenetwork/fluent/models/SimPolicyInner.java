// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.Ambr;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.SliceConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.SliceResourceId;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** SIM policy resource. */
@Fluent
public final class SimPolicyInner extends Resource {
    /*
     * SIM policy Properties.
     */
    @JsonProperty(value = "properties", required = true)
    private SimPolicyPropertiesFormat innerProperties = new SimPolicyPropertiesFormat();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: SIM policy Properties.
     *
     * @return the innerProperties value.
     */
    private SimPolicyPropertiesFormat innerProperties() {
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

    /** {@inheritDoc} */
    @Override
    public SimPolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SimPolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the SIM policy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the ueAmbr property: Aggregate maximum bit rate across all non-GBR QoS flows of all PDU sessions of a given
     * UE. See 3GPP TS23.501 section 5.7.2.6 for a full description of the UE-AMBR.
     *
     * @return the ueAmbr value.
     */
    public Ambr ueAmbr() {
        return this.innerProperties() == null ? null : this.innerProperties().ueAmbr();
    }

    /**
     * Set the ueAmbr property: Aggregate maximum bit rate across all non-GBR QoS flows of all PDU sessions of a given
     * UE. See 3GPP TS23.501 section 5.7.2.6 for a full description of the UE-AMBR.
     *
     * @param ueAmbr the ueAmbr value to set.
     * @return the SimPolicyInner object itself.
     */
    public SimPolicyInner withUeAmbr(Ambr ueAmbr) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPolicyPropertiesFormat();
        }
        this.innerProperties().withUeAmbr(ueAmbr);
        return this;
    }

    /**
     * Get the defaultSlice property: The default slice to use if the UE does not explicitly specify it. This slice must
     * exist in the `sliceConfigurations` map.
     *
     * @return the defaultSlice value.
     */
    public SliceResourceId defaultSlice() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultSlice();
    }

    /**
     * Set the defaultSlice property: The default slice to use if the UE does not explicitly specify it. This slice must
     * exist in the `sliceConfigurations` map.
     *
     * @param defaultSlice the defaultSlice value to set.
     * @return the SimPolicyInner object itself.
     */
    public SimPolicyInner withDefaultSlice(SliceResourceId defaultSlice) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPolicyPropertiesFormat();
        }
        this.innerProperties().withDefaultSlice(defaultSlice);
        return this;
    }

    /**
     * Get the rfspIndex property: RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413. This is an
     * optional setting and by default is unspecified.
     *
     * @return the rfspIndex value.
     */
    public Integer rfspIndex() {
        return this.innerProperties() == null ? null : this.innerProperties().rfspIndex();
    }

    /**
     * Set the rfspIndex property: RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413. This is an
     * optional setting and by default is unspecified.
     *
     * @param rfspIndex the rfspIndex value to set.
     * @return the SimPolicyInner object itself.
     */
    public SimPolicyInner withRfspIndex(Integer rfspIndex) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPolicyPropertiesFormat();
        }
        this.innerProperties().withRfspIndex(rfspIndex);
        return this;
    }

    /**
     * Get the registrationTimer property: Interval for the UE periodic registration update procedure, in seconds.
     *
     * @return the registrationTimer value.
     */
    public Integer registrationTimer() {
        return this.innerProperties() == null ? null : this.innerProperties().registrationTimer();
    }

    /**
     * Set the registrationTimer property: Interval for the UE periodic registration update procedure, in seconds.
     *
     * @param registrationTimer the registrationTimer value to set.
     * @return the SimPolicyInner object itself.
     */
    public SimPolicyInner withRegistrationTimer(Integer registrationTimer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPolicyPropertiesFormat();
        }
        this.innerProperties().withRegistrationTimer(registrationTimer);
        return this;
    }

    /**
     * Get the sliceConfigurations property: The allowed slices and the settings to use for them. The list must not
     * contain duplicate items and must contain at least one item.
     *
     * @return the sliceConfigurations value.
     */
    public List<SliceConfiguration> sliceConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().sliceConfigurations();
    }

    /**
     * Set the sliceConfigurations property: The allowed slices and the settings to use for them. The list must not
     * contain duplicate items and must contain at least one item.
     *
     * @param sliceConfigurations the sliceConfigurations value to set.
     * @return the SimPolicyInner object itself.
     */
    public SimPolicyInner withSliceConfigurations(List<SliceConfiguration> sliceConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPolicyPropertiesFormat();
        }
        this.innerProperties().withSliceConfigurations(sliceConfigurations);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model SimPolicyInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SimPolicyInner.class);
}
