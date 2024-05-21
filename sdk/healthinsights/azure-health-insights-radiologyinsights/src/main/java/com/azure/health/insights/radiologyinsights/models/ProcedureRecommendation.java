// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The procedure recommendation can be a generic procedure or an imaging procedure.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = ProcedureRecommendation.class,
    visible = true)
@JsonTypeName("ProcedureRecommendation")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "genericProcedureRecommendation", value = GenericProcedureRecommendation.class),
    @JsonSubTypes.Type(name = "imagingProcedureRecommendation", value = ImagingProcedureRecommendation.class) })
@Immutable
public class ProcedureRecommendation {

    /*
     * The kind property.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Creates an instance of ProcedureRecommendation class.
     */
    @Generated
    protected ProcedureRecommendation() {
        this.kind = "ProcedureRecommendation";
    }

    /**
     * Get the kind property: The kind property.
     *
     * @return the kind value.
     */
    @Generated
    public String getKind() {
        return this.kind;
    }
}
