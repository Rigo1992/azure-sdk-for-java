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

/** Response from a get service statistics request. If successful, it includes service level counters and limits. */
@Fluent
public final class SearchServiceStatistics implements JsonSerializable<SearchServiceStatistics> {
    /*
     * Service level resource counters.
     */
    private final SearchServiceCounters counters;

    /*
     * Service level general limits.
     */
    private final SearchServiceLimits limits;

    /**
     * Creates an instance of SearchServiceStatistics class.
     *
     * @param counters the counters value to set.
     * @param limits the limits value to set.
     */
    public SearchServiceStatistics(SearchServiceCounters counters, SearchServiceLimits limits) {
        this.counters = counters;
        this.limits = limits;
    }

    /**
     * Get the counters property: Service level resource counters.
     *
     * @return the counters value.
     */
    public SearchServiceCounters getCounters() {
        return this.counters;
    }

    /**
     * Get the limits property: Service level general limits.
     *
     * @return the limits value.
     */
    public SearchServiceLimits getLimits() {
        return this.limits;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("counters", this.counters, false);
        jsonWriter.writeJsonField("limits", this.limits, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of SearchServiceStatistics from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchServiceStatistics if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static SearchServiceStatistics fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    boolean countersFound = false;
                    SearchServiceCounters counters = null;
                    boolean limitsFound = false;
                    SearchServiceLimits limits = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("counters".equals(fieldName)) {
                            counters = SearchServiceCounters.fromJson(reader);
                            countersFound = true;
                        } else if ("limits".equals(fieldName)) {
                            limits = SearchServiceLimits.fromJson(reader);
                            limitsFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!countersFound) {
                        missingProperties.add("counters");
                    }
                    if (!limitsFound) {
                        missingProperties.add("limits");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    SearchServiceStatistics deserializedValue = new SearchServiceStatistics(counters, limits);

                    return deserializedValue;
                });
    }
}
