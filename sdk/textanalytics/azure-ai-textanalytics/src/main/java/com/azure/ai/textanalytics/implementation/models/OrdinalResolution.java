// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A resolution for ordinal numbers entity instances. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resolutionKind")
@JsonTypeName("OrdinalResolution")
@Fluent
public final class OrdinalResolution extends BaseResolution {
    /*
     * The offset With respect to the reference (e.g., offset = -1 in "show me the second to last"
     */
    @JsonProperty(value = "offset", required = true)
    private String offset;

    /*
     * The reference point that the ordinal number denotes.
     */
    @JsonProperty(value = "relativeTo", required = true)
    private RelativeTo relativeTo;

    /*
     * A simple arithmetic expression that the ordinal denotes.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the offset property: The offset With respect to the reference (e.g., offset = -1 in "show me the second to
     * last".
     *
     * @return the offset value.
     */
    public String getOffset() {
        return this.offset;
    }

    /**
     * Set the offset property: The offset With respect to the reference (e.g., offset = -1 in "show me the second to
     * last".
     *
     * @param offset the offset value to set.
     * @return the OrdinalResolution object itself.
     */
    public OrdinalResolution setOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the relativeTo property: The reference point that the ordinal number denotes.
     *
     * @return the relativeTo value.
     */
    public RelativeTo getRelativeTo() {
        return this.relativeTo;
    }

    /**
     * Set the relativeTo property: The reference point that the ordinal number denotes.
     *
     * @param relativeTo the relativeTo value to set.
     * @return the OrdinalResolution object itself.
     */
    public OrdinalResolution setRelativeTo(RelativeTo relativeTo) {
        this.relativeTo = relativeTo;
        return this;
    }

    /**
     * Get the value property: A simple arithmetic expression that the ordinal denotes.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: A simple arithmetic expression that the ordinal denotes.
     *
     * @param value the value value to set.
     * @return the OrdinalResolution object itself.
     */
    public OrdinalResolution setValue(String value) {
        this.value = value;
        return this;
    }
}
