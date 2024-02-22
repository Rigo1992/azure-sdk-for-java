// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Concur Service dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ConcurObject")
@JsonFlatten
@Fluent
public class ConcurObjectDataset extends Dataset {
    /*
     * The table name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /**
     * Creates an instance of ConcurObjectDataset class.
     */
    public ConcurObjectDataset() {
    }

    /**
     * Get the tableName property: The table name. Type: string (or Expression with resultType string).
     * 
     * @return the tableName value.
     */
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The table name. Type: string (or Expression with resultType string).
     * 
     * @param tableName the tableName value to set.
     * @return the ConcurObjectDataset object itself.
     */
    public ConcurObjectDataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConcurObjectDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConcurObjectDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConcurObjectDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConcurObjectDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConcurObjectDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConcurObjectDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConcurObjectDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
