// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties that contain a workbook. */
@Fluent
public final class WorkbookProperties {
    /*
     * The user-defined name (display name) of the workbook.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Configuration of this particular workbook. Configuration data is a string containing valid JSON
     */
    @JsonProperty(value = "serializedData", required = true)
    private String serializedData;

    /*
     * Workbook schema version format, like 'Notebook/1.0', which should match the workbook in serializedData
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Date and time in UTC of the last modification that was made to this workbook definition.
     */
    @JsonProperty(value = "timeModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeModified;

    /*
     * Workbook category, as defined by the user at creation time.
     */
    @JsonProperty(value = "category", required = true)
    private String category;

    /*
     * Being deprecated, please use the other tags field
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /*
     * Unique user id of the specific user that owns this workbook.
     */
    @JsonProperty(value = "userId", access = JsonProperty.Access.WRITE_ONLY)
    private String userId;

    /*
     * ResourceId for a source resource.
     */
    @JsonProperty(value = "sourceId")
    private String sourceId;

    /*
     * The resourceId to the storage account when bring your own storage is used
     */
    @JsonProperty(value = "storageUri")
    private String storageUri;

    /*
     * The description of the workbook.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The unique revision id for this workbook definition
     */
    @JsonProperty(value = "revision", access = JsonProperty.Access.WRITE_ONLY)
    private String revision;

    /** Creates an instance of WorkbookProperties class. */
    public WorkbookProperties() {
    }

    /**
     * Get the displayName property: The user-defined name (display name) of the workbook.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The user-defined name (display name) of the workbook.
     *
     * @param displayName the displayName value to set.
     * @return the WorkbookProperties object itself.
     */
    public WorkbookProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the serializedData property: Configuration of this particular workbook. Configuration data is a string
     * containing valid JSON.
     *
     * @return the serializedData value.
     */
    public String serializedData() {
        return this.serializedData;
    }

    /**
     * Set the serializedData property: Configuration of this particular workbook. Configuration data is a string
     * containing valid JSON.
     *
     * @param serializedData the serializedData value to set.
     * @return the WorkbookProperties object itself.
     */
    public WorkbookProperties withSerializedData(String serializedData) {
        this.serializedData = serializedData;
        return this;
    }

    /**
     * Get the version property: Workbook schema version format, like 'Notebook/1.0', which should match the workbook in
     * serializedData.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Workbook schema version format, like 'Notebook/1.0', which should match the workbook in
     * serializedData.
     *
     * @param version the version value to set.
     * @return the WorkbookProperties object itself.
     */
    public WorkbookProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the timeModified property: Date and time in UTC of the last modification that was made to this workbook
     * definition.
     *
     * @return the timeModified value.
     */
    public OffsetDateTime timeModified() {
        return this.timeModified;
    }

    /**
     * Get the category property: Workbook category, as defined by the user at creation time.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Workbook category, as defined by the user at creation time.
     *
     * @param category the category value to set.
     * @return the WorkbookProperties object itself.
     */
    public WorkbookProperties withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the tags property: Being deprecated, please use the other tags field.
     *
     * @return the tags value.
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Being deprecated, please use the other tags field.
     *
     * @param tags the tags value to set.
     * @return the WorkbookProperties object itself.
     */
    public WorkbookProperties withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the userId property: Unique user id of the specific user that owns this workbook.
     *
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Get the sourceId property: ResourceId for a source resource.
     *
     * @return the sourceId value.
     */
    public String sourceId() {
        return this.sourceId;
    }

    /**
     * Set the sourceId property: ResourceId for a source resource.
     *
     * @param sourceId the sourceId value to set.
     * @return the WorkbookProperties object itself.
     */
    public WorkbookProperties withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Get the storageUri property: The resourceId to the storage account when bring your own storage is used.
     *
     * @return the storageUri value.
     */
    public String storageUri() {
        return this.storageUri;
    }

    /**
     * Set the storageUri property: The resourceId to the storage account when bring your own storage is used.
     *
     * @param storageUri the storageUri value to set.
     * @return the WorkbookProperties object itself.
     */
    public WorkbookProperties withStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }

    /**
     * Get the description property: The description of the workbook.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the workbook.
     *
     * @param description the description value to set.
     * @return the WorkbookProperties object itself.
     */
    public WorkbookProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the revision property: The unique revision id for this workbook definition.
     *
     * @return the revision value.
     */
    public String revision() {
        return this.revision;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (displayName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property displayName in model WorkbookProperties"));
        }
        if (serializedData() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serializedData in model WorkbookProperties"));
        }
        if (category() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property category in model WorkbookProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkbookProperties.class);
}
