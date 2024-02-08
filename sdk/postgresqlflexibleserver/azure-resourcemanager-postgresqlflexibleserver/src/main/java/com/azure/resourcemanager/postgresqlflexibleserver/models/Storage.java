// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage properties of a server.
 */
@Fluent
public final class Storage {
    /*
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "storageSizeGB")
    private Integer storageSizeGB;

    /*
     * Flag to enable / disable Storage Auto grow for flexible server.
     */
    @JsonProperty(value = "autoGrow")
    private StorageAutoGrow autoGrow;

    /*
     * Name of storage tier for IOPS.
     */
    @JsonProperty(value = "tier")
    private AzureManagedDiskPerformanceTiers tier;

    /*
     * Storage tier IOPS quantity. This property is required to be set for storage Type PremiumV2_LRS
     */
    @JsonProperty(value = "iops")
    private Integer iops;

    /*
     * Storage throughput for the server. This is required to be set for storage Type PremiumV2_LRS
     */
    @JsonProperty(value = "throughput")
    private Integer throughput;

    /*
     * Storage type for the server. Allowed values are Premium_LRS and PremiumV2_LRS, and default is Premium_LRS if not
     * specified
     */
    @JsonProperty(value = "type")
    private StorageType type;

    /**
     * Creates an instance of Storage class.
     */
    public Storage() {
    }

    /**
     * Get the storageSizeGB property: Max storage allowed for a server.
     * 
     * @return the storageSizeGB value.
     */
    public Integer storageSizeGB() {
        return this.storageSizeGB;
    }

    /**
     * Set the storageSizeGB property: Max storage allowed for a server.
     * 
     * @param storageSizeGB the storageSizeGB value to set.
     * @return the Storage object itself.
     */
    public Storage withStorageSizeGB(Integer storageSizeGB) {
        this.storageSizeGB = storageSizeGB;
        return this;
    }

    /**
     * Get the autoGrow property: Flag to enable / disable Storage Auto grow for flexible server.
     * 
     * @return the autoGrow value.
     */
    public StorageAutoGrow autoGrow() {
        return this.autoGrow;
    }

    /**
     * Set the autoGrow property: Flag to enable / disable Storage Auto grow for flexible server.
     * 
     * @param autoGrow the autoGrow value to set.
     * @return the Storage object itself.
     */
    public Storage withAutoGrow(StorageAutoGrow autoGrow) {
        this.autoGrow = autoGrow;
        return this;
    }

    /**
     * Get the tier property: Name of storage tier for IOPS.
     * 
     * @return the tier value.
     */
    public AzureManagedDiskPerformanceTiers tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Name of storage tier for IOPS.
     * 
     * @param tier the tier value to set.
     * @return the Storage object itself.
     */
    public Storage withTier(AzureManagedDiskPerformanceTiers tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the iops property: Storage tier IOPS quantity. This property is required to be set for storage Type
     * PremiumV2_LRS.
     * 
     * @return the iops value.
     */
    public Integer iops() {
        return this.iops;
    }

    /**
     * Set the iops property: Storage tier IOPS quantity. This property is required to be set for storage Type
     * PremiumV2_LRS.
     * 
     * @param iops the iops value to set.
     * @return the Storage object itself.
     */
    public Storage withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Get the throughput property: Storage throughput for the server. This is required to be set for storage Type
     * PremiumV2_LRS.
     * 
     * @return the throughput value.
     */
    public Integer throughput() {
        return this.throughput;
    }

    /**
     * Set the throughput property: Storage throughput for the server. This is required to be set for storage Type
     * PremiumV2_LRS.
     * 
     * @param throughput the throughput value to set.
     * @return the Storage object itself.
     */
    public Storage withThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * Get the type property: Storage type for the server. Allowed values are Premium_LRS and PremiumV2_LRS, and
     * default is Premium_LRS if not specified.
     * 
     * @return the type value.
     */
    public StorageType type() {
        return this.type;
    }

    /**
     * Set the type property: Storage type for the server. Allowed values are Premium_LRS and PremiumV2_LRS, and
     * default is Premium_LRS if not specified.
     * 
     * @param type the type value to set.
     * @return the Storage object itself.
     */
    public Storage withType(StorageType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
