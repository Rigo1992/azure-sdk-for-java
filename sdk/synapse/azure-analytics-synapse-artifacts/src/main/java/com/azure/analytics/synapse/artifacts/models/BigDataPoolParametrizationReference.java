// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Big data pool reference type. */
@Fluent
public final class BigDataPoolParametrizationReference {
    /*
     * Big data pool reference type.
     */
    @JsonProperty(value = "type", required = true)
    private BigDataPoolReferenceType type;

    /*
     * Reference big data pool name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "referenceName", required = true)
    private Object referenceName;

    /**
     * Get the type property: Big data pool reference type.
     *
     * @return the type value.
     */
    public BigDataPoolReferenceType getType() {
        return this.type;
    }

    /**
     * Set the type property: Big data pool reference type.
     *
     * @param type the type value to set.
     * @return the BigDataPoolParametrizationReference object itself.
     */
    public BigDataPoolParametrizationReference setType(BigDataPoolReferenceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: Reference big data pool name. Type: string (or Expression with resultType
     * string).
     *
     * @return the referenceName value.
     */
    public Object getReferenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference big data pool name. Type: string (or Expression with resultType
     * string).
     *
     * @param referenceName the referenceName value to set.
     * @return the BigDataPoolParametrizationReference object itself.
     */
    public BigDataPoolParametrizationReference setReferenceName(Object referenceName) {
        this.referenceName = referenceName;
        return this;
    }
}
