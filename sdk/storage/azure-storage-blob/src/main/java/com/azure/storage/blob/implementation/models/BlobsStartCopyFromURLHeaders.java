// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.blob.models.CopyStatusType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The BlobsStartCopyFromURLHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class BlobsStartCopyFromURLHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-copy-id property.
     */
    @JsonProperty(value = "x-ms-copy-id")
    private String xMsCopyId;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-version-id property.
     */
    @JsonProperty(value = "x-ms-version-id")
    private String xMsVersionId;

    /*
     * The x-ms-copy-status property.
     */
    @JsonProperty(value = "x-ms-copy-status")
    private CopyStatusType xMsCopyStatus;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-client-request-id property.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String xMsClientRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of BlobsStartCopyFromURLHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public BlobsStartCopyFromURLHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue("x-ms-version");
        this.xMsCopyId = rawHeaders.getValue("x-ms-copy-id");
        this.eTag = rawHeaders.getValue("ETag");
        if (rawHeaders.getValue("Last-Modified") != null) {
            this.lastModified = new DateTimeRfc1123(rawHeaders.getValue("Last-Modified"));
        }
        this.xMsVersionId = rawHeaders.getValue("x-ms-version-id");
        if (rawHeaders.getValue("x-ms-copy-status") != null) {
            this.xMsCopyStatus = CopyStatusType.fromString(rawHeaders.getValue("x-ms-copy-status"));
        }
        this.xMsRequestId = rawHeaders.getValue("x-ms-request-id");
        this.xMsClientRequestId = rawHeaders.getValue("x-ms-client-request-id");
        if (rawHeaders.getValue("Date") != null) {
            this.dateProperty = new DateTimeRfc1123(rawHeaders.getValue("Date"));
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
     * @return the BlobsStartCopyFromURLHeaders object itself.
     */
    public BlobsStartCopyFromURLHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
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
     * @return the BlobsStartCopyFromURLHeaders object itself.
     */
    public BlobsStartCopyFromURLHeaders setXMsCopyId(String xMsCopyId) {
        this.xMsCopyId = xMsCopyId;
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
     * @return the BlobsStartCopyFromURLHeaders object itself.
     */
    public BlobsStartCopyFromURLHeaders setETag(String eTag) {
        this.eTag = eTag;
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
     * @return the BlobsStartCopyFromURLHeaders object itself.
     */
    public BlobsStartCopyFromURLHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsVersionId property: The x-ms-version-id property.
     *
     * @return the xMsVersionId value.
     */
    public String getXMsVersionId() {
        return this.xMsVersionId;
    }

    /**
     * Set the xMsVersionId property: The x-ms-version-id property.
     *
     * @param xMsVersionId the xMsVersionId value to set.
     * @return the BlobsStartCopyFromURLHeaders object itself.
     */
    public BlobsStartCopyFromURLHeaders setXMsVersionId(String xMsVersionId) {
        this.xMsVersionId = xMsVersionId;
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
     * @return the BlobsStartCopyFromURLHeaders object itself.
     */
    public BlobsStartCopyFromURLHeaders setXMsCopyStatus(CopyStatusType xMsCopyStatus) {
        this.xMsCopyStatus = xMsCopyStatus;
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
     * @return the BlobsStartCopyFromURLHeaders object itself.
     */
    public BlobsStartCopyFromURLHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the BlobsStartCopyFromURLHeaders object itself.
     */
    public BlobsStartCopyFromURLHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
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
     * @return the BlobsStartCopyFromURLHeaders object itself.
     */
    public BlobsStartCopyFromURLHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}
