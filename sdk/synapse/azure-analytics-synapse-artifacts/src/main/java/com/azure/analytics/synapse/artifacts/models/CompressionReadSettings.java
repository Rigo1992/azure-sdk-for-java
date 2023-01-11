// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** Compression read settings. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = CompressionReadSettings.class)
@JsonTypeName("CompressionReadSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ZipDeflateReadSettings", value = ZipDeflateReadSettings.class),
    @JsonSubTypes.Type(name = "TarReadSettings", value = TarReadSettings.class),
    @JsonSubTypes.Type(name = "TarGZipReadSettings", value = TarGZipReadSettings.class)
})
@Fluent
public class CompressionReadSettings {
    /*
     * Compression read settings.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of CompressionReadSettings class. */
    public CompressionReadSettings() {}

    /**
     * Get the additionalProperties property: Compression read settings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Compression read settings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the CompressionReadSettings object itself.
     */
    public CompressionReadSettings setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
