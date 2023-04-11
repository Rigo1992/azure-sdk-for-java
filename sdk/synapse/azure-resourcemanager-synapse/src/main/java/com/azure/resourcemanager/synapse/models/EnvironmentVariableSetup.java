// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.models.EnvironmentVariableSetupTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The custom setup of setting environment variable. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("EnvironmentVariableSetup")
@Fluent
public final class EnvironmentVariableSetup extends CustomSetupBase {
    /*
     * Add environment variable type properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private EnvironmentVariableSetupTypeProperties innerTypeProperties = new EnvironmentVariableSetupTypeProperties();

    /** Creates an instance of EnvironmentVariableSetup class. */
    public EnvironmentVariableSetup() {
    }

    /**
     * Get the innerTypeProperties property: Add environment variable type properties.
     *
     * @return the innerTypeProperties value.
     */
    private EnvironmentVariableSetupTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the variableName property: The name of the environment variable.
     *
     * @return the variableName value.
     */
    public String variableName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().variableName();
    }

    /**
     * Set the variableName property: The name of the environment variable.
     *
     * @param variableName the variableName value to set.
     * @return the EnvironmentVariableSetup object itself.
     */
    public EnvironmentVariableSetup withVariableName(String variableName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new EnvironmentVariableSetupTypeProperties();
        }
        this.innerTypeProperties().withVariableName(variableName);
        return this;
    }

    /**
     * Get the variableValue property: The value of the environment variable.
     *
     * @return the variableValue value.
     */
    public String variableValue() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().variableValue();
    }

    /**
     * Set the variableValue property: The value of the environment variable.
     *
     * @param variableValue the variableValue value to set.
     * @return the EnvironmentVariableSetup object itself.
     */
    public EnvironmentVariableSetup withVariableValue(String variableValue) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new EnvironmentVariableSetupTypeProperties();
        }
        this.innerTypeProperties().withVariableValue(variableValue);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model EnvironmentVariableSetup"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EnvironmentVariableSetup.class);
}
