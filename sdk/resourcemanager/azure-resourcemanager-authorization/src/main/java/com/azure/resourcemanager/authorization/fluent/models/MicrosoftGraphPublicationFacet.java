// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** publicationFacet. */
@Fluent
public final class MicrosoftGraphPublicationFacet {
    /*
     * The state of publication for this document. Either published or
     * checkout. Read-only.
     */
    @JsonProperty(value = "level")
    private String level;

    /*
     * The unique identifier for the version that is visible to the current
     * caller. Read-only.
     */
    @JsonProperty(value = "versionId")
    private String versionId;

    /*
     * publicationFacet
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the level property: The state of publication for this document. Either published or checkout. Read-only.
     *
     * @return the level value.
     */
    public String level() {
        return this.level;
    }

    /**
     * Set the level property: The state of publication for this document. Either published or checkout. Read-only.
     *
     * @param level the level value to set.
     * @return the MicrosoftGraphPublicationFacet object itself.
     */
    public MicrosoftGraphPublicationFacet withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Get the versionId property: The unique identifier for the version that is visible to the current caller.
     * Read-only.
     *
     * @return the versionId value.
     */
    public String versionId() {
        return this.versionId;
    }

    /**
     * Set the versionId property: The unique identifier for the version that is visible to the current caller.
     * Read-only.
     *
     * @param versionId the versionId value to set.
     * @return the MicrosoftGraphPublicationFacet object itself.
     */
    public MicrosoftGraphPublicationFacet withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * Get the additionalProperties property: publicationFacet.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: publicationFacet.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPublicationFacet object itself.
     */
    public MicrosoftGraphPublicationFacet withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
