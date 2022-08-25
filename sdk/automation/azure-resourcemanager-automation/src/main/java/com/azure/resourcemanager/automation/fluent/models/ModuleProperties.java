// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.models.ContentLink;
import com.azure.resourcemanager.automation.models.ModuleErrorInfo;
import com.azure.resourcemanager.automation.models.ModuleProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Definition of the module property type. */
@Fluent
public final class ModuleProperties {
    /*
     * Gets or sets the isGlobal flag of the module.
     */
    @JsonProperty(value = "isGlobal")
    private Boolean isGlobal;

    /*
     * Gets or sets the version of the module.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Gets or sets the size in bytes of the module.
     */
    @JsonProperty(value = "sizeInBytes")
    private Long sizeInBytes;

    /*
     * Gets or sets the activity count of the module.
     */
    @JsonProperty(value = "activityCount")
    private Integer activityCount;

    /*
     * Gets or sets the provisioning state of the module.
     */
    @JsonProperty(value = "provisioningState")
    private ModuleProvisioningState provisioningState;

    /*
     * Gets or sets the contentLink of the module.
     */
    @JsonProperty(value = "contentLink")
    private ContentLink contentLink;

    /*
     * Gets or sets the error info of the module.
     */
    @JsonProperty(value = "error")
    private ModuleErrorInfo error;

    /*
     * Gets or sets the creation time.
     */
    @JsonProperty(value = "creationTime")
    private OffsetDateTime creationTime;

    /*
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "lastModifiedTime")
    private OffsetDateTime lastModifiedTime;

    /*
     * Gets or sets the description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Gets or sets type of module, if its composite or not.
     */
    @JsonProperty(value = "isComposite")
    private Boolean isComposite;

    /**
     * Get the isGlobal property: Gets or sets the isGlobal flag of the module.
     *
     * @return the isGlobal value.
     */
    public Boolean isGlobal() {
        return this.isGlobal;
    }

    /**
     * Set the isGlobal property: Gets or sets the isGlobal flag of the module.
     *
     * @param isGlobal the isGlobal value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }

    /**
     * Get the version property: Gets or sets the version of the module.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Gets or sets the version of the module.
     *
     * @param version the version value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the sizeInBytes property: Gets or sets the size in bytes of the module.
     *
     * @return the sizeInBytes value.
     */
    public Long sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Set the sizeInBytes property: Gets or sets the size in bytes of the module.
     *
     * @param sizeInBytes the sizeInBytes value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * Get the activityCount property: Gets or sets the activity count of the module.
     *
     * @return the activityCount value.
     */
    public Integer activityCount() {
        return this.activityCount;
    }

    /**
     * Set the activityCount property: Gets or sets the activity count of the module.
     *
     * @param activityCount the activityCount value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withActivityCount(Integer activityCount) {
        this.activityCount = activityCount;
        return this;
    }

    /**
     * Get the provisioningState property: Gets or sets the provisioning state of the module.
     *
     * @return the provisioningState value.
     */
    public ModuleProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets or sets the provisioning state of the module.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withProvisioningState(ModuleProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the contentLink property: Gets or sets the contentLink of the module.
     *
     * @return the contentLink value.
     */
    public ContentLink contentLink() {
        return this.contentLink;
    }

    /**
     * Set the contentLink property: Gets or sets the contentLink of the module.
     *
     * @param contentLink the contentLink value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withContentLink(ContentLink contentLink) {
        this.contentLink = contentLink;
        return this;
    }

    /**
     * Get the error property: Gets or sets the error info of the module.
     *
     * @return the error value.
     */
    public ModuleErrorInfo error() {
        return this.error;
    }

    /**
     * Set the error property: Gets or sets the error info of the module.
     *
     * @param error the error value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withError(ModuleErrorInfo error) {
        this.error = error;
        return this;
    }

    /**
     * Get the creationTime property: Gets or sets the creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: Gets or sets the creation time.
     *
     * @param creationTime the creationTime value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description.
     *
     * @param description the description value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the isComposite property: Gets or sets type of module, if its composite or not.
     *
     * @return the isComposite value.
     */
    public Boolean isComposite() {
        return this.isComposite;
    }

    /**
     * Set the isComposite property: Gets or sets type of module, if its composite or not.
     *
     * @param isComposite the isComposite value to set.
     * @return the ModuleProperties object itself.
     */
    public ModuleProperties withIsComposite(Boolean isComposite) {
        this.isComposite = isComposite;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contentLink() != null) {
            contentLink().validate();
        }
        if (error() != null) {
            error().validate();
        }
    }
}
