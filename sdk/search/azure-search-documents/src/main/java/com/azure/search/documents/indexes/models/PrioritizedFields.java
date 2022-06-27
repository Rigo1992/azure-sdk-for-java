// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.List;

/**
 * Describes the title, content, and keywords fields to be used for semantic ranking, captions, highlights, and answers.
 */
@Fluent
public final class PrioritizedFields implements JsonSerializable<PrioritizedFields> {
    /*
     * Defines the title field to be used for semantic ranking, captions, highlights, and answers. If you don't have a
     * title field in your index, leave this blank.
     */
    private SemanticField titleField;

    /*
     * Defines the content fields to be used for semantic ranking, captions, highlights, and answers. For the best
     * result, the selected fields should contain text in natural language form. The order of the fields in the array
     * represents their priority. Fields with lower priority may get truncated if the content is long.
     */
    private List<SemanticField> prioritizedContentFields;

    /*
     * Defines the keyword fields to be used for semantic ranking, captions, highlights, and answers. For the best
     * result, the selected fields should contain a list of keywords. The order of the fields in the array represents
     * their priority. Fields with lower priority may get truncated if the content is long.
     */
    private List<SemanticField> prioritizedKeywordsFields;

    /**
     * Get the titleField property: Defines the title field to be used for semantic ranking, captions, highlights, and
     * answers. If you don't have a title field in your index, leave this blank.
     *
     * @return the titleField value.
     */
    public SemanticField getTitleField() {
        return this.titleField;
    }

    /**
     * Set the titleField property: Defines the title field to be used for semantic ranking, captions, highlights, and
     * answers. If you don't have a title field in your index, leave this blank.
     *
     * @param titleField the titleField value to set.
     * @return the PrioritizedFields object itself.
     */
    public PrioritizedFields setTitleField(SemanticField titleField) {
        this.titleField = titleField;
        return this;
    }

    /**
     * Get the prioritizedContentFields property: Defines the content fields to be used for semantic ranking, captions,
     * highlights, and answers. For the best result, the selected fields should contain text in natural language form.
     * The order of the fields in the array represents their priority. Fields with lower priority may get truncated if
     * the content is long.
     *
     * @return the prioritizedContentFields value.
     */
    public List<SemanticField> getPrioritizedContentFields() {
        return this.prioritizedContentFields;
    }

    /**
     * Set the prioritizedContentFields property: Defines the content fields to be used for semantic ranking, captions,
     * highlights, and answers. For the best result, the selected fields should contain text in natural language form.
     * The order of the fields in the array represents their priority. Fields with lower priority may get truncated if
     * the content is long.
     *
     * @param prioritizedContentFields the prioritizedContentFields value to set.
     * @return the PrioritizedFields object itself.
     */
    public PrioritizedFields setPrioritizedContentFields(List<SemanticField> prioritizedContentFields) {
        this.prioritizedContentFields = prioritizedContentFields;
        return this;
    }

    /**
     * Get the prioritizedKeywordsFields property: Defines the keyword fields to be used for semantic ranking, captions,
     * highlights, and answers. For the best result, the selected fields should contain a list of keywords. The order of
     * the fields in the array represents their priority. Fields with lower priority may get truncated if the content is
     * long.
     *
     * @return the prioritizedKeywordsFields value.
     */
    public List<SemanticField> getPrioritizedKeywordsFields() {
        return this.prioritizedKeywordsFields;
    }

    /**
     * Set the prioritizedKeywordsFields property: Defines the keyword fields to be used for semantic ranking, captions,
     * highlights, and answers. For the best result, the selected fields should contain a list of keywords. The order of
     * the fields in the array represents their priority. Fields with lower priority may get truncated if the content is
     * long.
     *
     * @param prioritizedKeywordsFields the prioritizedKeywordsFields value to set.
     * @return the PrioritizedFields object itself.
     */
    public PrioritizedFields setPrioritizedKeywordsFields(List<SemanticField> prioritizedKeywordsFields) {
        this.prioritizedKeywordsFields = prioritizedKeywordsFields;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("titleField", this.titleField, false);
        JsonUtils.writeArray(
                jsonWriter,
                "prioritizedContentFields",
                this.prioritizedContentFields,
                (writer, element) -> writer.writeJson(element, false));
        JsonUtils.writeArray(
                jsonWriter,
                "prioritizedKeywordsFields",
                this.prioritizedKeywordsFields,
                (writer, element) -> writer.writeJson(element, false));
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of PrioritizedFields from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrioritizedFields if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     */
    public static PrioritizedFields fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    SemanticField titleField = null;
                    List<SemanticField> prioritizedContentFields = null;
                    List<SemanticField> prioritizedKeywordsFields = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("titleField".equals(fieldName)) {
                            titleField = SemanticField.fromJson(reader);
                        } else if ("prioritizedContentFields".equals(fieldName)) {
                            prioritizedContentFields =
                                    JsonUtils.readArray(reader, reader1 -> SemanticField.fromJson(reader1));
                        } else if ("prioritizedKeywordsFields".equals(fieldName)) {
                            prioritizedKeywordsFields =
                                    JsonUtils.readArray(reader, reader1 -> SemanticField.fromJson(reader1));
                        } else {
                            reader.skipChildren();
                        }
                    }
                    PrioritizedFields deserializedValue = new PrioritizedFields();
                    deserializedValue.titleField = titleField;
                    deserializedValue.prioritizedContentFields = prioritizedContentFields;
                    deserializedValue.prioritizedKeywordsFields = prioritizedKeywordsFields;

                    return deserializedValue;
                });
    }
}
