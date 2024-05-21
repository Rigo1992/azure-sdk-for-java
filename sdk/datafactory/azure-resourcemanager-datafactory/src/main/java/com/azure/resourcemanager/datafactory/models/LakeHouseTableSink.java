// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity for Microsoft Fabric LakeHouse Table sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = LakeHouseTableSink.class, visible = true)
@JsonTypeName("LakeHouseTableSink")
@Fluent
public final class LakeHouseTableSink extends CopySink {
    /*
     * Copy sink type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "LakeHouseTableSink";

    /*
     * The type of table action for LakeHouse Table sink. Possible values include: "None", "Append", "Overwrite".
     */
    @JsonProperty(value = "tableActionOption")
    private Object tableActionOption;

    /*
     * Create partitions in folder structure based on one or multiple columns. Each distinct column value (pair) will be a new partition. Possible values include: "None", "PartitionByKey".
     */
    @JsonProperty(value = "partitionOption")
    private Object partitionOption;

    /*
     * Specify the partition column names from sink columns. Type: array of objects (or Expression with resultType array of objects).
     */
    @JsonProperty(value = "partitionNameList")
    private Object partitionNameList;

    /**
     * Creates an instance of LakeHouseTableSink class.
     */
    public LakeHouseTableSink() {
    }

    /**
     * Get the type property: Copy sink type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the tableActionOption property: The type of table action for LakeHouse Table sink. Possible values include:
     * "None", "Append", "Overwrite".
     * 
     * @return the tableActionOption value.
     */
    public Object tableActionOption() {
        return this.tableActionOption;
    }

    /**
     * Set the tableActionOption property: The type of table action for LakeHouse Table sink. Possible values include:
     * "None", "Append", "Overwrite".
     * 
     * @param tableActionOption the tableActionOption value to set.
     * @return the LakeHouseTableSink object itself.
     */
    public LakeHouseTableSink withTableActionOption(Object tableActionOption) {
        this.tableActionOption = tableActionOption;
        return this;
    }

    /**
     * Get the partitionOption property: Create partitions in folder structure based on one or multiple columns. Each
     * distinct column value (pair) will be a new partition. Possible values include: "None", "PartitionByKey".
     * 
     * @return the partitionOption value.
     */
    public Object partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: Create partitions in folder structure based on one or multiple columns. Each
     * distinct column value (pair) will be a new partition. Possible values include: "None", "PartitionByKey".
     * 
     * @param partitionOption the partitionOption value to set.
     * @return the LakeHouseTableSink object itself.
     */
    public LakeHouseTableSink withPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionNameList property: Specify the partition column names from sink columns. Type: array of objects
     * (or Expression with resultType array of objects).
     * 
     * @return the partitionNameList value.
     */
    public Object partitionNameList() {
        return this.partitionNameList;
    }

    /**
     * Set the partitionNameList property: Specify the partition column names from sink columns. Type: array of objects
     * (or Expression with resultType array of objects).
     * 
     * @param partitionNameList the partitionNameList value to set.
     * @return the LakeHouseTableSink object itself.
     */
    public LakeHouseTableSink withPartitionNameList(Object partitionNameList) {
        this.partitionNameList = partitionNameList;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseTableSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseTableSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseTableSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseTableSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseTableSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseTableSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
    }
}
