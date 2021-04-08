// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The PathsLeaseHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class PathsLeaseHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-lease-time property.
     */
    @JsonProperty(value = "x-ms-lease-time")
    private String xMsLeaseTime;

    /*
     * The x-ms-lease-id property.
     */
    @JsonProperty(value = "x-ms-lease-id")
    private String xMsLeaseId;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

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
     * @return the PathsLeaseHeaders object itself.
     */
    public PathsLeaseHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
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
     * @return the PathsLeaseHeaders object itself.
     */
    public PathsLeaseHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsLeaseTime property: The x-ms-lease-time property.
     *
     * @return the xMsLeaseTime value.
     */
    public String getXMsLeaseTime() {
        return this.xMsLeaseTime;
    }

    /**
     * Set the xMsLeaseTime property: The x-ms-lease-time property.
     *
     * @param xMsLeaseTime the xMsLeaseTime value to set.
     * @return the PathsLeaseHeaders object itself.
     */
    public PathsLeaseHeaders setXMsLeaseTime(String xMsLeaseTime) {
        this.xMsLeaseTime = xMsLeaseTime;
        return this;
    }

    /**
     * Get the xMsLeaseId property: The x-ms-lease-id property.
     *
     * @return the xMsLeaseId value.
     */
    public String getXMsLeaseId() {
        return this.xMsLeaseId;
    }

    /**
     * Set the xMsLeaseId property: The x-ms-lease-id property.
     *
     * @param xMsLeaseId the xMsLeaseId value to set.
     * @return the PathsLeaseHeaders object itself.
     */
    public PathsLeaseHeaders setXMsLeaseId(String xMsLeaseId) {
        this.xMsLeaseId = xMsLeaseId;
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
     * @return the PathsLeaseHeaders object itself.
     */
    public PathsLeaseHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
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
     * @return the PathsLeaseHeaders object itself.
     */
    public PathsLeaseHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
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
     * @return the PathsLeaseHeaders object itself.
     */
    public PathsLeaseHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}
