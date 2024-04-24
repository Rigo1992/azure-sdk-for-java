// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A representation of an image output emitted by a code interpreter tool in response to a tool call by the model.
 */
@Immutable
public final class RunStepCodeInterpreterImageOutput extends RunStepCodeInterpreterToolCallOutput {

    /*
     * Referential information for the image associated with this output.
     */
    @Generated
    private final RunStepCodeInterpreterImageReference image;

    /**
     * Creates an instance of RunStepCodeInterpreterImageOutput class.
     *
     * @param image the image value to set.
     */
    @Generated
    private RunStepCodeInterpreterImageOutput(RunStepCodeInterpreterImageReference image) {
        this.image = image;
    }

    /**
     * Get the image property: Referential information for the image associated with this output.
     *
     * @return the image value.
     */
    @Generated
    public RunStepCodeInterpreterImageReference getImage() {
        return this.image;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("image", this.image);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepCodeInterpreterImageOutput from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepCodeInterpreterImageOutput if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepCodeInterpreterImageOutput.
     */
    @Generated
    public static RunStepCodeInterpreterImageOutput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepCodeInterpreterImageReference image = null;
            String type = "image";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("image".equals(fieldName)) {
                    image = RunStepCodeInterpreterImageReference.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            RunStepCodeInterpreterImageOutput deserializedRunStepCodeInterpreterImageOutput
                = new RunStepCodeInterpreterImageOutput(image);
            deserializedRunStepCodeInterpreterImageOutput.type = type;
            return deserializedRunStepCodeInterpreterImageOutput;
        });
    }

    /*
     * The object type.
     */
    @Generated
    private String type = "image";

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }
}
