// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Statistics related to resource consumption by Compute Nodes in a Pool. */
@Immutable
public final class ResourceStatistics {

    /*
     * The start time of the time range covered by the statistics.
     */
    @Generated
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The time at which the statistics were last updated. All statistics are limited to the range between startTime
     * and lastUpdateTime.
     */
    @Generated
    @JsonProperty(value = "lastUpdateTime")
    private OffsetDateTime lastUpdateTime;

    /*
     * The average CPU usage across all Compute Nodes in the Pool (percentage per node).
     */
    @Generated
    @JsonProperty(value = "avgCPUPercentage")
    private double avgCpuPercentage;

    /*
     * The average memory usage in GiB across all Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "avgMemoryGiB")
    private double avgMemoryGiB;

    /*
     * The peak memory usage in GiB across all Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "peakMemoryGiB")
    private double peakMemoryGiB;

    /*
     * The average used disk space in GiB across all Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "avgDiskGiB")
    private double avgDiskGiB;

    /*
     * The peak used disk space in GiB across all Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "peakDiskGiB")
    private double peakDiskGiB;

    /*
     * The total number of disk read operations across all Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "diskReadIOps")
    private int diskReadIOps;

    /*
     * The total number of disk write operations across all Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "diskWriteIOps")
    private int diskWriteIOps;

    /*
     * The total amount of data in GiB of disk reads across all Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "diskReadGiB")
    private double diskReadGiB;

    /*
     * The total amount of data in GiB of disk writes across all Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "diskWriteGiB")
    private double diskWriteGiB;

    /*
     * The total amount of data in GiB of network reads across all Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "networkReadGiB")
    private double networkReadGiB;

    /*
     * The total amount of data in GiB of network writes across all Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "networkWriteGiB")
    private double networkWriteGiB;

    /**
     * Creates an instance of ResourceStatistics class.
     *
     * @param startTime the startTime value to set.
     * @param lastUpdateTime the lastUpdateTime value to set.
     * @param avgCpuPercentage the avgCpuPercentage value to set.
     * @param avgMemoryGiB the avgMemoryGiB value to set.
     * @param peakMemoryGiB the peakMemoryGiB value to set.
     * @param avgDiskGiB the avgDiskGiB value to set.
     * @param peakDiskGiB the peakDiskGiB value to set.
     * @param diskReadIOps the diskReadIOps value to set.
     * @param diskWriteIOps the diskWriteIOps value to set.
     * @param diskReadGiB the diskReadGiB value to set.
     * @param diskWriteGiB the diskWriteGiB value to set.
     * @param networkReadGiB the networkReadGiB value to set.
     * @param networkWriteGiB the networkWriteGiB value to set.
     */
    @Generated
    @JsonCreator
    private ResourceStatistics(
            @JsonProperty(value = "startTime") OffsetDateTime startTime,
            @JsonProperty(value = "lastUpdateTime") OffsetDateTime lastUpdateTime,
            @JsonProperty(value = "avgCPUPercentage") double avgCpuPercentage,
            @JsonProperty(value = "avgMemoryGiB") double avgMemoryGiB,
            @JsonProperty(value = "peakMemoryGiB") double peakMemoryGiB,
            @JsonProperty(value = "avgDiskGiB") double avgDiskGiB,
            @JsonProperty(value = "peakDiskGiB") double peakDiskGiB,
            @JsonProperty(value = "diskReadIOps") int diskReadIOps,
            @JsonProperty(value = "diskWriteIOps") int diskWriteIOps,
            @JsonProperty(value = "diskReadGiB") double diskReadGiB,
            @JsonProperty(value = "diskWriteGiB") double diskWriteGiB,
            @JsonProperty(value = "networkReadGiB") double networkReadGiB,
            @JsonProperty(value = "networkWriteGiB") double networkWriteGiB) {
        this.startTime = startTime;
        this.lastUpdateTime = lastUpdateTime;
        this.avgCpuPercentage = avgCpuPercentage;
        this.avgMemoryGiB = avgMemoryGiB;
        this.peakMemoryGiB = peakMemoryGiB;
        this.avgDiskGiB = avgDiskGiB;
        this.peakDiskGiB = peakDiskGiB;
        this.diskReadIOps = diskReadIOps;
        this.diskWriteIOps = diskWriteIOps;
        this.diskReadGiB = diskReadGiB;
        this.diskWriteGiB = diskWriteGiB;
        this.networkReadGiB = networkReadGiB;
        this.networkWriteGiB = networkWriteGiB;
    }

    /**
     * Get the startTime property: The start time of the time range covered by the statistics.
     *
     * @return the startTime value.
     */
    @Generated
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the lastUpdateTime property: The time at which the statistics were last updated. All statistics are limited
     * to the range between startTime and lastUpdateTime.
     *
     * @return the lastUpdateTime value.
     */
    @Generated
    public OffsetDateTime getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Get the avgCpuPercentage property: The average CPU usage across all Compute Nodes in the Pool (percentage per
     * node).
     *
     * @return the avgCpuPercentage value.
     */
    @Generated
    public double getAvgCpuPercentage() {
        return this.avgCpuPercentage;
    }

    /**
     * Get the avgMemoryGiB property: The average memory usage in GiB across all Compute Nodes in the Pool.
     *
     * @return the avgMemoryGiB value.
     */
    @Generated
    public double getAvgMemoryGiB() {
        return this.avgMemoryGiB;
    }

    /**
     * Get the peakMemoryGiB property: The peak memory usage in GiB across all Compute Nodes in the Pool.
     *
     * @return the peakMemoryGiB value.
     */
    @Generated
    public double getPeakMemoryGiB() {
        return this.peakMemoryGiB;
    }

    /**
     * Get the avgDiskGiB property: The average used disk space in GiB across all Compute Nodes in the Pool.
     *
     * @return the avgDiskGiB value.
     */
    @Generated
    public double getAvgDiskGiB() {
        return this.avgDiskGiB;
    }

    /**
     * Get the peakDiskGiB property: The peak used disk space in GiB across all Compute Nodes in the Pool.
     *
     * @return the peakDiskGiB value.
     */
    @Generated
    public double getPeakDiskGiB() {
        return this.peakDiskGiB;
    }

    /**
     * Get the diskReadIOps property: The total number of disk read operations across all Compute Nodes in the Pool.
     *
     * @return the diskReadIOps value.
     */
    @Generated
    public int getDiskReadIOps() {
        return this.diskReadIOps;
    }

    /**
     * Get the diskWriteIOps property: The total number of disk write operations across all Compute Nodes in the Pool.
     *
     * @return the diskWriteIOps value.
     */
    @Generated
    public int getDiskWriteIOps() {
        return this.diskWriteIOps;
    }

    /**
     * Get the diskReadGiB property: The total amount of data in GiB of disk reads across all Compute Nodes in the Pool.
     *
     * @return the diskReadGiB value.
     */
    @Generated
    public double getDiskReadGiB() {
        return this.diskReadGiB;
    }

    /**
     * Get the diskWriteGiB property: The total amount of data in GiB of disk writes across all Compute Nodes in the
     * Pool.
     *
     * @return the diskWriteGiB value.
     */
    @Generated
    public double getDiskWriteGiB() {
        return this.diskWriteGiB;
    }

    /**
     * Get the networkReadGiB property: The total amount of data in GiB of network reads across all Compute Nodes in the
     * Pool.
     *
     * @return the networkReadGiB value.
     */
    @Generated
    public double getNetworkReadGiB() {
        return this.networkReadGiB;
    }

    /**
     * Get the networkWriteGiB property: The total amount of data in GiB of network writes across all Compute Nodes in
     * the Pool.
     *
     * @return the networkWriteGiB value.
     */
    @Generated
    public double getNetworkWriteGiB() {
        return this.networkWriteGiB;
    }
}
