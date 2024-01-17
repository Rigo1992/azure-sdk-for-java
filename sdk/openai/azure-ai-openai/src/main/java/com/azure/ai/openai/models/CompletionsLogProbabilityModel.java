// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Representation of a log probabilities model for a completions generation.
 */
@Immutable
public final class CompletionsLogProbabilityModel {

    /*
     * The textual forms of tokens evaluated in this probability model.
     */
    @Generated
    @JsonProperty(value = "tokens")
    private List<String> tokens;

    /**
     * Creates an instance of CompletionsLogProbabilityModel class.
     *
     * @param tokens the tokens value to set.
     * @param tokenLogProbabilities the tokenLogProbabilities value to set.
     * @param topLogProbabilities the topLogProbabilities value to set.
     * @param textOffsets the textOffsets value to set.
     */
    @Generated
    @JsonCreator
    private CompletionsLogProbabilityModel(@JsonProperty(value = "tokens") List<String> tokens,
        @JsonProperty(value = "token_logprobs") List<Double> tokenLogProbabilities,
        @JsonProperty(value = "top_logprobs") List<Map<String, Double>> topLogProbabilities,
        @JsonProperty(value = "text_offset") List<Integer> textOffsets) {
        this.tokens = tokens;
        this.tokenLogProbabilities = tokenLogProbabilities;
        this.topLogProbabilities = topLogProbabilities;
        this.textOffsets = textOffsets;
    }

    /**
     * Get the tokens property: The textual forms of tokens evaluated in this probability model.
     *
     * @return the tokens value.
     */
    @Generated
    public List<String> getTokens() {
        return this.tokens;
    }

    /*
     * A collection of log probability values for the tokens in this completions data.
     */
    @Generated
    @JsonProperty(value = "token_logprobs")
    private List<Double> tokenLogProbabilities;

    /*
     * A mapping of tokens to maximum log probability values in this completions data.
     */
    @Generated
    @JsonProperty(value = "top_logprobs")
    private List<Map<String, Double>> topLogProbabilities;

    /*
     * The text offsets associated with tokens in this completions data.
     */
    @Generated
    @JsonProperty(value = "text_offset")
    private List<Integer> textOffsets;

    /**
     * Get the tokenLogProbabilities property: A collection of log probability values for the tokens in this
     * completions data.
     *
     * @return the tokenLogProbabilities value.
     */
    @Generated
    public List<Double> getTokenLogProbabilities() {
        return this.tokenLogProbabilities;
    }

    /**
     * Get the topLogProbabilities property: A mapping of tokens to maximum log probability values in this completions
     * data.
     *
     * @return the topLogProbabilities value.
     */
    @Generated
    public List<Map<String, Double>> getTopLogProbabilities() {
        return this.topLogProbabilities;
    }

    /**
     * Get the textOffsets property: The text offsets associated with tokens in this completions data.
     *
     * @return the textOffsets value.
     */
    @Generated
    public List<Integer> getTextOffsets() {
        return this.textOffsets;
    }
}
