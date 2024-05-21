// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * The FilesCreateHeaders model.
 */
@Fluent
public final class FilesCreateHeaders {
    /*
     * The x-ms-version property.
     */
    private String xMsVersion;

    /*
     * The x-ms-file-permission-key property.
     */
    private String xMsFilePermissionKey;

    /*
     * The x-ms-file-id property.
     */
    private String xMsFileId;

    /*
     * The x-ms-file-creation-time property.
     */
    private OffsetDateTime xMsFileCreationTime;

    /*
     * The Last-Modified property.
     */
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-request-server-encrypted property.
     */
    private Boolean xMsRequestServerEncrypted;

    /*
     * The Date property.
     */
    private DateTimeRfc1123 date;

    /*
     * The ETag property.
     */
    private String eTag;

    /*
     * The x-ms-file-attributes property.
     */
    private String xMsFileAttributes;

    /*
     * The x-ms-file-change-time property.
     */
    private OffsetDateTime xMsFileChangeTime;

    /*
     * The x-ms-file-parent-id property.
     */
    private String xMsFileParentId;

    /*
     * The x-ms-request-id property.
     */
    private String xMsRequestId;

    /*
     * The x-ms-file-last-write-time property.
     */
    private OffsetDateTime xMsFileLastWriteTime;

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    private static final HttpHeaderName X_MS_FILE_PERMISSION_KEY
        = HttpHeaderName.fromString("x-ms-file-permission-key");

    private static final HttpHeaderName X_MS_FILE_ID = HttpHeaderName.fromString("x-ms-file-id");

    private static final HttpHeaderName X_MS_FILE_CREATION_TIME = HttpHeaderName.fromString("x-ms-file-creation-time");

    private static final HttpHeaderName X_MS_REQUEST_SERVER_ENCRYPTED
        = HttpHeaderName.fromString("x-ms-request-server-encrypted");

    private static final HttpHeaderName X_MS_FILE_ATTRIBUTES = HttpHeaderName.fromString("x-ms-file-attributes");

    private static final HttpHeaderName X_MS_FILE_CHANGE_TIME = HttpHeaderName.fromString("x-ms-file-change-time");

    private static final HttpHeaderName X_MS_FILE_PARENT_ID = HttpHeaderName.fromString("x-ms-file-parent-id");

    private static final HttpHeaderName X_MS_FILE_LAST_WRITE_TIME
        = HttpHeaderName.fromString("x-ms-file-last-write-time");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of FilesCreateHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public FilesCreateHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.xMsFilePermissionKey = rawHeaders.getValue(X_MS_FILE_PERMISSION_KEY);
        this.xMsFileId = rawHeaders.getValue(X_MS_FILE_ID);
        String xMsFileCreationTime = rawHeaders.getValue(X_MS_FILE_CREATION_TIME);
        if (xMsFileCreationTime != null) {
            this.xMsFileCreationTime = OffsetDateTime.parse(xMsFileCreationTime);
        }
        String lastModified = rawHeaders.getValue(HttpHeaderName.LAST_MODIFIED);
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        String xMsRequestServerEncrypted = rawHeaders.getValue(X_MS_REQUEST_SERVER_ENCRYPTED);
        if (xMsRequestServerEncrypted != null) {
            this.xMsRequestServerEncrypted = Boolean.parseBoolean(xMsRequestServerEncrypted);
        }
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        this.xMsFileAttributes = rawHeaders.getValue(X_MS_FILE_ATTRIBUTES);
        String xMsFileChangeTime = rawHeaders.getValue(X_MS_FILE_CHANGE_TIME);
        if (xMsFileChangeTime != null) {
            this.xMsFileChangeTime = OffsetDateTime.parse(xMsFileChangeTime);
        }
        this.xMsFileParentId = rawHeaders.getValue(X_MS_FILE_PARENT_ID);
        this.xMsRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_REQUEST_ID);
        String xMsFileLastWriteTime = rawHeaders.getValue(X_MS_FILE_LAST_WRITE_TIME);
        if (xMsFileLastWriteTime != null) {
            this.xMsFileLastWriteTime = OffsetDateTime.parse(xMsFileLastWriteTime);
        }
    }

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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setXMsVersion(String xMsVersion) {
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setXMsFilePermissionKey(String xMsFilePermissionKey) {
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setXMsFileId(String xMsFileId) {
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setXMsFileCreationTime(OffsetDateTime xMsFileCreationTime) {
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setLastModified(OffsetDateTime lastModified) {
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setXMsRequestServerEncrypted(Boolean xMsRequestServerEncrypted) {
        this.xMsRequestServerEncrypted = xMsRequestServerEncrypted;
        return this;
    }

    /**
     * Get the date property: The Date property.
     * 
     * @return the date value.
     */
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     * 
     * @param date the date value to set.
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setETag(String eTag) {
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setXMsFileAttributes(String xMsFileAttributes) {
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setXMsFileChangeTime(OffsetDateTime xMsFileChangeTime) {
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setXMsFileParentId(String xMsFileParentId) {
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setXMsRequestId(String xMsRequestId) {
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
     * @return the FilesCreateHeaders object itself.
     */
    public FilesCreateHeaders setXMsFileLastWriteTime(OffsetDateTime xMsFileLastWriteTime) {
        this.xMsFileLastWriteTime = xMsFileLastWriteTime;
        return this;
    }
}
