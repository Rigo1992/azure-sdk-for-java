// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Representation of the manner in which a completions response concluded.
 */
public final class CompletionsFinishReason extends ExpandableStringEnum<CompletionsFinishReason> {

    /**
     * Completions ended normally and reached its end of token generation.
     */
    @Generated
    public static final CompletionsFinishReason STOPPED = fromString("stop");

    /**
     * Completions exhausted available token limits before generation could complete.
     */
    @Generated
    public static final CompletionsFinishReason TOKEN_LIMIT_REACHED = fromString("length");

    /**
     * Completions generated a response that was identified as potentially sensitive per content
     * moderation policies.
     */
    @Generated
    public static final CompletionsFinishReason CONTENT_FILTERED = fromString("content_filter");

    /**
     * Creates a new instance of CompletionsFinishReason value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public CompletionsFinishReason() {
    }

    /**
     * Creates or finds a CompletionsFinishReason from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CompletionsFinishReason.
     */
    @Generated
    @JsonCreator
    public static CompletionsFinishReason fromString(String name) {
        return fromString(name, CompletionsFinishReason.class);
    }

    /**
     * Gets known CompletionsFinishReason values.
     *
     * @return known CompletionsFinishReason values.
     */
    @Generated
    public static Collection<CompletionsFinishReason> values() {
        return values(CompletionsFinishReason.class);
    }

    /**
     * Completion ended normally, with the model requesting a function to be called.
     */
    @Generated
    public static final CompletionsFinishReason FUNCTION_CALL = fromString("function_call");

    /**
     * Completion ended with the model calling a provided tool for output.
     */
    @Generated
    public static final CompletionsFinishReason TOOL_CALLS = fromString("tool_calls");
}
