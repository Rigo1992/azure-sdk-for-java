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

/** The HealthcareResultDocumentsItem model. */
@Fluent
public final class HealthcareResultDocumentsItem extends HealthcareEntitiesDocumentResult {
    /** Creates an instance of HealthcareResultDocumentsItem class. */
    public HealthcareResultDocumentsItem() {}

    /** {@inheritDoc} */
    @Override
    public HealthcareResultDocumentsItem setEntities(List<HealthcareEntity> entities) {
        super.setEntities(entities);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HealthcareResultDocumentsItem setRelations(List<HealthcareRelation> relations) {
        super.setRelations(relations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HealthcareResultDocumentsItem setId(String id) {
        super.setId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HealthcareResultDocumentsItem setWarnings(List<DocumentWarning> warnings) {
        super.setWarnings(warnings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HealthcareResultDocumentsItem setStatistics(DocumentStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", getId());
        jsonWriter.writeArrayField("warnings", getWarnings(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("entities", getEntities(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("relations", getRelations(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("statistics", getStatistics());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HealthcareResultDocumentsItem from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of HealthcareResultDocumentsItem if the JsonReader was pointing to an instance of it, or null
     *     if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HealthcareResultDocumentsItem.
     */
    public static HealthcareResultDocumentsItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    HealthcareResultDocumentsItem deserializedHealthcareResultDocumentsItem =
                            new HealthcareResultDocumentsItem();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("id".equals(fieldName)) {
                            deserializedHealthcareResultDocumentsItem.setId(reader.getString());
                        } else if ("warnings".equals(fieldName)) {
                            List<DocumentWarning> warnings =
                                    reader.readArray(reader1 -> DocumentWarning.fromJson(reader1));
                            deserializedHealthcareResultDocumentsItem.setWarnings(warnings);
                        } else if ("entities".equals(fieldName)) {
                            List<HealthcareEntity> entities =
                                    reader.readArray(reader1 -> HealthcareEntity.fromJson(reader1));
                            deserializedHealthcareResultDocumentsItem.setEntities(entities);
                        } else if ("relations".equals(fieldName)) {
                            List<HealthcareRelation> relations =
                                    reader.readArray(reader1 -> HealthcareRelation.fromJson(reader1));
                            deserializedHealthcareResultDocumentsItem.setRelations(relations);
                        } else if ("statistics".equals(fieldName)) {
                            deserializedHealthcareResultDocumentsItem.setStatistics(
                                    DocumentStatistics.fromJson(reader));
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedHealthcareResultDocumentsItem;
                });
    }
}
