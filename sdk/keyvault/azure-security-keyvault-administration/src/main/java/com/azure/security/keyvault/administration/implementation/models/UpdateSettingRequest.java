// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The update settings request object. */
@Fluent
public final class UpdateSettingRequest {
    /*
     * The value of the pool setting.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /** Creates an instance of UpdateSettingRequest class. */
    public UpdateSettingRequest() {}

    /**
     * Get the value property: The value of the pool setting.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the pool setting.
     *
     * @param value the value value to set.
     * @return the UpdateSettingRequest object itself.
     */
    public UpdateSettingRequest setValue(String value) {
        this.value = value;
        return this;
    }
}
