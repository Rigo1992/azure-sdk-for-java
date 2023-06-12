// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A rule providing static rules that always return the same result, regardless of input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("static-rule")
@Fluent
public final class StaticRule extends RouterRuleInternal {
    /*
     * The static value this rule always returns.
     */
    @JsonProperty(value = "value")
    private Object value;

    /** Creates an instance of StaticRule class. */
    public StaticRule() {}

    /**
     * Get the value property: The static value this rule always returns.
     *
     * @return the value value.
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: The static value this rule always returns.
     *
     * @param value the value value to set.
     * @return the StaticRule object itself.
     */
    public StaticRule setValue(Object value) {
        this.value = value;
        return this;
    }
}
