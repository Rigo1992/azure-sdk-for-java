// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The FilesRenameHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class FilesRenameHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-file-permission-key property.
     */
    @JsonProperty(value = "x-ms-file-permission-key")
    private String xMsFilePermissionKey;

    /*
     * The x-ms-file-id property.
     */
    @JsonProperty(value = "x-ms-file-id")
    private String xMsFileId;

    /*
     * The x-ms-file-creation-time property.
     */
    @JsonProperty(value = "x-ms-file-creation-time")
    private OffsetDateTime xMsFileCreationTime;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-request-server-encrypted property.
     */
    @JsonProperty(value = "x-ms-request-server-encrypted")
    private Boolean xMsRequestServerEncrypted;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-file-attributes property.
     */
    @JsonProperty(value = "x-ms-file-attributes")
    private String xMsFileAttributes;

    /*
     * The x-ms-file-change-time property.
     */
    @JsonProperty(value = "x-ms-file-change-time")
    private OffsetDateTime xMsFileChangeTime;

    /*
     * The x-ms-file-parent-id property.
     */
    @JsonProperty(value = "x-ms-file-parent-id")
    private String xMsFileParentId;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-file-last-write-time property.
     */
    @JsonProperty(value = "x-ms-file-last-write-time")
    private OffsetDateTime xMsFileLastWriteTime;

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsFilePermissionKey property: The x-ms-file-permission-key property.
     *
     * @return the xMsFilePermissionKey value.
     */
    public String getXMsFilePermissionKey() {
        return this.xMsFilePermissionKey;
    }

    /**
     * Set the xMsFilePermissionKey property: The x-ms-file-permission-key property.
     *
     * @param xMsFilePermissionKey the xMsFilePermissionKey value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setXMsFilePermissionKey(String xMsFilePermissionKey) {
        this.xMsFilePermissionKey = xMsFilePermissionKey;
        return this;
    }

    /**
     * Get the xMsFileId property: The x-ms-file-id property.
     *
     * @return the xMsFileId value.
     */
    public String getXMsFileId() {
        return this.xMsFileId;
    }

    /**
     * Set the xMsFileId property: The x-ms-file-id property.
     *
     * @param xMsFileId the xMsFileId value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setXMsFileId(String xMsFileId) {
        this.xMsFileId = xMsFileId;
        return this;
    }

    /**
     * Get the xMsFileCreationTime property: The x-ms-file-creation-time property.
     *
     * @return the xMsFileCreationTime value.
     */
    public OffsetDateTime getXMsFileCreationTime() {
        return this.xMsFileCreationTime;
    }

    /**
     * Set the xMsFileCreationTime property: The x-ms-file-creation-time property.
     *
     * @param xMsFileCreationTime the xMsFileCreationTime value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setXMsFileCreationTime(OffsetDateTime xMsFileCreationTime) {
        this.xMsFileCreationTime = xMsFileCreationTime;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     *
     * @return the xMsRequestServerEncrypted value.
     */
    public Boolean isXMsRequestServerEncrypted() {
        return this.xMsRequestServerEncrypted;
    }

    /**
     * Set the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     *
     * @param xMsRequestServerEncrypted the xMsRequestServerEncrypted value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setXMsRequestServerEncrypted(Boolean xMsRequestServerEncrypted) {
        this.xMsRequestServerEncrypted = xMsRequestServerEncrypted;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsFileAttributes property: The x-ms-file-attributes property.
     *
     * @return the xMsFileAttributes value.
     */
    public String getXMsFileAttributes() {
        return this.xMsFileAttributes;
    }

    /**
     * Set the xMsFileAttributes property: The x-ms-file-attributes property.
     *
     * @param xMsFileAttributes the xMsFileAttributes value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setXMsFileAttributes(String xMsFileAttributes) {
        this.xMsFileAttributes = xMsFileAttributes;
        return this;
    }

    /**
     * Get the xMsFileChangeTime property: The x-ms-file-change-time property.
     *
     * @return the xMsFileChangeTime value.
     */
    public OffsetDateTime getXMsFileChangeTime() {
        return this.xMsFileChangeTime;
    }

    /**
     * Set the xMsFileChangeTime property: The x-ms-file-change-time property.
     *
     * @param xMsFileChangeTime the xMsFileChangeTime value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setXMsFileChangeTime(OffsetDateTime xMsFileChangeTime) {
        this.xMsFileChangeTime = xMsFileChangeTime;
        return this;
    }

    /**
     * Get the xMsFileParentId property: The x-ms-file-parent-id property.
     *
     * @return the xMsFileParentId value.
     */
    public String getXMsFileParentId() {
        return this.xMsFileParentId;
    }

    /**
     * Set the xMsFileParentId property: The x-ms-file-parent-id property.
     *
     * @param xMsFileParentId the xMsFileParentId value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setXMsFileParentId(String xMsFileParentId) {
        this.xMsFileParentId = xMsFileParentId;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsFileLastWriteTime property: The x-ms-file-last-write-time property.
     *
     * @return the xMsFileLastWriteTime value.
     */
    public OffsetDateTime getXMsFileLastWriteTime() {
        return this.xMsFileLastWriteTime;
    }

    /**
     * Set the xMsFileLastWriteTime property: The x-ms-file-last-write-time property.
     *
     * @param xMsFileLastWriteTime the xMsFileLastWriteTime value to set.
     * @return the FilesRenameHeaders object itself.
     */
    public FilesRenameHeaders setXMsFileLastWriteTime(OffsetDateTime xMsFileLastWriteTime) {
        this.xMsFileLastWriteTime = xMsFileLastWriteTime;
        return this;
    }
}
