// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/** The result of Autocomplete requests. */
@Immutable
public final class AutocompleteItem implements JsonSerializable<AutocompleteItem> {
    /*
     * The completed term.
     */
    private final String text;

    /*
     * The query along with the completed term.
     */
    private final String queryPlusText;

    /**
     * Creates an instance of AutocompleteItem class.
     *
     * @param text the text value to set.
     * @param queryPlusText the queryPlusText value to set.
     */
    public AutocompleteItem(String text, String queryPlusText) {
        this.text = text;
        this.queryPlusText = queryPlusText;
    }

    /**
     * Get the text property: The completed term.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the queryPlusText property: The query along with the completed term.
     *
     * @return the queryPlusText value.
     */
    public String getQueryPlusText() {
        return this.queryPlusText;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("text", this.text, false);
        jsonWriter.writeStringField("queryPlusText", this.queryPlusText, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of AutocompleteItem from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutocompleteItem if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static AutocompleteItem fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    boolean textFound = false;
                    String text = null;
                    boolean queryPlusTextFound = false;
                    String queryPlusText = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("text".equals(fieldName)) {
                            text = reader.getStringValue();
                            textFound = true;
                        } else if ("queryPlusText".equals(fieldName)) {
                            queryPlusText = reader.getStringValue();
                            queryPlusTextFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!textFound) {
                        missingProperties.add("text");
                    }
                    if (!queryPlusTextFound) {
                        missingProperties.add("queryPlusText");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    AutocompleteItem deserializedValue = new AutocompleteItem(text, queryPlusText);

                    return deserializedValue;
                });
    }
}
