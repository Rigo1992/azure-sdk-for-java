// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The configuration information for a completions request.
 * Completions support a wide variety of tasks and generate text that continues from or "completes"
 * provided prompt data.
 */
@Fluent
public final class CompletionsOptions {

    /*
     * The prompts to generate completions from.
     */
    @Generated
    @JsonProperty(value = "prompt")
    private List<String> prompt;

    /*
     * The maximum number of tokens to generate.
     */
    @Generated
    @JsonProperty(value = "max_tokens")
    private Integer maxTokens;

    /*
     * The sampling temperature to use that controls the apparent creativity of generated completions.
     * Higher values will make output more random while lower values will make results more focused
     * and deterministic.
     * It is not recommended to modify temperature and top_p for the same completions request as the
     * interaction of these two settings is difficult to predict.
     */
    @Generated
    @JsonProperty(value = "temperature")
    private Double temperature;

    /*
     * An alternative to sampling with temperature called nucleus sampling. This value causes the
     * model to consider the results of tokens with the provided probability mass. As an example, a
     * value of 0.15 will cause only the tokens comprising the top 15% of probability mass to be
     * considered.
     * It is not recommended to modify temperature and top_p for the same completions request as the
     * interaction of these two settings is difficult to predict.
     */
    @Generated
    @JsonProperty(value = "top_p")
    private Double topP;

    /*
     * A map between GPT token IDs and bias scores that influences the probability of specific tokens
     * appearing in a completions response. Token IDs are computed via external tokenizer tools, while
     * bias scores reside in the range of -100 to 100 with minimum and maximum values corresponding to
     * a full ban or exclusive selection of a token, respectively. The exact behavior of a given bias
     * score varies by model.
     */
    @Generated
    @JsonProperty(value = "logit_bias")
    private Map<String, Integer> logitBias;

    /*
     * An identifier for the caller or end user of the operation. This may be used for tracking
     * or rate-limiting purposes.
     */
    @Generated
    @JsonProperty(value = "user")
    private String user;

    /*
     * The number of completions choices that should be generated per provided prompt as part of an
     * overall completions response.
     * Because this setting can generate many completions, it may quickly consume your token quota.
     * Use carefully and ensure reasonable settings for max_tokens and stop.
     */
    @Generated
    @JsonProperty(value = "n")
    private Integer n;

    /*
     * A value that controls the emission of log probabilities for the provided number of most likely
     * tokens within a completions response.
     */
    @Generated
    @JsonProperty(value = "logprobs")
    private Integer logprobs;

    /*
     * A value specifying whether completions responses should include input prompts as prefixes to
     * their generated output.
     */
    @Generated
    @JsonProperty(value = "echo")
    private Boolean echo;

    /*
     * A collection of textual sequences that will end completions generation.
     */
    @Generated
    @JsonProperty(value = "stop")
    private List<String> stop;

    /*
     * A value that influences the probability of generated tokens appearing based on their existing
     * presence in generated text.
     * Positive values will make tokens less likely to appear when they already exist and increase the
     * model's likelihood to output new topics.
     */
    @Generated
    @JsonProperty(value = "presence_penalty")
    private Double presencePenalty;

    /*
     * A value that influences the probability of generated tokens appearing based on their cumulative
     * frequency in generated text.
     * Positive values will make tokens less likely to appear as their frequency increases and
     * decrease the likelihood of the model repeating the same statements verbatim.
     */
    @Generated
    @JsonProperty(value = "frequency_penalty")
    private Double frequencyPenalty;

    /*
     * A value that controls how many completions will be internally generated prior to response
     * formulation.
     * When used together with n, best_of controls the number of candidate completions and must be
     * greater than n.
     * Because this setting can generate many completions, it may quickly consume your token quota.
     * Use carefully and ensure reasonable settings for max_tokens and stop.
     */
    @Generated
    @JsonProperty(value = "best_of")
    private Integer bestOf;

    /*
     * A value indicating whether chat completions should be streamed for this request.
     */
    @Generated
    @JsonProperty(value = "stream")
    private Boolean stream;

    /*
     * The model name to provide as part of this completions request.
     * Not applicable to Azure OpenAI, where deployment information should be included in the Azure
     * resource URI that's connected to.
     */
    @Generated
    @JsonProperty(value = "model")
    private String model;

    /**
     * Creates an instance of CompletionsOptions class.
     *
     * @param prompt the prompt value to set.
     */
    @Generated
    @JsonCreator
    public CompletionsOptions(@JsonProperty(value = "prompt") List<String> prompt) {
        this.prompt = prompt;
    }

    /**
     * Get the prompt property: The prompts to generate completions from.
     *
     * @return the prompt value.
     */
    @Generated
    public List<String> getPrompt() {
        return this.prompt;
    }

    /**
     * Get the maxTokens property: The maximum number of tokens to generate.
     *
     * @return the maxTokens value.
     */
    @Generated
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * Set the maxTokens property: The maximum number of tokens to generate.
     *
     * @param maxTokens the maxTokens value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * Get the temperature property: The sampling temperature to use that controls the apparent creativity of generated
     * completions.
     * Higher values will make output more random while lower values will make results more focused
     * and deterministic.
     * It is not recommended to modify temperature and top_p for the same completions request as the
     * interaction of these two settings is difficult to predict.
     *
     * @return the temperature value.
     */
    @Generated
    public Double getTemperature() {
        return this.temperature;
    }

    /**
     * Set the temperature property: The sampling temperature to use that controls the apparent creativity of generated
     * completions.
     * Higher values will make output more random while lower values will make results more focused
     * and deterministic.
     * It is not recommended to modify temperature and top_p for the same completions request as the
     * interaction of these two settings is difficult to predict.
     *
     * @param temperature the temperature value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Get the topP property: An alternative to sampling with temperature called nucleus sampling. This value causes
     * the
     * model to consider the results of tokens with the provided probability mass. As an example, a
     * value of 0.15 will cause only the tokens comprising the top 15% of probability mass to be
     * considered.
     * It is not recommended to modify temperature and top_p for the same completions request as the
     * interaction of these two settings is difficult to predict.
     *
     * @return the topP value.
     */
    @Generated
    public Double getTopP() {
        return this.topP;
    }

    /**
     * Set the topP property: An alternative to sampling with temperature called nucleus sampling. This value causes
     * the
     * model to consider the results of tokens with the provided probability mass. As an example, a
     * value of 0.15 will cause only the tokens comprising the top 15% of probability mass to be
     * considered.
     * It is not recommended to modify temperature and top_p for the same completions request as the
     * interaction of these two settings is difficult to predict.
     *
     * @param topP the topP value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setTopP(Double topP) {
        this.topP = topP;
        return this;
    }

    /**
     * Get the logitBias property: A map between GPT token IDs and bias scores that influences the probability of
     * specific tokens
     * appearing in a completions response. Token IDs are computed via external tokenizer tools, while
     * bias scores reside in the range of -100 to 100 with minimum and maximum values corresponding to
     * a full ban or exclusive selection of a token, respectively. The exact behavior of a given bias
     * score varies by model.
     *
     * @return the logitBias value.
     */
    @Generated
    public Map<String, Integer> getLogitBias() {
        return this.logitBias;
    }

    /**
     * Set the logitBias property: A map between GPT token IDs and bias scores that influences the probability of
     * specific tokens
     * appearing in a completions response. Token IDs are computed via external tokenizer tools, while
     * bias scores reside in the range of -100 to 100 with minimum and maximum values corresponding to
     * a full ban or exclusive selection of a token, respectively. The exact behavior of a given bias
     * score varies by model.
     *
     * @param logitBias the logitBias value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setLogitBias(Map<String, Integer> logitBias) {
        this.logitBias = logitBias;
        return this;
    }

    /**
     * Get the user property: An identifier for the caller or end user of the operation. This may be used for tracking
     * or rate-limiting purposes.
     *
     * @return the user value.
     */
    @Generated
    public String getUser() {
        return this.user;
    }

    /**
     * Set the user property: An identifier for the caller or end user of the operation. This may be used for tracking
     * or rate-limiting purposes.
     *
     * @param user the user value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get the n property: The number of completions choices that should be generated per provided prompt as part of an
     * overall completions response.
     * Because this setting can generate many completions, it may quickly consume your token quota.
     * Use carefully and ensure reasonable settings for max_tokens and stop.
     *
     * @return the n value.
     */
    @Generated
    public Integer getN() {
        return this.n;
    }

    /**
     * Set the n property: The number of completions choices that should be generated per provided prompt as part of an
     * overall completions response.
     * Because this setting can generate many completions, it may quickly consume your token quota.
     * Use carefully and ensure reasonable settings for max_tokens and stop.
     *
     * @param n the n value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setN(Integer n) {
        this.n = n;
        return this;
    }

    /**
     * Get the logprobs property: A value that controls the emission of log probabilities for the provided number of
     * most likely
     * tokens within a completions response.
     *
     * @return the logprobs value.
     */
    @Generated
    public Integer getLogprobs() {
        return this.logprobs;
    }

    /**
     * Set the logprobs property: A value that controls the emission of log probabilities for the provided number of
     * most likely
     * tokens within a completions response.
     *
     * @param logprobs the logprobs value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setLogprobs(Integer logprobs) {
        this.logprobs = logprobs;
        return this;
    }

    /**
     * Get the echo property: A value specifying whether completions responses should include input prompts as prefixes
     * to
     * their generated output.
     *
     * @return the echo value.
     */
    @Generated
    public Boolean isEcho() {
        return this.echo;
    }

    /**
     * Set the echo property: A value specifying whether completions responses should include input prompts as prefixes
     * to
     * their generated output.
     *
     * @param echo the echo value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setEcho(Boolean echo) {
        this.echo = echo;
        return this;
    }

    /**
     * Get the stop property: A collection of textual sequences that will end completions generation.
     *
     * @return the stop value.
     */
    @Generated
    public List<String> getStop() {
        return this.stop;
    }

    /**
     * Set the stop property: A collection of textual sequences that will end completions generation.
     *
     * @param stop the stop value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setStop(List<String> stop) {
        this.stop = stop;
        return this;
    }

    /**
     * Get the presencePenalty property: A value that influences the probability of generated tokens appearing based on
     * their existing
     * presence in generated text.
     * Positive values will make tokens less likely to appear when they already exist and increase the
     * model's likelihood to output new topics.
     *
     * @return the presencePenalty value.
     */
    @Generated
    public Double getPresencePenalty() {
        return this.presencePenalty;
    }

    /**
     * Set the presencePenalty property: A value that influences the probability of generated tokens appearing based on
     * their existing
     * presence in generated text.
     * Positive values will make tokens less likely to appear when they already exist and increase the
     * model's likelihood to output new topics.
     *
     * @param presencePenalty the presencePenalty value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }

    /**
     * Get the frequencyPenalty property: A value that influences the probability of generated tokens appearing based
     * on their cumulative
     * frequency in generated text.
     * Positive values will make tokens less likely to appear as their frequency increases and
     * decrease the likelihood of the model repeating the same statements verbatim.
     *
     * @return the frequencyPenalty value.
     */
    @Generated
    public Double getFrequencyPenalty() {
        return this.frequencyPenalty;
    }

    /**
     * Set the frequencyPenalty property: A value that influences the probability of generated tokens appearing based
     * on their cumulative
     * frequency in generated text.
     * Positive values will make tokens less likely to appear as their frequency increases and
     * decrease the likelihood of the model repeating the same statements verbatim.
     *
     * @param frequencyPenalty the frequencyPenalty value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }

    /**
     * Get the bestOf property: A value that controls how many completions will be internally generated prior to
     * response
     * formulation.
     * When used together with n, best_of controls the number of candidate completions and must be
     * greater than n.
     * Because this setting can generate many completions, it may quickly consume your token quota.
     * Use carefully and ensure reasonable settings for max_tokens and stop.
     *
     * @return the bestOf value.
     */
    @Generated
    public Integer getBestOf() {
        return this.bestOf;
    }

    /**
     * Set the bestOf property: A value that controls how many completions will be internally generated prior to
     * response
     * formulation.
     * When used together with n, best_of controls the number of candidate completions and must be
     * greater than n.
     * Because this setting can generate many completions, it may quickly consume your token quota.
     * Use carefully and ensure reasonable settings for max_tokens and stop.
     *
     * @param bestOf the bestOf value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setBestOf(Integer bestOf) {
        this.bestOf = bestOf;
        return this;
    }

    /**
     * Get the stream property: A value indicating whether chat completions should be streamed for this request.
     *
     * @return the stream value.
     */
    @Generated
    public Boolean isStream() {
        return this.stream;
    }

    /**
     * Set the stream property: A value indicating whether chat completions should be streamed for this request.
     *
     * @param stream the stream value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }

    /**
     * Get the model property: The model name to provide as part of this completions request.
     * Not applicable to Azure OpenAI, where deployment information should be included in the Azure
     * resource URI that's connected to.
     *
     * @return the model value.
     */
    @Generated
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model property: The model name to provide as part of this completions request.
     * Not applicable to Azure OpenAI, where deployment information should be included in the Azure
     * resource URI that's connected to.
     *
     * @param model the model value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setModel(String model) {
        this.model = model;
        return this;
    }

    /*
     * The suffix that comes after a completion of inserted text
     */
    @Generated
    @JsonProperty(value = "suffix")
    private String suffix;

    /**
     * Get the suffix property: The suffix that comes after a completion of inserted text.
     *
     * @return the suffix value.
     */
    @Generated
    public String getSuffix() {
        return this.suffix;
    }

    /**
     * Set the suffix property: The suffix that comes after a completion of inserted text.
     *
     * @param suffix the suffix value to set.
     * @return the CompletionsOptions object itself.
     */
    @Generated
    public CompletionsOptions setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
}
