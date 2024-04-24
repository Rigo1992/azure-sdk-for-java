// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Translation source term.
 */
@Immutable
public final class DictionaryTranslation {

    /*
     * A string giving the normalized form of this term in the target language.
     * This value should be used as input to lookup examples.
     */
    @Generated
    @JsonProperty(value = "normalizedTarget")
    private final String normalizedTarget;

    /*
     * A string giving the term in the target language and in a form best suited
     * for end-user display. Generally, this will only differ from the normalizedTarget
     * in terms of capitalization. For example, a proper noun like "Juan" will have
     * normalizedTarget = "juan" and displayTarget = "Juan".
     */
    @Generated
    @JsonProperty(value = "displayTarget")
    private final String displayTarget;

    /*
     * A string associating this term with a part-of-speech tag.
     */
    @Generated
    @JsonProperty(value = "posTag")
    private final String posTag;

    /*
     * A value between 0.0 and 1.0 which represents the "confidence" 
     * (or perhaps more accurately, "probability in the training data") of that translation pair. 
     * The sum of confidence scores for one source word may or may not sum to 1.0.
     */
    @Generated
    @JsonProperty(value = "confidence")
    private final double confidence;

    /*
     * A string giving the word to display as a prefix of the translation. Currently,
     * this is the gendered determiner of nouns, in languages that have gendered determiners.
     * For example, the prefix of the Spanish word "mosca" is "la", since "mosca" is a feminine noun in Spanish. 
     * This is only dependent on the translation, and not on the source. 
     * If there is no prefix, it will be the empty string.
     */
    @Generated
    @JsonProperty(value = "prefixWord")
    private final String prefixWord;

    /*
     * A list of "back translations" of the target. For example, source words that the target can translate to.
     * The list is guaranteed to contain the source word that was requested (e.g., if the source word being
     * looked up is "fly", then it is guaranteed that "fly" will be in the backTranslations list).
     * However, it is not guaranteed to be in the first position, and often will not be.
     */
    @Generated
    @JsonProperty(value = "backTranslations")
    private final List<BackTranslation> backTranslations;

    /**
     * Creates an instance of DictionaryTranslation class.
     *
     * @param normalizedTarget the normalizedTarget value to set.
     * @param displayTarget the displayTarget value to set.
     * @param posTag the posTag value to set.
     * @param confidence the confidence value to set.
     * @param prefixWord the prefixWord value to set.
     * @param backTranslations the backTranslations value to set.
     */
    @Generated
    @JsonCreator
    private DictionaryTranslation(@JsonProperty(value = "normalizedTarget") String normalizedTarget,
        @JsonProperty(value = "displayTarget") String displayTarget, @JsonProperty(value = "posTag") String posTag,
        @JsonProperty(value = "confidence") double confidence, @JsonProperty(value = "prefixWord") String prefixWord,
        @JsonProperty(value = "backTranslations") List<BackTranslation> backTranslations) {
        this.normalizedTarget = normalizedTarget;
        this.displayTarget = displayTarget;
        this.posTag = posTag;
        this.confidence = confidence;
        this.prefixWord = prefixWord;
        this.backTranslations = backTranslations;
    }

    /**
     * Get the normalizedTarget property: A string giving the normalized form of this term in the target language.
     * This value should be used as input to lookup examples.
     *
     * @return the normalizedTarget value.
     */
    @Generated
    public String getNormalizedTarget() {
        return this.normalizedTarget;
    }

    /**
     * Get the displayTarget property: A string giving the term in the target language and in a form best suited
     * for end-user display. Generally, this will only differ from the normalizedTarget
     * in terms of capitalization. For example, a proper noun like "Juan" will have
     * normalizedTarget = "juan" and displayTarget = "Juan".
     *
     * @return the displayTarget value.
     */
    @Generated
    public String getDisplayTarget() {
        return this.displayTarget;
    }

    /**
     * Get the posTag property: A string associating this term with a part-of-speech tag.
     *
     * @return the posTag value.
     */
    @Generated
    public String getPosTag() {
        return this.posTag;
    }

    /**
     * Get the confidence property: A value between 0.0 and 1.0 which represents the "confidence"
     * (or perhaps more accurately, "probability in the training data") of that translation pair.
     * The sum of confidence scores for one source word may or may not sum to 1.0.
     *
     * @return the confidence value.
     */
    @Generated
    public double getConfidence() {
        return this.confidence;
    }

    /**
     * Get the prefixWord property: A string giving the word to display as a prefix of the translation. Currently,
     * this is the gendered determiner of nouns, in languages that have gendered determiners.
     * For example, the prefix of the Spanish word "mosca" is "la", since "mosca" is a feminine noun in Spanish.
     * This is only dependent on the translation, and not on the source.
     * If there is no prefix, it will be the empty string.
     *
     * @return the prefixWord value.
     */
    @Generated
    public String getPrefixWord() {
        return this.prefixWord;
    }

    /**
     * Get the backTranslations property: A list of "back translations" of the target. For example, source words that
     * the target can translate to.
     * The list is guaranteed to contain the source word that was requested (e.g., if the source word being
     * looked up is "fly", then it is guaranteed that "fly" will be in the backTranslations list).
     * However, it is not guaranteed to be in the first position, and often will not be.
     *
     * @return the backTranslations value.
     */
    @Generated
    public List<BackTranslation> getBackTranslations() {
        return this.backTranslations;
    }
}
