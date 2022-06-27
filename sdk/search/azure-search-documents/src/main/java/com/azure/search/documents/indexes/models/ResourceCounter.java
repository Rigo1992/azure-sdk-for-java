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

/** Represents a resource's usage and quota. */
@Fluent
public final class ResourceCounter implements JsonSerializable<ResourceCounter> {
    /*
     * The resource usage amount.
     */
    private final long usage;

    /*
     * The resource amount quota.
     */
    private Long quota;

    /**
     * Creates an instance of ResourceCounter class.
     *
     * @param usage the usage value to set.
     */
    public ResourceCounter(long usage) {
        this.usage = usage;
    }

    /**
     * Get the usage property: The resource usage amount.
     *
     * @return the usage value.
     */
    public long getUsage() {
        return this.usage;
    }

    /**
     * Get the quota property: The resource amount quota.
     *
     * @return the quota value.
     */
    public Long getQuota() {
        return this.quota;
    }

    /**
     * Set the quota property: The resource amount quota.
     *
     * @param quota the quota value to set.
     * @return the ResourceCounter object itself.
     */
    public ResourceCounter setQuota(Long quota) {
        this.quota = quota;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeLongField("usage", this.usage);
        jsonWriter.writeLongField("quota", this.quota, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of ResourceCounter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceCounter if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static ResourceCounter fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    boolean usageFound = false;
                    long usage = 0L;
                    Long quota = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("usage".equals(fieldName)) {
                            usage = reader.getLongValue();
                            usageFound = true;
                        } else if ("quota".equals(fieldName)) {
                            quota = JsonUtils.getNullableProperty(reader, r -> reader.getLongValue());
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!usageFound) {
                        missingProperties.add("usage");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    ResourceCounter deserializedValue = new ResourceCounter(usage);
                    deserializedValue.quota = quota;

                    return deserializedValue;
                });
    }
}
