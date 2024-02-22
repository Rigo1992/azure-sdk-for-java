// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The standard Chat Completions response format that can freely generate text and is not guaranteed to produce
 * response
 * content that adheres to a specific schema.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("text")
@Immutable
public final class ChatCompletionsTextResponseFormat extends ChatCompletionsResponseFormat {

    /**
     * Creates an instance of ChatCompletionsTextResponseFormat class.
     */
    @Generated
    public ChatCompletionsTextResponseFormat() {
    }
}
