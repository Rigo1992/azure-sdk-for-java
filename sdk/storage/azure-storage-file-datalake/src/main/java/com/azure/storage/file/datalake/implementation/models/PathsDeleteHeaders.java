// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The PathsDeleteHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class PathsDeleteHeaders {
    /*
     * The x-ms-deletion-id property.
     */
    @JsonProperty(value = "x-ms-deletion-id")
    private String xMsDeletionId;

    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-continuation property.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String xMsContinuation;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private String date;

    private static final HttpHeaderName X_MS_DELETION_ID = HttpHeaderName.fromString("x-ms-deletion-id");

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    private static final HttpHeaderName X_MS_REQUEST_ID = HttpHeaderName.fromString("x-ms-request-id");

    private static final HttpHeaderName X_MS_CONTINUATION = HttpHeaderName.fromString("x-ms-continuation");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of PathsDeleteHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public PathsDeleteHeaders(HttpHeaders rawHeaders) {
        this.xMsDeletionId = rawHeaders.getValue(X_MS_DELETION_ID);
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.xMsRequestId = rawHeaders.getValue(X_MS_REQUEST_ID);
        this.xMsContinuation = rawHeaders.getValue(X_MS_CONTINUATION);
        this.date = rawHeaders.getValue(HttpHeaderName.DATE);
    }

    /**
     * Get the xMsDeletionId property: The x-ms-deletion-id property.
     *
     * @return the xMsDeletionId value.
     */
    public String getXMsDeletionId() {
        return this.xMsDeletionId;
    }

    /**
     * Set the xMsDeletionId property: The x-ms-deletion-id property.
     *
     * @param xMsDeletionId the xMsDeletionId value to set.
     * @return the PathsDeleteHeaders object itself.
     */
    public PathsDeleteHeaders setXMsDeletionId(String xMsDeletionId) {
        this.xMsDeletionId = xMsDeletionId;
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
     * @return the PathsDeleteHeaders object itself.
     */
    public PathsDeleteHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
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
     * @return the PathsDeleteHeaders object itself.
     */
    public PathsDeleteHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsContinuation property: The x-ms-continuation property.
     *
     * @return the xMsContinuation value.
     */
    public String getXMsContinuation() {
        return this.xMsContinuation;
    }

    /**
     * Set the xMsContinuation property: The x-ms-continuation property.
     *
     * @param xMsContinuation the xMsContinuation value to set.
     * @return the PathsDeleteHeaders object itself.
     */
    public PathsDeleteHeaders setXMsContinuation(String xMsContinuation) {
        this.xMsContinuation = xMsContinuation;
        return this;
    }

    /**
     * Get the date property: The Date property.
     *
     * @return the date value.
     */
    public String getDate() {
        return this.date;
    }

    /**
     * Set the date property: The Date property.
     *
     * @param date the date value to set.
     * @return the PathsDeleteHeaders object itself.
     */
    public PathsDeleteHeaders setDate(String date) {
        this.date = date;
        return this;
    }
}
