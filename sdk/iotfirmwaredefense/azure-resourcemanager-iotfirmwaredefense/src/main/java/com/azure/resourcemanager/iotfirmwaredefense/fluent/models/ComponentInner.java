// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.iotfirmwaredefense.models.IsUpdateAvailable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Component of a firmware. */
@Fluent
public final class ComponentInner {
    /*
     * ID for the component.
     */
    @JsonProperty(value = "componentId")
    private String componentId;

    /*
     * Name for the component.
     */
    @JsonProperty(value = "componentName")
    private String componentName;

    /*
     * Version for the component.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * License for the component.
     */
    @JsonProperty(value = "license")
    private String license;

    /*
     * Release date for the component.
     */
    @JsonProperty(value = "releaseDate")
    private OffsetDateTime releaseDate;

    /*
     * Paths of the component.
     */
    @JsonProperty(value = "paths")
    private List<String> paths;

    /*
     * Flag if new update is available for the component.
     */
    @JsonProperty(value = "isUpdateAvailable")
    private IsUpdateAvailable isUpdateAvailable;

    /** Creates an instance of ComponentInner class. */
    public ComponentInner() {
    }

    /**
     * Get the componentId property: ID for the component.
     *
     * @return the componentId value.
     */
    public String componentId() {
        return this.componentId;
    }

    /**
     * Set the componentId property: ID for the component.
     *
     * @param componentId the componentId value to set.
     * @return the ComponentInner object itself.
     */
    public ComponentInner withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * Get the componentName property: Name for the component.
     *
     * @return the componentName value.
     */
    public String componentName() {
        return this.componentName;
    }

    /**
     * Set the componentName property: Name for the component.
     *
     * @param componentName the componentName value to set.
     * @return the ComponentInner object itself.
     */
    public ComponentInner withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * Get the version property: Version for the component.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version for the component.
     *
     * @param version the version value to set.
     * @return the ComponentInner object itself.
     */
    public ComponentInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the license property: License for the component.
     *
     * @return the license value.
     */
    public String license() {
        return this.license;
    }

    /**
     * Set the license property: License for the component.
     *
     * @param license the license value to set.
     * @return the ComponentInner object itself.
     */
    public ComponentInner withLicense(String license) {
        this.license = license;
        return this;
    }

    /**
     * Get the releaseDate property: Release date for the component.
     *
     * @return the releaseDate value.
     */
    public OffsetDateTime releaseDate() {
        return this.releaseDate;
    }

    /**
     * Set the releaseDate property: Release date for the component.
     *
     * @param releaseDate the releaseDate value to set.
     * @return the ComponentInner object itself.
     */
    public ComponentInner withReleaseDate(OffsetDateTime releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Get the paths property: Paths of the component.
     *
     * @return the paths value.
     */
    public List<String> paths() {
        return this.paths;
    }

    /**
     * Set the paths property: Paths of the component.
     *
     * @param paths the paths value to set.
     * @return the ComponentInner object itself.
     */
    public ComponentInner withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * Get the isUpdateAvailable property: Flag if new update is available for the component.
     *
     * @return the isUpdateAvailable value.
     */
    public IsUpdateAvailable isUpdateAvailable() {
        return this.isUpdateAvailable;
    }

    /**
     * Set the isUpdateAvailable property: Flag if new update is available for the component.
     *
     * @param isUpdateAvailable the isUpdateAvailable value to set.
     * @return the ComponentInner object itself.
     */
    public ComponentInner withIsUpdateAvailable(IsUpdateAvailable isUpdateAvailable) {
        this.isUpdateAvailable = isUpdateAvailable;
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