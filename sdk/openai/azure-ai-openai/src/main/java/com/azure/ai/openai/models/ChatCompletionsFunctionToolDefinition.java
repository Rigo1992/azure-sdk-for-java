// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The definition information for a chat completions function tool that can call a function in response to a tool call.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("function")
@Immutable
public final class ChatCompletionsFunctionToolDefinition extends ChatCompletionsToolDefinition {

    /*
     * The function definition details for the function tool.
     */
    @Generated
    @JsonProperty(value = "function")
    private FunctionDefinition function;

    /**
     * Creates an instance of ChatCompletionsFunctionToolDefinition class.
     *
     * @param function the function value to set.
     */
    @Generated
    @JsonCreator
    public ChatCompletionsFunctionToolDefinition(@JsonProperty(value = "function") FunctionDefinition function) {
        this.function = function;
    }

    /**
     * Get the function property: The function definition details for the function tool.
     *
     * @return the function value.
     */
    @Generated
    public FunctionDefinition getFunction() {
        return this.function;
    }
}
