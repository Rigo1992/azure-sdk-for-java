// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The platform object describes the platform which the image in the manifest runs on. A full list of valid operating
 * system and architecture values are listed in the Go language documentation for $GOOS and $GOARCH.
 */
@Fluent
public final class Platform implements JsonSerializable<Platform> {
    /*
     * Specifies the CPU architecture, for example amd64 or ppc64le.
     */
    private String architecture;

    /*
     * The os field specifies the operating system, for example linux or windows.
     */
    private String os;

    /*
     * The optional os.version field specifies the operating system version, for example 10.0.10586.
     */
    private String osVersion;

    /*
     * The optional os.features field specifies an array of strings, each listing a required OS feature (for example on
     * Windows win32k
     */
    private List<String> osFeatures;

    /*
     * The optional variant field specifies a variant of the CPU, for example armv6l to specify a particular CPU
     * variant of the ARM CPU.
     */
    private String variant;

    /*
     * The optional features field specifies an array of strings, each listing a required CPU feature (for example sse4
     * or aes
     */
    private List<String> features;

    /** Creates an instance of Platform class. */
    public Platform() {}

    /**
     * Get the architecture property: Specifies the CPU architecture, for example amd64 or ppc64le.
     *
     * @return the architecture value.
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * Set the architecture property: Specifies the CPU architecture, for example amd64 or ppc64le.
     *
     * @param architecture the architecture value to set.
     * @return the Platform object itself.
     */
    public Platform setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * Get the os property: The os field specifies the operating system, for example linux or windows.
     *
     * @return the os value.
     */
    public String getOs() {
        return this.os;
    }

    /**
     * Set the os property: The os field specifies the operating system, for example linux or windows.
     *
     * @param os the os value to set.
     * @return the Platform object itself.
     */
    public Platform setOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * Get the osVersion property: The optional os.version field specifies the operating system version, for example
     * 10.0.10586.
     *
     * @return the osVersion value.
     */
    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * Set the osVersion property: The optional os.version field specifies the operating system version, for example
     * 10.0.10586.
     *
     * @param osVersion the osVersion value to set.
     * @return the Platform object itself.
     */
    public Platform setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get the osFeatures property: The optional os.features field specifies an array of strings, each listing a
     * required OS feature (for example on Windows win32k.
     *
     * @return the osFeatures value.
     */
    public List<String> getOsFeatures() {
        return this.osFeatures;
    }

    /**
     * Set the osFeatures property: The optional os.features field specifies an array of strings, each listing a
     * required OS feature (for example on Windows win32k.
     *
     * @param osFeatures the osFeatures value to set.
     * @return the Platform object itself.
     */
    public Platform setOsFeatures(List<String> osFeatures) {
        this.osFeatures = osFeatures;
        return this;
    }

    /**
     * Get the variant property: The optional variant field specifies a variant of the CPU, for example armv6l to
     * specify a particular CPU variant of the ARM CPU.
     *
     * @return the variant value.
     */
    public String getVariant() {
        return this.variant;
    }

    /**
     * Set the variant property: The optional variant field specifies a variant of the CPU, for example armv6l to
     * specify a particular CPU variant of the ARM CPU.
     *
     * @param variant the variant value to set.
     * @return the Platform object itself.
     */
    public Platform setVariant(String variant) {
        this.variant = variant;
        return this;
    }

    /**
     * Get the features property: The optional features field specifies an array of strings, each listing a required CPU
     * feature (for example sse4 or aes.
     *
     * @return the features value.
     */
    public List<String> getFeatures() {
        return this.features;
    }

    /**
     * Set the features property: The optional features field specifies an array of strings, each listing a required CPU
     * feature (for example sse4 or aes.
     *
     * @param features the features value to set.
     * @return the Platform object itself.
     */
    public Platform setFeatures(List<String> features) {
        this.features = features;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("architecture", this.architecture);
        jsonWriter.writeStringField("os", this.os);
        jsonWriter.writeStringField("os.version", this.osVersion);
        jsonWriter.writeArrayField("os.features", this.osFeatures, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("variant", this.variant);
        jsonWriter.writeArrayField("features", this.features, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Platform from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Platform if the JsonReader was pointing to an instance of it, or null if it was pointing
     *     to JSON null.
     * @throws IOException If an error occurs while reading the Platform.
     */
    public static Platform fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    Platform deserializedPlatform = new Platform();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("architecture".equals(fieldName)) {
                            deserializedPlatform.architecture = reader.getString();
                        } else if ("os".equals(fieldName)) {
                            deserializedPlatform.os = reader.getString();
                        } else if ("os.version".equals(fieldName)) {
                            deserializedPlatform.osVersion = reader.getString();
                        } else if ("os.features".equals(fieldName)) {
                            List<String> osFeatures = reader.readArray(reader1 -> reader1.getString());
                            deserializedPlatform.osFeatures = osFeatures;
                        } else if ("variant".equals(fieldName)) {
                            deserializedPlatform.variant = reader.getString();
                        } else if ("features".equals(fieldName)) {
                            List<String> features = reader.readArray(reader1 -> reader1.getString());
                            deserializedPlatform.features = features;
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedPlatform;
                });
    }
}
