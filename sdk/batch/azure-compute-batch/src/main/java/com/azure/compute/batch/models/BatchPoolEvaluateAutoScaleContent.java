// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameters for evaluating an automatic scaling formula on an Azure Batch Pool.
 */
@Immutable
public final class BatchPoolEvaluateAutoScaleContent implements JsonSerializable<BatchPoolEvaluateAutoScaleContent> {

    /*
     * The formula for the desired number of Compute Nodes in the Pool. The formula is validated and its results
     * calculated, but it is not applied to the Pool. To apply the formula to the Pool, 'Enable automatic scaling on a
     * Pool'. For more information about specifying this formula, see Automatically scale Compute Nodes in an Azure
     * Batch Pool (https://azure.microsoft.com/en-us/documentation/articles/batch-automatic-scaling).
     */
    @Generated
    private final String autoScaleFormula;

    /**
     * Creates an instance of BatchPoolEvaluateAutoScaleContent class.
     *
     * @param autoScaleFormula the autoScaleFormula value to set.
     */
    @Generated
    public BatchPoolEvaluateAutoScaleContent(String autoScaleFormula) {
        this.autoScaleFormula = autoScaleFormula;
    }

    /**
     * Get the autoScaleFormula property: The formula for the desired number of Compute Nodes in the Pool. The formula
     * is validated and its results calculated, but it is not applied to the Pool. To apply the formula to the Pool,
     * 'Enable automatic scaling on a Pool'. For more information about specifying this formula, see Automatically scale
     * Compute Nodes in an Azure Batch Pool
     * (https://azure.microsoft.com/en-us/documentation/articles/batch-automatic-scaling).
     *
     * @return the autoScaleFormula value.
     */
    @Generated
    public String getAutoScaleFormula() {
        return this.autoScaleFormula;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("autoScaleFormula", this.autoScaleFormula);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchPoolEvaluateAutoScaleContent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchPoolEvaluateAutoScaleContent if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchPoolEvaluateAutoScaleContent.
     */
    @Generated
    public static BatchPoolEvaluateAutoScaleContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String autoScaleFormula = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("autoScaleFormula".equals(fieldName)) {
                    autoScaleFormula = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new BatchPoolEvaluateAutoScaleContent(autoScaleFormula);
        });
    }
}
