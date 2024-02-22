// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response of /command api.
 */
@Fluent
public final class CommandOutputInner {
    /*
     * Output of the command.
     */
    @JsonProperty(value = "commandOutput")
    private String commandOutput;

    /**
     * Creates an instance of CommandOutputInner class.
     */
    public CommandOutputInner() {
    }

    /**
     * Get the commandOutput property: Output of the command.
     * 
     * @return the commandOutput value.
     */
    public String commandOutput() {
        return this.commandOutput;
    }

    /**
     * Set the commandOutput property: Output of the command.
     * 
     * @param commandOutput the commandOutput value to set.
     * @return the CommandOutputInner object itself.
     */
    public CommandOutputInner withCommandOutput(String commandOutput) {
        this.commandOutput = commandOutput;
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
