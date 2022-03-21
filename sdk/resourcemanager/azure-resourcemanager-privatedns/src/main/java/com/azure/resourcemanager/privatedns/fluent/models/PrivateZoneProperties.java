// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.privatedns.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the properties of the Private DNS zone. */
@Immutable
public final class PrivateZoneProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateZoneProperties.class);

    /*
     * The maximum number of record sets that can be created in this Private
     * DNS zone. This is a read-only property and any attempt to set this value
     * will be ignored.
     */
    @JsonProperty(value = "maxNumberOfRecordSets", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxNumberOfRecordSets;

    /*
     * The current number of record sets in this Private DNS zone. This is a
     * read-only property and any attempt to set this value will be ignored.
     */
    @JsonProperty(value = "numberOfRecordSets", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfRecordSets;

    /*
     * The maximum number of virtual networks that can be linked to this
     * Private DNS zone. This is a read-only property and any attempt to set
     * this value will be ignored.
     */
    @JsonProperty(value = "maxNumberOfVirtualNetworkLinks", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxNumberOfVirtualNetworkLinks;

    /*
     * The current number of virtual networks that are linked to this Private
     * DNS zone. This is a read-only property and any attempt to set this value
     * will be ignored.
     */
    @JsonProperty(value = "numberOfVirtualNetworkLinks", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfVirtualNetworkLinks;

    /*
     * The maximum number of virtual networks that can be linked to this
     * Private DNS zone with registration enabled. This is a read-only property
     * and any attempt to set this value will be ignored.
     */
    @JsonProperty(value = "maxNumberOfVirtualNetworkLinksWithRegistration", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxNumberOfVirtualNetworkLinksWithRegistration;

    /*
     * The current number of virtual networks that are linked to this Private
     * DNS zone with registration enabled. This is a read-only property and any
     * attempt to set this value will be ignored.
     */
    @JsonProperty(value = "numberOfVirtualNetworkLinksWithRegistration", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfVirtualNetworkLinksWithRegistration;

    /*
     * The provisioning state of the resource. This is a read-only property and
     * any attempt to set this value will be ignored.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the maxNumberOfRecordSets property: The maximum number of record sets that can be created in this Private DNS
     * zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfRecordSets value.
     */
    public Long maxNumberOfRecordSets() {
        return this.maxNumberOfRecordSets;
    }

    /**
     * Get the numberOfRecordSets property: The current number of record sets in this Private DNS zone. This is a
     * read-only property and any attempt to set this value will be ignored.
     *
     * @return the numberOfRecordSets value.
     */
    public Long numberOfRecordSets() {
        return this.numberOfRecordSets;
    }

    /**
     * Get the maxNumberOfVirtualNetworkLinks property: The maximum number of virtual networks that can be linked to
     * this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfVirtualNetworkLinks value.
     */
    public Long maxNumberOfVirtualNetworkLinks() {
        return this.maxNumberOfVirtualNetworkLinks;
    }

    /**
     * Get the numberOfVirtualNetworkLinks property: The current number of virtual networks that are linked to this
     * Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the numberOfVirtualNetworkLinks value.
     */
    public Long numberOfVirtualNetworkLinks() {
        return this.numberOfVirtualNetworkLinks;
    }

    /**
     * Get the maxNumberOfVirtualNetworkLinksWithRegistration property: The maximum number of virtual networks that can
     * be linked to this Private DNS zone with registration enabled. This is a read-only property and any attempt to set
     * this value will be ignored.
     *
     * @return the maxNumberOfVirtualNetworkLinksWithRegistration value.
     */
    public Long maxNumberOfVirtualNetworkLinksWithRegistration() {
        return this.maxNumberOfVirtualNetworkLinksWithRegistration;
    }

    /**
     * Get the numberOfVirtualNetworkLinksWithRegistration property: The current number of virtual networks that are
     * linked to this Private DNS zone with registration enabled. This is a read-only property and any attempt to set
     * this value will be ignored.
     *
     * @return the numberOfVirtualNetworkLinksWithRegistration value.
     */
    public Long numberOfVirtualNetworkLinksWithRegistration() {
        return this.numberOfVirtualNetworkLinksWithRegistration;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource. This is a read-only property and any
     * attempt to set this value will be ignored.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
