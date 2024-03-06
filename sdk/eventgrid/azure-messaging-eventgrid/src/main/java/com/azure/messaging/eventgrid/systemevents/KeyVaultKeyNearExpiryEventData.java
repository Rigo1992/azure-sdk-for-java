// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.KeyVault.KeyNearExpiry event.
 */
@Fluent
public final class KeyVaultKeyNearExpiryEventData implements JsonSerializable<KeyVaultKeyNearExpiryEventData> {
    /*
     * The id of the object that triggered this event.
     */
    private String id;

    /*
     * Key vault name of the object that triggered this event.
     */
    private String vaultName;

    /*
     * The type of the object that triggered this event
     */
    private String objectType;

    /*
     * The name of the object that triggered this event
     */
    private String objectName;

    /*
     * The version of the object that triggered this event
     */
    private String version;

    /*
     * Not before date of the object that triggered this event
     */
    private Float nbf;

    /*
     * The expiration date of the object that triggered this event
     */
    private Float exp;

    /**
     * Creates an instance of KeyVaultKeyNearExpiryEventData class.
     */
    public KeyVaultKeyNearExpiryEventData() {
    }

    /**
     * Get the id property: The id of the object that triggered this event.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The id of the object that triggered this event.
     * 
     * @param id the id value to set.
     * @return the KeyVaultKeyNearExpiryEventData object itself.
     */
    public KeyVaultKeyNearExpiryEventData setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the vaultName property: Key vault name of the object that triggered this event.
     * 
     * @return the vaultName value.
     */
    public String getVaultName() {
        return this.vaultName;
    }

    /**
     * Set the vaultName property: Key vault name of the object that triggered this event.
     * 
     * @param vaultName the vaultName value to set.
     * @return the KeyVaultKeyNearExpiryEventData object itself.
     */
    public KeyVaultKeyNearExpiryEventData setVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Get the objectType property: The type of the object that triggered this event.
     * 
     * @return the objectType value.
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: The type of the object that triggered this event.
     * 
     * @param objectType the objectType value to set.
     * @return the KeyVaultKeyNearExpiryEventData object itself.
     */
    public KeyVaultKeyNearExpiryEventData setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the objectName property: The name of the object that triggered this event.
     * 
     * @return the objectName value.
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * Set the objectName property: The name of the object that triggered this event.
     * 
     * @param objectName the objectName value to set.
     * @return the KeyVaultKeyNearExpiryEventData object itself.
     */
    public KeyVaultKeyNearExpiryEventData setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * Get the version property: The version of the object that triggered this event.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the object that triggered this event.
     * 
     * @param version the version value to set.
     * @return the KeyVaultKeyNearExpiryEventData object itself.
     */
    public KeyVaultKeyNearExpiryEventData setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the nbf property: Not before date of the object that triggered this event.
     * 
     * @return the nbf value.
     */
    public Float getNbf() {
        return this.nbf;
    }

    /**
     * Set the nbf property: Not before date of the object that triggered this event.
     * 
     * @param nbf the nbf value to set.
     * @return the KeyVaultKeyNearExpiryEventData object itself.
     */
    public KeyVaultKeyNearExpiryEventData setNbf(Float nbf) {
        this.nbf = nbf;
        return this;
    }

    /**
     * Get the exp property: The expiration date of the object that triggered this event.
     * 
     * @return the exp value.
     */
    public Float getExp() {
        return this.exp;
    }

    /**
     * Set the exp property: The expiration date of the object that triggered this event.
     * 
     * @param exp the exp value to set.
     * @return the KeyVaultKeyNearExpiryEventData object itself.
     */
    public KeyVaultKeyNearExpiryEventData setExp(Float exp) {
        this.exp = exp;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("Id", this.id);
        jsonWriter.writeStringField("VaultName", this.vaultName);
        jsonWriter.writeStringField("ObjectType", this.objectType);
        jsonWriter.writeStringField("ObjectName", this.objectName);
        jsonWriter.writeStringField("Version", this.version);
        jsonWriter.writeNumberField("NBF", this.nbf);
        jsonWriter.writeNumberField("EXP", this.exp);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyVaultKeyNearExpiryEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultKeyNearExpiryEventData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyVaultKeyNearExpiryEventData.
     */
    public static KeyVaultKeyNearExpiryEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyVaultKeyNearExpiryEventData deserializedKeyVaultKeyNearExpiryEventData
                = new KeyVaultKeyNearExpiryEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("Id".equals(fieldName)) {
                    deserializedKeyVaultKeyNearExpiryEventData.id = reader.getString();
                } else if ("VaultName".equals(fieldName)) {
                    deserializedKeyVaultKeyNearExpiryEventData.vaultName = reader.getString();
                } else if ("ObjectType".equals(fieldName)) {
                    deserializedKeyVaultKeyNearExpiryEventData.objectType = reader.getString();
                } else if ("ObjectName".equals(fieldName)) {
                    deserializedKeyVaultKeyNearExpiryEventData.objectName = reader.getString();
                } else if ("Version".equals(fieldName)) {
                    deserializedKeyVaultKeyNearExpiryEventData.version = reader.getString();
                } else if ("NBF".equals(fieldName)) {
                    deserializedKeyVaultKeyNearExpiryEventData.nbf = reader.getNullable(JsonReader::getFloat);
                } else if ("EXP".equals(fieldName)) {
                    deserializedKeyVaultKeyNearExpiryEventData.exp = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyVaultKeyNearExpiryEventData;
        });
    }
}
