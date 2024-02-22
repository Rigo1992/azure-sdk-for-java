// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The datastore details of the MT.
 */
@Fluent
public final class DataStore {
    /*
     * The symbolic name of data store.
     */
    @JsonProperty(value = "symbolicName")
    private String symbolicName;

    /*
     * The uuid of data store.
     */
    @JsonProperty(value = "uuid")
    private String uuid;

    /*
     * The capacity of data store in GBs.
     */
    @JsonProperty(value = "capacity")
    private String capacity;

    /*
     * The free space of data store in GBs.
     */
    @JsonProperty(value = "freeSpace")
    private String freeSpace;

    /*
     * The type of data store.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Creates an instance of DataStore class.
     */
    public DataStore() {
    }

    /**
     * Get the symbolicName property: The symbolic name of data store.
     * 
     * @return the symbolicName value.
     */
    public String symbolicName() {
        return this.symbolicName;
    }

    /**
     * Set the symbolicName property: The symbolic name of data store.
     * 
     * @param symbolicName the symbolicName value to set.
     * @return the DataStore object itself.
     */
    public DataStore withSymbolicName(String symbolicName) {
        this.symbolicName = symbolicName;
        return this;
    }

    /**
     * Get the uuid property: The uuid of data store.
     * 
     * @return the uuid value.
     */
    public String uuid() {
        return this.uuid;
    }

    /**
     * Set the uuid property: The uuid of data store.
     * 
     * @param uuid the uuid value to set.
     * @return the DataStore object itself.
     */
    public DataStore withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get the capacity property: The capacity of data store in GBs.
     * 
     * @return the capacity value.
     */
    public String capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The capacity of data store in GBs.
     * 
     * @param capacity the capacity value to set.
     * @return the DataStore object itself.
     */
    public DataStore withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the freeSpace property: The free space of data store in GBs.
     * 
     * @return the freeSpace value.
     */
    public String freeSpace() {
        return this.freeSpace;
    }

    /**
     * Set the freeSpace property: The free space of data store in GBs.
     * 
     * @param freeSpace the freeSpace value to set.
     * @return the DataStore object itself.
     */
    public DataStore withFreeSpace(String freeSpace) {
        this.freeSpace = freeSpace;
        return this;
    }

    /**
     * Get the type property: The type of data store.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of data store.
     * 
     * @param type the type value to set.
     * @return the DataStore object itself.
     */
    public DataStore withType(String type) {
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
