// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the node group on a cluster. */
@Fluent
public class NodeGroupProperties {
    /*
     * The resource sku for the node group. This defines the size of CPU and memory that is provisioned for each node.
     * Example values: 'M30', 'M40'.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * The disk storage size for the node group in GB. Example values: 128, 256, 512, 1024.
     */
    @JsonProperty(value = "diskSizeGB")
    private Long diskSizeGB;

    /*
     * Whether high availability is enabled on the node group.
     */
    @JsonProperty(value = "enableHa")
    private Boolean enableHa;

    /** Creates an instance of NodeGroupProperties class. */
    public NodeGroupProperties() {
    }

    /**
     * Get the sku property: The resource sku for the node group. This defines the size of CPU and memory that is
     * provisioned for each node. Example values: 'M30', 'M40'.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The resource sku for the node group. This defines the size of CPU and memory that is
     * provisioned for each node. Example values: 'M30', 'M40'.
     *
     * @param sku the sku value to set.
     * @return the NodeGroupProperties object itself.
     */
    public NodeGroupProperties withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the diskSizeGB property: The disk storage size for the node group in GB. Example values: 128, 256, 512, 1024.
     *
     * @return the diskSizeGB value.
     */
    public Long diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: The disk storage size for the node group in GB. Example values: 128, 256, 512, 1024.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the NodeGroupProperties object itself.
     */
    public NodeGroupProperties withDiskSizeGB(Long diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the enableHa property: Whether high availability is enabled on the node group.
     *
     * @return the enableHa value.
     */
    public Boolean enableHa() {
        return this.enableHa;
    }

    /**
     * Set the enableHa property: Whether high availability is enabled on the node group.
     *
     * @param enableHa the enableHa value to set.
     * @return the NodeGroupProperties object itself.
     */
    public NodeGroupProperties withEnableHa(Boolean enableHa) {
        this.enableHa = enableHa;
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
