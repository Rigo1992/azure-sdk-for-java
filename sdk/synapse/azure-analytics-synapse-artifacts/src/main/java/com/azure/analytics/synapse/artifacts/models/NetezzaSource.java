// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Netezza source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("NetezzaSource")
@Fluent
public final class NetezzaSource extends TabularSource {
    /*
     * A query to retrieve data from source. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * The partition mechanism that will be used for Netezza read in parallel.
     */
    @JsonProperty(value = "partitionOption")
    private NetezzaPartitionOption partitionOption;

    /*
     * The settings that will be leveraged for Netezza source partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private NetezzaPartitionSettings partitionSettings;

    /**
     * Get the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     *
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     *
     * @param query the query value to set.
     * @return the NetezzaSource object itself.
     */
    public NetezzaSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for Netezza read in parallel.
     *
     * @return the partitionOption value.
     */
    public NetezzaPartitionOption getPartitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for Netezza read in parallel.
     *
     * @param partitionOption the partitionOption value to set.
     * @return the NetezzaSource object itself.
     */
    public NetezzaSource setPartitionOption(NetezzaPartitionOption partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for Netezza source partitioning.
     *
     * @return the partitionSettings value.
     */
    public NetezzaPartitionSettings getPartitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for Netezza source partitioning.
     *
     * @param partitionSettings the partitionSettings value to set.
     * @return the NetezzaSource object itself.
     */
    public NetezzaSource setPartitionSettings(NetezzaPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetezzaSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetezzaSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetezzaSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetezzaSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetezzaSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
