// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The SubResourceIntegrityCheck model. */
@Immutable
public final class SubResourceIntegrityCheck {
    /*
     * The violation property.
     */
    @Generated
    @JsonProperty(value = "violation")
    private Boolean violation;

    /*
     * The firstSeen property.
     */
    @Generated
    @JsonProperty(value = "firstSeen")
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    @JsonProperty(value = "lastSeen")
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    @JsonProperty(value = "count")
    private Long count;

    /*
     * The causePageUrl property.
     */
    @Generated
    @JsonProperty(value = "causePageUrl")
    private String causePageUrl;

    /*
     * The crawlGuid property.
     */
    @Generated
    @JsonProperty(value = "crawlGuid")
    private String crawlGuid;

    /*
     * The pageGuid property.
     */
    @Generated
    @JsonProperty(value = "pageGuid")
    private String pageGuid;

    /*
     * The resourceGuid property.
     */
    @Generated
    @JsonProperty(value = "resourceGuid")
    private String resourceGuid;

    /*
     * The expectedHash property.
     */
    @Generated
    @JsonProperty(value = "expectedHash")
    private String expectedHash;

    /** Creates an instance of SubResourceIntegrityCheck class. */
    @Generated
    private SubResourceIntegrityCheck() {}

    /**
     * Get the violation property: The violation property.
     *
     * @return the violation value.
     */
    @Generated
    public Boolean isViolation() {
        return this.violation;
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the causePageUrl property: The causePageUrl property.
     *
     * @return the causePageUrl value.
     */
    @Generated
    public String getCausePageUrl() {
        return this.causePageUrl;
    }

    /**
     * Get the crawlGuid property: The crawlGuid property.
     *
     * @return the crawlGuid value.
     */
    @Generated
    public String getCrawlGuid() {
        return this.crawlGuid;
    }

    /**
     * Get the pageGuid property: The pageGuid property.
     *
     * @return the pageGuid value.
     */
    @Generated
    public String getPageGuid() {
        return this.pageGuid;
    }

    /**
     * Get the resourceGuid property: The resourceGuid property.
     *
     * @return the resourceGuid value.
     */
    @Generated
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the expectedHash property: The expectedHash property.
     *
     * @return the expectedHash value.
     */
    @Generated
    public String getExpectedHash() {
        return this.expectedHash;
    }
}
