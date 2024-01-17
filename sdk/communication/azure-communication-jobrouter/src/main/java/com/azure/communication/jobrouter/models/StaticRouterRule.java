// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A rule providing static rules that always return the same result, regardless of input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("static")
@Fluent
public final class StaticRouterRule extends RouterRule {

    /*
     * The static value this rule always returns.
     */
    @JsonProperty(value = "value")
    private RouterValue value;

    /** Creates an instance of StaticRouterRule class. */
    @Generated
    public StaticRouterRule() {}

    /**
     * Get the value property: The static value this rule always returns.
     *
     * @return the value value.
     */
    public RouterValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The static value this rule always returns.
     *
     * @param value the value value to set.
     * @return the StaticRouterRule object itself.
     */
    public StaticRouterRule setValue(RouterValue value) {
        this.value = value;
        return this;
    }
}
