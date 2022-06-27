// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/** Represents an item-level warning. */
@Immutable
public final class SearchIndexerWarning implements JsonSerializable<SearchIndexerWarning> {
    /*
     * The key of the item which generated a warning.
     */
    private String key;

    /*
     * The message describing the warning that occurred while processing the item.
     */
    private final String message;

    /*
     * The name of the source at which the warning originated. For example, this could refer to a particular skill in
     * the attached skillset. This may not be always available.
     */
    private String name;

    /*
     * Additional, verbose details about the warning to assist in debugging the indexer. This may not be always
     * available.
     */
    private String details;

    /*
     * A link to a troubleshooting guide for these classes of warnings. This may not be always available.
     */
    private String documentationLink;

    /**
     * Creates an instance of SearchIndexerWarning class.
     *
     * @param message the message value to set.
     */
    public SearchIndexerWarning(String message) {
        this.message = message;
    }

    /**
     * Get the key property: The key of the item which generated a warning.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Get the message property: The message describing the warning that occurred while processing the item.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the name property: The name of the source at which the warning originated. For example, this could refer to a
     * particular skill in the attached skillset. This may not be always available.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the details property: Additional, verbose details about the warning to assist in debugging the indexer. This
     * may not be always available.
     *
     * @return the details value.
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Get the documentationLink property: A link to a troubleshooting guide for these classes of warnings. This may not
     * be always available.
     *
     * @return the documentationLink value.
     */
    public String getDocumentationLink() {
        return this.documentationLink;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("message", this.message, false);
        jsonWriter.writeStringField("key", this.key, false);
        jsonWriter.writeStringField("name", this.name, false);
        jsonWriter.writeStringField("details", this.details, false);
        jsonWriter.writeStringField("documentationLink", this.documentationLink, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of SearchIndexerWarning from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerWarning if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static SearchIndexerWarning fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    boolean messageFound = false;
                    String message = null;
                    String key = null;
                    String name = null;
                    String details = null;
                    String documentationLink = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("message".equals(fieldName)) {
                            message = reader.getStringValue();
                            messageFound = true;
                        } else if ("key".equals(fieldName)) {
                            key = reader.getStringValue();
                        } else if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                        } else if ("details".equals(fieldName)) {
                            details = reader.getStringValue();
                        } else if ("documentationLink".equals(fieldName)) {
                            documentationLink = reader.getStringValue();
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!messageFound) {
                        missingProperties.add("message");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    SearchIndexerWarning deserializedValue = new SearchIndexerWarning(message);
                    deserializedValue.key = key;
                    deserializedValue.name = name;
                    deserializedValue.details = details;
                    deserializedValue.documentationLink = documentationLink;

                    return deserializedValue;
                });
    }
}
