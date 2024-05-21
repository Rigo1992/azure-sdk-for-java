// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.namespaces.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The result of the Reject operation.
 */
@Immutable
public final class RejectResult implements JsonSerializable<RejectResult> {

    /*
     * Array of FailedLockToken for failed cloud events. Each FailedLockToken includes the lock token along with the
     * related error information (namely, the error code and description).
     */
    @Generated
    private final List<FailedLockToken> failedLockTokens;

    /*
     * Array of lock tokens for the successfully rejected cloud events.
     */
    @Generated
    private final List<String> succeededLockTokens;

    /**
     * Creates an instance of RejectResult class.
     *
     * @param failedLockTokens the failedLockTokens value to set.
     * @param succeededLockTokens the succeededLockTokens value to set.
     */
    @Generated
    private RejectResult(List<FailedLockToken> failedLockTokens, List<String> succeededLockTokens) {
        this.failedLockTokens = failedLockTokens;
        this.succeededLockTokens = succeededLockTokens;
    }

    /**
     * Get the failedLockTokens property: Array of FailedLockToken for failed cloud events. Each FailedLockToken
     * includes the lock token along with the related error information (namely, the error code and description).
     *
     * @return the failedLockTokens value.
     */
    @Generated
    public List<FailedLockToken> getFailedLockTokens() {
        return this.failedLockTokens;
    }

    /**
     * Get the succeededLockTokens property: Array of lock tokens for the successfully rejected cloud events.
     *
     * @return the succeededLockTokens value.
     */
    @Generated
    public List<String> getSucceededLockTokens() {
        return this.succeededLockTokens;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("failedLockTokens", this.failedLockTokens,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("succeededLockTokens", this.succeededLockTokens,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RejectResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RejectResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RejectResult.
     */
    @Generated
    public static RejectResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<FailedLockToken> failedLockTokens = null;
            List<String> succeededLockTokens = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("failedLockTokens".equals(fieldName)) {
                    failedLockTokens = reader.readArray(reader1 -> FailedLockToken.fromJson(reader1));
                } else if ("succeededLockTokens".equals(fieldName)) {
                    succeededLockTokens = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new RejectResult(failedLockTokens, succeededLockTokens);
        });
    }
}
