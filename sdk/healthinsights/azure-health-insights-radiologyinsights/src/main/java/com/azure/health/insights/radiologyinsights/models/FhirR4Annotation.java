// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A text note which also contains information about who made the statement and when
 * Based on [FHIR Annotation](https://www.hl7.org/fhir/R4/datatypes.html#Annotation).
 */
@Fluent
public final class FhirR4Annotation extends FhirR4Element {

    /*
     * Individual responsible for the annotation
     */
    @Generated
    @JsonProperty(value = "authorString")
    private String authorString;

    /*
     * When the annotation was made
     */
    @Generated
    @JsonProperty(value = "time")
    private String time;

    /*
     * The annotation - text content (as markdown)
     */
    @Generated
    @JsonProperty(value = "text")
    private String text;

    /**
     * Creates an instance of FhirR4Annotation class.
     *
     * @param text the text value to set.
     */
    @Generated
    @JsonCreator
    public FhirR4Annotation(@JsonProperty(value = "text") String text) {
        this.text = text;
    }

    /**
     * Get the authorString property: Individual responsible for the annotation.
     *
     * @return the authorString value.
     */
    @Generated
    public String getAuthorString() {
        return this.authorString;
    }

    /**
     * Set the authorString property: Individual responsible for the annotation.
     *
     * @param authorString the authorString value to set.
     * @return the FhirR4Annotation object itself.
     */
    @Generated
    public FhirR4Annotation setAuthorString(String authorString) {
        this.authorString = authorString;
        return this;
    }

    /**
     * Get the time property: When the annotation was made.
     *
     * @return the time value.
     */
    @Generated
    public String getTime() {
        return this.time;
    }

    /**
     * Set the time property: When the annotation was made.
     *
     * @param time the time value to set.
     * @return the FhirR4Annotation object itself.
     */
    @Generated
    public FhirR4Annotation setTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * Get the text property: The annotation - text content (as markdown).
     *
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Annotation setId(String id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Annotation setExtension(List<FhirR4Extension> extension) {
        super.setExtension(extension);
        return this;
    }
}
