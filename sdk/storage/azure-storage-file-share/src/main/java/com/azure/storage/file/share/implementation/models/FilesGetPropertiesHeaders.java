// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeader;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.file.share.models.CopyStatusType;
import com.azure.storage.file.share.models.LeaseDurationType;
import com.azure.storage.file.share.models.LeaseStateType;
import com.azure.storage.file.share.models.LeaseStatusType;
import java.time.OffsetDateTime;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * The FilesGetPropertiesHeaders model.
 */
@Fluent
public final class FilesGetPropertiesHeaders {
    /*
     * The x-ms-file-id property.
     */
    private String xMsFileId;

    /*
     * The x-ms-lease-status property.
     */
    private LeaseStatusType xMsLeaseStatus;

    /*
     * The x-ms-file-creation-time property.
     */
    private OffsetDateTime xMsFileCreationTime;

    /*
     * The x-ms-lease-state property.
     */
    private LeaseStateType xMsLeaseState;

    /*
     * The Last-Modified property.
     */
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-file-attributes property.
     */
    private String xMsFileAttributes;

    /*
     * The Content-Encoding property.
     */
    private String contentEncoding;

    /*
     * The x-ms-copy-status-description property.
     */
    private String xMsCopyStatusDescription;

    /*
     * The x-ms-lease-duration property.
     */
    private LeaseDurationType xMsLeaseDuration;

    /*
     * The Content-Length property.
     */
    private Long contentLength;

    /*
     * The x-ms-request-id property.
     */
    private String xMsRequestId;

    /*
     * The Content-Type property.
     */
    private String contentType;

    /*
     * The x-ms-version property.
     */
    private String xMsVersion;

    /*
     * The x-ms-file-permission-key property.
     */
    private String xMsFilePermissionKey;

    /*
     * The x-ms-copy-id property.
     */
    private String xMsCopyId;

    /*
     * The x-ms-copy-source property.
     */
    private String xMsCopySource;

    /*
     * The x-ms-copy-progress property.
     */
    private String xMsCopyProgress;

    /*
     * The x-ms-meta- property.
     */
    private Map<String, String> xMsMeta;

    /*
     * The Date property.
     */
    private DateTimeRfc1123 date;

    /*
     * The Content-MD5 property.
     */
    private byte[] contentMD5;

    /*
     * The x-ms-copy-completion-time property.
     */
    private DateTimeRfc1123 xMsCopyCompletionTime;

    /*
     * The x-ms-server-encrypted property.
     */
    private Boolean xMsServerEncrypted;

    /*
     * The x-ms-type property.
     */
    private String xMsType = "File";

    /*
     * The Cache-Control property.
     */
    private String cacheControl;

    /*
     * The ETag property.
     */
    private String eTag;

    /*
     * The Content-Disposition property.
     */
    private String contentDisposition;

    /*
     * The x-ms-file-change-time property.
     */
    private OffsetDateTime xMsFileChangeTime;

    /*
     * The x-ms-file-parent-id property.
     */
    private String xMsFileParentId;

    /*
     * The x-ms-copy-status property.
     */
    private CopyStatusType xMsCopyStatus;

    /*
     * The Content-Language property.
     */
    private String contentLanguage;

    /*
     * The x-ms-file-last-write-time property.
     */
    private OffsetDateTime xMsFileLastWriteTime;

    private static final HttpHeaderName X_MS_FILE_ID = HttpHeaderName.fromString("x-ms-file-id");

    private static final HttpHeaderName X_MS_LEASE_STATUS = HttpHeaderName.fromString("x-ms-lease-status");

    private static final HttpHeaderName X_MS_FILE_CREATION_TIME = HttpHeaderName.fromString("x-ms-file-creation-time");

    private static final HttpHeaderName X_MS_LEASE_STATE = HttpHeaderName.fromString("x-ms-lease-state");

    private static final HttpHeaderName X_MS_FILE_ATTRIBUTES = HttpHeaderName.fromString("x-ms-file-attributes");

    private static final HttpHeaderName X_MS_COPY_STATUS_DESCRIPTION
        = HttpHeaderName.fromString("x-ms-copy-status-description");

    private static final HttpHeaderName X_MS_LEASE_DURATION = HttpHeaderName.fromString("x-ms-lease-duration");

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    private static final HttpHeaderName X_MS_FILE_PERMISSION_KEY
        = HttpHeaderName.fromString("x-ms-file-permission-key");

    private static final HttpHeaderName X_MS_COPY_ID = HttpHeaderName.fromString("x-ms-copy-id");

    private static final HttpHeaderName X_MS_COPY_SOURCE = HttpHeaderName.fromString("x-ms-copy-source");

    private static final HttpHeaderName X_MS_COPY_PROGRESS = HttpHeaderName.fromString("x-ms-copy-progress");

    private static final HttpHeaderName X_MS_COPY_COMPLETION_TIME
        = HttpHeaderName.fromString("x-ms-copy-completion-time");

    private static final HttpHeaderName X_MS_SERVER_ENCRYPTED = HttpHeaderName.fromString("x-ms-server-encrypted");

    private static final HttpHeaderName X_MS_TYPE = HttpHeaderName.fromString("x-ms-type");

    private static final HttpHeaderName X_MS_FILE_CHANGE_TIME = HttpHeaderName.fromString("x-ms-file-change-time");

    private static final HttpHeaderName X_MS_FILE_PARENT_ID = HttpHeaderName.fromString("x-ms-file-parent-id");

    private static final HttpHeaderName X_MS_COPY_STATUS = HttpHeaderName.fromString("x-ms-copy-status");

    private static final HttpHeaderName X_MS_FILE_LAST_WRITE_TIME
        = HttpHeaderName.fromString("x-ms-file-last-write-time");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of FilesGetPropertiesHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public FilesGetPropertiesHeaders(HttpHeaders rawHeaders) {
        this.xMsFileId = rawHeaders.getValue(X_MS_FILE_ID);
        String xMsLeaseStatus = rawHeaders.getValue(X_MS_LEASE_STATUS);
        if (xMsLeaseStatus != null) {
            this.xMsLeaseStatus = LeaseStatusType.fromString(xMsLeaseStatus);
        }
        String xMsFileCreationTime = rawHeaders.getValue(X_MS_FILE_CREATION_TIME);
        if (xMsFileCreationTime != null) {
            this.xMsFileCreationTime = OffsetDateTime.parse(xMsFileCreationTime);
        }
        String xMsLeaseState = rawHeaders.getValue(X_MS_LEASE_STATE);
        if (xMsLeaseState != null) {
            this.xMsLeaseState = LeaseStateType.fromString(xMsLeaseState);
        }
        String lastModified = rawHeaders.getValue(HttpHeaderName.LAST_MODIFIED);
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        this.xMsFileAttributes = rawHeaders.getValue(X_MS_FILE_ATTRIBUTES);
        this.contentEncoding = rawHeaders.getValue(HttpHeaderName.CONTENT_ENCODING);
        this.xMsCopyStatusDescription = rawHeaders.getValue(X_MS_COPY_STATUS_DESCRIPTION);
        String xMsLeaseDuration = rawHeaders.getValue(X_MS_LEASE_DURATION);
        if (xMsLeaseDuration != null) {
            this.xMsLeaseDuration = LeaseDurationType.fromString(xMsLeaseDuration);
        }
        String contentLength = rawHeaders.getValue(HttpHeaderName.CONTENT_LENGTH);
        if (contentLength != null) {
            this.contentLength = Long.parseLong(contentLength);
        }
        this.xMsRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_REQUEST_ID);
        this.contentType = rawHeaders.getValue(HttpHeaderName.CONTENT_TYPE);
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.xMsFilePermissionKey = rawHeaders.getValue(X_MS_FILE_PERMISSION_KEY);
        this.xMsCopyId = rawHeaders.getValue(X_MS_COPY_ID);
        this.xMsCopySource = rawHeaders.getValue(X_MS_COPY_SOURCE);
        this.xMsCopyProgress = rawHeaders.getValue(X_MS_COPY_PROGRESS);
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
        String contentMD5 = rawHeaders.getValue(HttpHeaderName.CONTENT_MD5);
        if (contentMD5 != null) {
            this.contentMD5 = Base64.getDecoder().decode(contentMD5);
        }
        String xMsCopyCompletionTime = rawHeaders.getValue(X_MS_COPY_COMPLETION_TIME);
        if (xMsCopyCompletionTime != null) {
            this.xMsCopyCompletionTime = new DateTimeRfc1123(xMsCopyCompletionTime);
        }
        String xMsServerEncrypted = rawHeaders.getValue(X_MS_SERVER_ENCRYPTED);
        if (xMsServerEncrypted != null) {
            this.xMsServerEncrypted = Boolean.parseBoolean(xMsServerEncrypted);
        }
        this.xMsType = rawHeaders.getValue(X_MS_TYPE);
        this.cacheControl = rawHeaders.getValue(HttpHeaderName.CACHE_CONTROL);
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        this.contentDisposition = rawHeaders.getValue(HttpHeaderName.CONTENT_DISPOSITION);
        String xMsFileChangeTime = rawHeaders.getValue(X_MS_FILE_CHANGE_TIME);
        if (xMsFileChangeTime != null) {
            this.xMsFileChangeTime = OffsetDateTime.parse(xMsFileChangeTime);
        }
        this.xMsFileParentId = rawHeaders.getValue(X_MS_FILE_PARENT_ID);
        String xMsCopyStatus = rawHeaders.getValue(X_MS_COPY_STATUS);
        if (xMsCopyStatus != null) {
            this.xMsCopyStatus = CopyStatusType.fromString(xMsCopyStatus);
        }
        this.contentLanguage = rawHeaders.getValue(HttpHeaderName.CONTENT_LANGUAGE);
        String xMsFileLastWriteTime = rawHeaders.getValue(X_MS_FILE_LAST_WRITE_TIME);
        if (xMsFileLastWriteTime != null) {
            this.xMsFileLastWriteTime = OffsetDateTime.parse(xMsFileLastWriteTime);
        }
        Map<String, String> xMsMetaHeaderCollection = new HashMap<>();

        for (HttpHeader header : rawHeaders) {
            String headerName = header.getName();
            if (headerName.startsWith("x-ms-meta-")) {
                xMsMetaHeaderCollection.put(headerName.substring(10), header.getValue());
            }
        }

        this.xMsMeta = xMsMetaHeaderCollection;
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsFileId(String xMsFileId) {
        this.xMsFileId = xMsFileId;
        return this;
    }

    /**
     * Get the xMsLeaseStatus property: The x-ms-lease-status property.
     * 
     * @return the xMsLeaseStatus value.
     */
    public LeaseStatusType getXMsLeaseStatus() {
        return this.xMsLeaseStatus;
    }

    /**
     * Set the xMsLeaseStatus property: The x-ms-lease-status property.
     * 
     * @param xMsLeaseStatus the xMsLeaseStatus value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsLeaseStatus(LeaseStatusType xMsLeaseStatus) {
        this.xMsLeaseStatus = xMsLeaseStatus;
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsFileCreationTime(OffsetDateTime xMsFileCreationTime) {
        this.xMsFileCreationTime = xMsFileCreationTime;
        return this;
    }

    /**
     * Get the xMsLeaseState property: The x-ms-lease-state property.
     * 
     * @return the xMsLeaseState value.
     */
    public LeaseStateType getXMsLeaseState() {
        return this.xMsLeaseState;
    }

    /**
     * Set the xMsLeaseState property: The x-ms-lease-state property.
     * 
     * @param xMsLeaseState the xMsLeaseState value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsLeaseState(LeaseStateType xMsLeaseState) {
        this.xMsLeaseState = xMsLeaseState;
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsFileAttributes(String xMsFileAttributes) {
        this.xMsFileAttributes = xMsFileAttributes;
        return this;
    }

    /**
     * Get the contentEncoding property: The Content-Encoding property.
     * 
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: The Content-Encoding property.
     * 
     * @param contentEncoding the contentEncoding value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the xMsCopyStatusDescription property: The x-ms-copy-status-description property.
     * 
     * @return the xMsCopyStatusDescription value.
     */
    public String getXMsCopyStatusDescription() {
        return this.xMsCopyStatusDescription;
    }

    /**
     * Set the xMsCopyStatusDescription property: The x-ms-copy-status-description property.
     * 
     * @param xMsCopyStatusDescription the xMsCopyStatusDescription value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsCopyStatusDescription(String xMsCopyStatusDescription) {
        this.xMsCopyStatusDescription = xMsCopyStatusDescription;
        return this;
    }

    /**
     * Get the xMsLeaseDuration property: The x-ms-lease-duration property.
     * 
     * @return the xMsLeaseDuration value.
     */
    public LeaseDurationType getXMsLeaseDuration() {
        return this.xMsLeaseDuration;
    }

    /**
     * Set the xMsLeaseDuration property: The x-ms-lease-duration property.
     * 
     * @param xMsLeaseDuration the xMsLeaseDuration value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsLeaseDuration(LeaseDurationType xMsLeaseDuration) {
        this.xMsLeaseDuration = xMsLeaseDuration;
        return this;
    }

    /**
     * Get the contentLength property: The Content-Length property.
     * 
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The Content-Length property.
     * 
     * @param contentLength the contentLength value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the contentType property: The Content-Type property.
     * 
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The Content-Type property.
     * 
     * @param contentType the contentType value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsVersion(String xMsVersion) {
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsFilePermissionKey(String xMsFilePermissionKey) {
        this.xMsFilePermissionKey = xMsFilePermissionKey;
        return this;
    }

    /**
     * Get the xMsCopyId property: The x-ms-copy-id property.
     * 
     * @return the xMsCopyId value.
     */
    public String getXMsCopyId() {
        return this.xMsCopyId;
    }

    /**
     * Set the xMsCopyId property: The x-ms-copy-id property.
     * 
     * @param xMsCopyId the xMsCopyId value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsCopyId(String xMsCopyId) {
        this.xMsCopyId = xMsCopyId;
        return this;
    }

    /**
     * Get the xMsCopySource property: The x-ms-copy-source property.
     * 
     * @return the xMsCopySource value.
     */
    public String getXMsCopySource() {
        return this.xMsCopySource;
    }

    /**
     * Set the xMsCopySource property: The x-ms-copy-source property.
     * 
     * @param xMsCopySource the xMsCopySource value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsCopySource(String xMsCopySource) {
        this.xMsCopySource = xMsCopySource;
        return this;
    }

    /**
     * Get the xMsCopyProgress property: The x-ms-copy-progress property.
     * 
     * @return the xMsCopyProgress value.
     */
    public String getXMsCopyProgress() {
        return this.xMsCopyProgress;
    }

    /**
     * Set the xMsCopyProgress property: The x-ms-copy-progress property.
     * 
     * @param xMsCopyProgress the xMsCopyProgress value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsCopyProgress(String xMsCopyProgress) {
        this.xMsCopyProgress = xMsCopyProgress;
        return this;
    }

    /**
     * Get the xMsMeta property: The x-ms-meta- property.
     * 
     * @return the xMsMeta value.
     */
    public Map<String, String> getXMsMeta() {
        return this.xMsMeta;
    }

    /**
     * Set the xMsMeta property: The x-ms-meta- property.
     * 
     * @param xMsMeta the xMsMeta value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsMeta(Map<String, String> xMsMeta) {
        this.xMsMeta = xMsMeta;
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the contentMD5 property: The Content-MD5 property.
     * 
     * @return the contentMD5 value.
     */
    public byte[] getContentMD5() {
        return CoreUtils.clone(this.contentMD5);
    }

    /**
     * Set the contentMD5 property: The Content-MD5 property.
     * 
     * @param contentMD5 the contentMD5 value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setContentMD5(byte[] contentMD5) {
        this.contentMD5 = CoreUtils.clone(contentMD5);
        return this;
    }

    /**
     * Get the xMsCopyCompletionTime property: The x-ms-copy-completion-time property.
     * 
     * @return the xMsCopyCompletionTime value.
     */
    public OffsetDateTime getXMsCopyCompletionTime() {
        if (this.xMsCopyCompletionTime == null) {
            return null;
        }
        return this.xMsCopyCompletionTime.getDateTime();
    }

    /**
     * Set the xMsCopyCompletionTime property: The x-ms-copy-completion-time property.
     * 
     * @param xMsCopyCompletionTime the xMsCopyCompletionTime value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsCopyCompletionTime(OffsetDateTime xMsCopyCompletionTime) {
        if (xMsCopyCompletionTime == null) {
            this.xMsCopyCompletionTime = null;
        } else {
            this.xMsCopyCompletionTime = new DateTimeRfc1123(xMsCopyCompletionTime);
        }
        return this;
    }

    /**
     * Get the xMsServerEncrypted property: The x-ms-server-encrypted property.
     * 
     * @return the xMsServerEncrypted value.
     */
    public Boolean isXMsServerEncrypted() {
        return this.xMsServerEncrypted;
    }

    /**
     * Set the xMsServerEncrypted property: The x-ms-server-encrypted property.
     * 
     * @param xMsServerEncrypted the xMsServerEncrypted value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsServerEncrypted(Boolean xMsServerEncrypted) {
        this.xMsServerEncrypted = xMsServerEncrypted;
        return this;
    }

    /**
     * Get the xMsType property: The x-ms-type property.
     * 
     * @return the xMsType value.
     */
    public String getXMsType() {
        return this.xMsType;
    }

    /**
     * Set the xMsType property: The x-ms-type property.
     * 
     * @param xMsType the xMsType value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsType(String xMsType) {
        this.xMsType = xMsType;
        return this;
    }

    /**
     * Get the cacheControl property: The Cache-Control property.
     * 
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: The Cache-Control property.
     * 
     * @param cacheControl the cacheControl value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentDisposition property: The Content-Disposition property.
     * 
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: The Content-Disposition property.
     * 
     * @param contentDisposition the contentDisposition value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsFileChangeTime(OffsetDateTime xMsFileChangeTime) {
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsFileParentId(String xMsFileParentId) {
        this.xMsFileParentId = xMsFileParentId;
        return this;
    }

    /**
     * Get the xMsCopyStatus property: The x-ms-copy-status property.
     * 
     * @return the xMsCopyStatus value.
     */
    public CopyStatusType getXMsCopyStatus() {
        return this.xMsCopyStatus;
    }

    /**
     * Set the xMsCopyStatus property: The x-ms-copy-status property.
     * 
     * @param xMsCopyStatus the xMsCopyStatus value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsCopyStatus(CopyStatusType xMsCopyStatus) {
        this.xMsCopyStatus = xMsCopyStatus;
        return this;
    }

    /**
     * Get the contentLanguage property: The Content-Language property.
     * 
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: The Content-Language property.
     * 
     * @param contentLanguage the contentLanguage value to set.
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
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
     * @return the FilesGetPropertiesHeaders object itself.
     */
    public FilesGetPropertiesHeaders setXMsFileLastWriteTime(OffsetDateTime xMsFileLastWriteTime) {
        this.xMsFileLastWriteTime = xMsFileLastWriteTime;
        return this;
    }
}
