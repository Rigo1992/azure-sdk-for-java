// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * The custom dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CustomDataset")
@Fluent
public final class CustomDataset extends Dataset {
    /*
     * Custom dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private Object typeProperties;

    /**
     * Creates an instance of CustomDataset class.
     */
    public CustomDataset() {
    }

    /**
     * Get the typeProperties property: Custom dataset properties.
     * 
     * @return the typeProperties value.
     */
    public Object getTypeProperties() {
        return this.typeProperties;
    }

    /**
     * Set the typeProperties property: Custom dataset properties.
     * 
     * @param typeProperties the typeProperties value to set.
     * @return the CustomDataset object itself.
     */
    public CustomDataset setTypeProperties(Object typeProperties) {
        this.typeProperties = typeProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
