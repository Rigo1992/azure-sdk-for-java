// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ObservedBoolean model. */
@Immutable
public final class ObservedBoolean extends ObservedValue {
    /*
     * The value property.
     */
    @Generated
    @JsonProperty(value = "value")
    private Boolean value;

    /*
     * The sources property.
     */
    @Generated
    @JsonProperty(value = "sources")
    private List<Source> sources;

    /** Creates an instance of ObservedBoolean class. */
    @Generated
    private ObservedBoolean() {}

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    @Generated
    public Boolean isValue() {
        return this.value;
    }

    /**
     * Get the sources property: The sources property.
     *
     * @return the sources value.
     */
    @Generated
    public List<Source> getSources() {
        return this.sources;
    }
}
