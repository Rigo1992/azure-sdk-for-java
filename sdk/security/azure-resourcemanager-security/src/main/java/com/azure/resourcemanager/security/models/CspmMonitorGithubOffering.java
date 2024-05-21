// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The CSPM monitoring for github offering.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "offeringType",
    defaultImpl = CspmMonitorGithubOffering.class,
    visible = true)
@JsonTypeName("CspmMonitorGithub")
@Immutable
public final class CspmMonitorGithubOffering extends CloudOffering {
    /*
     * The type of the security offering.
     */
    @JsonTypeId
    @JsonProperty(value = "offeringType", required = true)
    private OfferingType offeringType = OfferingType.CSPM_MONITOR_GITHUB;

    /**
     * Creates an instance of CspmMonitorGithubOffering class.
     */
    public CspmMonitorGithubOffering() {
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
