// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings which determine whether to read watermark events.
 */
@Fluent
public final class InputWatermarkProperties {
    /*
     * The input watermark mode.
     */
    @JsonProperty(value = "watermarkMode")
    private InputWatermarkMode watermarkMode;

    /**
     * Creates an instance of InputWatermarkProperties class.
     */
    public InputWatermarkProperties() {
    }

    /**
     * Get the watermarkMode property: The input watermark mode.
     * 
     * @return the watermarkMode value.
     */
    public InputWatermarkMode watermarkMode() {
        return this.watermarkMode;
    }

    /**
     * Set the watermarkMode property: The input watermark mode.
     * 
     * @param watermarkMode the watermarkMode value to set.
     * @return the InputWatermarkProperties object itself.
     */
    public InputWatermarkProperties withWatermarkMode(InputWatermarkMode watermarkMode) {
        this.watermarkMode = watermarkMode;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
