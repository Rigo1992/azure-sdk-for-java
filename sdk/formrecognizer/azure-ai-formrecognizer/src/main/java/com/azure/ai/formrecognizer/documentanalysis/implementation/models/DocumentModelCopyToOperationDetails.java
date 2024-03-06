// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Get Operation response object.
 */
@Fluent
public final class DocumentModelCopyToOperationDetails extends OperationDetails {
    /*
     * Operation result upon success.
     */
    private DocumentModelDetails result;

    /**
     * Creates an instance of DocumentModelCopyToOperationDetails class.
     * 
     * @param operationId the operationId value to set.
     * @param status the status value to set.
     * @param createdDateTime the createdDateTime value to set.
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @param resourceLocation the resourceLocation value to set.
     */
    public DocumentModelCopyToOperationDetails(String operationId, OperationStatus status,
        OffsetDateTime createdDateTime, OffsetDateTime lastUpdatedDateTime, String resourceLocation) {
        super(operationId, status, createdDateTime, lastUpdatedDateTime, resourceLocation);
    }

    /**
     * Get the result property: Operation result upon success.
     * 
     * @return the result value.
     */
    public DocumentModelDetails getResult() {
        return this.result;
    }

    /**
     * Set the result property: Operation result upon success.
     * 
     * @param result the result value to set.
     * @return the DocumentModelCopyToOperationDetails object itself.
     */
    public DocumentModelCopyToOperationDetails setResult(DocumentModelDetails result) {
        this.result = result;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setPercentCompleted(Integer percentCompleted) {
        super.setPercentCompleted(percentCompleted);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setApiVersion(String apiVersion) {
        super.setApiVersion(apiVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setTags(Map<String, String> tags) {
        super.setTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setError(Error error) {
        super.setError(error);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", "documentModelCopyTo");
        jsonWriter.writeStringField("operationId", getOperationId());
        jsonWriter.writeStringField("status", getStatus() == null ? null : getStatus().toString());
        jsonWriter.writeStringField("createdDateTime",
            getCreatedDateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getCreatedDateTime()));
        jsonWriter.writeStringField("lastUpdatedDateTime", getLastUpdatedDateTime() == null ? null
            : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getLastUpdatedDateTime()));
        jsonWriter.writeStringField("resourceLocation", getResourceLocation());
        jsonWriter.writeNumberField("percentCompleted", getPercentCompleted());
        jsonWriter.writeStringField("apiVersion", getApiVersion());
        jsonWriter.writeMapField("tags", getTags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("error", getError());
        jsonWriter.writeJsonField("result", this.result);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentModelCopyToOperationDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentModelCopyToOperationDetails if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the DocumentModelCopyToOperationDetails.
     */
    public static DocumentModelCopyToOperationDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean operationIdFound = false;
            String operationId = null;
            boolean statusFound = false;
            OperationStatus status = null;
            boolean createdDateTimeFound = false;
            OffsetDateTime createdDateTime = null;
            boolean lastUpdatedDateTimeFound = false;
            OffsetDateTime lastUpdatedDateTime = null;
            boolean resourceLocationFound = false;
            String resourceLocation = null;
            Integer percentCompleted = null;
            String apiVersion = null;
            Map<String, String> tags = null;
            Error error = null;
            DocumentModelDetails result = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    String kind = reader.getString();
                    if (!"documentModelCopyTo".equals(kind)) {
                        throw new IllegalStateException(
                            "'kind' was expected to be non-null and equal to 'documentModelCopyTo'. The found 'kind' was '"
                                + kind + "'.");
                    }
                } else if ("operationId".equals(fieldName)) {
                    operationId = reader.getString();
                    operationIdFound = true;
                } else if ("status".equals(fieldName)) {
                    status = OperationStatus.fromString(reader.getString());
                    statusFound = true;
                } else if ("createdDateTime".equals(fieldName)) {
                    createdDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                    createdDateTimeFound = true;
                } else if ("lastUpdatedDateTime".equals(fieldName)) {
                    lastUpdatedDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                    lastUpdatedDateTimeFound = true;
                } else if ("resourceLocation".equals(fieldName)) {
                    resourceLocation = reader.getString();
                    resourceLocationFound = true;
                } else if ("percentCompleted".equals(fieldName)) {
                    percentCompleted = reader.getNullable(JsonReader::getInt);
                } else if ("apiVersion".equals(fieldName)) {
                    apiVersion = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    tags = reader.readMap(reader1 -> reader1.getString());
                } else if ("error".equals(fieldName)) {
                    error = Error.fromJson(reader);
                } else if ("result".equals(fieldName)) {
                    result = DocumentModelDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (operationIdFound && statusFound && createdDateTimeFound && lastUpdatedDateTimeFound
                && resourceLocationFound) {
                DocumentModelCopyToOperationDetails deserializedDocumentModelCopyToOperationDetails
                    = new DocumentModelCopyToOperationDetails(operationId, status, createdDateTime, lastUpdatedDateTime,
                        resourceLocation);
                deserializedDocumentModelCopyToOperationDetails.setPercentCompleted(percentCompleted);
                deserializedDocumentModelCopyToOperationDetails.setApiVersion(apiVersion);
                deserializedDocumentModelCopyToOperationDetails.setTags(tags);
                deserializedDocumentModelCopyToOperationDetails.setError(error);
                deserializedDocumentModelCopyToOperationDetails.result = result;

                return deserializedDocumentModelCopyToOperationDetails;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!operationIdFound) {
                missingProperties.add("operationId");
            }
            if (!statusFound) {
                missingProperties.add("status");
            }
            if (!createdDateTimeFound) {
                missingProperties.add("createdDateTime");
            }
            if (!lastUpdatedDateTimeFound) {
                missingProperties.add("lastUpdatedDateTime");
            }
            if (!resourceLocationFound) {
                missingProperties.add("resourceLocation");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
