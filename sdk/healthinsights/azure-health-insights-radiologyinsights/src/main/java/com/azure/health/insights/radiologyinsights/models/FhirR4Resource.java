// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * Resource is the ancestor of DomainResource from which most resources are derived. Bundle, Parameters, and Binary
 * extend Resource directly.
 * Based on [FHIR Resource](https://www.hl7.org/fhir/r4/resource.html.
 */
@Fluent
public class FhirR4Resource {

    /*
     * The type of resource
     */
    @Generated
    @JsonProperty(value = "resourceType")
    private final String resourceType;

    /*
     * Resource Id
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * Metadata about the resource
     */
    @Generated
    @JsonProperty(value = "meta")
    private FhirR4Meta meta;

    /*
     * A set of rules under which this content was created
     */
    @Generated
    @JsonProperty(value = "implicitRules")
    private String implicitRules;

    /*
     * Language of the resource content
     */
    @Generated
    @JsonProperty(value = "language")
    private String language;

    /*
     * Additional properties
     */
    @Generated
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of FhirR4Resource class.
     *
     * @param resourceType the resourceType value to set.
     */
    @Generated
    @JsonCreator
    public FhirR4Resource(@JsonProperty(value = "resourceType") String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Get the resourceType property: The type of resource.
     *
     * @return the resourceType value.
     */
    @Generated
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource Id.
     *
     * @param id the id value to set.
     * @return the FhirR4Resource object itself.
     */
    @Generated
    public FhirR4Resource setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the meta property: Metadata about the resource.
     *
     * @return the meta value.
     */
    @Generated
    public FhirR4Meta getMeta() {
        return this.meta;
    }

    /**
     * Set the meta property: Metadata about the resource.
     *
     * @param meta the meta value to set.
     * @return the FhirR4Resource object itself.
     */
    @Generated
    public FhirR4Resource setMeta(FhirR4Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get the implicitRules property: A set of rules under which this content was created.
     *
     * @return the implicitRules value.
     */
    @Generated
    public String getImplicitRules() {
        return this.implicitRules;
    }

    /**
     * Set the implicitRules property: A set of rules under which this content was created.
     *
     * @param implicitRules the implicitRules value to set.
     * @return the FhirR4Resource object itself.
     */
    @Generated
    public FhirR4Resource setImplicitRules(String implicitRules) {
        this.implicitRules = implicitRules;
        return this;
    }

    /**
     * Get the language property: Language of the resource content.
     *
     * @return the language value.
     */
    @Generated
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: Language of the resource content.
     *
     * @param language the language value to set.
     * @return the FhirR4Resource object itself.
     */
    @Generated
    public FhirR4Resource setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the additionalProperties property: Additional properties.
     *
     * @return the additionalProperties value.
     */
    @Generated
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Additional properties.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the FhirR4Resource object itself.
     */
    @Generated
    public FhirR4Resource setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @Generated
    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
