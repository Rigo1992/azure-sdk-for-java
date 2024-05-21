// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AzureSearchIndexDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * The Azure Search Index.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = AzureSearchIndexDataset.class,
    visible = true)
@JsonTypeName("AzureSearchIndex")
@Fluent
public final class AzureSearchIndexDataset extends Dataset {
    /*
     * Type of dataset.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "AzureSearchIndex";

    /*
     * Properties specific to this dataset type.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AzureSearchIndexDatasetTypeProperties innerTypeProperties = new AzureSearchIndexDatasetTypeProperties();

    /**
     * Creates an instance of AzureSearchIndexDataset class.
     */
    public AzureSearchIndexDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Properties specific to this dataset type.
     * 
     * @return the innerTypeProperties value.
     */
    private AzureSearchIndexDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchIndexDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchIndexDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchIndexDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchIndexDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchIndexDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchIndexDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchIndexDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the indexName property: The name of the Azure Search Index. Type: string (or Expression with resultType
     * string).
     * 
     * @return the indexName value.
     */
    public Object indexName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().indexName();
    }

    /**
     * Set the indexName property: The name of the Azure Search Index. Type: string (or Expression with resultType
     * string).
     * 
     * @param indexName the indexName value to set.
     * @return the AzureSearchIndexDataset object itself.
     */
    public AzureSearchIndexDataset withIndexName(Object indexName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSearchIndexDatasetTypeProperties();
        }
        this.innerTypeProperties().withIndexName(indexName);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model AzureSearchIndexDataset"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureSearchIndexDataset.class);
}
