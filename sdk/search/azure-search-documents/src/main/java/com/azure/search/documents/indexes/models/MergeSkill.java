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

/**
 * A skill for merging two or more strings into a single unified string, with an optional user-defined delimiter
 * separating each component part.
 */
@Fluent
public final class MergeSkill extends SearchIndexerSkill {
    /*
     * Identifies the concrete type of the skill.
     */
    private String odataType = "#Microsoft.Skills.Text.MergeSkill";

    /*
     * The tag indicates the start of the merged text. By default, the tag is an empty space.
     */
    private String insertPreTag;

    /*
     * The tag indicates the end of the merged text. By default, the tag is an empty space.
     */
    private String insertPostTag;

    /**
     * Creates an instance of MergeSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    public MergeSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the insertPreTag property: The tag indicates the start of the merged text. By default, the tag is an empty
     * space.
     *
     * @return the insertPreTag value.
     */
    public String getInsertPreTag() {
        return this.insertPreTag;
    }

    /**
     * Set the insertPreTag property: The tag indicates the start of the merged text. By default, the tag is an empty
     * space.
     *
     * @param insertPreTag the insertPreTag value to set.
     * @return the MergeSkill object itself.
     */
    public MergeSkill setInsertPreTag(String insertPreTag) {
        this.insertPreTag = insertPreTag;
        return this;
    }

    /**
     * Get the insertPostTag property: The tag indicates the end of the merged text. By default, the tag is an empty
     * space.
     *
     * @return the insertPostTag value.
     */
    public String getInsertPostTag() {
        return this.insertPostTag;
    }

    /**
     * Set the insertPostTag property: The tag indicates the end of the merged text. By default, the tag is an empty
     * space.
     *
     * @param insertPostTag the insertPostTag value to set.
     * @return the MergeSkill object itself.
     */
    public MergeSkill setInsertPostTag(String insertPostTag) {
        this.insertPostTag = insertPostTag;
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
        jsonWriter.writeStringField("insertPreTag", this.insertPreTag, false);
        jsonWriter.writeStringField("insertPostTag", this.insertPostTag, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of MergeSkill from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MergeSkill if the JsonReader was pointing to an instance of it, or null if it was pointing
     *     to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     */
    public static MergeSkill fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    String odataType = "#Microsoft.Skills.Text.MergeSkill";
                    boolean inputsFound = false;
                    List<InputFieldMappingEntry> inputs = null;
                    boolean outputsFound = false;
                    List<OutputFieldMappingEntry> outputs = null;
                    String name = null;
                    String description = null;
                    String context = null;
                    String insertPreTag = null;
                    String insertPostTag = null;
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
                        } else if ("insertPreTag".equals(fieldName)) {
                            insertPreTag = reader.getStringValue();
                        } else if ("insertPostTag".equals(fieldName)) {
                            insertPostTag = reader.getStringValue();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    if (!"#Microsoft.Skills.Text.MergeSkill".equals(odataType)) {
                        throw new IllegalStateException(
                                "'@odata.type' was expected to be non-null and equal to '#Microsoft.Skills.Text.MergeSkill'. The found '@odata.type' was '"
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
                    MergeSkill deserializedValue = new MergeSkill(inputs, outputs);
                    deserializedValue.odataType = odataType;
                    deserializedValue.setName(name);
                    deserializedValue.setDescription(description);
                    deserializedValue.setContext(context);
                    deserializedValue.insertPreTag = insertPreTag;
                    deserializedValue.insertPostTag = insertPostTag;

                    return deserializedValue;
                });
    }
}
