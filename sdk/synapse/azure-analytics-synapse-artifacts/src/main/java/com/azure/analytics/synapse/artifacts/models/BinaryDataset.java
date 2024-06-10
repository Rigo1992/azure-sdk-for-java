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

/** Binary dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Binary")
@JsonFlatten
@Fluent
public class BinaryDataset extends Dataset {
    /*
     * The location of the Binary storage.
     */
    @JsonProperty(value = "typeProperties.location")
    private DatasetLocation location;

    /*
     * The data compression method used for the binary dataset.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /** Creates an instance of BinaryDataset class. */
    public BinaryDataset() {}

    /**
     * Get the location property: The location of the Binary storage.
     *
     * @return the location value.
     */
    public DatasetLocation getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location of the Binary storage.
     *
     * @param location the location value to set.
     * @return the BinaryDataset object itself.
     */
    public BinaryDataset setLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the binary dataset.
     *
     * @return the compression value.
     */
    public DatasetCompression getCompression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the binary dataset.
     *
     * @param compression the compression value to set.
     * @return the BinaryDataset object itself.
     */
    public BinaryDataset setCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
