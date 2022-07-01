// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Container object for various projection selectors. */
@Fluent
public final class SearchIndexerKnowledgeStoreProjection {
    /*
     * Projections to Azure Table storage.
     */
    @JsonProperty(value = "tables")
    private List<SearchIndexerKnowledgeStoreTableProjectionSelector> tables;

    /*
     * Projections to Azure Blob storage.
     */
    @JsonProperty(value = "objects")
    private List<SearchIndexerKnowledgeStoreObjectProjectionSelector> objects;

    /*
     * Projections to Azure File storage.
     */
    @JsonProperty(value = "files")
    private List<SearchIndexerKnowledgeStoreFileProjectionSelector> files;

    /**
     * Get the tables property: Projections to Azure Table storage.
     *
     * @return the tables value.
     */
    public List<SearchIndexerKnowledgeStoreTableProjectionSelector> getTables() {
        return this.tables;
    }

    /**
     * Set the tables property: Projections to Azure Table storage.
     *
     * @param tables the tables value to set.
     * @return the SearchIndexerKnowledgeStoreProjection object itself.
     */
    public SearchIndexerKnowledgeStoreProjection setTables(
            List<SearchIndexerKnowledgeStoreTableProjectionSelector> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Get the objects property: Projections to Azure Blob storage.
     *
     * @return the objects value.
     */
    public List<SearchIndexerKnowledgeStoreObjectProjectionSelector> getObjects() {
        return this.objects;
    }

    /**
     * Set the objects property: Projections to Azure Blob storage.
     *
     * @param objects the objects value to set.
     * @return the SearchIndexerKnowledgeStoreProjection object itself.
     */
    public SearchIndexerKnowledgeStoreProjection setObjects(
            List<SearchIndexerKnowledgeStoreObjectProjectionSelector> objects) {
        this.objects = objects;
        return this;
    }

    /**
     * Get the files property: Projections to Azure File storage.
     *
     * @return the files value.
     */
    public List<SearchIndexerKnowledgeStoreFileProjectionSelector> getFiles() {
        return this.files;
    }

    /**
     * Set the files property: Projections to Azure File storage.
     *
     * @param files the files value to set.
     * @return the SearchIndexerKnowledgeStoreProjection object itself.
     */
    public SearchIndexerKnowledgeStoreProjection setFiles(
            List<SearchIndexerKnowledgeStoreFileProjectionSelector> files) {
        this.files = files;
        return this;
    }
}
