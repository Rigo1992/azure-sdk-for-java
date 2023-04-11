// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.workloads.models.SingleServerRecommendationResult;
import com.azure.resourcemanager.workloads.models.ThreeTierRecommendationResult;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The SAP sizing recommendation result. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "deploymentType",
    defaultImpl = SapSizingRecommendationResultInner.class)
@JsonTypeName("SapSizingRecommendationResult")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SingleServer", value = SingleServerRecommendationResult.class),
    @JsonSubTypes.Type(name = "ThreeTier", value = ThreeTierRecommendationResult.class)
})
@Immutable
public class SapSizingRecommendationResultInner {
    /** Creates an instance of SapSizingRecommendationResultInner class. */
    public SapSizingRecommendationResultInner() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
