// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A skill to translate text from one language to another. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Skills.Text.TranslationSkill")
@Fluent
public final class TextTranslationSkill extends SearchIndexerSkill {
    /*
     * Identifies the concrete type of the skill.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Skills.Text.TranslationSkill";

    /*
     * The language code to translate documents into for documents that don't specify the to language explicitly.
     */
    @JsonProperty(value = "defaultToLanguageCode", required = true)
    private TextTranslationSkillLanguage defaultToLanguageCode;

    /*
     * The language code to translate documents from for documents that don't specify the from language explicitly.
     */
    @JsonProperty(value = "defaultFromLanguageCode")
    private TextTranslationSkillLanguage defaultFromLanguageCode;

    /*
     * The language code to translate documents from when neither the fromLanguageCode input nor the
     * defaultFromLanguageCode parameter are provided, and the automatic language detection is unsuccessful. Default is
     * en.
     */
    @JsonProperty(value = "suggestedFrom")
    private TextTranslationSkillLanguage suggestedFrom;

    /**
     * Creates an instance of TextTranslationSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     * @param defaultToLanguageCode the defaultToLanguageCode value to set.
     */
    @JsonCreator
    public TextTranslationSkill(
            @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
            @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs,
            @JsonProperty(value = "defaultToLanguageCode", required = true)
                    TextTranslationSkillLanguage defaultToLanguageCode) {
        super(inputs, outputs);
        this.defaultToLanguageCode = defaultToLanguageCode;
    }

    /**
     * Get the defaultToLanguageCode property: The language code to translate documents into for documents that don't
     * specify the to language explicitly.
     *
     * @return the defaultToLanguageCode value.
     */
    public TextTranslationSkillLanguage getDefaultToLanguageCode() {
        return this.defaultToLanguageCode;
    }

    /**
     * Get the defaultFromLanguageCode property: The language code to translate documents from for documents that don't
     * specify the from language explicitly.
     *
     * @return the defaultFromLanguageCode value.
     */
    public TextTranslationSkillLanguage getDefaultFromLanguageCode() {
        return this.defaultFromLanguageCode;
    }

    /**
     * Set the defaultFromLanguageCode property: The language code to translate documents from for documents that don't
     * specify the from language explicitly.
     *
     * @param defaultFromLanguageCode the defaultFromLanguageCode value to set.
     * @return the TextTranslationSkill object itself.
     */
    public TextTranslationSkill setDefaultFromLanguageCode(TextTranslationSkillLanguage defaultFromLanguageCode) {
        this.defaultFromLanguageCode = defaultFromLanguageCode;
        return this;
    }

    /**
     * Get the suggestedFrom property: The language code to translate documents from when neither the fromLanguageCode
     * input nor the defaultFromLanguageCode parameter are provided, and the automatic language detection is
     * unsuccessful. Default is en.
     *
     * @return the suggestedFrom value.
     */
    public TextTranslationSkillLanguage getSuggestedFrom() {
        return this.suggestedFrom;
    }

    /**
     * Set the suggestedFrom property: The language code to translate documents from when neither the fromLanguageCode
     * input nor the defaultFromLanguageCode parameter are provided, and the automatic language detection is
     * unsuccessful. Default is en.
     *
     * @param suggestedFrom the suggestedFrom value to set.
     * @return the TextTranslationSkill object itself.
     */
    public TextTranslationSkill setSuggestedFrom(TextTranslationSkillLanguage suggestedFrom) {
        this.suggestedFrom = suggestedFrom;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TextTranslationSkill setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TextTranslationSkill setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TextTranslationSkill setContext(String context) {
        super.setContext(context);
        return this;
    }
}
