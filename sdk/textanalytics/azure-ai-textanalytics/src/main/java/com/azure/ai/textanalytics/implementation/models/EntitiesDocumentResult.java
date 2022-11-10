// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The EntitiesDocumentResult model. */
@Fluent
public class EntitiesDocumentResult extends DocumentResult {
    /*
     * Recognized entities in the document.
     */
    @JsonProperty(value = "entities", required = true)
    private List<EntityWithResolution> entities;

    /**
     * Get the entities property: Recognized entities in the document.
     *
     * @return the entities value.
     */
    public List<EntityWithResolution> getEntities() {
        return this.entities;
    }

    /**
     * Set the entities property: Recognized entities in the document.
     *
     * @param entities the entities value to set.
     * @return the EntitiesDocumentResult object itself.
     */
    public EntitiesDocumentResult setEntities(List<EntityWithResolution> entities) {
        this.entities = entities;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntitiesDocumentResult setId(String id) {
        super.setId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntitiesDocumentResult setWarnings(List<DocumentWarning> warnings) {
        super.setWarnings(warnings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntitiesDocumentResult setStatistics(DocumentStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }
}
