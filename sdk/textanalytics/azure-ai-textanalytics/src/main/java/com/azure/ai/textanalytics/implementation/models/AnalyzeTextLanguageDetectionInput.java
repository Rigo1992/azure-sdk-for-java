// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/** The AnalyzeTextLanguageDetectionInput model. */
@Fluent
public final class AnalyzeTextLanguageDetectionInput extends AnalyzeTextTask {
    /*
     * The analysisInput property.
     */
    private LanguageDetectionAnalysisInput analysisInput;

    /*
     * Supported parameters for a Language Detection task.
     */
    private LanguageDetectionTaskParameters parameters;

    /** Creates an instance of AnalyzeTextLanguageDetectionInput class. */
    public AnalyzeTextLanguageDetectionInput() {}

    /**
     * Get the analysisInput property: The analysisInput property.
     *
     * @return the analysisInput value.
     */
    public LanguageDetectionAnalysisInput getAnalysisInput() {
        return this.analysisInput;
    }

    /**
     * Set the analysisInput property: The analysisInput property.
     *
     * @param analysisInput the analysisInput value to set.
     * @return the AnalyzeTextLanguageDetectionInput object itself.
     */
    public AnalyzeTextLanguageDetectionInput setAnalysisInput(LanguageDetectionAnalysisInput analysisInput) {
        this.analysisInput = analysisInput;
        return this;
    }

    /**
     * Get the parameters property: Supported parameters for a Language Detection task.
     *
     * @return the parameters value.
     */
    public LanguageDetectionTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Supported parameters for a Language Detection task.
     *
     * @param parameters the parameters value to set.
     * @return the AnalyzeTextLanguageDetectionInput object itself.
     */
    public AnalyzeTextLanguageDetectionInput setParameters(LanguageDetectionTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", Objects.toString(AnalyzeTextTaskKind.LANGUAGE_DETECTION, null));
        jsonWriter.writeJsonField("analysisInput", this.analysisInput);
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnalyzeTextLanguageDetectionInput from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnalyzeTextLanguageDetectionInput if the JsonReader was pointing to an instance of it, or
     *     null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the AnalyzeTextLanguageDetectionInput.
     */
    public static AnalyzeTextLanguageDetectionInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    AnalyzeTextLanguageDetectionInput deserializedAnalyzeTextLanguageDetectionInput =
                            new AnalyzeTextLanguageDetectionInput();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!"LanguageDetection".equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to 'LanguageDetection'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("analysisInput".equals(fieldName)) {
                            deserializedAnalyzeTextLanguageDetectionInput.analysisInput =
                                    LanguageDetectionAnalysisInput.fromJson(reader);
                        } else if ("parameters".equals(fieldName)) {
                            deserializedAnalyzeTextLanguageDetectionInput.parameters =
                                    LanguageDetectionTaskParameters.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedAnalyzeTextLanguageDetectionInput;
                });
    }
}
