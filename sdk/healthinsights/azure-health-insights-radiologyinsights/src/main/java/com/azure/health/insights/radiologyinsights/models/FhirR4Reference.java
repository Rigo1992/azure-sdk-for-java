// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A reference from one resource to another
 * Based on [FHIR Reference](https://www.hl7.org/fhir/R4/references.html).
 */
@Fluent
public final class FhirR4Reference extends FhirR4Element {

    /*
     * Literal reference, Relative, internal or absolute URL
     */
    @Generated
    @JsonProperty(value = "reference")
    private String reference;

    /*
     * Type the reference refers to (e.g. "Patient")
     */
    @Generated
    @JsonProperty(value = "type")
    private String type;

    /*
     * Logical reference, when literal reference is not known
     */
    @Generated
    @JsonProperty(value = "identifier")
    private FhirR4Identifier identifier;

    /*
     * Text alternative for the resource
     */
    @Generated
    @JsonProperty(value = "display")
    private String display;

    /**
     * Creates an instance of FhirR4Reference class.
     */
    @Generated
    public FhirR4Reference() {
    }

    /**
     * Get the reference property: Literal reference, Relative, internal or absolute URL.
     *
     * @return the reference value.
     */
    @Generated
    public String getReference() {
        return this.reference;
    }

    /**
     * Set the reference property: Literal reference, Relative, internal or absolute URL.
     *
     * @param reference the reference value to set.
     * @return the FhirR4Reference object itself.
     */
    @Generated
    public FhirR4Reference setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get the type property: Type the reference refers to (e.g. "Patient").
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Type the reference refers to (e.g. "Patient").
     *
     * @param type the type value to set.
     * @return the FhirR4Reference object itself.
     */
    @Generated
    public FhirR4Reference setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the identifier property: Logical reference, when literal reference is not known.
     *
     * @return the identifier value.
     */
    @Generated
    public FhirR4Identifier getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Logical reference, when literal reference is not known.
     *
     * @param identifier the identifier value to set.
     * @return the FhirR4Reference object itself.
     */
    @Generated
    public FhirR4Reference setIdentifier(FhirR4Identifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the display property: Text alternative for the resource.
     *
     * @return the display value.
     */
    @Generated
    public String getDisplay() {
        return this.display;
    }

    /**
     * Set the display property: Text alternative for the resource.
     *
     * @param display the display value to set.
     * @return the FhirR4Reference object itself.
     */
    @Generated
    public FhirR4Reference setDisplay(String display) {
        this.display = display;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Reference setId(String id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Reference setExtension(List<FhirR4Extension> extension) {
        super.setExtension(extension);
        return this;
    }
}
