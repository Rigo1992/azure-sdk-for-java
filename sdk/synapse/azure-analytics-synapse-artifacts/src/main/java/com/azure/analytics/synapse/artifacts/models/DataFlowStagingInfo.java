// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Staging info for execute data flow activity.
 */
@Fluent
public final class DataFlowStagingInfo {
    /*
     * Staging linked service reference.
     */
    @JsonProperty(value = "linkedService")
    private LinkedServiceReference linkedService;

    /*
     * Folder path for staging blob.
     */
    @JsonProperty(value = "folderPath")
    private Object folderPath;

    /**
     * Creates an instance of DataFlowStagingInfo class.
     */
    public DataFlowStagingInfo() {
    }

    /**
     * Get the linkedService property: Staging linked service reference.
     * 
     * @return the linkedService value.
     */
    public LinkedServiceReference getLinkedService() {
        return this.linkedService;
    }

    /**
     * Set the linkedService property: Staging linked service reference.
     * 
     * @param linkedService the linkedService value to set.
     * @return the DataFlowStagingInfo object itself.
     */
    public DataFlowStagingInfo setLinkedService(LinkedServiceReference linkedService) {
        this.linkedService = linkedService;
        return this;
    }

    /**
     * Get the folderPath property: Folder path for staging blob.
     * 
     * @return the folderPath value.
     */
    public Object getFolderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: Folder path for staging blob.
     * 
     * @param folderPath the folderPath value to set.
     * @return the DataFlowStagingInfo object itself.
     */
    public DataFlowStagingInfo setFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }
}
