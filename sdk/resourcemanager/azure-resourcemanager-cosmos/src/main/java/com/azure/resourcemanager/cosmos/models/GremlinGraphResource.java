// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB Gremlin graph resource object. */
@Fluent
public class GremlinGraphResource {
    /*
     * Name of the Cosmos DB Gremlin graph
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The configuration of the indexing policy. By default, the indexing is
     * automatic for all document paths within the graph
     */
    @JsonProperty(value = "indexingPolicy")
    private IndexingPolicy indexingPolicy;

    /*
     * The configuration of the partition key to be used for partitioning data
     * into multiple partitions
     */
    @JsonProperty(value = "partitionKey")
    private ContainerPartitionKey partitionKey;

    /*
     * Default time to live
     */
    @JsonProperty(value = "defaultTtl")
    private Integer defaultTtl;

    /*
     * The unique key policy configuration for specifying uniqueness
     * constraints on documents in the collection in the Azure Cosmos DB
     * service.
     */
    @JsonProperty(value = "uniqueKeyPolicy")
    private UniqueKeyPolicy uniqueKeyPolicy;

    /*
     * The conflict resolution policy for the graph.
     */
    @JsonProperty(value = "conflictResolutionPolicy")
    private ConflictResolutionPolicy conflictResolutionPolicy;

    /*
     * Analytical TTL.
     */
    @JsonProperty(value = "analyticalStorageTtl")
    private Long analyticalStorageTtl;

    /**
     * Get the id property: Name of the Cosmos DB Gremlin graph.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB Gremlin graph.
     *
     * @param id the id value to set.
     * @return the GremlinGraphResource object itself.
     */
    public GremlinGraphResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the indexingPolicy property: The configuration of the indexing policy. By default, the indexing is automatic
     * for all document paths within the graph.
     *
     * @return the indexingPolicy value.
     */
    public IndexingPolicy indexingPolicy() {
        return this.indexingPolicy;
    }

    /**
     * Set the indexingPolicy property: The configuration of the indexing policy. By default, the indexing is automatic
     * for all document paths within the graph.
     *
     * @param indexingPolicy the indexingPolicy value to set.
     * @return the GremlinGraphResource object itself.
     */
    public GremlinGraphResource withIndexingPolicy(IndexingPolicy indexingPolicy) {
        this.indexingPolicy = indexingPolicy;
        return this;
    }

    /**
     * Get the partitionKey property: The configuration of the partition key to be used for partitioning data into
     * multiple partitions.
     *
     * @return the partitionKey value.
     */
    public ContainerPartitionKey partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set the partitionKey property: The configuration of the partition key to be used for partitioning data into
     * multiple partitions.
     *
     * @param partitionKey the partitionKey value to set.
     * @return the GremlinGraphResource object itself.
     */
    public GremlinGraphResource withPartitionKey(ContainerPartitionKey partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Get the defaultTtl property: Default time to live.
     *
     * @return the defaultTtl value.
     */
    public Integer defaultTtl() {
        return this.defaultTtl;
    }

    /**
     * Set the defaultTtl property: Default time to live.
     *
     * @param defaultTtl the defaultTtl value to set.
     * @return the GremlinGraphResource object itself.
     */
    public GremlinGraphResource withDefaultTtl(Integer defaultTtl) {
        this.defaultTtl = defaultTtl;
        return this;
    }

    /**
     * Get the uniqueKeyPolicy property: The unique key policy configuration for specifying uniqueness constraints on
     * documents in the collection in the Azure Cosmos DB service.
     *
     * @return the uniqueKeyPolicy value.
     */
    public UniqueKeyPolicy uniqueKeyPolicy() {
        return this.uniqueKeyPolicy;
    }

    /**
     * Set the uniqueKeyPolicy property: The unique key policy configuration for specifying uniqueness constraints on
     * documents in the collection in the Azure Cosmos DB service.
     *
     * @param uniqueKeyPolicy the uniqueKeyPolicy value to set.
     * @return the GremlinGraphResource object itself.
     */
    public GremlinGraphResource withUniqueKeyPolicy(UniqueKeyPolicy uniqueKeyPolicy) {
        this.uniqueKeyPolicy = uniqueKeyPolicy;
        return this;
    }

    /**
     * Get the conflictResolutionPolicy property: The conflict resolution policy for the graph.
     *
     * @return the conflictResolutionPolicy value.
     */
    public ConflictResolutionPolicy conflictResolutionPolicy() {
        return this.conflictResolutionPolicy;
    }

    /**
     * Set the conflictResolutionPolicy property: The conflict resolution policy for the graph.
     *
     * @param conflictResolutionPolicy the conflictResolutionPolicy value to set.
     * @return the GremlinGraphResource object itself.
     */
    public GremlinGraphResource withConflictResolutionPolicy(ConflictResolutionPolicy conflictResolutionPolicy) {
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        return this;
    }

    /**
     * Get the analyticalStorageTtl property: Analytical TTL.
     *
     * @return the analyticalStorageTtl value.
     */
    public Long analyticalStorageTtl() {
        return this.analyticalStorageTtl;
    }

    /**
     * Set the analyticalStorageTtl property: Analytical TTL.
     *
     * @param analyticalStorageTtl the analyticalStorageTtl value to set.
     * @return the GremlinGraphResource object itself.
     */
    public GremlinGraphResource withAnalyticalStorageTtl(Long analyticalStorageTtl) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model GremlinGraphResource"));
        }
        if (indexingPolicy() != null) {
            indexingPolicy().validate();
        }
        if (partitionKey() != null) {
            partitionKey().validate();
        }
        if (uniqueKeyPolicy() != null) {
            uniqueKeyPolicy().validate();
        }
        if (conflictResolutionPolicy() != null) {
            conflictResolutionPolicy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GremlinGraphResource.class);
}
