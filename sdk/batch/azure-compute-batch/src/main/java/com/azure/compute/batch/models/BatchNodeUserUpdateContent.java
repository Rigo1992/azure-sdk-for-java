// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Parameters for updating a user account for RDP or SSH access on an Azure Batch Compute Node.
 */
@Fluent
public final class BatchNodeUserUpdateContent implements JsonSerializable<BatchNodeUserUpdateContent> {

    /*
     * The password of the Account. The password is required for Windows Compute Nodes (those created with
     * 'virtualMachineConfiguration' using a Windows Image reference). For Linux Compute Nodes, the password can
     * optionally be specified along with the sshPublicKey property. If omitted, any existing password is removed.
     */
    @Generated
    private String password;

    /*
     * The time at which the Account should expire. If omitted, the default is 1 day from the current time. For Linux
     * Compute Nodes, the expiryTime has a precision up to a day.
     */
    @Generated
    private OffsetDateTime expiryTime;

    /*
     * The SSH public key that can be used for remote login to the Compute Node. The public key should be compatible
     * with OpenSSH encoding and should be base 64 encoded. This property can be specified only for Linux Compute Nodes.
     * If this is specified for a Windows Compute Node, then the Batch service rejects the request; if you are calling
     * the REST API directly, the HTTP status code is 400 (Bad Request). If omitted, any existing SSH public key is
     * removed.
     */
    @Generated
    private String sshPublicKey;

    /**
     * Creates an instance of BatchNodeUserUpdateContent class.
     */
    @Generated
    public BatchNodeUserUpdateContent() {
    }

    /**
     * Get the password property: The password of the Account. The password is required for Windows Compute Nodes (those
     * created with 'virtualMachineConfiguration' using a Windows Image reference). For Linux Compute Nodes, the
     * password can optionally be specified along with the sshPublicKey property. If omitted, any existing password is
     * removed.
     *
     * @return the password value.
     */
    @Generated
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password of the Account. The password is required for Windows Compute Nodes (those
     * created with 'virtualMachineConfiguration' using a Windows Image reference). For Linux Compute Nodes, the
     * password can optionally be specified along with the sshPublicKey property. If omitted, any existing password is
     * removed.
     *
     * @param password the password value to set.
     * @return the BatchNodeUserUpdateContent object itself.
     */
    @Generated
    public BatchNodeUserUpdateContent setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the expiryTime property: The time at which the Account should expire. If omitted, the default is 1 day from
     * the current time. For Linux Compute Nodes, the expiryTime has a precision up to a day.
     *
     * @return the expiryTime value.
     */
    @Generated
    public OffsetDateTime getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the expiryTime property: The time at which the Account should expire. If omitted, the default is 1 day from
     * the current time. For Linux Compute Nodes, the expiryTime has a precision up to a day.
     *
     * @param expiryTime the expiryTime value to set.
     * @return the BatchNodeUserUpdateContent object itself.
     */
    @Generated
    public BatchNodeUserUpdateContent setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get the sshPublicKey property: The SSH public key that can be used for remote login to the Compute Node. The
     * public key should be compatible with OpenSSH encoding and should be base 64 encoded. This property can be
     * specified only for Linux Compute Nodes. If this is specified for a Windows Compute Node, then the Batch service
     * rejects the request; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). If
     * omitted, any existing SSH public key is removed.
     *
     * @return the sshPublicKey value.
     */
    @Generated
    public String getSshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * Set the sshPublicKey property: The SSH public key that can be used for remote login to the Compute Node. The
     * public key should be compatible with OpenSSH encoding and should be base 64 encoded. This property can be
     * specified only for Linux Compute Nodes. If this is specified for a Windows Compute Node, then the Batch service
     * rejects the request; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). If
     * omitted, any existing SSH public key is removed.
     *
     * @param sshPublicKey the sshPublicKey value to set.
     * @return the BatchNodeUserUpdateContent object itself.
     */
    @Generated
    public BatchNodeUserUpdateContent setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("password", this.password);
        jsonWriter.writeStringField("expiryTime",
            this.expiryTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expiryTime));
        jsonWriter.writeStringField("sshPublicKey", this.sshPublicKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchNodeUserUpdateContent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchNodeUserUpdateContent if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchNodeUserUpdateContent.
     */
    @Generated
    public static BatchNodeUserUpdateContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchNodeUserUpdateContent deserializedBatchNodeUserUpdateContent = new BatchNodeUserUpdateContent();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("password".equals(fieldName)) {
                    deserializedBatchNodeUserUpdateContent.password = reader.getString();
                } else if ("expiryTime".equals(fieldName)) {
                    deserializedBatchNodeUserUpdateContent.expiryTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("sshPublicKey".equals(fieldName)) {
                    deserializedBatchNodeUserUpdateContent.sshPublicKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedBatchNodeUserUpdateContent;
        });
    }
}
