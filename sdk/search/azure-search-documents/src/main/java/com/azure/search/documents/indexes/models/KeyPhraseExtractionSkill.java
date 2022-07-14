// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/** A skill that uses text analytics for key phrase extraction. */
@Fluent
public final class KeyPhraseExtractionSkill extends SearchIndexerSkill {
    /*
     * Identifies the concrete type of the skill.
     */
    private String odataType = "#Microsoft.Skills.Text.KeyPhraseExtractionSkill";

    /*
     * A value indicating which language code to use. Default is en.
     */
    private KeyPhraseExtractionSkillLanguage defaultLanguageCode;

    /*
     * A number indicating how many key phrases to return. If absent, all identified key phrases will be returned.
     */
    private Integer maxKeyPhraseCount;

    /*
     * The version of the model to use when calling the Text Analytics service. It will default to the latest available
     * when not specified. We recommend you do not specify this value unless absolutely necessary.
     */
    private String modelVersion;

    /**
     * Creates an instance of KeyPhraseExtractionSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    public KeyPhraseExtractionSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public KeyPhraseExtractionSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the KeyPhraseExtractionSkill object itself.
     */
    public KeyPhraseExtractionSkill setDefaultLanguageCode(KeyPhraseExtractionSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the maxKeyPhraseCount property: A number indicating how many key phrases to return. If absent, all identified
     * key phrases will be returned.
     *
     * @return the maxKeyPhraseCount value.
     */
    public Integer getMaxKeyPhraseCount() {
        return this.maxKeyPhraseCount;
    }

    /**
     * Set the maxKeyPhraseCount property: A number indicating how many key phrases to return. If absent, all identified
     * key phrases will be returned.
     *
     * @param maxKeyPhraseCount the maxKeyPhraseCount value to set.
     * @return the KeyPhraseExtractionSkill object itself.
     */
    public KeyPhraseExtractionSkill setMaxKeyPhraseCount(Integer maxKeyPhraseCount) {
        this.maxKeyPhraseCount = maxKeyPhraseCount;
        return this;
    }

    /**
     * Get the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @param modelVersion the modelVersion value to set.
     * @return the KeyPhraseExtractionSkill object itself.
     */
    public KeyPhraseExtractionSkill setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", odataType);
        jsonWriter.writeArrayField("inputs", getInputs(), false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outputs", getOutputs(), false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("name", getName(), false);
        jsonWriter.writeStringField("description", getDescription(), false);
        jsonWriter.writeStringField("context", getContext(), false);
        jsonWriter.writeStringField(
                "defaultLanguageCode",
                this.defaultLanguageCode == null ? null : this.defaultLanguageCode.toString(),
                false);
        jsonWriter.writeIntegerField("maxKeyPhraseCount", this.maxKeyPhraseCount, false);
        jsonWriter.writeStringField("modelVersion", this.modelVersion, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of KeyPhraseExtractionSkill from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyPhraseExtractionSkill if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     */
    public static KeyPhraseExtractionSkill fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    String odataType = "#Microsoft.Skills.Text.KeyPhraseExtractionSkill";
                    boolean inputsFound = false;
                    List<InputFieldMappingEntry> inputs = null;
                    boolean outputsFound = false;
                    List<OutputFieldMappingEntry> outputs = null;
                    String name = null;
                    String description = null;
                    String context = null;
                    KeyPhraseExtractionSkillLanguage defaultLanguageCode = null;
                    Integer maxKeyPhraseCount = null;
                    String modelVersion = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            odataType = reader.getStringValue();
                        } else if ("inputs".equals(fieldName)) {
                            inputs = reader.readArray(reader1 -> InputFieldMappingEntry.fromJson(reader1));
                            inputsFound = true;
                        } else if ("outputs".equals(fieldName)) {
                            outputs = reader.readArray(reader1 -> OutputFieldMappingEntry.fromJson(reader1));
                            outputsFound = true;
                        } else if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                        } else if ("description".equals(fieldName)) {
                            description = reader.getStringValue();
                        } else if ("context".equals(fieldName)) {
                            context = reader.getStringValue();
                        } else if ("defaultLanguageCode".equals(fieldName)) {
                            defaultLanguageCode = KeyPhraseExtractionSkillLanguage.fromString(reader.getStringValue());
                        } else if ("maxKeyPhraseCount".equals(fieldName)) {
                            maxKeyPhraseCount = reader.getIntegerNullableValue();
                        } else if ("modelVersion".equals(fieldName)) {
                            modelVersion = reader.getStringValue();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    if (!"#Microsoft.Skills.Text.KeyPhraseExtractionSkill".equals(odataType)) {
                        throw new IllegalStateException(
                                "'@odata.type' was expected to be non-null and equal to '#Microsoft.Skills.Text.KeyPhraseExtractionSkill'. The found '@odata.type' was '"
                                        + odataType
                                        + "'.");
                    }

                    List<String> missingProperties = new ArrayList<>();
                    if (!inputsFound) {
                        missingProperties.add("inputs");
                    }
                    if (!outputsFound) {
                        missingProperties.add("outputs");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    KeyPhraseExtractionSkill deserializedValue = new KeyPhraseExtractionSkill(inputs, outputs);
                    deserializedValue.odataType = odataType;
                    deserializedValue.setName(name);
                    deserializedValue.setDescription(description);
                    deserializedValue.setContext(context);
                    deserializedValue.defaultLanguageCode = defaultLanguageCode;
                    deserializedValue.maxKeyPhraseCount = maxKeyPhraseCount;
                    deserializedValue.modelVersion = modelVersion;

                    return deserializedValue;
                });
    }
}
