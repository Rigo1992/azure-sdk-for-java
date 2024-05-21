// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * A reference to the Azure Virtual Machines Marketplace Image and additional
 * information about the Image.
 */
@Immutable
public final class BatchSupportedImage implements JsonSerializable<BatchSupportedImage> {

    /*
     * The ID of the Compute Node agent SKU which the Image supports.
     */
    @Generated
    private final String nodeAgentSkuId;

    /*
     * The reference to the Azure Virtual Machine's Marketplace Image.
     */
    @Generated
    private final ImageReference imageReference;

    /*
     * The type of operating system (e.g. Windows or Linux) of the Image.
     */
    @Generated
    private final OSType osType;

    /*
     * The capabilities or features which the Image supports. Not every capability of the Image is listed. Capabilities
     * in this list are considered of special interest and are generally related to integration with other features in
     * the Azure Batch service.
     */
    @Generated
    private List<String> capabilities;

    /*
     * The time when the Azure Batch service will stop accepting create Pool requests for the Image.
     */
    @Generated
    private OffsetDateTime batchSupportEndOfLife;

    /*
     * Whether the Azure Batch service actively verifies that the Image is compatible with the associated Compute Node
     * agent SKU.
     */
    @Generated
    private final ImageVerificationType verificationType;

    /**
     * Creates an instance of BatchSupportedImage class.
     *
     * @param nodeAgentSkuId the nodeAgentSkuId value to set.
     * @param imageReference the imageReference value to set.
     * @param osType the osType value to set.
     * @param verificationType the verificationType value to set.
     */
    @Generated
    private BatchSupportedImage(String nodeAgentSkuId, ImageReference imageReference, OSType osType,
        ImageVerificationType verificationType) {
        this.nodeAgentSkuId = nodeAgentSkuId;
        this.imageReference = imageReference;
        this.osType = osType;
        this.verificationType = verificationType;
    }

    /**
     * Get the nodeAgentSkuId property: The ID of the Compute Node agent SKU which the Image supports.
     *
     * @return the nodeAgentSkuId value.
     */
    @Generated
    public String getNodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }

    /**
     * Get the imageReference property: The reference to the Azure Virtual Machine's Marketplace Image.
     *
     * @return the imageReference value.
     */
    @Generated
    public ImageReference getImageReference() {
        return this.imageReference;
    }

    /**
     * Get the osType property: The type of operating system (e.g. Windows or Linux) of the Image.
     *
     * @return the osType value.
     */
    @Generated
    public OSType getOsType() {
        return this.osType;
    }

    /**
     * Get the capabilities property: The capabilities or features which the Image supports. Not every capability of the
     * Image is listed. Capabilities in this list are considered of special interest and are generally related to
     * integration with other features in the Azure Batch service.
     *
     * @return the capabilities value.
     */
    @Generated
    public List<String> getCapabilities() {
        return this.capabilities;
    }

    /**
     * Get the batchSupportEndOfLife property: The time when the Azure Batch service will stop accepting create Pool
     * requests for the Image.
     *
     * @return the batchSupportEndOfLife value.
     */
    @Generated
    public OffsetDateTime getBatchSupportEndOfLife() {
        return this.batchSupportEndOfLife;
    }

    /**
     * Get the verificationType property: Whether the Azure Batch service actively verifies that the Image is compatible
     * with the associated Compute Node agent SKU.
     *
     * @return the verificationType value.
     */
    @Generated
    public ImageVerificationType getVerificationType() {
        return this.verificationType;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("nodeAgentSKUId", this.nodeAgentSkuId);
        jsonWriter.writeJsonField("imageReference", this.imageReference);
        jsonWriter.writeStringField("osType", this.osType == null ? null : this.osType.toString());
        jsonWriter.writeStringField("verificationType",
            this.verificationType == null ? null : this.verificationType.toString());
        jsonWriter.writeArrayField("capabilities", this.capabilities, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("batchSupportEndOfLife",
            this.batchSupportEndOfLife == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.batchSupportEndOfLife));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchSupportedImage from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchSupportedImage if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchSupportedImage.
     */
    @Generated
    public static BatchSupportedImage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String nodeAgentSkuId = null;
            ImageReference imageReference = null;
            OSType osType = null;
            ImageVerificationType verificationType = null;
            List<String> capabilities = null;
            OffsetDateTime batchSupportEndOfLife = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("nodeAgentSKUId".equals(fieldName)) {
                    nodeAgentSkuId = reader.getString();
                } else if ("imageReference".equals(fieldName)) {
                    imageReference = ImageReference.fromJson(reader);
                } else if ("osType".equals(fieldName)) {
                    osType = OSType.fromString(reader.getString());
                } else if ("verificationType".equals(fieldName)) {
                    verificationType = ImageVerificationType.fromString(reader.getString());
                } else if ("capabilities".equals(fieldName)) {
                    capabilities = reader.readArray(reader1 -> reader1.getString());
                } else if ("batchSupportEndOfLife".equals(fieldName)) {
                    batchSupportEndOfLife
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            BatchSupportedImage deserializedBatchSupportedImage
                = new BatchSupportedImage(nodeAgentSkuId, imageReference, osType, verificationType);
            deserializedBatchSupportedImage.capabilities = capabilities;
            deserializedBatchSupportedImage.batchSupportEndOfLife = batchSupportEndOfLife;
            return deserializedBatchSupportedImage;
        });
    }
}
