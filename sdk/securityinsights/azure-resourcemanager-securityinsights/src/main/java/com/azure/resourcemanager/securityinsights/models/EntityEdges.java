// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The edge that connects the entity to the other entity. */
@Fluent
public final class EntityEdges {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EntityEdges.class);

    /*
     * The target entity Id.
     */
    @JsonProperty(value = "targetEntityId")
    private String targetEntityId;

    /*
     * A bag of custom fields that should be part of the entity and will be
     * presented to the user.
     */
    @JsonProperty(value = "additionalData")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> additionalData;

    /**
     * Get the targetEntityId property: The target entity Id.
     *
     * @return the targetEntityId value.
     */
    public String targetEntityId() {
        return this.targetEntityId;
    }

    /**
     * Set the targetEntityId property: The target entity Id.
     *
     * @param targetEntityId the targetEntityId value to set.
     * @return the EntityEdges object itself.
     */
    public EntityEdges withTargetEntityId(String targetEntityId) {
        this.targetEntityId = targetEntityId;
        return this;
    }

    /**
     * Get the additionalData property: A bag of custom fields that should be part of the entity and will be presented
     * to the user.
     *
     * @return the additionalData value.
     */
    public Map<String, Object> additionalData() {
        return this.additionalData;
    }

    /**
     * Set the additionalData property: A bag of custom fields that should be part of the entity and will be presented
     * to the user.
     *
     * @param additionalData the additionalData value to set.
     * @return the EntityEdges object itself.
     */
    public EntityEdges withAdditionalData(Map<String, Object> additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
