// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Create protection intent input.
 */
@Fluent
public final class CreateProtectionIntentInput {
    /*
     * Create protection intent input properties.
     */
    @JsonProperty(value = "properties")
    private CreateProtectionIntentProperties properties;

    /**
     * Creates an instance of CreateProtectionIntentInput class.
     */
    public CreateProtectionIntentInput() {
    }

    /**
     * Get the properties property: Create protection intent input properties.
     * 
     * @return the properties value.
     */
    public CreateProtectionIntentProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Create protection intent input properties.
     * 
     * @param properties the properties value to set.
     * @return the CreateProtectionIntentInput object itself.
     */
    public CreateProtectionIntentInput withProperties(CreateProtectionIntentProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
