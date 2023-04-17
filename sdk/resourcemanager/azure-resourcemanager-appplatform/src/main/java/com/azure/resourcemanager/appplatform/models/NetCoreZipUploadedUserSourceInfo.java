// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Uploaded Jar binary for a deployment. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("NetCoreZip")
@Fluent
public final class NetCoreZipUploadedUserSourceInfo extends UploadedUserSourceInfo {
    /*
     * The path to the .NET executable relative to zip root
     */
    @JsonProperty(value = "netCoreMainEntryPath")
    private String netCoreMainEntryPath;

    /*
     * Runtime version of the .Net file
     */
    @JsonProperty(value = "runtimeVersion")
    private String runtimeVersion;

    /** Creates an instance of NetCoreZipUploadedUserSourceInfo class. */
    public NetCoreZipUploadedUserSourceInfo() {
    }

    /**
     * Get the netCoreMainEntryPath property: The path to the .NET executable relative to zip root.
     *
     * @return the netCoreMainEntryPath value.
     */
    public String netCoreMainEntryPath() {
        return this.netCoreMainEntryPath;
    }

    /**
     * Set the netCoreMainEntryPath property: The path to the .NET executable relative to zip root.
     *
     * @param netCoreMainEntryPath the netCoreMainEntryPath value to set.
     * @return the NetCoreZipUploadedUserSourceInfo object itself.
     */
    public NetCoreZipUploadedUserSourceInfo withNetCoreMainEntryPath(String netCoreMainEntryPath) {
        this.netCoreMainEntryPath = netCoreMainEntryPath;
        return this;
    }

    /**
     * Get the runtimeVersion property: Runtime version of the .Net file.
     *
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: Runtime version of the .Net file.
     *
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the NetCoreZipUploadedUserSourceInfo object itself.
     */
    public NetCoreZipUploadedUserSourceInfo withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetCoreZipUploadedUserSourceInfo withRelativePath(String relativePath) {
        super.withRelativePath(relativePath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetCoreZipUploadedUserSourceInfo withVersion(String version) {
        super.withVersion(version);
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
