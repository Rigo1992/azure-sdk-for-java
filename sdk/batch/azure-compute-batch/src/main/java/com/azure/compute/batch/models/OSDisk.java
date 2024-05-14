// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Settings for the operating system disk of the compute node (VM).
 */
@Fluent
public final class OSDisk implements JsonSerializable<OSDisk> {

    /*
     * Specifies the ephemeral Disk Settings for the operating system disk used by the compute node (VM).
     */
    @Generated
    private DiffDiskSettings ephemeralOSDiskSettings;

    /**
     * Creates an instance of OSDisk class.
     */
    @Generated
    public OSDisk() {
    }

    /**
     * Get the ephemeralOSDiskSettings property: Specifies the ephemeral Disk Settings for the operating system disk
     * used by the compute node (VM).
     *
     * @return the ephemeralOSDiskSettings value.
     */
    @Generated
    public DiffDiskSettings getEphemeralOSDiskSettings() {
        return this.ephemeralOSDiskSettings;
    }

    /**
     * Set the ephemeralOSDiskSettings property: Specifies the ephemeral Disk Settings for the operating system disk
     * used by the compute node (VM).
     *
     * @param ephemeralOSDiskSettings the ephemeralOSDiskSettings value to set.
     * @return the OSDisk object itself.
     */
    @Generated
    public OSDisk setEphemeralOSDiskSettings(DiffDiskSettings ephemeralOSDiskSettings) {
        this.ephemeralOSDiskSettings = ephemeralOSDiskSettings;
        return this;
    }

    /*
     * Specifies the caching requirements. Possible values are: None, ReadOnly, ReadWrite. The default values are: None for Standard storage. ReadOnly for Premium storage.
     */
    @Generated
    private CachingType caching;

    /*
     * The initial disk size in GB when creating new OS disk.
     */
    @Generated
    private Integer diskSizeGB;

    /*
     * The managed disk parameters.
     */
    @Generated
    private ManagedDisk managedDisk;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     */
    @Generated
    private Boolean writeAcceleratorEnabled;

    /**
     * Get the caching property: Specifies the caching requirements. Possible values are: None, ReadOnly, ReadWrite. The
     * default values are: None for Standard storage. ReadOnly for Premium storage.
     *
     * @return the caching value.
     */
    @Generated
    public CachingType getCaching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements. Possible values are: None, ReadOnly, ReadWrite. The
     * default values are: None for Standard storage. ReadOnly for Premium storage.
     *
     * @param caching the caching value to set.
     * @return the OSDisk object itself.
     */
    @Generated
    public OSDisk setCaching(CachingType caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the diskSizeGB property: The initial disk size in GB when creating new OS disk.
     *
     * @return the diskSizeGB value.
     */
    @Generated
    public Integer getDiskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: The initial disk size in GB when creating new OS disk.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the OSDisk object itself.
     */
    @Generated
    public OSDisk setDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the managedDisk property: The managed disk parameters.
     *
     * @return the managedDisk value.
     */
    @Generated
    public ManagedDisk getManagedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managed disk parameters.
     *
     * @param managedDisk the managedDisk value to set.
     * @return the OSDisk object itself.
     */
    @Generated
    public OSDisk setManagedDisk(ManagedDisk managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     *
     * @return the writeAcceleratorEnabled value.
     */
    @Generated
    public Boolean isWriteAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     *
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the OSDisk object itself.
     */
    @Generated
    public OSDisk setWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("ephemeralOSDiskSettings", this.ephemeralOSDiskSettings);
        jsonWriter.writeStringField("caching", this.caching == null ? null : this.caching.toString());
        jsonWriter.writeNumberField("diskSizeGB", this.diskSizeGB);
        jsonWriter.writeJsonField("managedDisk", this.managedDisk);
        jsonWriter.writeBooleanField("writeAcceleratorEnabled", this.writeAcceleratorEnabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OSDisk from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OSDisk if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the OSDisk.
     */
    @Generated
    public static OSDisk fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OSDisk deserializedOSDisk = new OSDisk();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("ephemeralOSDiskSettings".equals(fieldName)) {
                    deserializedOSDisk.ephemeralOSDiskSettings = DiffDiskSettings.fromJson(reader);
                } else if ("caching".equals(fieldName)) {
                    deserializedOSDisk.caching = CachingType.fromString(reader.getString());
                } else if ("diskSizeGB".equals(fieldName)) {
                    deserializedOSDisk.diskSizeGB = reader.getNullable(JsonReader::getInt);
                } else if ("managedDisk".equals(fieldName)) {
                    deserializedOSDisk.managedDisk = ManagedDisk.fromJson(reader);
                } else if ("writeAcceleratorEnabled".equals(fieldName)) {
                    deserializedOSDisk.writeAcceleratorEnabled = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedOSDisk;
        });
    }
}
