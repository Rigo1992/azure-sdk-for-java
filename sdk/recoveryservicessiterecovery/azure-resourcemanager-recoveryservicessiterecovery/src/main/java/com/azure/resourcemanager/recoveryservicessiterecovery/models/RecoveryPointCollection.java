// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.RecoveryPointInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of recovery point details. */
@Fluent
public final class RecoveryPointCollection {
    /*
     * The recovery point details.
     */
    @JsonProperty(value = "value")
    private List<RecoveryPointInner> value;

    /*
     * The value of next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of RecoveryPointCollection class. */
    public RecoveryPointCollection() {
    }

    /**
     * Get the value property: The recovery point details.
     *
     * @return the value value.
     */
    public List<RecoveryPointInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The recovery point details.
     *
     * @param value the value value to set.
     * @return the RecoveryPointCollection object itself.
     */
    public RecoveryPointCollection withValue(List<RecoveryPointInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the RecoveryPointCollection object itself.
     */
    public RecoveryPointCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
