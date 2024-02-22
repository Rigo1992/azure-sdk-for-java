// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Stage/grade, usually assessed formally
 * Based on [FHIR Condition.Stage](https://www.hl7.org/fhir/R4/condition.html).
 */
@Fluent
public final class FhirR4ConditionStage {

    /*
     * Simple summary (disease specific)
     */
    @Generated
    @JsonProperty(value = "summary")
    private FhirR4CodeableConcept summary;

    /*
     * Kind of staging
     */
    @Generated
    @JsonProperty(value = "type")
    private FhirR4CodeableConcept type;

    /**
     * Creates an instance of FhirR4ConditionStage class.
     */
    @Generated
    public FhirR4ConditionStage() {
    }

    /**
     * Get the summary property: Simple summary (disease specific).
     *
     * @return the summary value.
     */
    @Generated
    public FhirR4CodeableConcept getSummary() {
        return this.summary;
    }

    /**
     * Set the summary property: Simple summary (disease specific).
     *
     * @param summary the summary value to set.
     * @return the FhirR4ConditionStage object itself.
     */
    @Generated
    public FhirR4ConditionStage setSummary(FhirR4CodeableConcept summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the type property: Kind of staging.
     *
     * @return the type value.
     */
    @Generated
    public FhirR4CodeableConcept getType() {
        return this.type;
    }

    /**
     * Set the type property: Kind of staging.
     *
     * @param type the type value to set.
     * @return the FhirR4ConditionStage object itself.
     */
    @Generated
    public FhirR4ConditionStage setType(FhirR4CodeableConcept type) {
        this.type = type;
        return this;
    }
}
