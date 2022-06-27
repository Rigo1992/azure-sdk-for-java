// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/** Input field mapping for a skill. */
@Fluent
public final class InputFieldMappingEntry implements JsonSerializable<InputFieldMappingEntry> {
    /*
     * The name of the input.
     */
    private final String name;

    /*
     * The source of the input.
     */
    private String source;

    /*
     * The source context used for selecting recursive inputs.
     */
    private String sourceContext;

    /*
     * The recursive inputs used when creating a complex type.
     */
    private List<InputFieldMappingEntry> inputs;

    /**
     * Creates an instance of InputFieldMappingEntry class.
     *
     * @param name the name value to set.
     */
    public InputFieldMappingEntry(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the input.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the source property: The source of the input.
     *
     * @return the source value.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: The source of the input.
     *
     * @param source the source value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    public InputFieldMappingEntry setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the sourceContext property: The source context used for selecting recursive inputs.
     *
     * @return the sourceContext value.
     */
    public String getSourceContext() {
        return this.sourceContext;
    }

    /**
     * Set the sourceContext property: The source context used for selecting recursive inputs.
     *
     * @param sourceContext the sourceContext value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    public InputFieldMappingEntry setSourceContext(String sourceContext) {
        this.sourceContext = sourceContext;
        return this;
    }

    /**
     * Get the inputs property: The recursive inputs used when creating a complex type.
     *
     * @return the inputs value.
     */
    public List<InputFieldMappingEntry> getInputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: The recursive inputs used when creating a complex type.
     *
     * @param inputs the inputs value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    public InputFieldMappingEntry setInputs(List<InputFieldMappingEntry> inputs) {
        this.inputs = inputs;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name, false);
        jsonWriter.writeStringField("source", this.source, false);
        jsonWriter.writeStringField("sourceContext", this.sourceContext, false);
        JsonUtils.writeArray(jsonWriter, "inputs", this.inputs, (writer, element) -> writer.writeJson(element, false));
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of InputFieldMappingEntry from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of InputFieldMappingEntry if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static InputFieldMappingEntry fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    String source = null;
                    String sourceContext = null;
                    List<InputFieldMappingEntry> inputs = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                            nameFound = true;
                        } else if ("source".equals(fieldName)) {
                            source = reader.getStringValue();
                        } else if ("sourceContext".equals(fieldName)) {
                            sourceContext = reader.getStringValue();
                        } else if ("inputs".equals(fieldName)) {
                            inputs = JsonUtils.readArray(reader, reader1 -> InputFieldMappingEntry.fromJson(reader1));
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    InputFieldMappingEntry deserializedValue = new InputFieldMappingEntry(name);
                    deserializedValue.source = source;
                    deserializedValue.sourceContext = sourceContext;
                    deserializedValue.inputs = inputs;

                    return deserializedValue;
                });
    }

    /**
     * Set the inputs property: The recursive inputs used when creating a complex type.
     *
     * @param inputs the inputs value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    public InputFieldMappingEntry setInputs(InputFieldMappingEntry... inputs) {
        this.inputs = (inputs == null) ? null : java.util.Arrays.asList(inputs);
        return this;
    }
}
