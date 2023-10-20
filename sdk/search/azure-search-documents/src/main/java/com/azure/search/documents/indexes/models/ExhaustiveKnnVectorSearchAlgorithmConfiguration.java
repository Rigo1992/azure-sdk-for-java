// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains configuration options specific to the exhaustive KNN algorithm used during querying, which will perform
 * brute-force search across the entire vector index.
 */
@Fluent
public final class ExhaustiveKnnVectorSearchAlgorithmConfiguration extends VectorSearchAlgorithmConfiguration {
    /*
     * The name of the kind of algorithm being configured for use with vector search.
     */
    /*
     * Contains the parameters specific to exhaustive KNN algorithm.
     */
    private ExhaustiveKnnParameters parameters;

    /**
     * Creates an instance of ExhaustiveKnnVectorSearchAlgorithmConfiguration class.
     *
     * @param name the name value to set.
     */
    public ExhaustiveKnnVectorSearchAlgorithmConfiguration(String name) {
        super(name);
    }

    /**
     * Get the parameters property: Contains the parameters specific to exhaustive KNN algorithm.
     *
     * @return the parameters value.
     */
    public ExhaustiveKnnParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Contains the parameters specific to exhaustive KNN algorithm.
     *
     * @param parameters the parameters value to set.
     * @return the ExhaustiveKnnVectorSearchAlgorithmConfiguration object itself.
     */
    public ExhaustiveKnnVectorSearchAlgorithmConfiguration setParameters(ExhaustiveKnnParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", Objects.toString(VectorSearchAlgorithmKind.EXHAUSTIVE_KNN, null));
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeJsonField("exhaustiveKnnParameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExhaustiveKnnVectorSearchAlgorithmConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExhaustiveKnnVectorSearchAlgorithmConfiguration if the JsonReader was pointing to an
     *     instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the ExhaustiveKnnVectorSearchAlgorithmConfiguration.
     */
    public static ExhaustiveKnnVectorSearchAlgorithmConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    ExhaustiveKnnParameters parameters = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!"exhaustiveKnn".equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to 'exhaustiveKnn'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("exhaustiveKnnParameters".equals(fieldName)) {
                            parameters = ExhaustiveKnnParameters.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        ExhaustiveKnnVectorSearchAlgorithmConfiguration
                                deserializedExhaustiveKnnVectorSearchAlgorithmConfiguration =
                                        new ExhaustiveKnnVectorSearchAlgorithmConfiguration(name);
                        deserializedExhaustiveKnnVectorSearchAlgorithmConfiguration.parameters = parameters;

                        return deserializedExhaustiveKnnVectorSearchAlgorithmConfiguration;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
