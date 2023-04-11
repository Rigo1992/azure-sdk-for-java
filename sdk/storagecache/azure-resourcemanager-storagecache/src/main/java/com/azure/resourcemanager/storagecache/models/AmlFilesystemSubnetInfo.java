// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information required to validate the subnet that will be used in AML file system create. */
@Fluent
public final class AmlFilesystemSubnetInfo {
    /*
     * Subnet used for managing the AML file system and for client-facing operations. This subnet should have at least
     * a /24 subnet mask within the VNET's address space.
     */
    @JsonProperty(value = "filesystemSubnet")
    private String filesystemSubnet;

    /*
     * The size of the AML file system, in TiB.
     */
    @JsonProperty(value = "storageCapacityTiB")
    private Float storageCapacityTiB;

    /*
     * SKU for the resource.
     */
    @JsonProperty(value = "sku")
    private SkuName sku;

    /*
     * Region that the AML file system will be created in.
     */
    @JsonProperty(value = "location")
    private String location;

    /** Creates an instance of AmlFilesystemSubnetInfo class. */
    public AmlFilesystemSubnetInfo() {
    }

    /**
     * Get the filesystemSubnet property: Subnet used for managing the AML file system and for client-facing operations.
     * This subnet should have at least a /24 subnet mask within the VNET's address space.
     *
     * @return the filesystemSubnet value.
     */
    public String filesystemSubnet() {
        return this.filesystemSubnet;
    }

    /**
     * Set the filesystemSubnet property: Subnet used for managing the AML file system and for client-facing operations.
     * This subnet should have at least a /24 subnet mask within the VNET's address space.
     *
     * @param filesystemSubnet the filesystemSubnet value to set.
     * @return the AmlFilesystemSubnetInfo object itself.
     */
    public AmlFilesystemSubnetInfo withFilesystemSubnet(String filesystemSubnet) {
        this.filesystemSubnet = filesystemSubnet;
        return this;
    }

    /**
     * Get the storageCapacityTiB property: The size of the AML file system, in TiB.
     *
     * @return the storageCapacityTiB value.
     */
    public Float storageCapacityTiB() {
        return this.storageCapacityTiB;
    }

    /**
     * Set the storageCapacityTiB property: The size of the AML file system, in TiB.
     *
     * @param storageCapacityTiB the storageCapacityTiB value to set.
     * @return the AmlFilesystemSubnetInfo object itself.
     */
    public AmlFilesystemSubnetInfo withStorageCapacityTiB(Float storageCapacityTiB) {
        this.storageCapacityTiB = storageCapacityTiB;
        return this;
    }

    /**
     * Get the sku property: SKU for the resource.
     *
     * @return the sku value.
     */
    public SkuName sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU for the resource.
     *
     * @param sku the sku value to set.
     * @return the AmlFilesystemSubnetInfo object itself.
     */
    public AmlFilesystemSubnetInfo withSku(SkuName sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the location property: Region that the AML file system will be created in.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Region that the AML file system will be created in.
     *
     * @param location the location value to set.
     * @return the AmlFilesystemSubnetInfo object itself.
     */
    public AmlFilesystemSubnetInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }
}
