// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/** The LanguageDetectionResult model. */
@Fluent
public final class LanguageDetectionResult extends PreBuiltResult {
    /*
     * Response by document
     */
    private List<LanguageDetectionDocumentResult> documents;

    /** Creates an instance of LanguageDetectionResult class. */
    public LanguageDetectionResult() {}

    /**
     * Get the documents property: Response by document.
     *
     * @return the documents value.
     */
    public List<LanguageDetectionDocumentResult> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Response by document.
     *
     * @param documents the documents value to set.
     * @return the LanguageDetectionResult object itself.
     */
    public LanguageDetectionResult setDocuments(List<LanguageDetectionDocumentResult> documents) {
        this.documents = documents;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LanguageDetectionResult setErrors(List<DocumentError> errors) {
        super.setErrors(errors);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LanguageDetectionResult setStatistics(RequestStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LanguageDetectionResult setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("errors", getErrors(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("modelVersion", getModelVersion());
        jsonWriter.writeJsonField("statistics", getStatistics());
        jsonWriter.writeArrayField("documents", this.documents, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LanguageDetectionResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of LanguageDetectionResult if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LanguageDetectionResult.
     */
    public static LanguageDetectionResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    LanguageDetectionResult deserializedLanguageDetectionResult = new LanguageDetectionResult();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("errors".equals(fieldName)) {
                            List<DocumentError> errors = reader.readArray(reader1 -> DocumentError.fromJson(reader1));
                            deserializedLanguageDetectionResult.setErrors(errors);
                        } else if ("modelVersion".equals(fieldName)) {
                            deserializedLanguageDetectionResult.setModelVersion(reader.getString());
                        } else if ("statistics".equals(fieldName)) {
                            deserializedLanguageDetectionResult.setStatistics(RequestStatistics.fromJson(reader));
                        } else if ("documents".equals(fieldName)) {
                            List<LanguageDetectionDocumentResult> documents =
                                    reader.readArray(reader1 -> LanguageDetectionDocumentResult.fromJson(reader1));
                            deserializedLanguageDetectionResult.documents = documents;
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedLanguageDetectionResult;
                });
    }
}
